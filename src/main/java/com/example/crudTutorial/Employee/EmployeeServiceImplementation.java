package com.example.crudTutorial.Employee;

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

    @Override
    public Employee save(Employee employee) {
       employee.getEmployeeshift().add(shiftRepository.findById(1L).orElseThrow());

        return employeeRepository.save(employee);
    }

    public void employeeToShift(EmployeeShiftDTO employeeShiftDTO){
        Employee updateEmployee = employeeRepository
                .findById(employeeShiftDTO.getEmployeeId())
                .orElseThrow();
        updateEmployee.getEmployeeshift()
                .add(shiftRepository.findById(employeeShiftDTO.getShiftId())
                        .orElseThrow());
        employeeRepository.save(updateEmployee);

    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll().stream().toList();
    }

    public void employeeRemove(EmployeeShiftDTO employeeShiftDTO){
        Employee updateEmployee = employeeRepository.findById(employeeShiftDTO
                .getEmployeeId()).orElseThrow();
        updateEmployee.getEmployeeshift().remove(shiftRepository.findById(employeeShiftDTO.getShiftId())
                .orElseThrow());
        employeeRepository.save(updateEmployee);
    }

}
