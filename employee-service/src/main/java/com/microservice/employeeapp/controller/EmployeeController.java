package com.microservice.employeeapp.controller;

import com.microservice.employeeapp.response.EmployeeResponse;
import com.microservice.employeeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
   public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") Integer id){
        EmployeeResponse employeeResponse= employeeService.getEmployee(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        return new ResponseEntity<>(employeeResponse, headers, HttpStatus.OK);
    }

}
