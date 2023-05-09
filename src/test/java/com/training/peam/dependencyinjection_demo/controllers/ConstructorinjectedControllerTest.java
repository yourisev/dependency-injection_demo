package com.training.peam.dependencyinjection_demo.controllers;

import com.training.peam.dependencyinjection_demo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorinjectedControllerTest {

        private ConstructorinjectedController constructorinjectedController;
    @Before
    public void setUp() throws Exception{
        this.constructorinjectedController = new ConstructorinjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorinjectedController.sayHello());
    }
}
