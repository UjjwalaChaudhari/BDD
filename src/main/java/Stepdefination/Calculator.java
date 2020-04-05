package Stepdefination;

import cucumber.api.java.en.Given;

public class Calculator {
int result=0;
	
@Given("^I have a number (\\d+)$")
public void i_have_first_number(int arg1) throws Throwable {
	//x=arg1;
result=result+arg1;
}
	/*
	 * @Given("^I have secound number (\\d+)$") public void
	 * i_have_secound_number(int arg2) throws Throwable { y=arg2; }
	 */
	@Given("^Add two numbers$")
	public void Add_two_numbers()
	{
		//result=x+y;
	}
	
	@Given("^Display Result$")
	public void Display_Result()
	{
		System.out.println(result);
	}
	
}
