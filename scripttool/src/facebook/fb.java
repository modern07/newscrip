package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fb {
	WebDriver driver;
	
@BeforeTest
public void test1()
{
	driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	
	
}
@Test
public void test2()
{
	driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys("pricce");
}
@AfterTest
public void test3()
{
	driver.quit();
}

}
