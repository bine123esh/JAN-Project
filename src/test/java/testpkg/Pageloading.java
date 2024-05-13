package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

public class Pageloading {
	WebDriver driver;
	@Test
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	
	

}
