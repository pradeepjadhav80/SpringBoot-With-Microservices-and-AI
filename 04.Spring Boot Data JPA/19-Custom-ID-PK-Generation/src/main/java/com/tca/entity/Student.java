package com.tca.entity;

import java.time.LocalDate;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Student 
{
	@Id
	@GenericGenerator(name="my-custom-generator",strategy="com.tca.generator.IdGenerator")
	@GeneratedValue(generator="my-custom-generator")
	private String rno;
	private String name;
	private Double per;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private LocalDate birthDate;
}
