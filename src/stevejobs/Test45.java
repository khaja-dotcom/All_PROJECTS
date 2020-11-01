package stevejobs;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Test45
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
		//Collect all items from that drop-down
		Select s=new Select(e);
		List<WebElement> items=s.getOptions();
		//This drop-down has 1st item as suggestion
		System.out.println("Total no: of items is "+(items.size()-1));
		//Test items for sorted order
		ArrayList<String> actual=new ArrayList<String>();
		ArrayList<String> sorted=new ArrayList<String>();
		//1st item is suggestion, so start from 2nd item(index=1)
		for(int i=1;i<items.size();i++)
		{
			actual.add(items.get(i).getText());
			sorted.add(items.get(i).getText());
		}
		//sort items text in sorted array
		Collections.sort(sorted); //Correct for alphabet values
		//Compare actual array and sorted array
		if(sorted==actual)
		{
			System.out.println("Items in sorted order");
		}
		else
		{
			System.out.println("Items are not in sorted order");
			//click on drop-down to get visibility of items
			e.click();
			//get page screenshot
			File pagesrc=driver.getScreenshotAs(OutputType.FILE);
			File pagedest=new File("dropdwnitems.png");
			FileHandler.copy(pagesrc, pagedest);
		}
		//close site
		driver.close();
	}
}





