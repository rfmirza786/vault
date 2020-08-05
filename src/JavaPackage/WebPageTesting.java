package JavaPackage;

import java.util.ArrayList;

public class WebPageTesting {
	  			//This Page is Associated with WebPage
	
//1.defining constructor, 2.calling constructor with help of Object and start giving the values 3.start using 
	
	public static void main(String[] args) {		
		
		//1.Defining the constructor
		ArrayList<String> linksList = new ArrayList<String>();
		linksList.add("forgot pwd");
		linksList.add("reset pwd");
		linksList.add("signup");	
		
		ArrayList<String> homelinksList= new ArrayList<String>();
		
		//2.Calling constructor with the help of Object, start giving the values
	WebPage loginPage = new WebPage("login", "http://amazon.com/login", linksList);
	WebPage homePage = new WebPage("home", "http://amazon.com/home", homelinksList);
	
		//3.Start accessing when you want to use them 		
	System.out.println(loginPage.title + " " + loginPage.url + " " + loginPage.linksList + " " + WebPage.logo);
	System.out.println(homePage.title + " " + loginPage.url + " "  + homePage.linksList  + " " + WebPage.logo);
		
	}

}
