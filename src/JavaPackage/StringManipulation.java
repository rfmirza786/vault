package JavaPackage;

import java.util.concurrent.SynchronousQueue;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "This is my first java code and I am so happy";
			
		//To calculate length of the string given above
		System.out.println(str.length());					//0-44 remember 'y' is at 43
			
		System.out.println(str.charAt(3)); 					//0-3= s		
		System.out.println(str.indexOf('i'));				// First occurrence of i=2
		
		//To find 2nd occurrenct of i we use method overload feature of .indexof to start from 3rd position		
		System.out.println(str.indexOf('i', 3));			//5
		
		//remove hard coded value of 3 to start the count after first i has been found
		System.out.println(str.indexOf('i',str.indexOf('i')+1));
		
		System.out.println(str.indexOf("Testing"));  //since testing NOt available it gives -1 and Not 0 and 
													//not null as the answer is integer NOT String.
		//trim
		String st ="       hello world     "; 
		System.out.println(st.trim());	//Before Space and After Space will be trimmed but NOT between Space only 
										//corner space
		//Date Format
		String dob = "01-01-1990";  						//should be this form: 01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		//LCase & UCase
		String sc = "This Is Java";		
		System.out.println(sc.toLowerCase());
		System.out.println(sc.toUpperCase());
		
		//ignore U or L case
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")){		
			System.out.println("launch browser");
		}

}
}
