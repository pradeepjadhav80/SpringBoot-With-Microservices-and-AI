package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
	@SequenceGenerator(name="rno_gen",sequenceName="student_seq",allocationSize=1)//Sequence name at DB side
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="rno_gen")			//AllocationSize muc match increment by 1
	private Integer rno;
	
	private String name;
	private Double per;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private LocalDate birthDate;
}
