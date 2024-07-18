package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UtilityClass {

	
public static WebDriver driver;
	
	public void launch() {
		
		String browsername="chrome";
		if(browsername.equalsIgnoreCase("chrome")) {
			//launch only chrome browser
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			//launch only firefox browser
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			//launch only Edge browser
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("safari")) {
			//launch only safari browser
			driver=new SafariDriver();
		}
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
		  public  static String getScreenshot(String testname) throws IOException {
				File srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//provide the path where we capture screenshot
				String screenshotfilepath=System.getProperty("user.dir")+"\\Screenshot\\"+testname+".png";
				//copy the file 
				FileUtils.copyFile(srcScreenshot, new File(screenshotfilepath));
				return screenshotfilepath;	
				
				
			}
		
	
	
	
	
	/*public void close() {
		
		driver.close();
	}*/


}
