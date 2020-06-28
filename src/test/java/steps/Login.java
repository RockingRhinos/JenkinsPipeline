package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseClass{
	
	
	/*
	 * @Given("open the chrome browser") public void openTheChromeBrowser() {
	 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 * driver = new ChromeDriver();
	 * 
	 * }
	 * 
	 * @Given("load the application url") public void loadTheApplicationUrl() {
	 * driver.get("http://leaftaps.com/opentaps/"); }
	 * 
	 * @Given("maximize the browser") public void maximizeTheBrowser() {
	 * driver.manage().window().maximize();
	 * 
	 * }
	 * 
	 * 
	 * @Given("apply wait") public void applyWait() {
	 * 
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

	@Given("enter the username as (.*)")
	public void enterTheUsernameAsDemosalesmanager(String data) {
		driver.findElementById("username").sendKeys(data);
	    
	}

	@Given("enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String data) {
	    
		driver.findElementById("password").sendKeys(data);
	}

	@When("click login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Then("Homepage should be displayed")
	public void homepageShouldBeDisplayed() {
	    System.out.println("homepage is displayed");
	    
	}
	
	@But("Error should be displayed")
	public void displayErrorMessage() {
		
		System.out.println("error is displayed");

	}

	

}
