package TestNG_Assertion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Hard_assert {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	// Assertion ====> used verify the test methods  (verification)
	
	//Hard_assert----> Assert---->Static
	// if a test method contains multiple assertions / verifications and if  one of the assertion is get failed then rest of the 
	// assertions will not be executed.
	
	
	@Test (priority = 1)
	public void test() 
	{
		String actualURL= "https://www.facebook.com/";
		String expectedURL= "https://www.facebook.com/";
		
		//compare the inputs
		//take decision--> PASSED & FAILEDlogic is inside the method
		//Apply the result on test method
		
		
		
		
		
		
		
		
	}
	@Test (priority = 2)
	public void test1()
	{
		System.out.println("test1");
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

	

}
