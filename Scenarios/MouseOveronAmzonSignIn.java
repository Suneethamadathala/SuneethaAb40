package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOveronAmzonSignIn {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		  ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in/"); 
	       WebElement element = driver.findElement(By.id("nav-link-accountList"));
	       
	  Actions act = new Actions(driver);
	  act.moveToElement(element).perform();

	}

}
