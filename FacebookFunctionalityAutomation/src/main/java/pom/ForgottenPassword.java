package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPassword {
	
	@FindBy(xpath = ("//a[text()='Forgotten password?']"))
	private WebElement forgotPassword;
	
	@FindBy(xpath = ("//input[@id='identify_email']"))
	private WebElement emailaddress;
	
	@FindBy(xpath = ("//a[text()='Cancel']"))
	private WebElement cancel;
	
	@FindBy(xpath = ("//button[text()='Search']"))
	private WebElement search;
	
	public ForgottenPassword (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnForgotPassword()
	{
		forgotPassword.click();
	}
	public void sendEmailAddress(String Email)
	{
		emailaddress.sendKeys(Email);
	}
	public void clickOnCancel()
	{
		search.click();
	}
	public void clickOnSearchButton()
	{
		search.click();
	}
	
	
	
}
