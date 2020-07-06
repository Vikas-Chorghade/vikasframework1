package com.stepdefinations.cucumber;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiplicationSteps {
	int l,m,n=0;

	@Given("I have two num {int} and {int}")
	public void i_have_two_num_and(Integer int1, Integer int2) {
		l=int1;
		n=int2;
	    }

	@When("We multiply the result")
	public void we_multiply_the_result() {
		n=l*n;
	    
	}

	@Then("Verify multiplication is {int}")
	public void verify_multiplication_is(Integer int1) {
	    
		System.out.println("Multiplication is: "+n);
	}


}
