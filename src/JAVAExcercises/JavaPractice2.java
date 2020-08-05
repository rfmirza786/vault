package JAVAExcercises;

import java.util.Scanner;

public class JavaPractice2 {	
	

	public static void main(String[] args) {
		
		//Exercise # 7 from https://www.w3resource.com/java-exercises/basic/index.php
//		
//		Scanner input = new Scanner (System.in);
//		System.out.println("Enter Number: ");
//		int num1 = input.nextInt();
//		
//		for(int i=0; i<10; i++){
//			System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
//		}	
		
		//Exercise # 9 https://www.w3resource.com/java-exercises/basic/index.php
		
//		double x = 25.5;
//		double y = 3.5;
//		double z = 40.5;
//		double a = 4.5;		
//		
//		System.out.println((x * y - y * y) / (z - a));	
//		
//		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));  //This method shown in the book
		
		//Exercise # 9
		
//		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		
		//Exercise 12 from https://www.w3resource.com/java-exercises/basic/index.php	
//		
//		Scanner input = new Scanner(System.in);		
//		
//		System.out.println("input first numb:");
//		int num1 = input.nextInt();
//		System.out.println("input second numb:");
//		int num2 = input.nextInt();
//		System.out.println("input third numb:");
//		int num3 = input.nextInt();
//		
//		int a = (num1+num2+num3)/3;
//		
//		System.out.println("Average to three numbers is : " + a);
		
		//Exercise 13 EXCELLENT: using float values in scanner 
		
		Scanner input = new Scanner (System.in);
		
		 
		System.out.println("Enter width:");
		float width = input.nextFloat();		//write float before width, will be able to get input.nextFloat 
		System.out.println("Enter height:");
		float height = input.nextFloat();		//write float before width, will be able to get input.nextFloat 
			
			float Area = (width*height);
			float Perimeter= 2*(width+height);
			
			System.out.println("the Area is:"+Area);
			System.out.println("The Perimeter is :" + Perimeter);			
			
				}
}
