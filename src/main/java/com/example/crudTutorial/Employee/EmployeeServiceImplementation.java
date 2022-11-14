package com.example.crudTutorial.Employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImplementation implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public void createEmployee(Employee employee){
        employeeRepository.save(employee);
    }

}
