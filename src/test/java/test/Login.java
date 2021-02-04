package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import util.BaseTest;

public class Login extends BaseTest{
	
	
	@Test
	public void testBot_Login() {
		
		try {
			String email="";
			String pass=""; 	//Give credentials
			
			WebElement email_txt_box = driver.findElement(By.name("username"));
			WebElement pass_txt_box = driver.findElement(By.name("password"));
			WebElement login_btn =  driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button"));
			
			
			 
			email_txt_box.clear();
			email_txt_box.sendKeys(email);
			
			pass_txt_box.clear();
			pass_txt_box.sendKeys(pass);
			
			login_btn.click();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
}
