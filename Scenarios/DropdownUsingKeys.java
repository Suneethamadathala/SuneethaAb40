package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownUsingKeys {

	public static void main(String[] args) 
	{
		// Using up and down arrows select dropdown
		
		  ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in/"); 
	       WebElement arrow = driver.findElement(By.id("searchDropdownBox"));
	       arrow.sendKeys(Keys.ARROW_DOWN);
	       arrow.sendKeys(Keys.ARROW_UP);
	       

	}

}
