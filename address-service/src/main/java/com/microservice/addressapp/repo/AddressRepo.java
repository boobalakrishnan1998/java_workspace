package com.microservice.addressapp.repo;

import com.microservice.addressapp.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

       @Query(nativeQuery = true,value="select a.id, a.street, a.district from employee e inner join address a on e.id=a.id where e.id=:empId")
      Address findAddressByEmpId(@Param("empId") String empId);
}
