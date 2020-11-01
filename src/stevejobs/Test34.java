package stevejobs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test34 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.gmail.com"); //1st window                
		Thread.sleep(5000);
		//do login with "From" account credentials
        driver.findElement(By.name("identifier")).sendKeys("khaja5224.kdp");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("07386364491");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
        //click compose link
    	driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		//Fill fields in compose page
		driver.findElement(By.name("to")).sendKeys("riyaz.selenium@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Wishes");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]"))
		          .sendKeys("Hi sir\nHow are you?\nBye sir...");
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		String res=driver.findElement(By.className("bAq")).getText();
		System.out.println(res);
		Thread.sleep(5000);
		//Do logout for "from" account mandatory to avoid "Same Origin Policy" Error
		driver.findElement(By.xpath(
						"//*[starts-with(@aria-label,'Google Account')]/child::span")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
        //Create new window/Tab
		driver.switchTo().newWindow(WindowType.WINDOW); //2nd window
		Set<String> wins=driver.getWindowHandles();
		ArrayList<String> handels=new ArrayList<String>(wins);
		driver.switchTo().window(handels.get(1));
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		try
		{
			driver.findElement(By.linkText("Try Again")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[text()='Use another account']")).click();
			Thread.sleep(5000);
		}
		catch(Exception ex)
		{
		}
		//do login with "to" account credentials
        driver.findElement(By.name("identifier")).sendKeys("riyaz.selenium");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("9481538032");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(10000);
        String value=driver.findElement(By.xpath(
        		"(//table/tbody)[7]/tr[1]/td[5]/div[2]/span/span")).getAttribute("email");
        System.out.println(value);
        if(value.startsWith("khaja5224.kdp"))
        {
        	System.out.println("Test passed");
        }
        else
        {
        	System.out.println("Test failed");
        }
        //do logout for "to" account
        driver.findElement(By.xpath(
				"//*[starts-with(@aria-label,'Google Account')]/child::span")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Sign out")).click();
        Thread.sleep(5000);
        //Close all browser windows or tabs
        driver.quit();
	}
}









