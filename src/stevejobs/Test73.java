package stevejobs;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test73
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String x=sc.nextLine();
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site and wait until text box is visible in page
		driver.get("https://angularjs.org");
		FluentWait w=new FluentWait(driver);
		w.pollingEvery(Duration.ofMillis(1000));
		w.withTimeout(Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				                                        "//*[@ng-model='yourName']")));
		//Fill text box and wait until message is clickable 
		driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath(
				                                 "//h1[starts-with(text(),'Hello')]")));
		//get message text and display
		String y=driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).getText();
		System.out.println(y);
		//close site
		driver.close();
	}
}

