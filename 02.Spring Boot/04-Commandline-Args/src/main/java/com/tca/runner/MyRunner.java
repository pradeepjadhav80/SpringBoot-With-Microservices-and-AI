package com.tca.runner;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner
{

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		List<String> lst = args.getNonOptionArgs();
		//It is used for the single Value Like[Mumbai,Pune]
		
		if(lst.isEmpty())
		{
			System.out.println("No Non-Options Argument Sent");
		}
		else
		{
			System.out.println("Non-Option Args List : "+lst);
		}
		
		if(args.containsOption("admin.user"))
		{
			List<String> lst2 = args.getOptionValues("admin.user");
			System.out.println("Option Args List : "+lst2);
		}
		else
		{
			System.out.println("No Admin User sent !!");
		}
		//Returns Only the Keys(names) of all named (option) arguments as a Set 
		Set<String> set = args.getOptionNames();
		System.out.println("Keys : "+set);
		
		for(String data :set)
		{
			System.out.println(data+"-->"+args.getOptionValues(data));
		}
		
	}

}
