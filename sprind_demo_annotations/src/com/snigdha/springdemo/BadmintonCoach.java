package com.snigdha.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

//Activity -4
@Component
public class BadmintonCoach implements Coach {
	
	//constructor
	public BadmintonCoach() {
		System.out.println("This is BadmintonCoach's constructor.");
	}
	
	private List<String> arr;
	private String directory = "C:\\Users\\SNIGDHA SAHU\\eclipse-workspace\\sprind_demo_annotations\\src\\com\\snigdha\\springdemo"
			+ "\\fortune-data.txt";
	
	//Activity - 6
	@PostConstruct
	public void doMyStartupStuff() throws IOException {
		System.out.println("The BadmintonCoach's doMyStartupStuff id called after creation of constructor.");
		File file = new File(directory);
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String st;
			
			while((st = br.readLine()) != null) {
				System.out.println(st);
			}
		}
		catch(Exception e) {
			System.out.println("Exception in BadmintonCoach's doMyStartupStuff");
		}
		
	}
	

	@Override
	public String getDailyWorkout() {
		
		return "Practice striking a shuttlecock";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Hi!";
	}
	

}
