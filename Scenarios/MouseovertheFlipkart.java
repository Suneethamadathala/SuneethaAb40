package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseovertheFlipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement fashion = driver.findElement(By.xpath("(//span)[9]"));
		
		
		
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(fashion).perform();
		Thread.sleep(1000);
		WebElement ram = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		//ram.click();
		//Thread.sleep(1000);
		//ram.sendKeys(Keys.ARROW_RIGHT);
	driver.findElement(By.xpath("//a[@class='_3490ry'][2]")).click();
	}

}
