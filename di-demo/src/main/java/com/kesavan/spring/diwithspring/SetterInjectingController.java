package com.kesavan.spring.diwithspring;

import com.kesavan.spring.diwithspring.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

public class SetterInjectingController {

    private GreetingService greetingService;

    public String getGreetings(){
        return this.greetingService.greet();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
