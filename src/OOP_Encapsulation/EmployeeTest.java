package OOP_Encapsulation;

public class EmployeeTest {
							// Employee is related class this class

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Tom", 25, 1000);
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		//System.out.println(e1.salary);		//Cannot access Private property outside Employee class
		
	//Using Private is NOT Encapsulation. Encapsulation you create a capsule surrounded by public method in the 
	//Employee class where private variable is located.Then create a public method so other class can access 
	//private var & methods. Create public layer over private properties...Encapsulation.
	
//		Using public method to access private variablt	 using public method below:
		
		System.out.println(e1.getSalary());	
	
// 		getAddress can be easily accessed as it is public 	
		e1.getAddress();
	
//		But need to need to create public method(getEmployeeBankData) for private method(getBankAccount) within 
//		Employee class and access here thru Encapsulation:		
		e1.getEmployeeBankData();			
		
	}

}
