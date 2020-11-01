package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(5000);
		//Click on a link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		//fill text boxes
		driver.findElement(By.name("firstName")).sendKeys("abdul");
		driver.findElement(By.name("lastName")).sendKeys("kalam");
		driver.findElement(By.name("phone")).sendKeys("9000624876");
		driver.findElement(By.name("userName")).sendKeys("apj@abdlkalam.com");
		driver.findElement(By.name("address1")).sendKeys("Mosque street, 10th house");
		driver.findElement(By.name("address2")).sendKeys("Dhanushkoti road");
		driver.findElement(By.name("city")).sendKeys("Rameshwaram");
		driver.findElement(By.name("state")).sendKeys("Tamilnadu");
		driver.findElement(By.name("postalCode")).sendKeys("600765");
		//automate drop down
		WebElement e=driver.findElement(By.name("country"));
		Select s=new Select(e);
		s.selectByVisibleText("INDIA");
		//Fill remaining fields
		driver.findElement(By.name("email")).sendKeys("kalam11india");
		driver.findElement(By.name("password")).sendKeys("batch245");
		driver.findElement(By.name("confirmPassword")).sendKeys("batch245");
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		//Close site
		driver.close();
	}
}
