package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	
	public String excelFileName;
	public String leadID;
	public static ChromeDriver driver;
	
	@BeforeSuite
	public void loadProperties() {

	}
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void launchBrowser(String url, String username, String pass) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(pass);
		driver.findElementByClassName("decorativeSubmit").click();

	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider(name="fetchData", parallel = true)
	public String[][] sendData() throws IOException {

		return ReadExcel.readExcel(excelFileName);

		/*String[][] data = new String[2][3];

		data[0][0] = "TestLeaf";
		data[0][1] = "Sam";
		data[0][2] = "Lazarus";

		data[1][0] = "TestLeaf";
		data[1][1] = "Naveen";
		data[1][2] = "Elumalai";

		return data;	*/

	}


}
