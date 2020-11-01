package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test74
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		//Launch site and wait until text box is visible in page
		driver.get("https://www.redbus.in");
		Thread.sleep(5000);
		
		

	}

}
