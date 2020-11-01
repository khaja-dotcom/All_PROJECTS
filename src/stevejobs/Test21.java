package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
                               "E:\\BATCH245\\batch245\\chromedriver_win32.exe");        
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//Collect all links
		List<WebElement> l=driver.findElements(By.tagName("a"));
		//Display count of links
		System.out.println("Total links are "+l.size());
		//Display each link text
		int clwtext=0;
		int clwotext=0;
		for(WebElement e:l)
		{
			String x=e.getText();
			if(x.length()!=0)
			{
				System.out.println(x);
				clwtext=clwtext+1;
			}
			else
			{
				clwotext=clwotext+1;
			}
		}
		System.out.println("Count of links with text:"+clwtext);
		System.out.println("Count of links with out text:"+clwotext);       
		//Close site
		driver.close();
	}
}





