package stevejobs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
                                   "E:\\batch245\\chromedriver.exe");        
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.cleartrip.com");
		Thread.sleep(5000);
		//Collect all link type elements of home page 
		//Which are developed using "a","link","img","area","base" and "href" tags  
		List<WebElement> l1=driver.findElements(
			  By.xpath("(//a)|(//link)|(//img)|(//area)|(//href)|(//base)"));
		//Filter link type elements for hyper links
		List<WebElement> l2=new ArrayList<WebElement>();
		for(WebElement e:l1)
		{
			if(e.getAttribute("href")!=null)
			{
				String x=e.getAttribute("href");
				if(x.length()!=0)
				{
					if(x.startsWith("http:") || x.startsWith("https:"))
					{
						l2.add(e);
					    System.out.println(x);
					}
				}
			}
		}
		System.out.println("Count of hyper links is "+l2.size());
		//Close site
		driver.close();
	}
}






