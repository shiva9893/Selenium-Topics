 package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Window_Maximize {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revathi\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//driver.manage().window().maximize();
		//Using Dimension from Selenium
		Dimension dm=new Dimension(800,500);
		driver.manage().window().setSize(dm);
		}
}
