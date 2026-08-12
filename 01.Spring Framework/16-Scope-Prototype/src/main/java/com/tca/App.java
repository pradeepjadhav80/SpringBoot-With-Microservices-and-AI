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
    	
    	System.out.println(service1);
    	System.out.println(service2);
    	
    	//It lazy binding beacuase every time object is created when we call getBean when container start object will be not created 
    	
        System.out.println("Bye !!");
    }
}
