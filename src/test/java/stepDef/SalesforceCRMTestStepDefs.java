package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class SalesforceCRMTestStepDefs {
	
	
//	@Before
//	public void login() {
//		System.out.println("Login in Salesforce");
//	}
//	
//	@After
//	public void logout() {
//		System.out.println("Logout from Salesforce");
//	}
	
	@Given("I want to generate a lead")
	public void i_want_to_generate_a_lead() {
	    System.out.println("Lead");
	}

	@Given("I want create an account")
	public void i_want_create_an_account() {
		System.out.println("Account");
	}

	@Given("I want to create an opportunity")
	public void i_want_to_create_an_opportunity() {
		System.out.println("Opportunity");
	}

}
