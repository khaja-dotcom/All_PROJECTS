package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","F:\\BATCH249\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("k.1996veeranarayana",Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys(Keys.chord(Keys.CONTROL,"x"));
		Thread.sleep(5000);
	}
}










