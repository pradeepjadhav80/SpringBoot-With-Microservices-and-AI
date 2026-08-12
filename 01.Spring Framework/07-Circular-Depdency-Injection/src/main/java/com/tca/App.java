package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.ClassA;

public class App 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        ClassA classA = (ClassA)context.getBean(ClassA.class);
        
       classA.display();
    }
}
