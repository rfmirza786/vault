package JavaPackage;

public class ConditionalOperators {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 20;
//		
//		if(b>a){
//			System.out.println("b is Greater");
//		}
		
		int a1 = 30;
		int b1 = 20;
		
		if(b1>a1){
			System.out.println("b is Greater");		//NO Output (False)			
		}
		else{
			System.out.println("a is Greater");
		}
		
		int x = 200;
		int y = 100; 
		
		if(x==y){
			System.out.println("Both are equal");
		}
		else{
			System.out.println("Both are NOT equal");
		}
		if(x>=y){	
			
			System.out.println("Hi");
		}
		else{
			System.out.println("bye");
		}
		
		//WAP (write a program) to find the Highest of three numbers:
		
		int j = 700;
		int k = 600;
		int l = 300;
		
		if(j>k && j>l){		//&& and or short circuit operator needs both sided to be True to move forward 
			System.out.println("j is the Highest number");
		}
		else if(k>l){
			System.out.println("k is the Highest number");
		}
		else{
			System.out.println("l is the greatest");
		}
		
		System.out.println(j+"\t"+k);			// "\t" is a TAB
		System.out.println(j+ "\n" +k); 			// "\n" is New line
		
		System.out.print(1000);					//No new line
		System.out.println	(2000);				//println: New line after printing 2000
		System.out.println(3000);
	}
}
	













