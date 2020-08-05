package OOP_Interface;

public class FortisHospital extends WHO implements USMedical, UKMedical, IndianMedical {
	
	//US
	@Override
	public void orthoServices() {
		System.out.println("FS -- orthoServices");
	}
	//US
	@Override
	public void cardioServices() {
		System.out.println("FS -- cardioServices");
	}
	//US
	@Override
	public void neuroServices() {
		System.out.println("FS -- neuroServices");
	}
	//US
	@Override
	public void Services911() {
		System.out.println("FS -- Services911");
	}	
	//************************************
	
	//UK
	@Override
	public void physioServices() {
		System.out.println("FS -- Services911");
	}
	//UK
	@Override
	public void pediatricServices() {
		System.out.println("FS -- pediatricServices");	
	}
	
	//************************************
	
	//Indian
	@Override
	public void oncologyServices() {
		System.out.println("FS -- oncologyServices");	
	}

	//Indian
	@Override
	public void radioServices() {
		System.out.println("FS -- radioServices");		
	}
	//Indian
	@Override
	public void pathologyServices() {
		System.out.println("FS -- pathologyServices");		
	}	
	
	//Fortis Proprietary method **************************
	
	public void medicalInsurance(){
	System.out.println("FS -- medicalInsurance");	
	}
	public void OPTClinics(){
		System.out.println("FS -- OPTClinics");			
	}
	
	//	WHO ***************************************	
	
	@Override
	public void vaccination(){
		System.out.println("WHO -- vaccination overriden");	 //Fortis Hospital has created own vaccination so overriden
	}
	@Override
	public void polio(){
	
	
}
}

	

