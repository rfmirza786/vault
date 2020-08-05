package JavaPackage;

public class LoginPageOverloading {
				//Java 09
	
	public void login(){
		System.out.println("0 param");		
	}
	public void login(long phonenumber){
		System.out.println("1 param phone");
	}
	public void login(long phonenumber, int otp){
		System.out.println("2 param phone, opt");
	}
	public void login(String un, long phonenumber, int otp){
		System.out.println("3 param. un, phone, int");
	}
	public void login(String un, String pwd){
		System.out.println("2 param String un, pwd");
	}	
	

	public static void main(String[] args) {
		
		LoginPageOverloading lp = new LoginPageOverloading();		//create an Object to call
		
		lp.login(34543254);
		lp.login(3454233, 87);
		lp.login("rfmirza@gmail.com", 3424564, 95);
		
		
			
			
		
		

	}

}
