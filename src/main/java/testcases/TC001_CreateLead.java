package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC001_CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName = "TestData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runTC001(String cName, String fName, String lName) {
		new HomePage(driver)
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSubmit();
	}

}
