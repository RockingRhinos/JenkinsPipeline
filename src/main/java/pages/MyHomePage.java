package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MyLeadsPage clickLeads() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage(driver);
	}
	
}
