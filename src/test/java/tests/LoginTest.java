package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;	

import pageobjects.Landingpage;
import resources.BaseClass;

public class LoginTest extends BaseClass {
	WebDriver driver;

	@Test
	public void login() throws IOException {
		driver = initializeWebDriver();
		String urlString = properties.getProperty("url");
		driver.get(urlString);
		Landingpage landingpage = new Landingpage(driver);
		landingpage.myAccountDropdown().click();
		landingpage.gotoLogin().click();

	}

}
