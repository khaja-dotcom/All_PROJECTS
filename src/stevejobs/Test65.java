package stevejobs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test65
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("kalam",Keys.ENTER);
		Thread.sleep(5000);
		//get inner text of page
		String x=(String) driver.executeScript("return document.documentElement.innerText;");
		//Define regular expression/pattern matching
		Pattern p=Pattern.compile("[kK][aA][lL][aA][mM]");
		Matcher m=p.matcher(x);
		int count=0;
		while(m.find())
		{
			count=count+1;
		}
		System.out.println("Count of matches with given word is "+count);
		//Close site
		driver.close();
	}
}







