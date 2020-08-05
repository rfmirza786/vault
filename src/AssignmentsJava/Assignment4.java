package AssignmentsJava;

import java.util.Scanner;

public class Assignment4 {
	
				//Using Scanner HERE:

		public static void product(){	
			Scanner s = new Scanner(System.in);		//import Scanner
			int e, f;	
			System.out.println("Enter a number: ");
			e=s.nextInt();
			System.out.println("Enter another number: ");
			f=s.nextInt();
			System.out.println("Product is:" + (e*f));
			}
		public static void main(String[] args) {
			product();
		}
		
		
		
	}		