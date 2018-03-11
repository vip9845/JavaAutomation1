package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}
