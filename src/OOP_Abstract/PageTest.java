package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.header();						//Override method
		lp.title();							//Override method
		
		lp.getPageInfo();					//Inherited method
		
		lp.doLogin("admin", "admin");		//Independent method
		
		//Top Casting
		Page p = new LoginPage();			//Page is Parent class of LoginPage (using TopCasting)				
		p.header();
		p.title();
		p.getPageInfo();
//		p.dologin();  	//p. is not able to access LoginPage-proprietary method: dologin.  Object is new LoginPage  
	
		//Can we do down Casting?				// Abstract Cannot create an Object.  Will immediately get error
		// =new Page();    					// Cannot Instantiate the type Page
		
		
		
		
	}

}
