package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test5
{
	public static void main(String[] args)
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.facebook.com");
		//Get handle of chrome browser window
		String w=driver.getWindowHandle();
		System.out.println(w);
		//Close site
		driver.close();
	}
}
