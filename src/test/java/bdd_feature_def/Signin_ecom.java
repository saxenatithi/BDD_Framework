package bdd_feature_def;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signin_ecom {
	WebDriver driver;

	@Given("User should be on e-com website url {string}")
	public void user_should_be_on_e_com_website_url(String string) {
		System.getProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(string);
	}
	
	@When("User to click on login button")
	public void user_to_click_on_login_button() {
		driver.findElement(By.id("login2")).click(); 
	}
	
	@Then("login dialog box should be displayed.")
	public void login_dialog_box_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
	    boolean actual = driver.findElement(By.id("logInModalLabel")).isDisplayed();
	    Assert.assertEquals(true, actual);
	    driver.close();
	}

	@When("^User to enter valid (.*) and (.*)$")
	public void user_to_enter_valid_user_name_and_passwrd(String user_name, String passwrd) throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.id("loginusername")).sendKeys(user_name);
	    driver.findElement(By.id("loginpassword")).sendKeys(passwrd);
	}

	@When("Click on Login")
	public void click_on_login() {
	    driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	}

	@Then("User must be on {string}")
	public void user_must_be_on(String string) throws InterruptedException {
		 String actual = driver.getCurrentUrl();
		 Thread.sleep(2000);
		  Assert.assertEquals("https://www.demoblaze.com/", actual);
		  driver.close();
	}

}
