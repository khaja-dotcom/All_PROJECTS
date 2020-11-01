package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test61
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate a <div> tag drop-down
		WebElement dd=driver.findElement(By.xpath("(//div[@class='ui dropdown'])[1]"));
		//Open drop-down to get visibility of items in page
		dd.click();
		Thread.sleep(5000);
		//Get visible items text
		List<WebElement> lidd=dd.findElements(By.xpath("child::div[2]/div"));
		for(WebElement e:lidd)
		{
			System.out.println(e.getText());
		}
		//Close site
		driver.close();
	}
}






