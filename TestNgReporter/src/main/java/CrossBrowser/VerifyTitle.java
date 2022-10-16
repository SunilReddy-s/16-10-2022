package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class VerifyTitle {
WebDriver driver;
@Test
@Parameters("browser")
	public void verifypageTitle(String browserName) {
//		
//	if(browserName.equalsIgnoreCase("firefox"))
//	{
//		WebDriverManager.firefoxdriver().setup();
//		driver=new FirefoxDriver();
//	}
	 if(browserName.equalsIgnoreCase("chrome"))
	{
		
	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("ie"))
	{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	System.out.println(driver.getTitle());
	driver.quit();

	}
}
