package com.kesavan.spring.diwithspringqualifiers;

import com.kesavan.spring.diwithspringqualifiers.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectingController {

    private final GreetingService greetingService;

    public ConstructorInjectingController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return this.greetingService.greet();
    }

    @Override
    public String toString() {
        return "I am Spring maintained ConstructorInjectingController";
    }
}
