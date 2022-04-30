package com.kesavan.spring.diwithspring;

import com.kesavan.spring.diwithspring.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectingController {

    private final GreetingService greetingService;

    public ConstructorInjectingController(GreetingService greetingService){
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
