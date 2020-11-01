package stevejobs;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;

public class Test41
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");          
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Launch site
        driver.get("http://newtours.demoaut.com");
        Thread.sleep(5000); 
        //Get chrome browser logs related to opened page
		List<LogEntry> lelist=driver.manage().logs().get("browser").getAll();
		if(lelist.size()!=0)
		{
			//display each log entry message
			for(LogEntry e:lelist)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("Page completly loaded and interpreted without any errors");            
		}
		//close site
		driver.close();

	}

}
