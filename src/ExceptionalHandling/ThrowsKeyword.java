package ExceptionalHandling;

public class ThrowsKeyword {
	
	// NOT something we will use as it is 
	
	public static void main(String[] args) throws Exception {  		//main method throws it so JVM responsibility		

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
	}	
	
	public void m1()throws Exception{
		m2();									//m1() responsibility,but it is throwing. Now main method responsibility
	}
	public void m2()throws Exception{			//m2() responsibility as it is callling m3(), and also throwing 
		m3();
	}
	public void m3() throws Exception {			// m3() is throwing unknown exception to other method
		
		int i=9/0;
				
	}
		
}
