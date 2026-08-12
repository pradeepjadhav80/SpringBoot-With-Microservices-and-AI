package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.MessageSender;

public class App 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        MessageSender ms = context.getBean(MessageSender.class);
        
        System.out.println(ms.getMessage());
        
        //You get error because close() method is not present in ApplicationContext
        //It is present in Implementation class
        //context.close();

        //ThereFore use downcasting to close the context
        
          (( ClassPathXmlApplicationContext)context).close();
        
        System.out.println("bye");
    }
}
