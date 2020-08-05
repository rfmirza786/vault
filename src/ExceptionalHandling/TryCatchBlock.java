package ExceptionalHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try{
		int i = 9/0;
		System.out.println("B");
		System.out.println("B");
		}
		catch(Throwable t){						//Throwable is Super class of error and Exception
			System.out.println("Some Error or Exception is coming");     						
		}	
		
//		catch(NullPointerException e){	
//			System.out.println("NullPointer Exception is coming");     //we can write our own message
//			e.printStackTrace();								//provides stackTrace, where exactly is error coming
//		}	
//		catch(ArithmeticException e){
//			System.out.println("ArithmeticException is coming"); 
//			e.printStackTrace();
//		}
		
			System.out.println("A");
			System.out.println("A");
		
		//Without try/catch, it will print: A A A then java.lang.ArithmeticException: / by zero w				
	}

}
