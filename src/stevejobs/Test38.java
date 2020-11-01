package stevejobs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test38
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");                      
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Delete all existing cookies
		driver.manage().deleteAllCookies();
		//Launch a site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000); 
		//Collect all cookies related to that site page
		Set<Cookie> cl=driver.manage().getCookies();
		List<Cookie> l=new ArrayList<Cookie>(cl);
		System.out.println("Count of Cookies is "+l.size());
		for(Cookie c:l)
		{
			System.out.println(c.getName()+","+c.getValue());
		}
		//Close site
		driver.close();
	}

}





