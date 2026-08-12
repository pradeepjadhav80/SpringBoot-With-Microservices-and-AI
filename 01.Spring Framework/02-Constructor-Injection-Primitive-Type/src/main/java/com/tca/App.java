package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.Demo;

public class App 
{
    public static void main(String[] args) 
    {
    	//1. Creating and starting Container
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        //2. Get the Object of the Bean class
        Demo demo = (Demo)context.getBean(Demo.class);
        
        System.out.println(demo.getMsg());
        System.out.println(demo.getId());
    }
}
