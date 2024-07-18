package base;

import org.testng.annotations.BeforeMethod;

import utilities.UtilityClass;

public class ProjectSpecification extends UtilityClass {
	
	@BeforeMethod 
	public void browserLaunch() {
		
		launch();
	}
	/*@AfterMethod
	public void closeBrowser() {
		
		close();
	}*/


}
