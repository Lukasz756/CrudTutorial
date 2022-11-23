package com.example.crudTutorial.Employee;

import com.example.crudTutorial.Branch.Branch;
import com.example.crudTutorial.Shift.Shift;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@DynamicUpdate
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

        @ManyToOne
        private Branch branch;

        @ManyToOne
        private Shift employeeshift;

        public Employee(Long id,String name,String designation,int age){
                this.id = id;
                this.name = name;
                this.designation = designation;
                this.age = age;
        }

}
