package stevejobs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site(google)
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		//click on gmail link
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		//click on Signin link
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(5000);
		//Get browser windows/tabs handles
		Set<String> wins=driver.getWindowHandles();
		ArrayList<String> winsarray=new ArrayList<String>(wins);
		//switch to 2nd tab/window(Gmail)
		driver.switchTo().window(winsarray.get(1));
		//do login using valid data
        driver.findElement(By.name("identifier")).sendKeys("khaja5224.kdp");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("07386364491");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(10000);
        //Do logout
        driver.findElement(By.xpath("//*[@class='gb_Ea gbii']")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Sign out")).click();
        Thread.sleep(5000);
        //Close site(Gmail)
        driver.close();
        Thread.sleep(5000);
        //Switch back to 1st tab/window
        driver.switchTo().window(winsarray.get(0));
        //close site(google)
        driver.close();
	}
}




