package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test55
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.yahoomail.com");
		Thread.sleep(5000);
		//Highlight sign in element
		//Way-1
		WebElement e=driver.findElement(By.xpath("//*[text()='Sign in']"));
		driver.executeScript("arguments[0].style.border='2px red solid';",e);
		//Way-2
		driver.executeScript("document.getElementsByTagName('span')[1].style.border='2px red solid';");
		Thread.sleep(5000);
		

	}

}





