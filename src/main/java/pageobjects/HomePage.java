package pageobjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {
	
	
	@FindBy(xpath="//a[text()='Sign up']")
	WebElement signup;
	
	@FindBy(id="login2")
	WebElement login;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public SignupPage clickSignup() {
		
		signup.click();
		return new SignupPage(driver);
	}
	
  public LoginPage clickLogin() {
		
		login.click();
		return new LoginPage(driver);
	}
  
 

}
