package com.tca;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.tca.repository.StudentRepository;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args)
	{
		ApplicationContext context =  SpringApplication.run(Application.class, args);
		StudentRepository rp = context.getBean(StudentRepository.class);
		
		//Map<String,Object> map = rp.getStudentGrade(101);
		
		String grade = rp.getStudentGrade(101);
		
		System.out.println("Map : "+grade);
	}
	
	//We can make Bean Object in main class also beacuase @SpringBootApplication this annotation is made from 3 annotation one in @Configuration also.
	
	
	@Bean
	public SimpleJdbcCall getJdbcCall(DataSource source)
	{
		//There are single function in the database then we write function name direct if there are multiple function.. 
		//name then we have to write function name in studentRepository class wich function has to call.
		return new SimpleJdbcCall(source).withFunctionName("get_grade");
		
		//return new SimpleJdbcCall(source);
	}

}

/*
  Making the function of the plsql 
  
DELIMITER $$
Create Function get_grade(prno int)
RETURNS varchar(30)
READS SQL DATA
Begin
	DECLARE grade varchar(30);
	DECLARE tper float;
	select per INTO tper from student where rno=prno;

	if tper >= 70 then 
		set grade = 'Distinction';
	elseif tper >= 60 then 
		set grade = 'FIRST CLASS';
	elseif tper >= 50 then 
		set grade = 'SECOND CLASS';
	elseif tper >= 40 then 
		set grade = 'PASS CLASS';
	else 
		set grade = 'FAIL';	
	END IF;

	RETURN grade;

End$$
DELIMITER ;

 */
