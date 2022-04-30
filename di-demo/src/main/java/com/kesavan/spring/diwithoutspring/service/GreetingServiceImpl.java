package com.kesavan.spring.diwithoutspring.service;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return("Hello from GreetingServiceImpl");
    }
}
