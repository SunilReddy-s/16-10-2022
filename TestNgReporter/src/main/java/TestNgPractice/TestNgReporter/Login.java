package TestNgPractice.TestNgReporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;

	@FindBy(xpath="//*[@placeholder=\"Username\"]")
	private WebElement USERNAME;
	
	@FindBy(xpath="//*[@placeholder=\"Password\"]")
	private WebElement PASSWORD;
	
	@FindBy(xpath="//*[@type=\"submit\"]")
	private WebElement LOGINBUTTON;
	
	public Login(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void  USERNAME() {
		USERNAME.sendKeys("Admin");
	}
	
	public void PASSWORD() {
		PASSWORD.sendKeys("admin123");
	}
	public void LOGINBUTTON() {
		LOGINBUTTON.click();
	}
}
