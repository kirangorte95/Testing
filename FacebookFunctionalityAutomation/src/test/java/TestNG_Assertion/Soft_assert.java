package TestNG_Assertion;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	
	// Assertion ====> used verify the test methods  (verification)
	
		//Soft_assert----> verify---->Non-Static methods
	
		// if a test method contains multiple assertions / verifications and if  one of the assertion is get failed then rest of the 
		// assertions will  be executed.
	 SoftAssert soft;
	
	@BeforeClass
	public void beforeclass ()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforemethod ()
	{
		System.out.println("before method");

		soft = new SoftAssert();
    }
	
	@Test
	public void test ()
	{
		String actualurl = "kirann";
		String expectedurl = "kiran";
		
		soft.assertEquals(actualurl, expectedurl);
		soft.assertNotEquals(actualurl, expectedurl);
		
		
		boolean result = actualurl.equalsIgnoreCase(expectedurl);
		soft.assertTrue(result);
		
		soft.assertFalse(result);
		
		soft.assertAll();  // used for apply --> 
		
		
		
	}
	@Test
	public void test1 ()
	{
		String actualurl = "kirann";
		String expectedurl = "kiran";
		
		soft.assertEquals(actualurl, expectedurl);
		soft.assertNotEquals(actualurl, expectedurl);
		
		
		boolean result = actualurl.equalsIgnoreCase(expectedurl);
		soft.assertTrue(result);
		
		soft.assertFalse(result);
		
		soft.assertAll();  // used for store the result in particualr same test method soft object reference --> compulsory
		
		
		
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void afterclass ()
	{
		System.out.println("after class");
	}

}
