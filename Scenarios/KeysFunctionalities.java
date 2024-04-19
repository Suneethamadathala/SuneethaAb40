package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionalities {

	public static void main(String[] args) throws InterruptedException 
	{
		// Type Name and the firstname copy the name and paste it into middlename 
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://grotechminds.com/registration");
		
		
		WebElement element = driver.findElement(By.id("fname"));
		element.sendKeys("suneetha");
		element.sendKeys(Keys.CONTROL +"a");
		element.sendKeys(Keys.CONTROL+"c");
		WebElement paste = driver.findElement(By.id("lname"));
		
		paste.sendKeys(Keys.CONTROL + "v");

	}

}
