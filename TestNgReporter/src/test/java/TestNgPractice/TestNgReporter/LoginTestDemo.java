package TestNgPractice.TestNgReporter;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.LoginUtility;
import Utility.Screenshot;

public class LoginTestDemo {

WebDriver driver;	
	
 @BeforeTest
    public void ChromeOpen() {
	driver=LoginUtility.Setup();
    }
    

@Test
    public void LoginDemo() throws IOException {
	
	LoginDemo login=new LoginDemo(driver);
	login.username();
	login.password();
	login.clickOnLogin();
	
	
	Screenshot.Takescreenshots(driver);
}

@AfterTest
	public void ChromeClose() {
		driver.close();
	}
	
}


	

	
	
	
	
	
	
	
	
	
	
	
	

