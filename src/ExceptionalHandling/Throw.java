package ExceptionalHandling;

public class Throw {

	public static void main(String[] args) {

		String browser = "IE";				//This is incorrect browser, will get error and need to handle
		
		if (browser.equals("chrome")){
			System.out.println("launch chrome");
			
		}
		else if(browser.equals("firefox")){
			System.out.println("launch firefox");
			
		}
		else if(browser.equals("safari")){
			System.out.println("launch safari");
			
		}
		else{
			try {
				throw new Exception("Please pass correct browser");
			} catch (Exception e) {									//if you are throwing exception,
				e.printStackTrace();								//you need to handle it also. Try/catch
			} 														
																	
			
			
		}
		
		
		}

}
