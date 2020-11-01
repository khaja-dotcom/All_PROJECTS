package stevejobs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test83 extends Thread
{
	public void run()
	{
		try
		{
			//Automate basic authentication window(Java Robot)
			Thread.sleep(10000);
			//Enter userid
			StringSelection x=new StringSelection("admin"); //userid
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			//Click on tab for password
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			//Enter password
			StringSelection y=new StringSelection("admin"); //password
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			//Click on Enter key
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(Exception ex)
		{
			
		}
	}
	public static void main(String[] args) 
	{
		Test83 obj=new Test83();
		obj.start();
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		//Further automation after getting home page

	}

}
