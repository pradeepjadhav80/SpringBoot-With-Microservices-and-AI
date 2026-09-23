package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@NamedNativeQuery(name="Student.findAllByGreaterThanPercentageAndGender",
				  query="select * from student",resultClass=Student.class)

@NamedNativeQuery(name="Student.updateName",
				 query="update student set name = :name where rno = :rno")

@NamedNativeQuery(name="Student.findGenderAndName",
					query="select gender,name from student")

@NamedNativeQuery(name="Student.countByGender",
				 query="select gender,count(gender) from student group by gender")

public class Student 
{
	@Id
	@Column(name="RNO")
	private Integer rno;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PER")
	private Double per;
	
	@Enumerated(EnumType.STRING)
	@Column(name="GENDER")
	private Gender gender;
	
	@Column(name="BIRTH_DATE")
	private LocalDate birthDate;
}
