package com.example.crudTutorial.Shift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ShiftController {
    @Autowired
    ShiftServiceImplementation shiftServiceImplementation;

    @PostMapping("/groups")
    public ResponseEntity<Shift> createShift(@RequestBody Shift shift){
        return new ResponseEntity<Shift>(shiftServiceImplementation.save(shift), HttpStatus.CREATED);
    }

}
