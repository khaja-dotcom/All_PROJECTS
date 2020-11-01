package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test57
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://www.mercurytravels.co.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='white-text']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='controls'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='controls'])[4]")).click();

	}

}





