package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test28 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser using chromedriver.exe software
		System.setProperty("webdriver.chrome.driver","E:\\batch245\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.ebay.com");
		Thread.sleep(5000);
		//Locate carousel slider
		WebElement carouselslider=driver.findElement(By.xpath("(//ul[@class='carousel__list'])[1]"));
		String tn=carouselslider.getTagName();
		int nvs=0;
		if(tn.equals("div"))
		{
			//Count of ads/slides are visible in carousel slider
			List<WebElement> listofslides=carouselslider.findElements(
					                                    By.xpath("child::div"));
			for(WebElement slide:listofslides)
			{
				if(slide.getAttribute("data-clone")!=null)
				{
					String x=slide.getAttribute("data-clone");
					if(x.equals("false"))
					{
						nvs=nvs+1;
					}
				}
			}
		}
		else   //tag name is ul
		{
			//Count of ads/slides are visible in carousel slider
			List<WebElement> listofslides=carouselslider.findElements(
					                                    By.xpath("child::li"));
			nvs=listofslides.size();
		}
		System.out.println("No: of visible ads/slides in carousel slider is "+nvs);
		//Cyclic or not
		if(carouselslider.getCssValue("transform")!=null)
		{
			String value=carouselslider.getCssValue("transform");
			if(value.length()!=0)
			{
				System.out.println("cyclic or rotating carousel slider");
				System.out.println("transform property value is "+value);
				//2d/3d
				if(value.contains("matrix3d"))
				{
					System.out.println("3D carousel slider");
				}
				else  //2-dimensional
				{
					System.out.println("2D carousel slider");
					//rotation direction left to right or right to left 
					//or top to bottom or bottom to top
					String temp1=value.replace("matrix(","");
					String temp2=temp1.replace(")","");
					String data[]=temp2.split(",");
					float x=Float.parseFloat(data[4]);
					float y=Float.parseFloat(data[5]);
					if(x<0)
					{
						System.out.println("sliders rotating from right to left");
					}
					else if(x>0)
					{
						System.out.println("sliders rotating from left to right");
					}
					else  //x=0
					{
						if(y<0)
						{
							System.out.println("sliders rotating from bottom to top");
						}
						else if(y>0)
						{
							System.out.println("sliders rotating from top to bottom");
						}
						else  //y=0
						{
							System.out.println("No rotation");
						}
					}
					//fast in, fast out....etc
					String temp3=carouselslider.getCssValue("transition");
					System.out.println("transition property value is: "+temp3);
					String parts[]=temp3.split(" ");
					if(parts[2].equals("ease-in"))
					{
						System.out.println("slide with a slow start");
					}
					else if(parts[2].equals("ease-out"))
					{
						System.out.println("slide with a slow end");
					}
					else
					{
						System.out.println("slide with a slow start and end");
					}
					//Slide moving duration
					System.out.println("Slide moving duration is: "+parts[1]);
					//Delay in between slides/ads
					System.out.println("delay between sldes is "+parts[3]);
				}
			}
		}
		else
		{
			System.out.println("Not cyclic or rotating carousel slider");
		}
		//close site
		driver.close();
	}
}
