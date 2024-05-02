package stepdefinitions;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.util.StdDateFormat;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Date;
public class CaptureGroupsSteps 
{	
	@Given("You are running a Program")
	public void you_are_running_a_program() {
	    System.out.println("Program Execution Started");
	}
	@When("You Want to Pass Various Types of Data")
	public void you_want_to_pass_various_types_of_data() {
		System.out.println("Various Data Types Entered");
	}
	@When("The Data is {string}")
	public void the_data_is(String string) {
		System.out.println("You Have Entered: "+string);
	}
	@When("^Today Date is (.*)$")
	public void today_date_is(String strDate) throws ParseException {
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		 java.util.Date date = format.parse(strDate);
		 System.out.println("After Handle The Date: "+date);
	}
	@When("The Data Is  Float {double}")
	public void the_data_is_float(Double value) {
		System.out.println("You Have Float Entered: "+value);
	}
	@When("The Data is {double}")
	public void the_data_is(Double value) {
		System.out.println("You Have Entered Decimal Value: "+value);
	}
	@When("The Data is true")
	public void the_data_is_true() {
		System.out.println("You Have Entered: ");
	}
	@Then("You Should Handle this")
	public void you_should_handle_this() {
		System.out.println("Program Execution Started");
	}
}