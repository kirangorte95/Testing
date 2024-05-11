package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.LoginOrSignUpPage;

public class Login_TestNG {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
		driver.get("https://www.facebook.com");
		LoginOrSignUpPage login=new LoginOrSignUpPage(driver);
        
	}
	
	@Test
	public void test()
	{
		System.out.println("test");
		LoginOrSignUpPage login=new LoginOrSignUpPage(driver);
		login.senduserName("kiran");
		login.sendUserPassword("kiran@123");
		login.clickOnLoginButton();
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
		LoginOrSignUpPage login=new LoginOrSignUpPage(driver);
		login.senduserName("dkdhishskhjjsk");
		login.sendUserPassword("ddkkj@123");
		login.clickOnLoginButton();
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");

	}
	@AfterClass
	public void afterclass()
	{
		LoginOrSignUpPage login=new LoginOrSignUpPage(driver);
        driver.close();
	}

}
