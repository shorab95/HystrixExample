package com.example.HystrixExample.service;

import com.example.HystrixExample.model.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import javafx.application.Application;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Service
public class HelloService {

    //private static final Logger LOGGER= (Logger) LoggerFactory.getLogger(HelloService.class);


    @Value("${client.url}")
    private String url;
    @Autowired
    private RestTemplate restTemplate;
    @CrossOrigin
    @HystrixCommand(groupKey = "sdf",commandKey = "gbyuhf",fallbackMethod="fallbackMethod")
    public String hello()
    {
        String resp = restTemplate.getForObject(url,String.class);
      //  LOGGER.info(resp);
        return resp;
    }
    public String fallbackMethod()
    {
       // LOGGER.info("Inside fallback");
        return  "Service Failed";
    }

}
