package TestNG_Keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword_invocationCount {
	
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
	//Lower priorities scheduled first
	
	@Test (priority = 1, invocationCount = 3)
	public void test()
	{
		System.out.println("test");
	}
	@Test (priority = -3) //negative number accepted
	public void test1()
	{
		System.out.println("Accept negative number");
	}
	@Test (priority = 4)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test (priority = 2)
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after method");
	}




}



