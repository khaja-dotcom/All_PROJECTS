package stevejobs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test85
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Create object to "ListenerBodies" class, which consists of bodies to methods
		ListenerBodies obj=new ListenerBodies();
		//Register "ListenerBodies" to "EventFiringWebDriver"
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		edriver.register(obj);
		//Launch site
		edriver.navigate().to("http://www.gmail.com");
		//further code related to test automation
		edriver.close();
		//Unregister "ListenerBodies" from "EventFiringWebDriver"
		edriver.unregister(obj);
	}
}






