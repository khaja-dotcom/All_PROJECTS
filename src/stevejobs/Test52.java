package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test52 
{
	public static void main(String[] args) throws Exception
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word to search");
		String word=sc.nextLine();
		System.out.println("Enter expected suggestion");
		String sug=sc.nextLine();
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys(word);
		Thread.sleep(5000);
		//Find count of items in cache element
		int c=driver.findElements(By.xpath("//*[@role='listbox']/li")).size();
		//traverse to each item in cache
		Actions a=new Actions(driver);
		int flag=0;
		for(int i=1;i<=c;i++)
		{
			a.sendKeys(Keys.DOWN).perform();
			String x=(String) driver.executeScript("return arguments[0].value;",e);
			Thread.sleep(2000);
			if(sug.equalsIgnoreCase(x))
			{
				a.sendKeys(Keys.ENTER).perform();
				flag=1;
				System.out.println("Expected suggesion found");
				break; //terminate from loop
			}
		}
		if(flag==0)
		{
			System.out.println("Expected suggesion not found");
		}
		//Close site
		driver.close();
	}
}










