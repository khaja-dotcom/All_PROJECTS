package stevejobs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser using chromedriver.exe software
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		//Click on link to goto target page
		driver.findElement(By.linkText("Start here.")).click();
		Thread.sleep(5000);
		//Collect all box type elements
		List<WebElement> l=driver.findElements(By.xpath(
		 "//input[@type='text' or @type='tel' or @type='email' or @type='password']"));
		System.out.println("Total count of boxes is "+l.size());
		//Check for visible boxes and hidden boxes
		int cvb=0;
		int chb=0;
		List<WebElement> vl=new ArrayList<WebElement>();
		for(WebElement e:l)
		{
			if(e.isDisplayed())
			{
				cvb=cvb+1;
				vl.add(e);  //Add visible box to another list
			}
			else
			{
				chb=chb+1;
			}
		}
		System.out.println("Total count of visible boxes is "+cvb);
		System.out.println("Total count of hidden boxes is "+chb);
		//Fill visible boxes only by taking data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data for "+cvb+" fields");
		for(WebElement e:vl)
		{
			e.sendKeys(sc.nextLine());
		}
		//Close site
		driver.close();
	}
}
