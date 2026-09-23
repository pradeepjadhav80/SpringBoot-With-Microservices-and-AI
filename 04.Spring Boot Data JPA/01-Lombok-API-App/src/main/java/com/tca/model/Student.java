package com.tca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
//@Setter
//@Getter
//@ToString
@Data 			//It Combination of the setter,getter,toString,EqualsAndHashCode
public class Student 
{
	//Why should use lombok --> When we declare member and after requirement comes we have to change the 
	//member name first we have generated getter and setter then after we have to change the getter and setter it is drawback
	
	private Integer rno;
	private String name;
	private Double per;
	private String city;
}
