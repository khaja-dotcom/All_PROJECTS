package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test33
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site, which has frames
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");                    
		Thread.sleep(5000);
		//go to frame and click on a button
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		//go to alert and get text in that alert
		String x=driver.switchTo().alert().getText();
		System.out.println(x);
		//Close alert
		driver.switchTo().alert().dismiss();
		//Back to page
		driver.switchTo().defaultContent();
		//Close site
		driver.close();
		
		
		

	}

}
