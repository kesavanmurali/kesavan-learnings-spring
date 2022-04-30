package com.kesavan.spring.diwithoutspring;

import com.kesavan.spring.diwithoutspring.service.GreetingService;

public class ConstructorInjectingController {

    private final GreetingService greetingService;

    public ConstructorInjectingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return this.greetingService.greet();
    }

}
