package stevejobs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test44
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Page screenshot
		File pagesrc=driver.getScreenshotAs(OutputType.FILE);
		File pagedest=new File("pagescreeshot.png");
		FileHandler.copy(pagesrc, pagedest);
		//Element screenshot
		File elesrc=driver.findElement(By.name("identifier")).getScreenshotAs(OutputType.FILE);
		File eledest=new File("elementscreenshot.png");
		FileHandler.copy(elesrc, eledest);
		//close site
		driver.close();
	}
}












