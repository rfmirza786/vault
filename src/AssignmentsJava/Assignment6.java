package AssignmentsJava;

import java.util.Scanner;

public class Assignment6 {
	
		////SCANNER USED	Naveen Assignment

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your marks");
		int x = s.nextInt();
		if(x<=40){
			System.out.println("Fail");
		}
		else if(x >=41 && x<50){
			System.out.println("DD");
		}	
		else if(x >=51 && x<60){
			System.out.println("CD");
		}
		else if(x >=61 && x<70){
			System.out.println("BC");
		}
		else if(x >=71 && x<80){
			System.out.println("BB");
		}
		else if(x >=81 && x<90){
			System.out.println("AB");
		}
		else if(x >=91 && x<100){
			System.out.println("AA");
		}
		else{
			System.out.println("Marks not correct, please enter again");
		}
		
		
		
		
	}  
}
