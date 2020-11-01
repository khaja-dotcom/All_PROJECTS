package stevejobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test71
{
	public static void main(String[] args)
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		//Define Explicit/Conditional wait for calendar
		FluentWait w=new FluentWait(driver);
		w.pollingEvery(Duration.ofMillis(1000));
		w.withTimeout(Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				                                "//*[@class='calendarContainer']/div")));
		//Click on a day
		driver.executeScript("window.scrollTo(0,100);");
		driver.findElement(By.linkText("17")).click();
		//Define Explicit/Conditional wait for completion of loading
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		driver.close();
	}
}








