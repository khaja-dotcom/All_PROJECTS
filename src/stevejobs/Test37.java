package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test37
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser 
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch google site
		driver.get("https://www.google.co.in");             
		Thread.sleep(5000);
		//Browser window size
		int w1=driver.manage().window().getSize().getWidth();
		int h1=driver.manage().window().getSize().getHeight();                                         
		System.out.println(w1+" "+h1);
		Dimension d=new Dimension(200,100);
		driver.manage().window().setSize(d);
		int w2=driver.manage().window().getSize().getWidth();
		int h2=driver.manage().window().getSize().getHeight();
		System.out.println(w2+" "+h2);
		Thread.sleep(5000);
		//Browser position on desktop
		int x1=driver.manage().window().getPosition().getX();
		int y1=driver.manage().window().getPosition().getY();
		System.out.println(x1+" "+y1);
		Point p=new Point(300,100);
		driver.manage().window().setPosition(p);
		int x2=driver.manage().window().getPosition().getX();
		int y2=driver.manage().window().getPosition().getY();
		System.out.println(x2+" "+y2);
		driver.close();
		driver.findElement(By.name("uhfdgbr")).click();
	}
}





