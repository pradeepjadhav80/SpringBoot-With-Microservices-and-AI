package com.tca.dto;

import org.springframework.stereotype.Component;

import com.tca.entity.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO 
{
	private String name;
	private Double per;
	private Gender gender;
	
}
