package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args)
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.facebook.com");
		//get source code of page
		String p=driver.getPageSource();
		System.out.println(p);
		//Close site
		driver.close();

	}

}
