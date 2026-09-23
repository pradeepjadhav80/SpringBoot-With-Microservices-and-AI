package com.tca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{
	@Query("SELECT s FROM Student s")
	public List<Student> findAllUsingJPQL();
	
	//It is Database depdent Query.
	@Query(value="select * from student",nativeQuery=true)
	public List<Student> findAllUsingSQL();
	
	//findPercentageRangeUsingJPQL
	
	@Query(value="select s from Student s where s.per>=:start and per < :end")
	public List<Student> findPercentageRangeUsingJPQL(@Param("start") Double start,@Param("end") Double end);
	
	@Query(value="select s.name,s.per,s.gender from Student s where s.per > :per and s.gender = :gender")
	public List<Object[]> findGenderNamePer(Double per,Gender gender);
	
	
	
	
}
