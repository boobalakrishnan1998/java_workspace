package com.microservice.addressapp.addressservice;

import com.microservice.addressapp.entity.Address;
import com.microservice.addressapp.repo.AddressRepo;
import com.microservice.addressapp.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    public AddressRepo repo;

    @Autowired
    public ModelMapper modelMapper;

    public AddressResponse getEmpAddress(Integer empId){
        Address address  =repo.findAddressByEmpId(String.valueOf(empId));
        AddressResponse response=modelMapper.map(address,AddressResponse.class);
        return response;
    }
}
