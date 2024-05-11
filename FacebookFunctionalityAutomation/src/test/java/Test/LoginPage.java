package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginOrSignUpPage;

public class LoginPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		LoginOrSignUpPage login=new LoginOrSignUpPage(driver);
		
		login.senduserName("kiran");
		login.sendUserPassword("kiran@123");
		login.clickOnLoginButton();

	}

}
