package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Links {
  @Test
  public void f() throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revathi\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
Thread.sleep(3000);
//to get all the cites present in the webpage
List<WebElement> links =driver.findElements(By.xpath("//a//cite"));
		
for(WebElement linksurl:links)
{
	//System.out.println(linksurl.getAttribute("href"));
	System.out.println(linksurl.getText());
	
	
	
	
	
	
	
	
	
	
}
  }
}
