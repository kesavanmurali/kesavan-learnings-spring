package com.kesavan.spring.diwithspringqualifiers.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return("Hello from Constructor GreetingServiceImpl - Spring");
    }
}
