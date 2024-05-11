package TestNG_Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOut {
	
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
	
	//used to set maximum execution time for any test method
	//if a test method is time consuming for execution, then we can use timeout
	// to set the maximum execution time.
	
	@Test (priority = 1, timeOut = (5000))
	public void test() throws InterruptedException
	{
		System.out.println("test");
		Thread.sleep(3000);
		System.out.println("hello");
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
