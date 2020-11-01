package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test6
{
	public static void main(String[] args)
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.sentia.in"); //give base url
		//Get handle of chrome browser window
		String u=driver.getCurrentUrl();
		System.out.println(u);
		if(u.contains("https:"))
		{
			System.out.println("Site is secued");
		}
		else
		{
			System.out.println("Site is not secued");
		}
		//Close site
		driver.close();

	}

}
