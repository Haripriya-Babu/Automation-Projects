package travel;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Datepicker 
	{

		ChromeDriver driver;
		  
		  @BeforeTest
		  public void str() 
		  {
		    driver=new ChromeDriver();
		  }
		  @BeforeMethod
		  public void str1()
		  {
		    driver.get("https://www.wego.co.in/");
		    driver.manage().window().maximize();
		  }
		  @Test
		  public void datepicker()
		  {
		    
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div/div[1]/div[1]/div[1]")).click();
		    datepickermethod("January 2024","14");
		    
		  }
		   
			public void datepickermethod(String expmonth,String expdate)
		    {
		    while(true)
		    {
		    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		      String month=driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]")).getText();
		    
		      if(month.equals(expmonth))
		      {
		        break;
		      }
		      else
		      {
		    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div")).click();
		      }
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[3]/div/div"));
		      
	    for(WebElement datelement:alldates)
	    {
	    	String date=datelement.getText();
	    	if(date.equals(expdate))
	    	{
	    		datelement.click();
	    		break;
	    	}
	    }

		    
		    }}
		

		}



