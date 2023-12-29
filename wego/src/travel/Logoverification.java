package travel;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Logoverification
	{
		ChromeDriver driver;
		
		@BeforeTest
		public void signin()
		{
			driver=new ChromeDriver();
			driver.get("https://www.wego.co.in/");
		}
		
		@Test
		public void test1()
		{
			driver.manage().window().maximize();
			WebElement logoElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a"));
			if(logoElement.isDisplayed())
			{
				
			System.out.println("pass");
			}
			else
			{
			System.out.println("fail");
			}
			}
			
			
			
		}

