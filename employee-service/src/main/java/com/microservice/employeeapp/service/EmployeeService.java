package com.microservice.employeeapp.service;

import com.microservice.employeeapp.entity.Employee;
import com.microservice.employeeapp.feignclient.AddressFeignClient;
import com.microservice.employeeapp.repo.EmployeeRepo;
import com.microservice.employeeapp.response.AddressResponse;
import com.microservice.employeeapp.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    //@Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private WebClient webClient;

    @Autowired
    private AddressFeignClient addressFeignClient;

   /* @Value("${addressService.base.url}")
    private String addressBaseUrl;*/

//    public EmployeeService(@Value("${addressService.base.url}") String addressBaseUrl, RestTemplateBuilder builder) {
//        this.restTemplate = builder
//                .rootUri(addressBaseUrl)
//                .build();
//
//    }
    public EmployeeResponse getEmployee(Integer id) {
        Employee employee = employeeRepo.findById(id).get();
        EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
        AddressResponse addressResponse = addressFeignClient.getAddressById(id);
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }

   /* private AddressResponse getAddressByWebClient(Integer id) {
        return webClient
                .get()
                .uri("/address/" + id).retrieve()
                .bodyToMono(AddressResponse.class).block();
    }
*/
    private AddressResponse getAddressByRestTemplate(Integer id) {
        return restTemplate.getForObject("/address/{id}", AddressResponse.class, id);
    }
}
