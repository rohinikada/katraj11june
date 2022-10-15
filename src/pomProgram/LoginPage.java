package pomProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//WebElement,Constructor and public methods
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement emailID;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterEmailID()
	{
		emailID.sendKeys("ketandabhade198@gmail.com");
	}
	
	public void enterPassword()
	{
		password.sendKeys("ketan@123");
	}
	
	public void clickOnSubmitBtn()
	{
		loginBtn.click();
	}

}
