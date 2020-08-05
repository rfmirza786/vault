package JavaPackage;

public class StaticVsNonStaticConcept {
	
	String name;								//Non Static variable
	static int age;								//Static variable
	
	public void getName(){						//Non Static Method
		System.out.println("get name");
	}
	public static void getEmail(){				//Static Method
		System.out.println("get email");
	}

	public static void main(String[] args) {
		
	//1. How to access Non-Static Var & Methods: create the Object:
		StaticVsNonStaticConcept obj = new StaticVsNonStaticConcept();
		obj.name = "Tom";
		System.out.println(obj.name);
		obj.getName();
		
	//2. How to access Static Var & Methods.
		//a. Call them directly (Static is stored inside CMA-Common Memory Area)
		getEmail();
		
		age=20; 								//Static stuff can be directly assigned.
		System.out.println(age);
		
		//b.call them by class name:
		StaticVsNonStaticConcept.age = 30;		//Call/assign static var by class name
		System.out.println(age);
		
		StaticVsNonStaticConcept.getEmail();	//Call/assign static Method by class name
		
		
		
	}

}
