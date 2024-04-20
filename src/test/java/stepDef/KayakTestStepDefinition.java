package stepDef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.KayakHomePage;
import pageObjects.KayakSearchResultPage;

public class KayakTestStepDefinition {
	KayakHomePage khp = new KayakHomePage();
	KayakSearchResultPage ksr = new KayakSearchResultPage();
	
	@Given("^I am on Kayak home page$")
	public void i_am_on_kayak_home_page() {
		BaseClass.setUp();
	}
	
	@When("^I perform flight search for (\\w+)$")
	public void i_perform_flight_search_for_destination(String city) throws InterruptedException {
		khp.searchDestination(city);
	}
	
	@When("^from date should be (.*?)$")
	public void from_date_should_be_october(String fDate) {
		khp.fromDateSelection(fDate);
	}
	
	@When("^to date should be (.*?)$")
	public void to_date_should_be_october(String toDate) {
		khp.toDateSelection(toDate);
	}
	
	@When("^I click on search button$")
	public void i_click_on_search_button() {
		khp.clickSearchBtn();
	}
	
	@Then("^Flight search result page should be displayed and the prices should be displayed in increasing order$")
	public void flight_search_result_page_should_be_displayed() throws InterruptedException {
		ksr.priceSortingValidation();
		BaseClass.tearDown();
	}
}