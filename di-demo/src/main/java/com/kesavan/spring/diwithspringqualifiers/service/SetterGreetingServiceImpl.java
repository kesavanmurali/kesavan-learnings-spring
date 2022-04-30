package com.kesavan.spring.diwithspringqualifiers.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return("Hello from SetterGreetingServiceImpl - Spring");
    }
}
