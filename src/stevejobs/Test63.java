package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test63
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
		//Scroll down
		driver.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//Scroll up
		driver.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		//Scroll to specific element
		WebElement e=driver.findElement(By.xpath(
				"(//*[@class='search'])[1]/following-sibling::div[1]"));
		driver.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}






