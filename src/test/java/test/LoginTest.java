package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.HomePage;

public class LoginTest extends ProjectSpecification {
	@Test
	public void loginTest() {
		
		
		HomePage obj=new HomePage(driver);
		obj.clickLogin()
		.enterUsername()
		.enterPassword()
		.clickOnLogin();
		 String expected="STORE";
		 String actual=driver.getTitle();
		 Assert.assertEquals(actual, expected);
	   }

}
