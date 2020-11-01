package stevejobs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test80
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://www.gmail.com");
		WebDriverWait w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		//do login
		driver.findElement(By.name("identifier")).sendKeys("venu.srivenu");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("Venu@4321");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Compose']")));
		//click compose
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
		//Fill fields in compose page
		driver.findElement(By.name("to")).sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Wishes");
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]"))
		          .sendKeys("Hi sir\nHow are you in haven?\nHappy birthday sir\nBye sir...");
		//Click on attachment link
		driver.findElement(By.xpath("//*[@name='Filedata']/preceding::div[2]")).click();
		//File upload(Java Robot)
		Thread.sleep(5000); //wait for file upload window
		StringSelection fp=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\tulips.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fp,null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//Send mail
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@aria-label,'Press enter to view the attachment and delete to remove it')]")));
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		//get output message
		try
		{
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					                         "//*[contains(text(),'Message sent')]")));
			System.out.println("Test passed");
		}
		catch(Exception ex)
		{
			System.out.println("Test failed");
		}
		//Do logout
		driver.findElement(By.xpath(
				"//*[starts-with(@aria-label,'Google Account')]/child::span")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
		driver.findElement(By.linkText("Sign out")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Signed out']")));
		//Close site
		driver.close();
	}

}






