package launchprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchBrowesers {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();//Close the current browser where control is 
		
		//driver.quit();//Close the parent and child browsers
		

	}

}
