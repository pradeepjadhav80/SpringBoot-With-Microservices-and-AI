package com.tca.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository	
public class StudentRepository 
{
	@Autowired
	SimpleJdbcCall jdbcCall;
	
	public String getStudentGrade(int rno)
	{
		//jdbcCall.withFunctionName("get_grade");
		//jdbcCall.withCatalogName("sb01db");
		//Catalog is used when there are multiple function with same in diffrent database then Exception will be come 
		//To Solve this we have to specify the database name.
		
		//Map<String,Object> map = jdbcCall.execute(rno);
		//Map will return in the key value form then key will be return.
		
		//when we want to print only the grade 
		Map<String,Object> map = jdbcCall.execute(rno);
		
		return map.get("return").toString();
	}
}
