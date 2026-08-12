package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.ServiceA;

public class App {
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        ServiceA serviceA = context.getBean(ServiceA.class);
         
        System.out.println(serviceA.getMessage());
        
        System.out.println("Bye !!");
        
        ((ClassPathXmlApplicationContext)context).close();
    }
}
