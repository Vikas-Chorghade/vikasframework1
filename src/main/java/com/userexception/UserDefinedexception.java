package com.userexception;

public class UserDefinedexception extends Exception{
	
	public void elementNotInteractableException() 
	{
		try {
			
			throw new UserDefinedexception();
		} catch (Exception e) {
			System.err.println("ElementNotInteractableException");
			
		} 
		
	}
	
	

}
