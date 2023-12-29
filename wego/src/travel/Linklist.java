package travel;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Linklist 
{

	ChromeDriver driver;
	@BeforeTest
	public void load()
	{
		driver=new ChromeDriver();
        driver.get("https://www.wego.co.in/");
	}
	@Test
	public void google()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(WebElement s:li)
		{
			String sss=s.getAttribute("href");
			System.out.println(sss);
		}
	}
}
