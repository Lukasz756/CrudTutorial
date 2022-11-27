package com.example.crudTutorial.Shift;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShiftServiceImplementation implements ShiftService {

    @Autowired
    private final ShiftRepository shiftRepository;

    @Override
    public Shift save(Shift shift) {
            return shiftRepository.save(shift);
    }

    public List<Shift> getAllShifts(){
        return shiftRepository.findAll();
    }
}
