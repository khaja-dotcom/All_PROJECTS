package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test49
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://jqueryui.com/droppable");
		Thread.sleep(5000);
		//Switch to frame and locate drag and drop elements
		driver.switchTo().frame(0); //0 means 1st frame in page
		WebElement e1=driver.findElement(By.id("draggable"));
		WebElement e2=driver.findElement(By.id("droppable"));
		//Get drop element into desktop view area
		driver.executeScript("arguments[0].scrollIntoView();",e2);
		Thread.sleep(5000);
		//Perform drag and drop
		Actions a=new Actions(driver);
		a.dragAndDrop(e1, e2).perform();
	}
}




