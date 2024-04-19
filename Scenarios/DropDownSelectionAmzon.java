package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectionAmzon {

	public static void main(String[] args) throws InterruptedException 
	{
		//launch amazon india from dropdown catagory select books type worldwar and click on search button
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select sb= new Select(dropdown);
	
	      sb.selectByIndex(11);
	      //sb.selectByVisibleText("Books");
	      Thread.sleep(1000);
	      //sb.selectByValue("search-alias=stripbooks");
	       driver.findElement(By.xpath("(//input)[5]")).sendKeys("World war");
	       driver.findElement(By.xpath("(//input)[6]")).click();

	}

}
