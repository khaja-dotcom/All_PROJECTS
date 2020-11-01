package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		System.setProperty("webdriver.chrome.driver",
                                         "E:\\batch245\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        //Launch site 
        driver.get("http://www.gmail.com");
        Thread.sleep(5000);
        //do login using valid data
        driver.findElement(By.name("identifier")).sendKeys("khaja5224.kdp");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("07386364491");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(10000);
        //get unread e-mails count given by site
        String temp=driver.findElement(By.xpath(
        		"//*[text()='Inbox']/parent::*/following-sibling::div")).getText();
        temp=temp.replace(",",""); //replace "," with blank value to remove ","
        int aunrmc=Integer.parseInt(temp);
        System.out.println("Actual unread emails count is "+aunrmc);
        //Pagination to count expected unread mails
        int eunrmc=0;
        while(2>1) //infinite loop for pagination
        {
        	//Locate mailbox table body
        	WebElement mailbox=driver.findElement(By.xpath("(//table)[last()]/tbody"));
        	//Collect all mails/rows in mail box table body
        	List<WebElement> mails=mailbox.findElements(By.xpath("child::tr"));
        	//Check each mail for read or unread
        	for(WebElement m:mails)
        	{
        		WebElement target=m.findElement(By.xpath("child::td[5]/div[1]"));
            	String value=(String)driver.executeScript("return arguments[0].textContent;",target);
            	if(value.startsWith("unread"))
            	{
            		eunrmc=eunrmc+1;
            	}
        	} 
        	//Goto next page for older mails
        	try
        	{
        		WebElement older=driver.findElement(By.xpath("//*[@data-tooltip='Older']"));
        		if(older.getAttribute("aria-disabled").equals("true"))
        		{
        			break; //came to last page, so terminate from loop
        		}
        	}
        	catch(Exception ex)
        	{
        		//go next
        		driver.findElement(By.xpath("//*[@data-tooltip='Older']")).click();
        		Thread.sleep(3000);
        	}
        } 
        System.out.println("Expected unread emails count is "+eunrmc);
        //validation
        if(eunrmc==aunrmc)
        {
        	System.out.println("Unread emails count test passed");
        }
        else
        {
        	System.out.println("Unread emails count test failed");
        }
        //Do logout
        driver.findElement(By.xpath("//*[@class='gb_Ea gbii']")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Sign out")).click();
        Thread.sleep(5000);
        //Close site
        driver.close();
	}
}


















