package com.example.crudTutorial.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeShiftDTO {
    private Long employeeId;
    private Long shiftId;
}
