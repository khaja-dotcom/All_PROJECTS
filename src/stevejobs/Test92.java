package stevejobs;


import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Test92
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser(SWD)
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site(SWD)
		driver.get("https://www.youtube.com");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
		//screen shot via SWD
		File dest1=new File("swdscreenshot.png");
		File src=driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, dest1);
		Thread.sleep(5000);
		//screen shot via SikuliX
		Screen s=new Screen();
		ScreenImage si=s.capture();
		BufferedImage bi=si.getImage();
		File dest2=new File("sikuliscreenshot.png");
		ImageIO.write(bi,"png",dest2);
		//close site
		s.keyDown(Key.ALT);
		s.keyDown(Key.F4);
		s.keyUp(Key.F4);
		s.keyUp(Key.ALT);
		
	}
}






