package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory - OR:
		@FindBy(name="uid")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(name="btnLogin")
		WebElement loginBtn;
		
		/*
		 * @FindBy(xpath = "//img[contains(@src,'/logo.png')]") WebElement Logo;
		 */
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:

		/*
		 * public String validateLoginPageTitle() { return driver.getTitle(); }
		 * 
		 * public boolean validateCRMImage() { return Logo.isDisplayed(); }
		 */
		public HomePage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			/*
			 * JavascriptExecutor js = (JavascriptExecutor)driver;
			 * js.executeScript("arguments[0].click();", loginBtn);
			 */
			return new HomePage();
		}
	
}
