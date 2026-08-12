package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.beans.ServiceA;

public class App 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        ServiceA serviceA = context.getBean(ServiceA.class);
        
        serviceA.display();
        
        System.out.println("Bye !!");
    }
}
