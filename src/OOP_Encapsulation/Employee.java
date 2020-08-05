	package OOP_Encapsulation;

public class Employee {
						//Employee Test is related to this class
	
	public String name;
	public int age;
	private int salary;
	
	//Create constructor by using (right click+source):	
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void getAddress(){
		System.out.println("employee address");	
	}	
	private void getBankAccount(){
		System.out.println("Employee bank details...");		
	}	
	public int getSalary(){					//created public method to access var for Encapsulation access purposes
		return salary; 		
	}
	public void getEmployeeBankData(){		//created public method to access method for Encapsulation access purposes
		getBankAccount();
	}	
	
		
		public static void main(String[] args) {
			
			Employee e1 = new Employee("Tom", 25, 1000);
			
			System.out.println(e1.name);
			System.out.println(e1.age);
			System.out.println(e1.salary);			//Able to access Private property here within Employee class
			
			
		}
		
		
	}


