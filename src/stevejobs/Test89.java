package stevejobs;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;

import com.google.common.collect.ImmutableList;

public class Test89
{
	public static void main(String[] args)
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Connect to DevTools/Inspect
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//enable Network panel in DevTools/Inspect
		dt.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		//set blocked URL patterns
		ImmutableList<String> list=ImmutableList.of("*.css","*.png","*.jpg");
		dt.send(Network.setBlockedURLs(list));
		driver.get("https://www.facebook.com");
	}
}






