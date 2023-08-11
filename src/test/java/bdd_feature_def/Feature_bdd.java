package bdd_feature_def;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature_bdd {
	WebDriver driver;
	Alert a;

		@Given("User must be on homepage of the E-commerce website by clicking {string}")
		public void user_must_be_on_homepage_of_the_e_commerce_website_by_clicking(String string) {
		    System.getProperty("webdriver.chrome.driver","chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get(string);
		}
		@When("User should click on signup button.")
		public void user_should_click_on_signup_button() {
		    driver.findElement(By.id("signin2")).click();   
		}

		@Then("Sign-up dialog box should be displayed.")
		public void sign_up_dialog_box_should_be_displayed() throws InterruptedException {
			Thread.sleep(3500);
		    boolean actual = driver.findElement(By.id("signInModalLabel")).isDisplayed();
		    Assert.assertEquals(true, actual);
		    driver.close();
		}
		
		@When("Enter valid username and password")
		public void enter_valid_username_and_password() throws InterruptedException {
			Thread.sleep(3500);
			driver.findElement(By.id("sign-username")).sendKeys("Tei31");
			driver.findElement(By.id("sign-password")).sendKeys("4235ar!");
		}

		@When("Click on signup")
		public void click_on_signup() {
		   driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		}

		@Then("A successful pop-up should be displayed saying {string}")
		public void a_successful_pop_up_should_be_displayed_saying(String string) throws InterruptedException {
			Thread.sleep(3500);
			a= driver.switchTo().alert();    
		}

		@Then("User should click on ok button.")
		public void user_should_click_on_ok_button() {
			a.accept(); 
			driver.close();
		}
}
