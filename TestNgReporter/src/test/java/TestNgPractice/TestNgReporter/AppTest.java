package TestNgPractice.TestNgReporter;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.LoginUtility;

public class AppTest {
	WebDriver driver;
	
	@BeforeMethod
	public void chromeopen() {
		driver=LoginUtility.Setup();
	}
	@Test
	public void App() {
		
		App l=new App(driver);
		l.createnewaccount();
		l.firstname();
		l.lastname();
		l.day();
	}
	
	@AfterMethod
	public void  closechrome() {
		driver.close();
	}
}
