package scripts;

import org.testng.annotations.Test;

import generics.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest{

	@Test
	public void testValidLoginLogOut() throws InterruptedException
	{
		String un=Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1, 0);
		String pw=Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1, 1);
		String hp=Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1, 2);
		String lp=Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1, 3);
		
		System.out.println("Excel path      is : "+XL_PATH);
		System.out.println("UserName        is : "+un);
		System.out.println("Password        is : "+pw);
		System.out.println("homepage title  is : "+hp);
		System.out.println("loginpage title is : "+lp);
		
		//Enter valid UerName
		LoginPage l=new LoginPage(driver);
		l.SetUserName(un);
		
		//Enter valid UerName
		l.SetPassword(pw);
		
		//Click Login
		l.ClickLogin();
		
		//Verify Home Page
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyTitle(lp);
		
		Thread.sleep(5000);
		//Click on the Logout
		e.ClickLogOutLink();
		
		//Verify login Page
		l.verifyTitle(hp);
		Thread.sleep(5000);
	}
}
