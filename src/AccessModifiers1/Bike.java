package AccessModifiers1;

public class Bike {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		//b.price		private-price could not be accessed	by Non-subclass, NO subclass and No extends
		
		String Nm = c.name;
		System.out.println(Nm);
		

	}

}
