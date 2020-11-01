package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test47 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.mercurytravels.co.in");
		Thread.sleep(5000);
		//Close banner
		driver.findElement(By.xpath("(//*[@class='close'])[2]/span")).click();
		Thread.sleep(5000);
		//Locate drop-down which developed using <select> tag
		WebElement e=driver.findElement(By.name("theme"));
		//Select a item in single select drop-down
		Select s=new Select(e);
		//s.selectByVisibleText("Beach");
		//s.selectByIndex(1); //2nd item
		s.selectByValue("13");

	}

}





