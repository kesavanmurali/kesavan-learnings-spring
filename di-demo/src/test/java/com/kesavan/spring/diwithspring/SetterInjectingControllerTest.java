package com.kesavan.spring.diwithspring;

import com.kesavan.spring.diwithspring.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetterInjectingControllerTest {

    private SetterInjectingController controller;

    @BeforeEach
    public void setup(){
        this.controller = new SetterInjectingController();
        this.controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void test(){
        assertEquals("Hello from GreetingServiceImpl - Spring", this.controller.getGreetings());
    }

}
