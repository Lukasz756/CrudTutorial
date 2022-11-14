package com.example.crudTutorial.Employee;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeServiceImplementation employeeServiceImplementation;

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeServiceImplementation.save(employee), HttpStatus.CREATED);
    }

    @GetMapping()
    public void getEmployeeById(Long id){

    }

    @DeleteMapping()
    public void deleteById(){

    }

    @PutMapping("/")
    public void addEmployeeToGroup(Long employeeId,Long groupId){

    }

}
