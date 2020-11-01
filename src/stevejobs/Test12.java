package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test12
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");        
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Locate Gmail link
		WebElement e=driver.findElement(By.linkText("Gmail"));
		//Get opacity and text decoration values before mouse over to "Gmail" link
		String x1=e.getCssValue("opacity");
		String y1=e.getCssValue("text-decoration");
		System.out.println("Values before Mouse over:");
		System.out.println("Opacity is "+x1);
		System.out.println("Text decoration is "+y1);
		//Move mouse pointer to "Gmail" link
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(5000);
		//Get opacity and text decoration values after mouse over to "Gmail" link
		String x2=e.getCssValue("opacity");
		String y2=e.getCssValue("text-decoration");
		System.out.println("Values after Mouse over:");
		System.out.println("Opacity is "+x2);
		System.out.println("Text decoration is "+y2);
		//Close site
		driver.close();
		
		
		
		
		

	}

}
