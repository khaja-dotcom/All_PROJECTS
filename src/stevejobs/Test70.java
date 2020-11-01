package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test70 {

	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch site
		driver.get("https://stackoverflow.com/questions/33179670/actions-class-clickwebelement-ele-function-does-not-clicks");
		Thread.sleep(5000);
		//Scroll pre(element)
		WebElement e=driver.findElement(By.xpath("(//pre)[1]"));
		driver.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
		//To right
		driver.executeScript("var x=arguments[0].scrollWidth; arguments[0].scrollLeft=x;",e);
		Thread.sleep(5000);
		//To left
		driver.executeScript("arguments[0].scrollLeft=0;",e);
	}

}
