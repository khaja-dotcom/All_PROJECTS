package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test32
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site, which has frames
		driver.get("https://www.way2sms.com");          
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("9000675423");

	}
}







