package com.example.crudTutorial.Employee;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@AllArgsConstructor
@NoArgsConstructor
@Controller
public class EmployeeController {
    EmployeeService employeeService;

    @PutMapping()
    public void createEmployee(){

    }


    @GetMapping()
    public void getEmployeeById(Long id){

    }

    @DeleteMapping()
    public void deleteById(){

    }

    @PutMapping("/")
    public void addEmployeeToGroup(){

    }

}
