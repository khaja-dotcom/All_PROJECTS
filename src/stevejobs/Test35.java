package stevejobs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test35 
{
	public static void main(String[] args) throws Exception
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Gmail credentials");
		String guid=sc.nextLine();
		String gpwd=sc.nextLine();
		System.out.println("Enter Yahoo credentials");
		String yuid=sc.nextLine();
		String ypwd=sc.nextLine();
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch Gmail site
		driver.get("https://www.gmail.com"); //1st window                
		Thread.sleep(5000);
		//do login with "From" account credentials in Gmail site
        driver.findElement(By.name("identifier")).sendKeys(guid);
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys(gpwd);
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
        //click compose link in Gmail site
    	driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		//Fill fields in compose page in Gmail site
		driver.findElement(By.name("to")).sendKeys(yuid+"@yahoo.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Wishes");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]"))
		                                .sendKeys("Hi sir\nHow are you?\nBye sir...");
		//send email in Gmail site
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		//Get output message of "Gmail" 
		String res=driver.findElement(By.className("bAq")).getText();
		res=res.toLowerCase();
		System.out.println(res);
		Thread.sleep(5000);
		if(res.contains("message sent"))
		{
			//Launch Yahoo site in new browser window
			driver.switchTo().newWindow(WindowType.WINDOW); //2nd window
			Set<String> wins=driver.getWindowHandles();
			ArrayList<String> handels=new ArrayList<String>(wins);
			driver.switchTo().window(handels.get(1)); //goto 2nd window for yahoo
			driver.get("https://www.yahoomail.com");
			Thread.sleep(5000);
			//Login to Yahoo site using "to" account credentials
			driver.findElement(By.xpath("//span[text()='Sign in']")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("username")).sendKeys(yuid);
			WebElement e1=driver.findElement(By.name("signin"));
			driver.executeScript("arguments[0].click();",e1);
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys(ypwd);
			WebElement e2=driver.findElement(By.name("verifyPassword"));
			driver.executeScript("arguments[0].click();",e2);
			Thread.sleep(5000);
			WebElement recentmail=driver.findElement(By.xpath(
				"//*[@data-test-id='virtual-list-container']/descendant::ul/li[3]"));
			WebElement fromid=recentmail.findElement(By.xpath(
									"descendant::div[@data-test-id='senders']/span"));
			String value=fromid.getAttribute("title");
			System.out.println(value);
			if(value.startsWith(guid))
			{
				System.out.println("Gmail mail sent Test passed");
			}
			else
			{
				System.out.println("Gmail mail sent Test failed");
			}
			//do logout for "to" account in yahoo site
			driver.findElement(By.xpath("(//img[@alt='Profile image'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Sign out']")).click();
			Thread.sleep(5000);
			//close yahoo site
			driver.close();
			//Back to Gmail site 
			driver.switchTo().window(handels.get(0)); //back to 1st browser window
		}
		else
		{
			System.out.println("Please check magnitiasdet@yahoo.com address details");
		}
		//Do logout from Gmail
		driver.findElement(By.xpath(
				"//*[starts-with(@aria-label,'Google Account')]/child::span")).click();              
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//close gmail site
		driver.close();
	}
}







