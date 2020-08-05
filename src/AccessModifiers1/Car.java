package AccessModifiers1;

public class Car {

	public String name = "BMW";
	private int price = 30;
	protected String engine = "petrol";
	int wheels = 4; 
	
	public void getName(){								//public method
		System.out.println("get name car");
	}
	private void getPrice(){								//private method
		System.out.println("get Price car");
	}
	protected void getEngine(){								//protected method
		System.out.println("get Engine car");
	}
	void getWheels(){										//default method
		System.out.println("get Wheels car");
	}
	public 	static void main(String ar[]){
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.engine);
		
		c.getEngine();
		
		

	}
	
	
	
	
	
	
	
	
	
	
	}
