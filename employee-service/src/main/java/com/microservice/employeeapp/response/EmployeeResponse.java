package com.microservice.employeeapp.response;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeResponse {

    private int id;

    private String name;

    private String email;

    private Date dob;

    private String dept;

    private AddressResponse addressResponse;

}
