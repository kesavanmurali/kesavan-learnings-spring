package com.kesavan.spring.diwithspringqualifiers.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return("Hello from PropertyGreetingServiceImpl - Spring");
    }
}
