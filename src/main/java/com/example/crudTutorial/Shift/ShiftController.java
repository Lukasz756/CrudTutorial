package com.example.crudTutorial.Shift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ShiftController {
    @Autowired
    ShiftServiceImplementation shiftServiceImplementation;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/shift")
    public ResponseEntity<Shift> createShift(@RequestBody Shift shift){
        return new ResponseEntity<Shift>(shiftServiceImplementation.save(shift), HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/shift")
    public List<Shift> getShifts (){
       return shiftServiceImplementation.getAllShifts();
    }

}
