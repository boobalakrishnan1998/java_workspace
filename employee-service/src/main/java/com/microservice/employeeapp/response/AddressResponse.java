package com.microservice.employeeapp.response;
import lombok.Data;

@Data
public class AddressResponse {
    private int id;
    private String street;
    private String district;
}
