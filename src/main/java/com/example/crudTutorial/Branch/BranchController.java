package com.example.crudTutorial.Branch;

import com.example.crudTutorial.Shift.Shift;
import com.example.crudTutorial.Shift.ShiftServiceImplementation;
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
public class BranchController {
    @Autowired
    BranchServiceImplementation branchServiceImplementation;

    @PostMapping("/branch")
    public ResponseEntity<Branch> createShift(@RequestBody Branch branch){
        return new ResponseEntity<Branch>(branchServiceImplementation.save(branch), HttpStatus.CREATED);
    }

}
