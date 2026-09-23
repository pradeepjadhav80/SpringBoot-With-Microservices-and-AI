package com.tca.generator;

import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

@Component
public class IdGenerator implements IdentifierGenerator
{
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) 
	{
		Random r = new Random();
		int a = r.nextInt();
		int b = r.nextInt();
		int c = r.nextInt();
		int d = r.nextInt();
		
		return "TCA-"+a+b+c+d;
	}
	
}
