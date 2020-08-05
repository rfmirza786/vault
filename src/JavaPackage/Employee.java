package JavaPackage;

import java.util.ArrayList;

public class Employee {
	
	String name;
	int age;
	String deptName;
	boolean ispermanent; 
	String laptop[];
	ArrayList<String> devicesList;

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.name = "Tom";
		emp.age = 25;
		emp.deptName = "admin";
		emp.laptop = new String[3];
		
		emp.devicesList = new ArrayList<String>();	//Remember to Always create Object for ArrayList to work
													// it has been initialize and not just reference as on line 12
		
		emp.devicesList.add("Apple iPhone");
		emp.devicesList.add("Samsung s8");
		emp.devicesList.add("Windows 10");
		
		System.out.println(emp.devicesList);
				
		Employee emp1 = new Employee();
		emp1.name = "Arif";
		emp1.age = 26;
		emp1.deptName = "QA";
		emp1.ispermanent = false;
		
		System.out.println(emp.name + " " + emp.age + " " + emp.deptName + " " + emp.ispermanent);
		
		System.out.println(emp1.name + " "  + emp1.age +  " " + emp1.deptName + " " + emp1.ispermanent);
		
//		new Employee().name = "Puja";//		
//		System.gc();
		
		
		
		
		
	}

}
