package com.example.crudTutorial.Employee;


import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee,Long branchId,Long shiftId) throws Exception;
    void employeeToShift(EmployeeShiftDTO employeeShiftDTO);

    List<Employee> getEmployeesByShift(Long shiftId);
}
