package com.training.peam.dependencyinjection_demo;

import com.training.peam.dependencyinjection_demo.controllers.ConstructorinjectedController;
import com.training.peam.dependencyinjection_demo.controllers.DemoController;
import com.training.peam.dependencyinjection_demo.controllers.PropertyinjectedController;
import com.training.peam.dependencyinjection_demo.controllers.SetterinjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
        DemoController controller = (DemoController) context.getBean("demoController");


    }

}
