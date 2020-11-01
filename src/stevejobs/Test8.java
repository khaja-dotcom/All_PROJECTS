package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//do login
		driver.findElement(By.name("identifier")).sendKeys("xxxxxxxxxxxxxxx");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("xxxxxxxxxxxx");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//click compose
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		//Fill fields in compose page
		driver.findElement(By.name("to")).sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Wishes");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]"))
		          .sendKeys("Hi sir\nHow are you in haven?\nHappy birthday sir\nBye sir...");
		
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		String res=driver.findElement(By.className("bAq")).getText();
		System.out.println(res);
		Thread.sleep(5000);
		//Do logout
		driver.findElement(By.xpath(
				"//*[starts-with(@aria-label,'Google Account')]/child::span")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//Close site
		driver.close();
	}

}






