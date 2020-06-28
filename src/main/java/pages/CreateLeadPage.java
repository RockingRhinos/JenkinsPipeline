package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage getLeadId() {
		leadID = driver.findElementById("createLeadForm_companyName").getText();
		return this;
	}
	
	public CreateLeadPage enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage clickSubmit() {
		driver.findElementByClassName("smallSubmit").click();
		return this;
	}

}
