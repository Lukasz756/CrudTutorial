package com.example.crudTutorial.Group;

import com.example.crudTutorial.Employee.Employee;
import com.example.crudTutorial.Employee.EmployeeServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GroupController {
    @Autowired
    GroupServiceImplementation groupServiceImplementation;

    @PostMapping("/groups")
    public ResponseEntity<Group> createGroup(@RequestBody Group group){
        return new ResponseEntity<Group>(groupServiceImplementation.save(group), HttpStatus.CREATED);
    }

}
