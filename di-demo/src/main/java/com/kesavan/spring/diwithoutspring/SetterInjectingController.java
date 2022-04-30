package com.kesavan.spring.diwithoutspring;

import com.kesavan.spring.diwithoutspring.service.GreetingService;

public class SetterInjectingController {

    private GreetingService greetingService;

    public String getGreetings(){
        return this.greetingService.greet();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
