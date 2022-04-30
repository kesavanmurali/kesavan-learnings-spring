package com.kesavan.spring.diwithspringqualifiers;

import com.kesavan.spring.diwithspringqualifiers.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PropertyInjectingController {

    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    private GreetingService greetingService;

    public String getGreetings(){
        return this.greetingService.greet();
    }
}
