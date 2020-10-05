package com.stepdefinations.cucumber;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionSteps {
	
	 /* @Before 
	  public void openchromebrowser() { 
		  System.out.println("Chrome browser is open");
	  
	  }*/
	 
	/*
	 * @Given("Chrome browser is opened") public void chrome_browser_is_opened() {
	 * System.out.println("Chrome browser is opened"); }
	 */
	
	int x,y,z=0;
	@Given("I have two numbers {int} and {int}")
	public void i_have_two_numbers_and(Integer int1, Integer int2) {
		x=int1;
		y=int2;
		
	   
	}

	@When("We add the result")
	public void we_add_the_result() {
		z=x+y;

}

	@Then("Verify addition  is {int}")
	public void verify_addition_is(Integer int1) {
		System.out.println("Addition is: "+z);
		
	    
	}
}
