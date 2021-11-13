package steps;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class LoginStep {
	
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user entered the \"([^\"]*)\" username$")
	public void user_entered_the_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user entered the \"([^\"]*)\" password$")
	public void user_entered_the_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user logged in \"([^\"]*)\"$")
	public void user_logged_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	}


