package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement unTextBox;
	
	@FindBy(name="pwd")
	private WebElement pwTextBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath=".//span[contains(.,'invalid')]")
	private WebElement errMsg;
	
	public void SetUserName(String un)
	{
		unTextBox.sendKeys(un);
	}
	public void SetPassword(String pw)
	{
		pwTextBox.sendKeys(pw);
	}
	public void ClickLogin()
	{
		loginButton.click();
	}
	public void VerifyErrMsgDisplayed()
	{
		Assert.assertTrue(errMsg.isDisplayed());
	}
}
