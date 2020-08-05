package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();     		//BMW start method will be called as it has overridden car class start
		b.stop(); 			//BMW will inherit from Car class
		b.refuel(); 		//BMW will inherit from Car class
		b.autoParking(); 	//BMW own method will be called from BMW
		b.engine(); 		//To access this method we had to create relationship Car extends Vehicle
		
		Car c = new Car();
		c.start();			//Car start method  will be called
		c.stop();			//Car stop method will be called
		c.refuel();			//Car refuel method will be called
		c.engine(); 		//Car created extends Vehicle to access all Vehicle methods
		
		Audi au = new Audi();
		au.start();			//Audi start method will be called as it has overridden car class start		
		au.stop();			//Car stop method will be called
		au.refuel(); 		//Audi refuel method will be called as it has overridden car class refuel
		
		//Top Casting
		Car c1 = new BMW();	 //Created BMW object Without reference, but Car class providing reference
							//child class can be referenced by parent class(top casting), possible in Java
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoParking(); // car ref c1 can access overridden & non-overridden methods but NOT proprietary methods.  
							//c1 ref will be stopped by a layer called reference type check. Itwill confirm where c1 
							//coming from? As it is coming from c1, the car reference it will NOt allow access.
		
		//Down Casting opposite of Down Casting is NOT allowed in Java at RunTime: 
		
		//new Car();					//Parent class object
		//BMW b1 = new Car();			//child class reference
		//BMW b1 = (BMW) new Car();		//use (BMW) will get error:"main" java.lang.ClassCastException:
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
