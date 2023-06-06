package com.microservice.addressapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="address")
@Entity
@Data
public class Address {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "street")
    private String street;
    @Column(name = "district")
    private String district;
}
