package com.example.crudTutorial.Employee;


import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee,Long shiftId);
    void employeeToShift(EmployeeShiftDTO employeeShiftDTO);
}
