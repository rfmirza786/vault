package OOP_Interface;

public class FortisTest {

	public static void main(String[] args) {
		
		FortisHospital fs = new FortisHospital();
		
		fs.cardioServices();
		fs.neuroServices();
		fs.medicalInsurance();
		fs.pathologyServices();
			
		fs.ebola();
		fs.polio();
		fs.pandemic();
		fs.vaccination();
		
		USMedical.medicine();
		
			//top casting:
	 //Create child object Without reference, then add parent class reference. 
	//Child class can be referenced by parent class(top casting), possible in Java
		
	USMedical us = new FortisHospital();  	//child class object can be referenced by parent interface ref variable
											//can only access US methods
	us.orthoServices();
	us.cardioServices();
	us.neuroServices();
	us.Services911();
	
	UKMedical uk = new FortisHospital();	//can only access UK methods
	
	uk.pediatricServices();
	uk.physioServices();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
