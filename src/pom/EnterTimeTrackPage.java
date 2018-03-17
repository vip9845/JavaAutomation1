package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EnterTimeTrackPage extends BasePage {
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="logoutLink")
	private WebElement logoutLink;

	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(xpath=".//a[.='About actiTIME']")
	private WebElement aboutActiTime;
	
	@FindBy(xpath=".//*[@id='aboutPopup']/div/table[1]/tbody/tr/td/img")
	private WebElement closeButton;
	
	@FindBy(xpath="//span[@class='productVersion']")
	private WebElement productVersion;
	
	public void ClickLogOutLink()
	{
		logoutLink.click();
	}

	public void ClickHelp()
	{
		help.click();
	}
	public void ClickAboutActiTime()
	{
		aboutActiTime.click();
	}
	public void VerifyProductVersion(String eVersion)
	{
		String aVersion=productVersion.getText();
		Assert.assertEquals(aVersion, eVersion);
	}
	public void ClickCloseButton()
	{
		closeButton.click();
	}
	
}
