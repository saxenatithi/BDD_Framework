package bdd_feature_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login_form {
	WebDriver driver;
	
	@Given("user must be on login page of url {string}")
	public void user_must_be_on_login_page_of_url(String string) {
		System.getProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(string);
	}

	@When("^User must enter valid (.*) and (.*)$")
	public void user_must_enter_valid_username_and_password(String username, String password) throws InterruptedException {
	   driver.findElement(By.id("username")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	   Thread.sleep(2500);
	}

	@When("User should click on sign in button")
	public void user_should_click_on_sign_in_button() {
	  driver.findElement(By.linkText("Sign in")).click();
	}

	@Then("User must navigate to there account page {string}")
	public void user_must_navigate_to_there_account_page(String string) {
	  String actual = driver.getCurrentUrl();
	  Assert.assertEquals("https://demo.applitools.com/app.html", actual);
	  driver.close();
	}
				
			
		}
