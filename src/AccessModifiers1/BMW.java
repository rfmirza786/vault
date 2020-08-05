package AccessModifiers1;

	public class BMW extends Car {			//(same package create child class-subclass)

	public static void main(String[] args) {
		
			BMW b = new BMW();
			
			String eng = b.engine;
				System.out.println(eng);
			String Nm = b.name;
				System.out.println(Nm);
				
			//b.price		private-price could not be accessed even by subclass from parent
			

	}

}
