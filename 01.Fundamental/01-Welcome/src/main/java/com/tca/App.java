package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.WelcomeBean;

public class App 
{
    public static void main(String[] args) 
    {
    	//1. Creating and Strating Container
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        
        //2. Get the object of the Bean
        //Object obj = context.getBean("WelcomeBean.class");
        //WelcomeBean wb = (WelcomeBean)obj;
        
        WelcomeBean wb = (WelcomeBean)context.getBean(WelcomeBean.class);
        
        //3. call bean method /bussiness logic
        String msg = wb.getMessage();
        
        System.out.println(msg);
    }
}
