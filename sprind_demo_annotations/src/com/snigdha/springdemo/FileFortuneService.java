package com.snigdha.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

/*Assignment 5*/

@Component
class FileFortuneService implements FortuneService {
	
	
	private Random myRandom = new Random();
	private List<String> arr;
	private String directory = "C:\\Users\\SNIGDHA SAHU\\eclipse-workspace\\sprind_demo_annotations\\src\\com\\snigdha\\springdemo\\fortune-data.txt";

	@Override
	public String getFortune() {
		
		File file = new File(directory);
		arr = new ArrayList<String>();
		 try (BufferedReader br = new BufferedReader(new FileReader(file))){
	       
	        // Declaring a string variable
	        String st;
	        // Condition holds true till
	        // there is character in a string
	        	
				while ((st = br.readLine()) != null) {
 
				    arr.add(st);
				}

			} catch (IOException e) {
				
				System.out.println("IOException "+e);
			}
		 
		 
		 int index = myRandom.nextInt(arr.size());
		 return(arr.get(index));
		 
		
	}


}
