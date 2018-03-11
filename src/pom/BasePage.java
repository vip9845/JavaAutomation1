package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import scripts.AutoConst;

public abstract class BasePage implements AutoConst{
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
}
