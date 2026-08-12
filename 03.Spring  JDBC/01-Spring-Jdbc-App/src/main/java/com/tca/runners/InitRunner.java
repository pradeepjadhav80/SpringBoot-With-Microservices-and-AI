package com.tca.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class InitRunner implements ApplicationRunner
{
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		// TODO Auto-generated method stub
		jt.execute("Drop table IF EXISTS student");
		System.out.println("Table is Deleted Successfully !!");
		
		jt.execute("create table student(rno int primary key,name varchar(20),per float,city ");
		System.out.println("Table is Created !!");
		
		jt.update("Insert into student values(101,'Pradeep',90.2,'Pune')");
		jt.update("Insert into student values(102,'Aniket',80.2,'Pakistan')");
		jt.update("Insert into student values(103,'Tejas',10.2,'Delhi')");
		System.out.println("Record is Inserted Successfully !!");
	}

}
