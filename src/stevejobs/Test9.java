package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//do login
		driver.findElement(By.name("identifier")).sendKeys("k.1996veeranarayana",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Hydv2148",Keys.ENTER);		
		Thread.sleep(5000);
	}
}







