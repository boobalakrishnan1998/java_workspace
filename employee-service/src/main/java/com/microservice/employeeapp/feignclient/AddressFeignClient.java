package com.microservice.employeeapp.feignclient;

import com.microservice.employeeapp.response.AddressResponse;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="address",path="/address-app/api")
@RibbonClient(name="address")
public interface AddressFeignClient {

    @GetMapping("/address/{id}")
    AddressResponse getAddressById(@PathVariable("id") int id);
}
