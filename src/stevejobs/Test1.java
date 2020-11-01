package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{

	public static void main(String[] args) 
	{
		//Java code to set path of "chromedriver" software to property
		System.setProperty("webdriver.chrome.driver","F:\\BATCH249\\chromedriver_win32\\chromedriver.exe");
		//Create object to "ChromeDriver" class by using ChromeDriver() constructor
		ChromeDriver driver=new ChromeDriver();
		//Launch google site
		driver.get("http://www.google.co.in");
		
		

	}

}







