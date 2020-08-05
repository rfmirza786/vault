package AssignmentsJava;

import java.util.Scanner;

public class Assigmment8 {

			

//		int x=74,y=36;
//		int sum=x+y;
//		System.out.println("Sum of two number is :" + sum);	
//		
//		System.out.println("*************************************************************");
//		
//		int a=50;
//		int b=3 ;
//		int division=a/b;
//		
//		System.out.println("Division of two number is: " + division);
//		
//		System.out.println("*************************************************************");
//
//		System.out.println( -5 + 8 * 6);
//		
//		System.out.println("*************************************************************");
//	
		
		public static void product(){	
			Scanner s = new Scanner(System.in);		//import Scanner
			
			int c, d;
			
			System.out.println("Enter an amount1:");
			c=s.nextInt();
			System.out.println("Enter an aount2:");
			d=s.nextInt();
			
			System.out.println("Product =" + (c*d));
		}
			
			public static void main(String[] args) {
			
			product();
			}
		
}
