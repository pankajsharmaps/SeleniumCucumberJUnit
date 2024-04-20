package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class TagsDemoStepDef {
	
//	@Before
	public void i_want_login_in_my_application() {
		System.out.println("I run BEFORE every step");
//		System.out.println("ST");
	}

	@Given("Generating leads")
	public void generating_leads() {
	    System.out.println("FT");
	}

	@Given("Connecting DataBase")
	public void connecting_data_base() {
		System.out.println("ST");
	}

	@Given("Disconnecting DB")
	public void disconnecting_db() {
		System.out.println("ST and FT");
	}
	
	
//	@After
	public void logout_from_system() {
		System.out.println("I run AFTER every step");
	}
}