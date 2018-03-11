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
	
	@FindBy(linkText="About actiTime")
	private WebElement aboutActiTime;
	
	@FindBy(xpath="html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[1]/nobr")
	private WebElement productVersion;
	
	@FindBy(xpath="//span[@class='productversion']")
	private WebElement closeButton;
	
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
