package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test67
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
		WebElement dd=driver.findElement(By.xpath("//*[@id='selection']/following-sibling::div[2]"));
		//check for single-select or multi-select
		if(dd.getAttribute("class").contains("multiple"))
		{
			System.out.println("Multi select drop down");
		}
		else
		{
			System.out.println("Single select drop down");
		}
		//Collect all items and display count of items
		List<WebElement> items=dd.findElements(By.xpath("child::div[2]/div"));
		System.out.println("Count of items is "+items.size());
		//Display items text
		dd.click(); //drop down items should be displayed in page
		Thread.sleep(5000);
		System.out.println("Itmes are:");
		for(WebElement item:items)
		{
			String x=item.getText();
			System.out.println(x);
		}
		//Select specific item
		items.get(1).click(); //2nd item
		Thread.sleep(5000);
		//Get selected item text
		String y=dd.findElement(By.xpath("child::div[1]")).getText();
		System.out.println("Selected item is "+y);
		//Close site
		driver.close();
	}
}







