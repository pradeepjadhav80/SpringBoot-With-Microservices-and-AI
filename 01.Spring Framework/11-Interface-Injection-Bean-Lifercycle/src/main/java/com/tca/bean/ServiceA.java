package com.tca.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServiceA implements BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean
{
	private String message;
	
	//private String myBeanName;
	
	public ServiceA()
	{
		System.out.println("Creation of bean !!");
	}
	
	public void setMessage(String message)
	{
		this.message = message;
		System.out.println("Setter Injection !!");
	}
	
	public String getMessage()
	{
		return message;
	}

	@Override
	public void setBeanName(String name) 
	{
		System.out.println("Bean Name Aware : "+name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException 
	{
		System.out.println("Application Context Name : "+applicationContext);
		
	}

	@Override
	public void destroy() throws Exception 
	{
		System.out.println("Interface destroy() !!");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{

		System.out.println("Interface afterPropertiesSet() !!");
		
	}
	
	public void myInit()
	{
		System.out.println("Custom afterPropertiesSet() !!");
	}
	
	public void myDestroy()
	{
		System.out.println("Custom destroy() !!");
	}
}
