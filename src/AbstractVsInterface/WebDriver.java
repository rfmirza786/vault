package AbstractVsInterface;

public interface WebDriver {
	
	//100% Abstract in Interface
	
	public void get(String	 url);
	public void close();
	
	public void getTitle();
	public void getCurrentUrl();
	
	public void findElement (String element);
	
	
	
	
	
	
	
	
	
	
	
	

}
