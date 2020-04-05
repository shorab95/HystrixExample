package com.example.HystrixExample.controller;

import com.example.HystrixExample.model.Employee;
import com.example.HystrixExample.service.HelloService;
import com.example.HystrixExample.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private HelloService  helloService;

    @GetMapping("/user/hystrix")
    public List<Employee> getAllUsers()
    {
        return userService.getAllUsers();
    }
    @GetMapping("/helloService")
    public String helloService()
    {
        return helloService.hello();
    }



}
