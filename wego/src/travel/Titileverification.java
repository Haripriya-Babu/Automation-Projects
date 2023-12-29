package travel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Titileverification 
	{

		ChromeDriver driver;
		@BeforeTest
	public void load ()
	{
			driver=new ChromeDriver();
			driver.get("https://www.wego.co.in/");
			
	}
		@Test
		public void newtest()
		{
			String actualtitle=driver.getTitle();
		    String title="wega";
		    
		    
		    if (actualtitle.equals (title) )
		    {
		    	System.out.println("pass");
		    }
		    else
		    	System.out.println("Fail");
		}
		@AfterTest
		public void last()
		{
			driver.quit();
		}
	}


