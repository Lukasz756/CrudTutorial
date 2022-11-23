package com.example.crudTutorial.Branch;

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
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Building building;

    @OneToMany(mappedBy = "branch")
    private Set<Employee> employees = new HashSet<>();
}
