package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test54
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.yahoomail.com");
		Thread.sleep(5000);
		//Click on sign in
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		Thread.sleep(5000);
		//Do login
		//Way-1(Locate element using SWD and operate that element using javascript)
		/*WebElement e1=driver.findElement(By.name("username"));
		driver.executeScript("arguments[0].value='magnitia.batch245';",e1);*/
		//Way-2(Locate and operate element by javascript)
		driver.executeScript("document.getElementById('login-username').value='magnitia.batch245';");
		//way-1(Locate element using SWD and operate that element using javascript)
		/*WebElement e=driver.findElement(By.name("signin"));
		driver.executeScript("arguments[0].click();",e); */
		//way-2(Locate and operate element by javascript)
		driver.executeScript("document.getElementById('login-signin').click();");

	}

}






