package com.example.HystrixExample.service;

import com.example.HystrixExample.model.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Value("${client.url}")
    private String url;
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(groupKey = "sdf",commandKey = "gbyuhf",fallbackMethod="fallbackMethod")
    public List<Employee> getAllUsers(){
        List<Employee> forObject = (List<Employee>) restTemplate.getForObject(url, Employee.class);
        return forObject;
    }
    public List<Employee> fallbackMethod()
    {
        return  Collections.emptyList();
    }

}
