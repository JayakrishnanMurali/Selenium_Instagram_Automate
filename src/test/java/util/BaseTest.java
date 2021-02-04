package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Java Eclipse\\JAVA JARS\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/accounts/login/");
		
	}
	
	
	@AfterTest
	public void teardown() throws InterruptedException {
		System.out.println("Closing the session...");
		Thread.sleep(3000);
		driver.quit(); 
	}
	
	@Test
	public void testone() {
		System.out.println("Hurrayyyy!!!");
	}
	
}
