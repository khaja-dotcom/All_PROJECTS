package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test66
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.executeAsyncScript("window.setTimeout(function(){window.alert('kalam');},1000); window.alert('hi');");
		

	}
}



