package com.example.crudTutorial.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeServiceImplementation employeeServiceImplementation;

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee){
        employeeServiceImplementation.save(employee);
    }

    @GetMapping()
    public void getEmployeeById(Long id){

    }

    @DeleteMapping()
    public void deleteById(){

    }

    @PostMapping("/employee")
    public void addEmployeeToGroup(@RequestBody EmployeeShiftDTO employeeShiftDTO){
        employeeServiceImplementation.employeeToShift(employeeShiftDTO);
    }

}
