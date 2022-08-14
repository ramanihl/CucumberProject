package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// In TestRunner.java
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import pages.LoginPage;

public class LoginStepDefination {
	
	WebDriver driver;
	LoginPage lp = new LoginPage();

	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() {
		lp.openBrowser();
		lp.openLoginPage();
		
	}

	@When("title of login page is {string}")
	public void title_of_login_page_is(String expectedTitle) {
		String actualTitle = lp.getTitle();
 		Assert.assertEquals(expectedTitle, actualTitle);
 		
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String email, String password) {
		lp.login(email, password);
		
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		lp.clickOnLoginButton();
		
	}

	@Then("user get error for email")
	public void user_get_error_for_email() {
		String expctedError = "Sorry, we couldn't complete your request";
		String actualError = lp.readErr();
		Assert.assertEquals(expctedError, actualError);
		
	   
	}

	@Then("user quit")
	public void user_quit() {
	  lp.closeBrowse();
	  
	}
}
