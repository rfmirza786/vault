package AssignmentsJava;

import java.util.Scanner;

public class Assignment7 {
	
	//SCANNER USED	
	//Write a program to calculate the average height of all the students of a class. 
	//The number of students and their heights in a class are entered by

	public static void main(String[] args) {
		  	
		  	float sum = 0, avg;
		  	
		    Scanner s1 = new Scanner(System.in);
		    
		    System.out.println("Enter number of students");
		    int n = s1.nextInt();
		    
		    System.out.println("Enter height of students");
		    
		    for (int i = 0; i < n; i++) {
		    	System.out.println("Student " + (i+1) + ":");
		    	float height = s1.nextFloat();
		    	sum = sum + height;
		    }
		    
		    avg = sum/n;
		    System.out.println("Average heigth : " + avg);
		  }		
	}