package JavaPackage;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//default class in jdk
		//dynaic in nature
		//can store different type of values(raw types)
		//can provide generics also (only one type)
		//virtual capacity--vc of 10 (0-9) is provided by Java, but physical capacity is zero.
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		
			ar.add(100);	//0
			ar.add(200);	//1	
			
			System.out.println(ar.size());
			
			ar.add(300);
			ar.add(400);
			
			System.out.println(ar.size());
			
			ar.add(500);	//4
			ar.add(600);	//5
			
			
			
			System.out.println(ar.get(0));
			System.out.println(ar.get(5));
			
//			System.out.println(ar.get(6));		
//			java.lang.IndexOutOfBoundsException(will get Index NOt Array out of bound Exception like Arrays)
			
//			ar.remove(4);
//			System.out.println(ar.get(4));  //as 4 is removed Index (5) will shift upwards
			
			//Print ALL values from ArrayList: 
			for(int i=0; i<ar.size(); i++) {
				System.out.println(ar.get(i));
			}
			
			//data type (Generic) based ArrayList:
			
			ArrayList<String> studentList = new ArrayList<String>();
			studentList.add("Sheba");			//can ONLY add Strings
			studentList.add("Hari");
			
			ArrayList<Integer> studentMarks = new ArrayList<Integer>();
			studentMarks.add(100); 				//can ONLY add Integers
			studentMarks.add(200);
			
			ArrayList<Object> empData = new ArrayList<Object>();
			empData.add("Tom");					//Here we are using Object to enter different types of data.
			empData.add(25);
			empData.add(12.33);
			empData.add(true);
			empData.add('m');
			
					
		
	}

}
