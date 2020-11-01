package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test50 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://jqueryui.com/slider");
		Thread.sleep(5000);
		//Switch to frame and locate Horizontal slider element
		driver.switchTo().frame(0);
		WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/span"));
		Actions a=new Actions(driver);
		//left to right
		a.dragAndDropBy(e1,300,0).perform();
		Thread.sleep(5000);
		//right to left
		a.dragAndDropBy(e1,-300,0).perform();
		Thread.sleep(5000);
		//Back to page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(5000);
		//Switch to frame and locate Vertical slider element
		driver.switchTo().frame(0);
		WebElement e2=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		//to bottom
		a.dragAndDropBy(e2,0,100).perform();
		Thread.sleep(5000);
		//bottom to top
		a.dragAndDropBy(e2,0,-150).perform();
		Thread.sleep(5000);
		//Back to page
		driver.switchTo().defaultContent();
		//Close site
		driver.close();	
	}
}





