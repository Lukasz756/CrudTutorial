package com.example.crudTutorial.Employee;

import com.example.crudTutorial.Group.Group;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String designation;
        private int age;

        @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
        @JoinTable(name = "employee_group",
        joinColumns = @JoinColumn(name = "employee_id"),
        inverseJoinColumns = @JoinColumn(name = "group_id"))
        private Set<Group> employeeGroups = new HashSet<>();

        public Employee(Long id,String name,String designation,int age){
                this.id = id;
                this.name = name;
                this.designation = designation;
                this.age = age;

        }

}
