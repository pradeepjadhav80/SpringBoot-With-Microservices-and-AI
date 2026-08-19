package com.tca.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tca.model.Student;

@Repository
public class StudentRepository 
{
	@Autowired
	JdbcTemplate jt;
	
	public boolean saveStudent(Student ob)
	{
		String sql = "INSERT INTO student values(?,?,?,?)";
		jt.update(sql, ob.getRno(), ob.getName(), ob.getPer(), ob.getCity() );
		return true;
	}
	public List<Map<String , Object>>   findAll()
	{
		String sql = "SELECT * FROM student";
		
		return jt.queryForList(sql);
	}
}
