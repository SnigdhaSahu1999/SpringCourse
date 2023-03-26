package com.snigdha.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*giving bean id in the annotation
@Component("thatSillyCoach")*/

@Component
public class TennisCoach implements Coach {
	/*@Autowired  // this is used for field injection by Java Reflections
	private FortuneService fortuneService;*/
	
	@Autowired  // this is used for field injection by Java Reflections
	@Qualifier("randomFortuneService")  //this tells which class should be called 
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
	
	/*@Autowired
	//Setter Injection
	 public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside Setter method");
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	//Method Injection
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside doSomeCrazyStuff");
		this.fortuneService = fortuneService;
	}*/
	
	//define my init method (called after bean is created)
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside of doMyStartuoStuff()");
	}
	
	//define my destroy method (called before bean is destroyed)
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach: inside of doMyCleanupStuff()");
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
