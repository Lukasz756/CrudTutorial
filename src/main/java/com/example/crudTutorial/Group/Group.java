package com.example.crudTutorial.Group;

import com.example.crudTutorial.Employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "groupSet")
    private Set<Employee> employees = new HashSet<>();

    private void addEmployee(Employee employee){
        this.employees.add(employee);
        employee.getGroupSet().add(this);
    }

    private void removeEmployee(Employee employee){
        this.employees.remove(employee);
        employee.getGroupSet().remove(this);
    }


}
