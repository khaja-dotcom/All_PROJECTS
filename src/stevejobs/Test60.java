package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test60
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Locate hidden element
		WebElement e=driver.findElement(By.name("hiddenPassword"));
		//Get hidden element details(no exception)
		String x=e.getCssValue("background-color");
		System.out.println(x);
		//Close site
		driver.close();
	}
}





