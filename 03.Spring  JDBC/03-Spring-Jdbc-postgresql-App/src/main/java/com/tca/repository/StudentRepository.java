package com.tca.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tca.model.Student;

@Repository
public class StudentRepository 
{
	@Autowired
	JdbcTemplate jt;
	
	public int saveStudent(Student ob)
	{
		String sql = "Insert into student values(?,?,?,?)";
		return jt.update(sql,ob.getRno(),ob.getName(),ob.getPer(),ob.getCity());
	}
}
