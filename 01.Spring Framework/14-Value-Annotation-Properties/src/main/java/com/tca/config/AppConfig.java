package com.tca.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.tca")
@PropertySource(value = { "myapp.properties" })

//--> It is used to specify name of Properties file(e.g config.properties)
//--> Properties file are kept in foloder src/main/resources
//--> It is repeatable annotation.

public class AppConfig
{
	//bean classes
}
