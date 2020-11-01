package stevejobs;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test76
{
	public static void main(String[] args) throws Exception
	{
		//Create an empty folder
		File fo=new File("E:\\mydownloads");
		fo.mkdir(); 
		//Define preferences/arguments with values in a hash map
		HashMap<String, Object> hm=new HashMap<String, Object>();
		hm.put("profile.default_content_settings.popups",0); //0 means off
		hm.put("download.default_directory",fo.getAbsolutePath());
		//Set hash map pairs to chrome browser preferences
		ChromeOptions co=new ChromeOptions();
		co.setExperimentalOption("prefs",hm);
		//Open browser with preferences
		System.setProperty("webdriver.chrome.driver","E:\\batch244\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(co);
		//Launch site
		driver.get("https://selenium.dev/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[text()='DOWNLOAD'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(4000);
		//Close site
		driver.close();
	}
}
