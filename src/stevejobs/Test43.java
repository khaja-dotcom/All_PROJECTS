package stevejobs;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class Test43 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");          
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(5000);
		//Window automation(Java Robot)
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F11);
		r.keyRelease(KeyEvent.VK_F11);
	}
}





