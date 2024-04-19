package launchprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTheElements {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//Scenario //launch google//find element
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		//driver.close();
		//Login to facebook
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("suneethareddy23@gmail.com");	
		driver.findElement(By.id("pass")).sendKeys("Saadhvin@1255");
		driver.findElement(By.name("login")).click();
		
		
		

	}

}
