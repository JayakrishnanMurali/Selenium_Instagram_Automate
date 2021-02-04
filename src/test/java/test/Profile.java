package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Profile extends Login{
	
	@Test
	public void test_Profile() {
		
		try {
			WebElement notification_popup = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button[2]"));
			WebElement profile_ico = driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[5]/span/img"));
			
		
			Thread.sleep(5000);
			notification_popup.click();
			Thread.sleep(200);
		
			profile_ico.click();
			Thread.sleep(200);
			
			
			
			
			
			WebElement profile_page = driver.findElement(By.linkText("Profile"));
			

			profile_page.click();
			Thread.sleep(2000);
			
			
			
			
			
			WebElement profile_name = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/header/section/div[1]/h2"));
			
					
			String account_name = profile_name.getText();
			String og_account_name = ""; //Give Credentials
			Assert.assertEquals(account_name, og_account_name);
			
			System.out.println("Profile Verified");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
