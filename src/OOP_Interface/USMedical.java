package OOP_Interface;

public interface USMedical {
	
	int min_fee = 10;
	// Interview Quest: Interface variables are Static and Final by default...do not need to write.
	
	//interface Never has main method
	//only method declaration
	//no method body--only method prototype
	//Abstract method are methods without any method body--Interface method Cannot be static
	//no business logic inside Interface
	//Cannot create object of Interface
	
	
	public void  orthoServices();  				//no method body or curly bracket { in prototype only semicolon
	
	public void cardioServices();
	
	
	public void neuroServices();
	
	public void Services911();
	
	
	//After jdk 1.8:
	//can define static methods with method body in Interface:
	public static void medicine(){
		System.out.println("USMedical Medicine");
	}
	
	
	
	
	 
	
	
	
	
	
	
	

}
