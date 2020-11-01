package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver",
                "E:\\batch245\\chromedriver.exe");        
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Locate element
		WebElement e=driver.findElement(By.name("identifier"));
		//Check for visibility of element in page
		if(e.isDisplayed())
		{
			System.out.println("Visible in page");
			if(e.isEnabled())
			{
				System.out.println("enabled");
			}
			else
			{
				System.out.println("disabled");
			}
		}
		else
		{
			System.out.println("Hidden");
		}
		//Close site
		driver.close(); 
	}
}
