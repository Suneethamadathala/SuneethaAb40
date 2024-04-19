package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon {

	public static void main(String[] args) 
	{
		
	  ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.in/"); 
       driver.findElement(By.linkText("Customer Service")).click();
       WebElement orders = driver.findElement(By.xpath("(//h3)[1]"));
       orders.click();
       driver.findElement(By.name("email")).sendKeys("suneethareddy55@gmail.com");
       driver.findElement(By.name("password")).sendKeys("Saadhvin@1255");
       driver.findElement(By.id("signInSubmit")).click();
	  
	}

}
