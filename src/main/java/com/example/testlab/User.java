package com.example.testlab;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@NoArgsConstructor
//this is the validation class
public class User {

    // @NumberFormat(message = "InvalidEmployeeDataException")
    //@NonNull(message = "EmployeeNotFoundException")
    //@NumberFormat( = 0, "InvalidEmployeeDataException")
    @NotBlank(message = "error: Invalid EmployeeDataException")
    private String employeeCode;

    @NotBlank(message = "error: Invalid Employee Name")
     String name;

    @Email(message = "error: Must be valid email address")
    String email;

    @NotBlank(message = "error: invalid position")
    private String position;

    @Min(value = 0, message = "error: Salary must be Positive")
    private String salary;

  // @Timestamp("2024-10-31T12:35:01Z")
   // @DateTimeFormat(value = 0, message = "2024-10-31T12:35:01Z")
    private String dateOfJoining;
    //printf(,@ResponseStatus);
}
