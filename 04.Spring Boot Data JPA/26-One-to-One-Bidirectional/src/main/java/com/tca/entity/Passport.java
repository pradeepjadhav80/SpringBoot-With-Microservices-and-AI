package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Passport 
{
	@Id
	private Long passportNumber;
	
	private LocalDate expiryDate;
	
	@OneToOne(cascade = CascadeType.ALL ,mappedBy="passport")
	private Person person;
}
