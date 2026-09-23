package com.tca.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerLoan 
{
	@EmbeddedId
	private CustomerLoanId customerLoanId;
	private Long LaonAmount;
	private Integer periodMonth;
}
