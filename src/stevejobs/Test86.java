package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;

import com.google.common.collect.ImmutableMap;

public class Test86
{
	public static void main(String[] args)
	{
		//Open chrome browser 1st instance
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		//Launch site under recovery testing
		driver1.get("https://www.facebook.com");
		//Create object to connect to DevTools
		DevTools dt=driver1.getDevTools();
		dt.createSession();
		//Run crash browser command
		try
		{
			Command cmd=new Command("Browser.crash",ImmutableMap.of());
			dt.send(cmd);
		}
		catch(Exception ex)
		{
			System.out.println("Crash Operation completed");
		}
		//Create chrome browser new instance
		try
		{
			ChromeDriver driver2=new ChromeDriver();
			driver2.get("https://www.facebook.com");
			if(driver2.getTitle().contains("Facebook"))
			{
				System.out.println(
						"Chrome with facebook site recovered from crash state to normal");
				driver2.close();
			}
			else
			{
				System.out.println("Chrome with facebook site not recovered properly");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Chrome with facebook site not recovered properly");
		}
	}
}





