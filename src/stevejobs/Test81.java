package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test81
{
	public static void main(String[] args)
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}








