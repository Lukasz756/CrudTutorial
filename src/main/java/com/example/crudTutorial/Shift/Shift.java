package com.example.crudTutorial.Shift;

import com.example.crudTutorial.Employee.Employee;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shifts")
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "employeeshift", fetch = FetchType.LAZY)
    private Set<Employee> employees = new HashSet<>();

    public Shift(Long id, String name){
       this.id = id;
       this.name = name;
    }


}
