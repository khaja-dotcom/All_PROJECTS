package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test46 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(5000);
		//Switch to frame and locate drop-down developed using <select> tag
		driver.switchTo().frame("iframeResult");
		WebElement e=driver.findElement(By.name("cars"));
		Select s=new Select(e);
		//Check for single select or multi select
		if(s.isMultiple())
		{
			System.out.println("Multi-select");
			//select multiple items
			Actions a=new Actions(driver);
			a.keyDown(Keys.CONTROL).perform();
			a.click(s.getOptions().get(2)).perform(); //3rd item
			a.click(s.getOptions().get(0)).perform(); //1st item
			a.keyUp(Keys.CONTROL).perform();
			//Show selected items
			List<WebElement> sl=s.getAllSelectedOptions();
			for(WebElement x:sl)
			{
				System.out.println(x.getText());
			}
			//get first item in selected items
			String fsi=s.getFirstSelectedOption().getText();
			System.out.println(fsi);
			//De-select all
			//s.deselectAll();
			//s.deselectByIndex(2); //index as per all items, not per selected items
			//s.deselectByVisibleText("Volvo");
			s.deselectByValue("volvo");
		}
		else
		{
			System.out.println("Single-Select");
		}
		//Close site
		//driver.close();
	}
}





