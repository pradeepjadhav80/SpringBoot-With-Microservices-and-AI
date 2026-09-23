package com.tca.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class Address 
{
	private String houseNumber;
	private String street;
	private String city;
	private String pinCode;
	
	//@Embeddable classes do not have a primary .
	//This class is not Entity class .
	//this class does not have seprate database table. 
}
