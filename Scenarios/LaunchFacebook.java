package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException 
	{
		// launch FB registration and till the FN,LN,Email,PW
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		driver.findElement(By.name("firstname")).sendKeys("suneetha");
		driver.findElement(By.name("lastname")).sendKeys("mada");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("suneethareddy1255@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sam@1255");
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.id("day"));
		Select s1 = new Select(date);
		s1.selectByVisibleText("13");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		s.selectByVisibleText("Apr");
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1990");
		
		WebElement radio =driver.findElement(By.name("sex"));
		//Select s4= new Select(radio);
		//s4.selectByVisibleText("Female");
		radio.click();
		
		

	}

}
