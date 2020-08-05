package JavaPackage;

import java.util.ArrayList;

public class PageTest {

	public static void main(String[] args) {
		
			//This is affiliated with Page Class
		
		Page loginPage = new Page();
		
		loginPage.url = "http://amazon.com/login";
		loginPage.title = "Amazon login";
		loginPage.logo = "Amazon logo";
		loginPage.header = "Login Header;";
		loginPage.footerLinkLists = new ArrayList<String>();		
		
		Page HomePage = new Page();
		
		loginPage.url = "http://amazon.com/login";
		loginPage.title = "Amazon login";
		loginPage.logo = "Amazon Header";
		
		System.out.println(loginPage.url);
		System.out.println(loginPage.title);
		

		
	}

}
