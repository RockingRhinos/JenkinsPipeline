package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLeadLink() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage(driver);
	}
	
	public void enterLeadId() {
		String id = leadID;
		driver.findElementById("").sendKeys(id);
	}

}
