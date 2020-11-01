package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test20 
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
		//Radio button/Check box/Drop down list "on" or "off" testing
		WebElement e=driver.findElement(By.id("RoundTrip"));
		if(e.isDisplayed())
 		{
			if(e.isEnabled())
			{
				if(e.isSelected())
				{
					System.out.println("Radio button is visible, enabled, and selected");
				}
				else
				{
					System.out.println("Radio button is visible and enabled, but not selected");
				}
			}
			else
			{
				System.out.println("Radio button is visible, but disabled");
			}
		}
		else
		{
			System.out.println("Radio button is not visible in page");
		}
		//close site
		driver.close();
	}
}









