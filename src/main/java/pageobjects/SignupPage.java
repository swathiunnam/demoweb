package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SignupPage extends ProjectSpecification {
	
	@FindBy(xpath="//input[@id='sign-username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='sign-password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign up']")
	WebElement signup;
	
	public SignupPage(WebDriver driver) {
		 
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public SignupPage enterUsername() {

		username.sendKeys("Swathiinturi");
		return this;
	}
	
	public SignupPage enterPassword() {
		
		password.sendKeys("Swathi@123456");
		return this;
	}
	
  public void clickOnSignup() {
		
		signup.click();
		
	}
  
 
}
