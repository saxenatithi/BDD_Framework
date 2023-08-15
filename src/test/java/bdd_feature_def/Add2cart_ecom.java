package bdd_feature_def;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add2cart_ecom {
	WebDriver driver;
	WebDriverWait wait;
	
	
	@Given("User must be logged in on {string} and on {string} page")
	public void user_must_be_logged_in_on_and_on_page(String string, String string2) throws InterruptedException{
		System.getProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(string);
	    driver.findElement(By.id("login2")).click(); Thread.sleep(2000);
	    driver.findElement(By.id("loginusername")).sendKeys("tithi980");
	    driver.findElement(By.id("loginpassword")).sendKeys("Tithi980");
	    driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	    String actual = driver.getCurrentUrl();
		  Assert.assertEquals("https://www.demoblaze.com/", actual); 
	}

	@When("User click on Categories option")
	public void user_click_on_categories_option() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.id("cat")).click();
	}

	@When("Add one Phone, one Laptop and a Monitor to Cart")
	public void add_one_phone_one_laptop_and_a_monitor_to_cart() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.linkText("Iphone 6 32gb")).click(); Thread.sleep(1000);
		driver.findElement(By.linkText("Add to cart")).click();
	}
	
	@Then("User should see a propmt message {string} and click ok.")
	public void user_should_see_a_propmt_message_and_click_ok(String string) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent()); 
		Alert a1= driver.switchTo().alert(); 
		a1.accept(); driver.close();
	}
	
	  @When("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
		  Thread.sleep(1000); 
		  driver.findElement(By.linkText("Cart")).click();
	}
	
	@When("User click on Place order button")
	public void user_click_on_place_order_button() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
	}

	@Then("Dialog box should open to enter details to place order")
	public void dialog_box_should_open_to_enter_details_to_place_order() throws InterruptedException {
	    Thread.sleep(1000);
	    driver.findElement(By.id("name")).sendKeys("Jamie");
	    driver.findElement(By.id("country")).sendKeys("Canada");
	    driver.findElement(By.id("city")).sendKeys("Toronto");
	    driver.findElement(By.id("card")).sendKeys("232131");
	    driver.findElement(By.id("month")).sendKeys("Aug");
	    driver.findElement(By.id("year")).sendKeys("2023");
	    driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click(); 
	}

	@Then("after clicking on purchase. User must see successful message saying {string}")
	public void after_clicking_on_purchase_user_must_see_successful_message_saying(String string) throws InterruptedException {
		Thread.sleep(1500);
	String result = string;
	Assert.assertEquals("Thank you for your purchase!", result); 
	driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
	driver.close();	
	}	
	
	}
