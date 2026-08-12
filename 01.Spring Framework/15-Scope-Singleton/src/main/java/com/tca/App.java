package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.config.AppConfig;
import com.tca.service.ServiceA;

public class App 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceA service1 = context.getBean(ServiceA.class);
        ServiceA service2 = context.getBean(ServiceA.class);
        
        //System.out.println(service1);
        //System.out.println(service2);
        
        //In singleton only single object will be created
        //when we call getBean() it will give object bean from the container not create new object
        //When we write lazy then when container start object will be not created when we call that class by getBean then object wil be created
        
        System.out.println("Bye !!");
    }
}
