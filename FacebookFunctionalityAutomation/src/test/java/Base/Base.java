package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public  static WebDriver openChromeBrowser()
	{
	//	System.setProperty(key, path)
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	

	public  static WebDriver openFirefoxBrowser()
	{
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	

	public  static WebDriver openEdgeBrowser()
	{
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	
//	public  static WebDriver openIeBrowser()
//	{
//		WebDriver driver = new IeDriver();
//		return driver;
//	}

}
