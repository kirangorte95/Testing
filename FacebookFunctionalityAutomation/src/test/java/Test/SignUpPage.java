package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.module.SignUpModule;

public class SignUpPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		SignUpModule signup = new SignUpModule(driver);
		
		signup.clickOnCreateNewAcc();
		signup.sendfirstName("kiran");
		signup.sendLastName("gorte");
		signup.sendEmailOrPhone("89756");
		
		signup.sendnewPassword("kiran@125");
		signup.selectday();
		signup.selectMonth();
		signup.selectYear();
		signup.selectFemale();
		signup.clickOnSignUpButton();
		
		signup.selectday1();
		signup.selectMonth1();
		signup.selectYear1();
		signup.selectMale();

	}

}
