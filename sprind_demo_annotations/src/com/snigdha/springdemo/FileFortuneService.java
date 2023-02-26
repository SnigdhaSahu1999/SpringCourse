package com.snigdha.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
class FileFortuneService implements FortuneService {
	
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		String arr[] = new String[4];
		File file = new File("C:\\Users\\SNIGDHA SAHU\\eclipse-workspace\\sprind_demo_annotations\\src\\com\\snigdha\\springdemo\\dependencyInjectionWithAnnotations.txt");
	 
		 try {
	        BufferedReader br = new BufferedReader(new FileReader(file));
	 
	        // Declaring a string variable
	        String st;
	        // Condition holds true till
	        // there is character in a string
	        	
	        	int c = 0;
				while ((st = br.readLine()) != null)
 
				    // Print the string
					arr[c] = st;
					c += 1;

			} catch (IOException e) {
				
				System.out.println("IOException "+e);
			}
		 
		 int index = myRandom.nextInt(arr.length);
		 return(arr[index]);
		 
		
	}


}
