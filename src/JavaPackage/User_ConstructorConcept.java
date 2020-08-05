 package JavaPackage;

import java.util.ArrayList;

public class User_ConstructorConcept {
	
	//Create variables
	
	String name;
	int age;
	String email;
	boolean isActive;
	char gender;
	long phone;
	ArrayList<String> paymentsOptions;
	
	//1. Looks like a function/Method but it is NOT a function or Method
	//2. Same Name as Class Name
	//3. No void and No return type
	//4. Constructor overloading is possible
	//5. You can create Constructor Object
	//6. PURPOSE Of a Constructor? To create object with limited values or ALL values.  
	//7. How are constructor associated with your class variable?
	//8. Create Constructors with limited values or ALL values
	//9. CONSTRUCTOR  will NEVER return a value.
	//10. CONSTRUCTOR is built with ONLY Non-Static variables.
	//11. CONSTRUCTOR has to be before Main Method and print statement after Main Method:	
	
	//Default Constructor object is created:
	public User_ConstructorConcept(){								//0 param constructor
		System.out.println("default constructor...");		
	}	
	
	//We can Overload Constructor:
	public User_ConstructorConcept(int i){							//1 param constructor
		System.out.println("1 param constructor:" + i);		
	}		
	public User_ConstructorConcept(int i, String p){				//2 param constructor
		System.out.println("2 param constructor:" + p + i);		
	}
	
	//to create user/object class constructor with Limited class variables:	
	public User_ConstructorConcept(String name, int age, String email, boolean isActive){		
		this.name = name;
		this.age =age;
		this.email = email;
		this.isActive = isActive;
			
	}
	
	//create user/object class constructor with ALL class Variables. Here Use (right click+Source):
	//Remember this Constructor has to be before Main Method
	public User_ConstructorConcept(String name, int age, String email, boolean isActive, char gender, long phone,
		ArrayList<String> paymentsOptions) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.isActive = isActive;
		this.gender = gender;
		this.phone = phone;
		this.paymentsOptions = paymentsOptions;
	}	
	
	//Remember this Constructor has to be before Main Method and print statement after Main Method:	
	public User_ConstructorConcept(String name, String email, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	
	public static void main(String[] args){
				
	//Call Constructor after Main method, compiler will decide which Constructor to call based on param:	
		
	User_ConstructorConcept u4 =new User_ConstructorConcept("Tom", 25, "tom@gmail.com", true);		//Assign the values
	User_ConstructorConcept u5 =new User_ConstructorConcept("Ali", 24, "ali@gmail.com", false);
		
	ArrayList<String> paymentList = new ArrayList<String>();			//for payment option create ArrayList
	paymentList.add("CPay");
	paymentList.add("Debit card");
	User_ConstructorConcept u6 =new User_ConstructorConcept("Deep", 26, "deep@gmail.com", true, 'm', 56336, paymentList );
		
//How to access all the above values? You firsts define the properties, the variables on top of this class, 
//User has to assign the value: name, age, email, isActive, gender, phone and Payment details using u6 reference below:
	
	System.out.println(u6.name + " " + u6.age + " " + u6.email + " " + u6.paymentsOptions);

	
	//We can also use constructor using right click+source to only have few values or with All the values:	
	
		
		User_ConstructorConcept u7 = new User_ConstructorConcept("Naveen", "navee@gmail.com", 786543);
		
		System.out.println(u7.name + " " + u7.email + " " + u7.phone);
	}
}
	
