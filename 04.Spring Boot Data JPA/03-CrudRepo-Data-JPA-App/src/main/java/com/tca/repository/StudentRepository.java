package com.tca.repository;

import org.springframework.data.repository.CrudRepository;

import com.tca.entity.Student;

//@Repository 	
//This annotation is optional beacause JPARepository<t,ID> extends the Repository interface
public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
