package com.example.crudTutorial.Employee;

import com.example.crudTutorial.Group.Group;
import com.example.crudTutorial.Group.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;
    private final GroupRepository groupRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void employeeToGroup(Long employeeId, Long groupId){
        Employee employee = new Employee();
        employee = employeeRepository.findById(employeeId).orElseThrow();
        employee.getEmployeeGroups().add(groupRepository.findById(groupId).orElseThrow());
    }

}
