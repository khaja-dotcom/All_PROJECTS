package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site, which has frames
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_form_submit");          
		Thread.sleep(5000);
		//fill fields in a frame in page
		driver.switchTo().frame("iframeResult");
		WebElement e1=driver.findElement(By.name("FirstName"));
		e1.clear();
		Thread.sleep(5000);
		e1.sendKeys("abdul");
		WebElement e2=driver.findElement(By.name("LastName"));
		e2.clear();
		e2.sendKeys("kalam");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		Thread.sleep(5000);
		//Back to page
		driver.switchTo().defaultContent();
		

	}

}







