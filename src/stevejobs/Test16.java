package stevejobs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test16
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
				                      "E:\\batch245\\chromedriver.exe");        
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Locate an element and get size of element
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("abdul kalam");
		File src=e.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\batch245\\eless.png");
		FileHandler.copy(src,dest);
		//Close site
		driver.close();
	}
}




