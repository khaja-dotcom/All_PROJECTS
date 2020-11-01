package stevejobs;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test75
{
	public static void main(String[] args) throws Exception
	{
		FirefoxOptions fo=new FirefoxOptions();
		fo.addPreference("dom.webnotifications.enabled",false);
		//Open firefox browser
		System.setProperty("webdriver.gecko.driver","E:\\batch245\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver(fo);
		driver.manage().window().maximize();
		//Launch site and wait until text box is visible in page
		driver.get("https://www.redbus.in");
		Thread.sleep(5000);

	}

}
