package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.security.Security;

public class Test87
{
	public static void main(String[] args) 
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Connect to DevTools/Inspect
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Send commands to Security Panel in DevTools/Inspect
		dt.send(Security.enable());
		//set ignore certificate errors
		dt.send(Security.setIgnoreCertificateErrors(true)); 
		//load insecure web site and continue automation
		driver.get("https://expired.badssl.com/");
	}
}


