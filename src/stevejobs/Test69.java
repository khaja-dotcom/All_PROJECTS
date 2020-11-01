package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test69
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("http://demo.automationtesting.in/WebTable.html");
		Thread.sleep(5000);
		//Locate drop-down(<select> tag)
		WebElement e1=driver.findElement(By.xpath("//*[@role='menubar']/following::select"));
		Select s=new Select(e1);
		s.selectByVisibleText("30");
		Thread.sleep(5000);
		//Scroll web table(element) to bottom
		WebElement e2=driver.findElement(By.xpath("(//*[@role='rowgroup'])[2]"));
		driver.executeScript("var x=arguments[0].scrollHeight; arguments[0].scrollTop=x;",e2);
		Thread.sleep(5000);
		//Scroll web table(element) to top
		driver.executeScript("arguments[0].scrollTop=0;",e2);

	}

}




