package pomClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SecondPage 
{
public WebDriver driver;

	
	public SecondPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//input[@id='ee-form-3-form-3-firstName']")
	WebElement FirstName;
	
	public void sendFirstName() throws IOException
	{
		FirstName.clear();
		FirstName.sendKeys("Suraj");
	
	}
	
	@FindBy(xpath="//input[@id='ee-form-3-form-3-email']")
	WebElement EmailId;
	
	public void sendEmailID() throws IOException
	{
		EmailId.clear();
		EmailId.sendKeys("surajbodake2209@gmail.com");
	}	
	
	@FindBy(xpath="//input[@id='ee-form-3-form-3-mobile']")
	WebElement MobileNo;
	
	public void sendMobileNo() throws IOException
	{

		MobileNo.clear();
		MobileNo.sendKeys("7028732209");
	}
	
	@FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
	WebElement dropdown;
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement dropdownData;
	
	public void dropdown()
	{
		dropdown.click();
		dropdownData.sendKeys("BE");
		dropdownData.sendKeys(Keys.ENTER);	
	}

	@FindBy(xpath="//textarea[@id='ee-form-3-form-3-comments']")
	WebElement Comment;
	
	public void sendComment() throws IOException
	{
		Comment.clear();
		Comment.sendKeys("NA");
	}

	@FindBy(xpath="//input[@id='ee-form-3-form-3-iAgree']")
	WebElement CheckBox;
	
	public void clickCheckBox() throws IOException
	{
		CheckBox.click();
	}
	
	@FindBy(xpath="	//button[@id='ee-form-3-form-3-submit']")
	WebElement SubmitButton;
	
	public void clickSubmitButton() throws IOException
	{
		SubmitButton.click();
	}

	@FindBy(xpath="//button[@class='btn btn-feedback-control btn-feedback-custom']")
	WebElement FillTheApplication;
	
	public void clickToFillTheApplication() throws IOException
	{
		FillTheApplication.click();
	}
}
