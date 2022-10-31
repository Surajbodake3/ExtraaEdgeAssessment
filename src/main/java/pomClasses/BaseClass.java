package pomClasses;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	@BeforeMethod
	public void method1()
	{
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
	
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		
		System.out.println("Browser is Opened");
		
		driver.get("https://eequeuestorage.blob.core.windows.net/staticfiles/appform-demo/ee-form-widget/form-3/index.html?university=18");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		String expectedURL= "https://eequeuestorage.blob.core.windows.net/staticfiles/appform-demo/ee-form-widget/form-3/index.html?university=18";
		
		String actualURL = driver.getCurrentUrl();
		
		
		String expectedTitle = "ExtraaEdge | (Demo) Form Widget";
		
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		
		FirstPage fp = new FirstPage(driver);
		
		fp.clickApplyNow();
		
	}
}
