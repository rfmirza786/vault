package JavaPackage;

public class FinalKeyword {

	public static void main(String[] args) {

		//final int i = 10;		//this cannot be reassigned
		
		final int days = 7;
		//days = 10; 				//This is will NOT be allowed
		int totalsalary=days* 50;
		
		System.out.println(totalsalary);
		
		float f=9/2;
		System.out.println(f);  		//Answer will be 4
		
		double g= 9.0/2.0;
		System.out.println(g);			//Now answer will be 4.5
		
		double h= 9/2f;
		System.out.println(h);  		//This will also be 4.5
		
		double i= (float)9/2;
		System.out.println(i);  		//This will also be 4.5
		 
		
		
		
	}

}
