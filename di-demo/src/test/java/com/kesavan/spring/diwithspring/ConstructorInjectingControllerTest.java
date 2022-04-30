package com.kesavan.spring.diwithspring;

import com.kesavan.spring.diwithspring.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectingControllerTest {

    @Autowired
    private ConstructorInjectingController controller;

    @BeforeEach
    public void setup(){
        /* Nothing to do. */
    }

    @Test
    public void test(){

        assertEquals("I am Spring maintained ConstructorInjectingController", this.controller.toString());
        assertEquals("Hello from GreetingServiceImpl - Spring", this.controller.getGreetings());

        System.out.println("ConstructorInjectingControllerTest Successfull");
    }

}
