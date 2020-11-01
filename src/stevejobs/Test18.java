package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
		                         "E:\\batch245\\chromedriver.exe");        
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.cleartrip.com/flight-booking/indigo-airlines.html");
		Thread.sleep(5000);
		//Operate radio button by locating parent label 
		driver.findElement(By.xpath("(//*[@for='rnd-trip'])[1]")).click();

	}

}
