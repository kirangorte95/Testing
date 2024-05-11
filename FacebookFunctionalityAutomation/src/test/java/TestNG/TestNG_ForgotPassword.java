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

public class TestNG_ForgotPassword extends Base {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void beforetest( String browsername)
	{
		System.out.println("before test");
		if(browsername.equals("Chrome"))
         {
			//driver = new ChromeDriver();
			driver = openChromeBrowser();
         }
		if(browsername.equals("Firefox"))

		{
			//driver = new FirefoxDriver();
			driver = openFirefoxBrowser();
		}
		if(browsername.equals("Edge"))

		{
			//driver = new EdgeDriver();openEdgeBrowser
			driver = openEdgeBrowser();
		}
		
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void beforeclass ()
	{
		System.out.println("before class");
		
    }
	
	@BeforeMethod 
	public void beforemethod()
	{
		System.out.println("before method");
		driver.get("https://www.facebook.com");
	    ForgottenPassword forgot = new ForgottenPassword(driver);
	    forgot.clickOnForgotPassword();
		
     }
	
	@Test
	public void test1()
	{
		System.out.println("test1");

	    ForgottenPassword forgot = new ForgottenPassword(driver);
		forgot.sendEmailAddress("hjgyrdt");
		forgot.clickOnSearchButton();
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");

	    ForgottenPassword forgot = new ForgottenPassword(driver);
		forgot.sendEmailAddress("kiran@123");
		forgot.clickOnCancel();
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");

	   
	   

	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
		 driver.close();
	}

}
