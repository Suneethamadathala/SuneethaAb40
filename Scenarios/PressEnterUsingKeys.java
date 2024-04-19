package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressEnterUsingKeys {

	public static void main(String[] args)
	{
		// Launch google and type india and press enter button
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement enter= driver.findElement(By.name("q"));
		
		enter.sendKeys("india");
		enter.sendKeys(Keys.ENTER);

	}

}
