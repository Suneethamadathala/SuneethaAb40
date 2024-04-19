package launchprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownProgram {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		
	driver.get("https://www.amazon.in/");
	
	WebElement element = driver.findElement(By.id("searchDropdownBox"));
	     Select s1 = new Select(element);
	     
	     s1.selectByIndex(2);
	     Thread.sleep(1000);
	     s1.selectByValue("search-alias=audible");
	     Thread.sleep(1000);
	     s1.selectByVisibleText("Beauty");
	     

	}

}
