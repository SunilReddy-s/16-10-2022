package TestNgPractice.TestNgReporter;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utility.LoginUtility;
import Utility.Screenshot;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest   {
	WebDriver driver;
	
	
	
@BeforeClass
public void chromesetup() {

	WebDriver driver=LoginUtility.Setup();
	this.driver=driver;
	
}


	
@Test()
public void Login() {	
	
	Login login=new Login(driver);
	
	login.USERNAME();
	login.PASSWORD();
	login.LOGINBUTTON();
}

	
	@AfterClass
	public void  loginn(WebDriver driver) {
	driver.close();	
	}
	
	
}

	
	


