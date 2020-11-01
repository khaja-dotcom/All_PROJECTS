package stevejobs;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
                "E:\\batch245\\chromedriver.exe");        
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		//Collect all link type elements of home page 
		//Which are developed using "a","link","img","area","base" and "href"  
		List<WebElement> l=driver.findElements(
			 By.xpath("(//a)|(//link)|(//img)|(//area)|(//href)|(//base)"));
		//Filter all elements for hyper links
		int brokenlinks=0;
		int workinglinks=0;
		int totalhyperlinks=0;
		for(WebElement e:l)
		{
			if(e.getAttribute("href")!=null)
			{
				String x=e.getAttribute("href");
				if(x.length()!=0)
				{
					if(x.startsWith("http:") || x.startsWith("https:"))
					{
						totalhyperlinks++;
						URL u=new URL(x);
						HttpURLConnection con=
								(HttpURLConnection) u.openConnection();
						con.connect();
						String y=con.getResponseMessage();
						con.disconnect();
						if(y.equalsIgnoreCase("OK") || 
								      y.equalsIgnoreCase("Found"))
						{
							workinglinks++;
						}
						else
						{
							brokenlinks++;
							System.out.println(y+" is response of "+x);
						}
					}
				}
			}
		}
		System.out.println("Total hyper links is "+totalhyperlinks);
		System.out.println("Working links count is "+workinglinks);
		System.out.println("Broken links coun is "+brokenlinks);
		//Close site
		driver.close();
	}	
}





