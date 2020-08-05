package OOP_Inheritance;

public class BMW extends Car{
	
	//Below is Method Overriding-->when we have a method in parent class(start) and same method in child
	//class with same name and parameters/arguments...
	
	@Override
	public void start(){
		System.out.println("BMW -- start ");
	}
	public void autoParking(){							//This is BMW proprietary method
		System.out.println("BMW -- autoParking ");		
	}
	
	
	
	
	

}
