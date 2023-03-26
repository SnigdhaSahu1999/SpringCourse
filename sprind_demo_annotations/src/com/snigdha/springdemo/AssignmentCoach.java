package com.snigdha.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*Assignment 5*/
@Component
public class AssignmentCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		
		return ("Complete assignments on daily basis!");
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
