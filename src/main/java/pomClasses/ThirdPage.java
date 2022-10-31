package pomClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage 
{
	
public WebDriver driver;

	public ThirdPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="//button[@id='btncontinue']")
	WebElement clickToProceed;
	
	public void clickToProceed() throws IOException
	{
		clickToProceed.click();
	}
	
	@FindBy(xpath="(//div[@class=' css-1hwfws3'])[2]")
	WebElement stream;
	public void streamclick() throws InterruptedException
	{
		stream.clear();
//		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class=' css-1hwfws3'])[2]"));
//        System.out.println(allOptions.size());
//               
//        for(int i = 0; i<allOptions.size(); i++) 
//        {     
//            if(allOptions.get(i).getText().contains("Btech (Mechanical Engineering)")) 
//            {
//                 allOptions.get(i).click();
//            }
//        }
		Thread.sleep(2000);
		stream.click();
		Thread.sleep(2000);
		stream.sendKeys("Btech (Mechanical Engineering)");
		Thread.sleep(2000);
		stream.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
	
	}
	
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[6]")
			WebElement course;
	
			public void course()
			{
				course.clear();
				course.click();
				course.sendKeys("0112012");
				course.sendKeys(Keys.ENTER);	
			}
	
			@FindBy (xpath = "(//div[@class=' css-yk16xz-control'])[4]")
			WebElement campuspreference;
			
			public void campuspreference()
			{
				campuspreference.clear();
				campuspreference.click();
				campuspreference.sendKeys("Field1F");
				campuspreference.sendKeys(Keys.ENTER);
			}
			@FindBy(xpath="//input[@id='preferredDate']")
			WebElement preferrenceDate;
			
			public void preferrenceDate()
			{
				preferrenceDate.sendKeys("22/09/2022");	
			}
			
			@FindBy(xpath="//input[@id='dateOfBirth']")
			WebElement dateOfBirth;
			
			public void dateOfBirth()
			{
				dateOfBirth.sendKeys("09/22/1995");	
			}
			
			
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[8]")
			WebElement bloodGroup;
			
			public void bloodGroup()
			{
				bloodGroup.click();
				bloodGroup.sendKeys("AB+ve");
				bloodGroup.sendKeys(Keys.ENTER);	
			}
			
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[9]")
			WebElement gender;
			
			public void gender()
			{
				gender.click();
				gender.sendKeys("Male");
				gender.sendKeys(Keys.ENTER);	
			}
			
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[10]")
			WebElement category;
			
			public void category()
			{
				category.click();
				category.sendKeys("OBC");
				category.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[11]")
			WebElement religion;
			
			public void religion()
			{
				religion.click();
				religion.sendKeys("Hindu");
				religion.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[12]")
			WebElement nationality;
			
			public void nationality()
			{
				nationality.click();
				nationality.sendKeys("Indian");
				nationality.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="//input[@id='alternateMobileNumber']")
			WebElement alternateMobileNo;
			
			public void alternateMobileNo()
			{
				alternateMobileNo.sendKeys("7387427825");	
			}
			
			@FindBy(xpath="//input[@id='alternateEmailAddress']")
			WebElement alternateEmailAddress;
			
			public void alternateEmailAddress()
			{
				alternateEmailAddress.sendKeys("surajbodake3@gmail.com");	
			}
			
			@FindBy(xpath="//input[@id='passportNumber']")
			WebElement passportNumber;
			
			public void passportNumber()
			{
				passportNumber.sendKeys("132453465768");	
			}
			
			@FindBy(xpath="//input[@id='passportDateofIssue']")
			WebElement passportDateofIssue;
			
			public void passportDateofIssue()
			{
				passportDateofIssue.sendKeys("06/04/2022");	
			}
			
			@FindBy(xpath="//input[@id='passportExpiryDate']")
			WebElement passportExpiryDate;
			
			public void passportExpiryDate()
			{
				passportExpiryDate.sendKeys("05/31/2030");	
			}
			
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[13]")
			WebElement domicile;
			
			public void domicile()
			{
				domicile.click();
				domicile.sendKeys("Indian");
				domicile.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[14]")
			WebElement citizenship;
			
			public void citizenship()
			{
				citizenship.click();
				citizenship.sendKeys("Maharashtrian");
				citizenship.sendKeys(Keys.ENTER);	
			}
			@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[15]")
			WebElement caste;
			
			public void caste()
			{
				caste.click();
				caste.sendKeys("Hindu");
				caste.sendKeys(Keys.ENTER);	
			}
}
