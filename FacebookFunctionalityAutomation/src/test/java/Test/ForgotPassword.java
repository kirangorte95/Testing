package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ForgottenPassword;

public class ForgotPassword {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
    ForgottenPassword forgot = new ForgottenPassword(driver);
		
		forgot.clickOnForgotPassword();
		forgot.sendEmailAddress("shashi");
		forgot.clickOnSearchButton();
		forgot.clickOnCancel();

	}

}
