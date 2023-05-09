package com.training.peam.dependencyinjection_demo.controllers;

import com.training.peam.dependencyinjection_demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorinjectedController {

    public GreetingService greetingService;

    public ConstructorinjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
