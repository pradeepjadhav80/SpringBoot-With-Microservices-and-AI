package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer rno;
	private String name;
	private Double per;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private LocalDate birthDate;
}
