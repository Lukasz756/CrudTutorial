package com.example.crudTutorial.Group;

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
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "employeeGroups", fetch = FetchType.LAZY)
    private Set<Employee> employees = new HashSet<>();

    public Group(Long id, String name){
       this.id = id;
       this.name = name;
    }


}
