package AccessModifiers2;

import AccessModifiers1.Car;

public class Audi extends Car{

	public static void main(String[] args) {
		
		Audi a = new Audi();
		
		//a.wheels();			default Not accessed by Different Package subclass 
		//a.price();			private Not accessed by Different Package subclass
		
		String eng= a.engine;
		System.out.println(eng);
		
		String NM = a.name;
		System.out.println(NM);
		
		
		
		
		
		

	}

}
