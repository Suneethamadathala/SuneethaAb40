package launchprograms;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLauchBrowser {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");

	}

}
