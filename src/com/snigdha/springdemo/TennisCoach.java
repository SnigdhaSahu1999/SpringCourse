package com.snigdha.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*giving bean id in the annotation
@Component("thatSillyCoach")*/

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	/*@Autowired  // Spring will find a bean that implements FortuneService
		//Constructor Injection
	public TennisCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}*/
	
	
	//define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	@Autowired
	//Setter Injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside Setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
