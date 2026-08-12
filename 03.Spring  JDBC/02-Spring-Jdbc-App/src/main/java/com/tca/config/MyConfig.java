package com.tca.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@Configuration
public class MyConfig 
{
	/*
	@Bean
	public SimpleJdbcCall getJdbcCall(DataSource source)
	{
		//There are single function in the database then we write function name direct if there are multiple function.. 
		//name then we have to write function name in studentRepository class wich function has to call.
		return new SimpleJdbcCall(source).withFunctionName("get_grade");
		
		//return new SimpleJdbcCall(source);
	}
	*/
}
