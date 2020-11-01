package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Test90 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser(SWD)
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site(SWD)
		driver.get("https://www.youtube.com");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
		//Search for a video link(SWD)
		driver.findElement(By.name("search_query")).sendKeys("abdul kalam sir speech");
		driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]/child::*[1]")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Abdul Kalam in European Parliament')]")));
		driver.findElement(By.xpath("//*[contains(text(),'Abdul Kalam in European Parliament')]")).click();
		Thread.sleep(5000);//wait 5 seconds for video to start
		//Video automation(SikuliX)
		Screen s=new Screen(); 
		//Click on skipadd if exists(SikuliX)
		if(s.exists("skipadd.png",5) != null)
		{
			s.click("skipadd.png");
		}
		//move mouse pointer to video body to get icons visibility
		Location l=new Location(200,300);
		s.wheel(l,Button.LEFT,0); //just move mouse pointer, here no click
		s.click("pause.png");
		Thread.sleep(5000);
		s.wheel(l,Button.LEFT,0); //just move mouse pointer, here no click
		s.click("play.png");
		Thread.sleep(5000);
		s.wheel(l,Button.LEFT,0); //just move mouse pointer, here no click
		s.mouseMove("volume.png");
		//Decrease volume
		Match m=s.find("bubble.png"); //png image saved in project folder
		int x=m.getX();
		int y=m.getY();
		Location l1=new Location(x-20,y);
		s.dragDrop(m,l1);
		Thread.sleep(5000);
		//Increase volume
		s.wheel(l,Button.LEFT,0);  //0 means no click
		s.mouseMove("volume.png"); //png image saved in project folder
		Location l2=new Location(x+20,y);
		s.dragDrop(m,l2);
		
	}
}















