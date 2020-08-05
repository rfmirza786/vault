package OOP_Abstract;

public abstract class Page {
	
	//This class Page is Parent class of LoginPage
	
	public Page (){			//Created a constructor but an object Cannot be created to call in Abstract class...
							//so we create an object in child class when that is called it will come here to parent class.
	System.out.println("Page -- default Constructor..." ); 
	}	
	
	//Cannot create object of Abstract class but can create the constructor.  This Page abstract class constructor..
	//will be called when you create object of child class:(LoginPage) 
	// can have both Abstract and non-Abstract methods in the class

	
	public abstract void header();				//abstract method cannot be FINAL	
	public abstract void title();
	
	public void getPageInfo(){
		System.out.println("Page -- getPage info");		
		}
	
	public final void logo(){			//Final so Noone can change
		System.out.println("Page -- logo");
		
	}
	
	//Abstract class can have NO Abstract methods
	
	
	
	
	
	
	
	
	
	
}
