package com.example.crudTutorial.Employee;

import com.example.crudTutorial.Branch.BranchRepository;
import com.example.crudTutorial.Shift.ShiftRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;
    private final ShiftRepository shiftRepository;
    private final BranchRepository branchRepository;

    @Override
    public Employee save(Employee employeeToSave,Long branchId,Long shiftId) throws Exception {
        Employee employee = new Employee();
        employee.setName(employeeToSave.getName());
        employee.setAge(employeeToSave.getAge());
        employee.setDesignation(employeeToSave.getDesignation());
        employee.setBranch(branchRepository.findById(branchId).orElseThrow(()->new Exception("Not found.")));
        employee.setEmployeeshift(shiftRepository.findById(shiftId).orElseThrow(()->new Exception("Not found.")));
        return employeeRepository.save(employee);

    }

    public void employeeToShift(EmployeeShiftDTO employeeShiftDTO){
        Employee updateEmployee = employeeRepository
                .findById(employeeShiftDTO.getEmployeeId())
                .orElseThrow();

        employeeRepository.save(updateEmployee);

    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll().stream().toList();
    }

    public void employeeRemove(EmployeeShiftDTO employeeShiftDTO){
        Employee updateEmployee = employeeRepository.findById(employeeShiftDTO
                .getEmployeeId()).orElseThrow();
        employeeRepository.save(updateEmployee);
    }

}
