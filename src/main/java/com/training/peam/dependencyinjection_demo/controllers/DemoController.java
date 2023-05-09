package com.training.peam.dependencyinjection_demo.controllers;

import com.training.peam.dependencyinjection_demo.services.GreetingService;
import com.training.peam.dependencyinjection_demo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    private GreetingService greetingService;

    public DemoController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hey what's up ?");

        return greetingService.sayGreeting();
    }

}
