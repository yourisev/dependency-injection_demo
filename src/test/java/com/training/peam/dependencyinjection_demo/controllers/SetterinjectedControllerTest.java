package com.training.peam.dependencyinjection_demo.controllers;

import com.training.peam.dependencyinjection_demo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterinjectedControllerTest {

    private SetterinjectedController setterinjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterinjectedController = new SetterinjectedController();
        this.setterinjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterinjectedController.sayHello());
    }
}
