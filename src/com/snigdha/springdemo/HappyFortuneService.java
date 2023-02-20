package com.snigdha.springdemo;

import org.springframework.stereotype.Component;


@Component  //Spring can auto scan and find this implementation for the Spring container
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

}
