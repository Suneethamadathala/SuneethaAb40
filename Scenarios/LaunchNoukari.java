package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNoukari {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.partialLinkText("Register"));
		ele.click();
		Thread.sleep(1000);
		driver.findElement(By.name("google-register")).click();

	}

}
