package stevejobs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.console.Console;

public class Test88
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch246\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		//Create object to access DevTools and start session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Goto Console panel to run JavaScript code
		dt.send(Console.enable());
		driver.executeScript("console.log('hi kalam sir');");
		Thread.sleep(5000);
		driver.executeScript("console.log(window.scrollTo(0,document.body.scrollHeight));");
		Thread.sleep(5000);
		driver.executeScript("console.log(window.scrollTo(document.body.scrollHeight,0));");

	}

}






