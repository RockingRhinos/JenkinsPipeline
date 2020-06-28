package steps;

import cucumber.api.java.en.Given;

public class CreateLead extends BaseClass {
	
	@Given("click crmsfa link")
	public void clickCrmsfa() {
		driver.findElementByClassName("decorativeSubmit").click();

	}

}
