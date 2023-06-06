package com.microservice.addressapp.controller;

import com.microservice.addressapp.addressservice.AddressService;
import com.microservice.addressapp.response.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    public AddressService addressService;

    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressResponse> getAddress(@PathVariable("employeeId") Integer id) {
        AddressResponse addressResponse = addressService.getEmpAddress(id);
        return ResponseEntity.accepted().body(addressResponse);
    }
}
