package AbstractVsInterface;

public class LoginPageTest {

	public static void main(String[] args) {
		
		String browser = "firefox";
		WebDriver driver = null; 
		
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")){
			driver = new FirefoxDriver();
		}
		else if (browser.equals("safari")){
			driver = new SafariDriver();
		}
					
		//Top Casting: Webdriver is parent(Interface-no Obj) driver is reference and ChromeDriver-Child:
		//WebDriver driver = new ChromeDriver(); 
		
		driver.get(" http://www.google.com");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.findElement(" search");
		driver.close();
		
	}
}
		


