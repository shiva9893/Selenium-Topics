package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTable {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Revathi\\Downloads\\geckodriver-v0.24.0-win64 (2)\\geckodriver.exe");
	  
	    WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		List<WebElement> table=driver.findElements(By.xpath("//table"));
		
		
		
		for(WebElement data:table)
		{	
			
		//System.out.println(data.getText());	
		
		int rows=data.findElements(By.xpath("//tr")).size();
		
		for(int i=1;i<rows;i++)
		{
			List<WebElement> columndata=data.findElements(By.xpath("//tr["+i+"]//td[1]"));
			for(WebElement cd:columndata)
			{
				String result=cd.getText();
				if(result.contains("UAE"));
				System.out.println("match found");
				
				
				
				
			}
			break;
		}
		
		
		}
		
		
  }
}
