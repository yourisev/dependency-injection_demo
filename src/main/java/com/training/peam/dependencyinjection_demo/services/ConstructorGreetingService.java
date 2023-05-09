package com.training.peam.dependencyinjection_demo.services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!";
    }
}
