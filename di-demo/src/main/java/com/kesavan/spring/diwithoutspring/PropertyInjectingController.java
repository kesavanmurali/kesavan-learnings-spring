package com.kesavan.spring.diwithoutspring;

import com.kesavan.spring.diwithoutspring.service.GreetingService;

public class PropertyInjectingController {

    public GreetingService greetingService;

    public String getGreetings(){
        return this.greetingService.greet();
    }

}
