package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Base;
import pom.ForgottenPassword;
import pom.module.SignUpModule;

public class TestNG_SignUpPage extends Base{
	private WebDriver driver;
//	private SignUpModule signup ;
//	private ForgottenPassword forgot;
	@Parameters("browser")
	
	@BeforeTest
	public void beforetest( String browsername)
	{
		System.out.println("before test");
		if(browsername.equals("Chrome"))
        {
			driver = openChromeBrowser();
        }
		if(browsername.equals("Firefox"))

		{
			driver = openFirefoxBrowser();
		}
		if(browsername.equals("Edge"))

		{
			driver = openEdgeBrowser();
		}
		
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
		
//		SignUpModule signup = new SignUpModule(driver);
//        ForgottenPassword forgot = new ForgottenPassword(driver);
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://www.facebook.com/");
        
		SignUpModule signup = new SignUpModule(driver);
        signup.clickOnCreateNewAcc();
		//signup.clickOnSignUpButton();
	}
	
	@Test
	public void test()
	{
		
     SignUpModule signup = new SignUpModule(driver);
		
        signup.clickOnCreateNewAcc();
		signup.sendfirstName("kiran");
		signup.sendLastName("gorte");
		signup.sendEmailOrPhone("9960668515");
		
		signup.sendnewPassword("kiran@125");
		signup.selectday();
		signup.selectMonth();
		signup.selectYear();
		signup.selectFemale();
		signup.clickOnSignUpButton();

	}
	
	
//	@Test
//	public void test1()
//	{
//		System.out.println("test1");
//
//	  //  ForgottenPassword forgot = new ForgottenPassword(driver);
//		forgot.sendEmailAddress("hjgyrdt");
//		forgot.clickOnSearchButton();
//	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
		driver.close();
	}

}
