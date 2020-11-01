package stevejobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test72
{
	public static void main(String[] args)
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.gmail.com");
		FluentWait w=new FluentWait(driver);
		w.pollingEvery(Duration.ofMillis(1000));
		w.withTimeout(Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		//Locate target element using Relative locators or Friendly locators
		WebElement e=driver.findElement(By.linkText("Learn more"));
		driver.findElement(RelativeLocator.withTagName("button").above(e)).click();
	}
}





