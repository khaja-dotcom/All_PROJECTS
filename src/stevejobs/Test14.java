package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");        
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Locate an element and get size of element
		WebElement e=driver.findElement(By.name("q"));
		Point p=e.getLocation(); 
		int x=p.getX();
		int y=p.getY();
		System.out.println(x+" "+y);
		//Close site
		driver.close();

	}

}
