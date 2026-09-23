package com.tca.generator;

import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class IdGenerator implements IdentifierGenerator
{
	private final String prefix;
	
	public IdGenerator(TcaId tcaid)
	{
		this.prefix = tcaid.name();
	}

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) 
	{
		Random r = new Random();
		int a = r.nextInt();
		int b = r.nextInt();
		int c = r.nextInt();
		
		return "TCA-"+prefix+"-"+a+b+c;
	}

}
