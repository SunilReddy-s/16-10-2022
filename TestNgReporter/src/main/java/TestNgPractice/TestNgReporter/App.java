package TestNgPractice.TestNgReporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class App 
{
  WebDriver driver;
  
  @FindBy(xpath="//*[text()=\"Create New Account\"]")
  private WebElement CNA;
  
  @FindBy(xpath="//*[@name=\"firstname\"]")
  private WebElement FN;
  
  @FindBy(xpath="//*[@name=\"lastname\"]")
  private WebElement LN;
  
 @FindBy(xpath="//*[@name=\"birthday_day\"]")
  private WebElement DAY;
 
 public App(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
 }
 public void createnewaccount() {
	 CNA.click();
 }
 public void firstname() {
	 FN.sendKeys("sunil");
 }
 public void lastname() {
	 LN.sendKeys("naik");
 }
 public void day() {
	 Select s =new Select(DAY);
	 s.selectByIndex(12);
 }
}
