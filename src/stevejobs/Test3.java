package stevejobs;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3
{
	public static void main(String[] args)
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.facebook.com");
		//get title of google home page window
		String t=driver.getTitle();
		System.out.println(t);
		//Close site
		driver.close();

	}

}
