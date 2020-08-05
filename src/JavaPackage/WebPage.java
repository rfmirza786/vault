package JavaPackage;

import java.util.ArrayList;

public class WebPage {
	
	//This WebPage is Associated with WebPage
	
	String title;
	String url;
	ArrayList<String> linksList;
	final static String logo = "Amazon";

	
	//First Constructor can be create with ONLY Non-Static properties.  No Static  	
	public WebPage(String title, String url, ArrayList<String> linksList) {
		this.title = title;
		this.url = url;
		this.linksList = linksList;
	}

	//Below we create another constructor with only title & url
	public WebPage(String title, String url) {
		this.title = title;
		this.url = url;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
