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
	
	//when we want perform any operation on the jdbc we have JdbcTemplate object 
	
	public int saveStudent(Student student)
	{
		String sql = "Insert into student values(?,?,?,?)";
		return jt.update(sql,student.getRno(),student.getName(),student.getPer(),student.getCity());
		
	}
	
	public int deleteStudent(int studentrno)
	{
		String sql = "Delete from student where rno = ?";
		return jt.update(sql,studentrno);
	}
	public int deleteStudent(String studentcity)
	{
		String sql = "Delete from student where city = ?";
		return jt.update(sql,studentcity);
	}
	public int updateStudent(Student student)
	{
		String sql = "update student set name=?,per=?,city=? where rno=?";
		return jt.update(sql,student.getName(),student.getPer(),student.getCity(),student.getRno());
	}
	public Map<String,Object> findById(int studentRno)
	{
		String sql = "select * from student where rno=?";
		return jt.queryForMap(sql,studentRno);
	}
	public List<Map<String,Object>> findAll()
	{
		String sql="select * from student";
		return jt.queryForList(sql);
	}
	public List<Map<String,Object>> findByCity(String studentCity)
	{
		String sql="select * from student where city=?";
		return jt.queryForList(sql,studentCity);
	}
}
