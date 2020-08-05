package JavaPackage;

public class DataConversion {

	public static void main(String[] args) {

//		String x = "100A";
//		System.out.println(x+20);  				// 10020
//		
//		// Convert string to integer:
//		int i = Integer.parseInt(x);
//		System.out.println(i+20); 				// 120
		
		
//		String x = "100A";
//		System.out.println(x+20);
//		int i = Integer.parseInt(x);	     //for "100A" conversion, will get "main" java.lang.NumberFormatException: 
		
		//string to double
		String y="12.33";
		System.out.println(y+20);				// 12.3320
		
		double d = Double.parseDouble(y);
			//System.out.println(d);				// 12.33
			System.out.println(d+20);				// 32.33
			
		//integer to String
			int p = 100;
			System.out.println(p+20);
			
			String p1 = String.valueOf(p);
			System.out.println(p1+20);
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
