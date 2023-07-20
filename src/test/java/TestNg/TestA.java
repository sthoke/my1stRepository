package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestA {
    @BeforeMethod
	public void login()
	{
		System.out.println("login to the application");
		Reporter.log("login to application");
	}
	@Test
	public void profilePage()
	{
		System.out.println("Check the profile");
		Reporter.log("Check the profile");
	}
	@AfterMethod
	public void logOut()
	{
		System.out.println("logout from the application");
		Reporter.log("logout to application");
	}
	
	

}
