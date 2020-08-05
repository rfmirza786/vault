package JavaPackage;

public class AmazonSearch_MethodOverloading {
					//Java 09
	
	//Good Example of Method Overloading also (Compile time Poly+Morphism). Means:within a class same methods with 
	//same name but different number of param & sequence of param
	
	public void search(){
		System.out.println("0 param search");
	}
	public void search(String name){					//1 param
		System.out.println("1 param name search");
	}
	public void search(int price){						//1 param
		System.out.println("1 param price search");
	}
	public void search(String name, int price){			//2 param-diff seq from below
		System.out.println("2 param name & price search");
	}
	public void search(int price, String name){			//param-diff seq from above
		System.out.println("2 param price & name search");
	}	
		

	public static void main(String[] args) {
		
		//To create above Method create an Object
		AmazonSearch_MethodOverloading am =new AmazonSearch_MethodOverloading();
		am.search();
		am.search("Nike");
		am.search(55, "Nike");
		
		
				
		
				
		
		
		
		
	}

}
