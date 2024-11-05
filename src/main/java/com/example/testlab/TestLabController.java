package com.example.testlab;


import jakarta.validation.Valid;
import jdk.jfr.Timestamp;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class TestLabController {
 @PostMapping("/addUser")
public String addUser (@RequestBody @Valid User userRequest) {

  return "Message: Employee added successfully, welcome " + userRequest.getName() + "\nEmployeeCode: " + userRequest.getEmployeeCode() + "\nTimestamp: " +
       userRequest.getDateOfJoining();
 }

}
