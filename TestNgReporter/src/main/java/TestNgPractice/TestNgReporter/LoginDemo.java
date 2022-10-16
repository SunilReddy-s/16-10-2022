package TestNgPractice.TestNgReporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemo {

	WebDriver driver;
	
@FindBy(xpath="//*[@placeholder=\"Username\"]")
private WebElement UN;

@FindBy(xpath="//*[@placeholder=\"Password\"]")
private WebElement PW;

@FindBy(xpath="//*[@type=\"submit\"]")
private WebElement CLICK;

 public LoginDemo(WebDriver driver) {
	 this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

 public void  username() {
	 UN.sendKeys("Admin");
 }
	
 public void password() {
	 PW.sendKeys("admin123");
 }
 
 public void clickOnLogin() {
	 CLICK.click();
 }
	
	
	
	
	
}
