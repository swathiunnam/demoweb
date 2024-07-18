package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.HomePage;

public class SignupTest extends ProjectSpecification {
	@Test
	public void signupTest() {
		
		HomePage obj=new HomePage(driver);
		obj.clickSignup()
		.enterUsername()
		.enterPassword()
		.clickOnSignup();
		String expected="STORE";
		String actual=driver.getTitle();
	     Assert.assertEquals(actual, expected);
	  
		
		
	}

}
