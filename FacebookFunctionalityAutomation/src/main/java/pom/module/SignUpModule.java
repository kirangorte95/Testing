package pom.module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpModule {
	
	@FindBy(xpath=("//a[text()='Create new account']"))
	private WebElement createNewAcc;
	
	@FindBy(xpath=("//input[@name='firstname']"))
	private WebElement firstName;
	
	@FindBy(xpath=("//input[@name='lastname']"))
	private WebElement lastName;
	
	@FindBy(xpath=("//input[@name='reg_email__']"))
	private WebElement emailOrPhone;
	
	@FindBy(xpath=("//input[@name='reg_passwd__']"))
	private WebElement newPassword;
	
	@FindBy(xpath=("//select[@name='birthday_day']"))
	private WebElement day;
	
	@FindBy(xpath=("//select[@name='birthday_month']"))
	private WebElement month;

	@FindBy(xpath=("//select[@name='birthday_year']"))
	private WebElement year;
	
	@FindBy(xpath = ("(//input[@type='radio'])[1]"))
	private WebElement female;
	
	@FindBy(xpath = ("(//input[@type='radio'])[2]"))
	private WebElement male;
	
	@FindBy(xpath = ("(//input[@type='radio'])[3]"))
	private WebElement custom;
	
	@FindBy(xpath = ("(//button[text()='Sign Up'])[1]"))
	private WebElement signUp;
	
	
	public SignUpModule (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnCreateNewAcc()
	{
		createNewAcc.click();
	}
	public void sendfirstName(String name)
	{
		firstName.sendKeys(name);
	}
	public void sendLastName(String lastname)
	{
		lastName.sendKeys(lastname);
	}
	public void sendEmailOrPhone(String number)
	{
		emailOrPhone.sendKeys(number);
	}
	public void sendnewPassword(String pwd)
	{
		newPassword.sendKeys(pwd);
	}
    public void selectday ()
	{
		Select s = new Select(day);
		s.selectByVisibleText("24");
		
	}
    public void selectday1 ()
	{
		Select s = new Select(day);
		s.selectByVisibleText("8");
		
	}
	public void selectMonth ()
	{
		Select s = new Select(month);
		s.selectByVisibleText("Aug");
	}
	public void selectMonth1 ()
	{
		Select s = new Select(month);
		s.selectByVisibleText("Jun");
	}
	public void selectYear ()
	{
		Select s = new Select(year);
		s.selectByVisibleText("2000");
	}
	public void selectYear1 ()
	{
		Select s = new Select(year);
		s.selectByVisibleText("1995");
	}
	public void selectFemale ()
	{
		female.click();
	}
	public void clickOnSignUpButton ()
	{
		signUp.click();
	}
	public void selectMale ()
	{
		male.click();
	}

//	public void selectCustom ()
//	{
//		
//	}
	
	}
	
	


	
	
	
	





