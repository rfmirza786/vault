package JavaPackage;

public class FunctionsInJava {
	
	String name;
	//Above class variable and class Method below will be given to the Object when object of the class is created
	//in Main method as below:
	
	
	//data members of a class:
	//1. class vars
	//2. class methods
	
	//cannot create a method inside another method
	//methods are independent to each other
	//methods are parallel to each other
	//u can give any method name
	

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();			//Object of the class created		
		obj.test();												//calling test Method.
		
		//obj.getTrainerName();					//calling Method GetTrainerName.
		String n1 = obj.getTrainerName();		//will add String as it is returning String: Naveen
			System.out.println(n1);
		
		int n3 = obj.add(10, 20);				//will add integer 
			System.out.println(n3);				//use n3 to print result
			
		int m1 = obj.getMarks("Tom");
			System.out.println(m1);
			
		String br = obj.launchBrowser("Firefox");
			System.out.println(br);
		
	}
	//Cannot create a Method inside Main methods, so I come outside main method-- outside curly bracket
	//type of Method:  
	
	//1. Simple --> No input or output
	public void test(){
		System.out.println("test method");		
	}
	//2. Return type--> on input but some return 
	public String getTrainerName(){
		System.out.println("getTrainerName");
		String name = "Naveen";
		return name;			//To call getTrainerName by using ref name: obj as given above in Main Method
	}
	//3. Return type--> some input and some output
	public int add(int a, int b){
		System.out.println("add method");
		int z=a+b;
		return z;				//To call Method: add use ref name: obj as given above in Main Method
								//provide the values for a&b. 
	}

	public int getMarks(String studentName){
		
		System.out.println("getMarks Method");
		int marks = -1;
		
	if(studentName.equals("Anu")){
		marks=90;	
	}
	else if(studentName.equals("Virender")){
		marks=98; 	
	}
	else if(studentName.equals("Naveen")){
	marks=10; 	
	}
	else if(studentName.equals("Puja")){
	marks=0; 	
	}
	else{
		System.out.println(studentName + " is not found ");	
	}
	
	return marks;	
	
	}

	public String launchBrowser(String browserName){
		
		System.out.println("browser name is :" + browserName);
		String driver=null;
		
		//Using Switch case:
		
		switch (browserName) {
		case "Chrome":
			driver="Launch Chrome";
			break;
		case "Firefox":
			driver="Launch Firefox";
			break;
		case "Safari":
			driver="Launch Safari";
			break;
		case "IE":
			driver="Launch IE";
			break;


		default:
			break;
		}
		return driver;		//To Launch browser use obj under Main method 
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


