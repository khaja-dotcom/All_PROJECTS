package stevejobs;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test15
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
		Rectangle r=e.getRect();
		int h=r.getHeight();
		int w=r.getWidth();
		int x=r.getX();
		int y=r.getY();
		System.out.println("width of element is "+w);
		System.out.println("height of element is "+h);
		System.out.println("X-coordinate of element is "+x);
		System.out.println("Y-coordinate of element is "+y);
		//Close site
		driver.close();
	}
}
