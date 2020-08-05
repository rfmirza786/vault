package OOP_Abstract;

public class LoginPage extends Page {
	
	//Page is Parent class of LoginPage
	//We have two @Overridden method and One Non Overridden/Independent (doLogin) method.
	
	public LoginPage(){
		System.out.println("LP -- Default Constructor...");
	}
	
	@Override
	public void header() {
		System.out.println("Amazon Page header");		
	}
	@Override			//Had to change it to version 1.7 from build path-libraries and then back to 1.8 again
	public void title() {
		System.out.println("Amazon Page title");		
	}
	
	public void doLogin(String un, String pwd){
		System.out.println("login with:" + un + " " + pwd);			
	}

}
