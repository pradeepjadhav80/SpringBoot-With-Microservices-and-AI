package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student 
{
	@Id
	@Column(name="RNO")
	private Integer rno;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PER")
	private Double per;
	
	@Column(name="GENDER")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name="BIRTH_DATE")
	private LocalDate birthDate;
	
}
