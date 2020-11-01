package stevejobs;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test79 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser(SWD)
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site(SWD)
		driver.get("https://selenium.dev/");
		WebDriverWait w=new WebDriverWait(driver,50);
		w.until(ExpectedConditions.elementToBeClickable(
												By.xpath("(//*[text()='DOWNLOAD'])[3]")));
		//Scroll to Element(SWD)
		WebElement e=driver.findElement(By.xpath("(//*[text()='DOWNLOAD'])[3]"));
		driver.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
		//Perform right click on element(SWD)
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
		Thread.sleep(5000);
		//Handle win-menu(Java Robot)
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
}





