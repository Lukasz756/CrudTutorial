package com.example.crudTutorial.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeServiceImplementation employeeServiceImplementation;

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employeeToSave,@RequestParam Long branchId,@RequestParam Long shiftId) throws Exception {
        employeeServiceImplementation.save(employeeToSave,branchId,shiftId);
    }

    @GetMapping()
    public void getEmployeeById(Long id){

    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
       return employeeServiceImplementation.getAllEmployees();
    }

    @DeleteMapping()
    public void deleteById(){

    }

    @PostMapping("/employee")
    public void addEmployeeToShift(@RequestBody EmployeeShiftDTO employeeShiftDTO){
        employeeServiceImplementation.employeeToShift(employeeShiftDTO);
    }


    @DeleteMapping("/employee")
    public void removeEmployeeFromShift(@RequestBody EmployeeShiftDTO employeeShiftDTO){
        employeeServiceImplementation.employeeRemove(employeeShiftDTO);
    }

}
