package com.training.peam.dependencyinjection_demo.controllers;

import com.training.peam.dependencyinjection_demo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyinjectedControllerTest {

    private PropertyinjectedController propertyinjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyinjectedController = new PropertyinjectedController();
        this.propertyinjectedController.greetingServiceImpl = new GreetingServiceImpl();

    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyinjectedController.sayHello());
    }
}
