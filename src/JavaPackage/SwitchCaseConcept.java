package JavaPackage;

public class SwitchCaseConcept {

	public static void main(String[] args) {

			String browser = "chrome";
			
			switch (browser) {				//Type swit...+Ctrl+Space
			case "chrome":
				System.out.println("Launch Chrome");
				break;
			case "firefox":
				System.out.println("Launch firefox");
				break;
			case "safari":
				System.out.println("Launch safari");
				break;
			case "ie":
				System.out.println("Launch ie");
				break;
				
		default:
			System.out.println("Please enter correct browser");
			break;
			}
			
			int marks = 90;
			
			switch (marks) {
			case 100:
				System.out.println("Excellent");
				break;
			case 90:
				System.out.println("Good");
				break;
			case 80:
				System.out.println("Fair");
				break;

			default:
				System.out.println("fail");
				break;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
