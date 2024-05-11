package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	// Variable- private=>>>> WebElement
	
	@FindBy(xpath = ("//input[@id='email']"))
	private WebElement username;
	
	@FindBy(xpath = ("//input[@id='pass']"))
	private WebElement password;
	
	@FindBy(xpath = ("//button[text()='Log in']"))
	private WebElement loginbutton;
	
	@FindBy(xpath = ("//a[@id='u_0_0_xW']"))
	private WebElement CreateNewAcc;
	
	//Constructor- public=>>>>>>>>>WebElement Initialization
	public LoginOrSignUpPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method - Public =>>>>>>>>>>Action on WebElement
	public void senduserName(String userId)
	{
		username.sendKeys(userId);
	}
	public void sendUserPassword(String userPassword)
	{
		password.sendKeys(userPassword);
	}
	
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}
	
	

}
