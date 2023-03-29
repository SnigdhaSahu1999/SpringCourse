package com.snigdha.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  							//to help Java know this is a configuration file
//@ComponentScan("com.snigdha.springdemo")   // this works exactly as XML component scanning
public class SportConfig {
	
	// define bean(object) for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean(object) for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	

}
