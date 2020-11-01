package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test48
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//Right click on Gmail link
		WebElement e=driver.findElement(By.linkText("Gmail"));
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
	}
}








