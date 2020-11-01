package stevejobs;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test53 
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
		//Collect items in cache element
		List<WebElement> lis=driver.findElements(By.xpath("//*[@role='listbox']/li"));
		int flag=0;
		for(int i=0; i<lis.size();i++)
		{
			String x=lis.get(i).getText();
			if(sug.equalsIgnoreCase(x))
			{
				lis.get(i).click();
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







