package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegExDemoStepDef {
	
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() {
	    System.out.println("Home Page");
	}

	@When("^I want search from (\\w+) city in the date (.*?)$")
	public void i_want_search_from_city_in_the_month(String city, String date) {
	   System.out.println("City is : "+city);
	   System.out.println("Date is : "+date);
	}

	@When("^I select child option (Yes|No)$")
	public void i_select_child_option(String childOption) {
		System.out.println(childOption);
	    
	}
	
	@When("^I select the month ([0-9]*)$")
	public void i_select_the_month(Integer m) {
		System.out.println(m);
	} 

	@Then("^I should get search result$")
	public void i_should_get_search_result() {
	    System.out.println("Search result page");
	}
}