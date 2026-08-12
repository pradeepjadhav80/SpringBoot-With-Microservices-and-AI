package com.tca.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetBean 
{
	//This Annotation will be add depdency object on the depdent class
	//@Autowired
	private WelcomeBean welcomeBean;
	
	public GreetBean()
	{
		System.out.println("GreetBean is Created  !!");
	}
/*	
	@Autowired
	public GreetBean(WelcomeBean welcomeBean)
	{
		this.welcomeBean = welcomeBean;
		System.out.println("GreetBean is Created  --> Using Constructor Injection !!!");
	}
*/
	@Autowired
	public void setWelcomeBean(WelcomeBean welcomeBean)
	{
		this.welcomeBean=welcomeBean;
		System.out.println("GreetBean is Created --> Using Setter Injection !!!");
	}
	public void greet()
	{
		welcomeBean.printMessage();
	}
}
