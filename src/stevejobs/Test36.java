package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test36
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser instance without any history by default  
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch google site
		driver.get("https://www.google.co.in");             
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com");             
		Thread.sleep(5000);
		//back to google as per current history
		driver.navigate().back(); 
		Thread.sleep(5000);
		//Forward to facebook as per current history
		driver.navigate().forward();
		Thread.sleep(5000);
		//Refresh facebook as per current history
		driver.navigate().refresh();
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}





