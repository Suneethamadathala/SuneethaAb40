package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanughGoogleclickonGmail {

	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.className("gb_J")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Gma")).click();
		
	 

	}

}
