package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13
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
		Dimension d=e.getSize(); 
		int h=d.getHeight();
		int w=d.getWidth();
		System.out.println(h+" "+w);
		//Close site
		driver.close();

	}

}







