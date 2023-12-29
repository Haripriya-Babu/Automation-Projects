package travel;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	public class Signuppage 
	{
		ChromeDriver driver;
		@BeforeTest
		public void hotelbg()
		{
			driver=new ChromeDriver();
			driver.get("https://www.wego.co.in/");
			driver.manage().window().maximize();

		}
	@Test
	public void wego()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/button[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd@123");
	driver.findElement(By.xpath("//*[@id=\"repeatPassword\"]")).sendKeys("abcd@123");
	driver.findElement(By.xpath("//*[@id=\"layoutPortalRoot\"]/div/form/div[1]/button[3]")).click();


	}
	}

	

