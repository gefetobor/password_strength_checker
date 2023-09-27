package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class BaiduScreens extends GenericMethods {
	
	
	public BaiduScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}
	/*  //input[@id='Email'][@name='Email']

	or

	//*[@id='Email'][@name='Email']   */
	
	By signUpButton = By.xpath("/html/body/div[6]/div[2]/div[2]/div/div/div/div/div/div[2]/a");
	By loginButton = By.xpath("/html/body/div[1]/div[1]/div[4]/a");
	By usernameField = By.xpath("/html/body/div[1]/div[3]/div[3]/div[2]/form/p[2]/input[2]");
	By phoneNumberField = By.xpath("/html/body/div[1]/div[3]/div[3]/div[2]/form/p[3]/input[2]");
	By passwordField = By.xpath("/html/body/div[1]/div[3]/div[3]/div[2]/form/p[4]/input[2]");
	public By form = By.xpath("/html/body/div[2]/div[3]/div[3]/div[2]/form/p[5]/input");
	public By successElement = By.xpath("//*[@id='TANGRAM__PSP_4__passwordSucc']");
	public By errorToast2 = By.xpath("/html/body/div[1]/div[3]/div[3]/div[2]/form/p[4]/span[2]/span/span[2]");
	public By errorToast = By.xpath("//*[text()='密码设置不符合要求']");
	
	
	public void clickOnSignUpButton() {
		System.out.println("Attempting to click on signUpButton");
		driver.findElement(signUpButton).click();
		System.out.println("signUpButton clicked");
	}
	public void clickOnSuccessElement() {
		System.out.println("Attempting to click on successElement");
		driver.findElement(successElement).click();
		System.out.println("successElement clicked");
	}
	public boolean isSuccessElementPresent() {
		System.out.println("Attempting to click on successElement");
		driver.findElement(successElement).isDisplayed();
		System.out.println("successElement clicked");
		return true;
	}
	public String getSuccessElementAttribute() {
		String attr = null;
		System.out.println("Attempting to getSuccessElementAttribute");
		attr = driver.findElement(successElement).getAttribute("class");
		System.out.println("getSuccessElementAttribute retrieved");
		
		return attr;
	}
	
	
	public void clickOnLogInButton() {
		System.out.println("Attempting to click on loginButton");
		driver.findElement(loginButton).click();
		System.out.println("loginButton clicked");
	}
	
	public void clickOut() {
		System.out.println("Attempting to click on form");
		driver.findElement(form).click();
		System.out.println("form clicked");
	}	
	public void clickOnUsernameField() {
		System.out.println("Attempting to click on usernameField");
		driver.findElement(usernameField).click();
		System.out.println("usernameField clicked");
	}
	public void enterForm(String text) {
		System.out.println("Attempting to enter form");
		driver.findElement(form).sendKeys(text);
		System.out.println("form entered");
	}
	
	public void enterUsernameField(String text) {
		System.out.println("Attempting to enter usernameField");
		driver.findElement(usernameField).sendKeys(text);
		System.out.println("usernameField entered");
	}
	public void enterPhoneNumber(String text) {
		System.out.println("Attempting to enter phoneNumberField");
		driver.findElement(phoneNumberField).sendKeys(text);
		System.out.println("phoneNumberField entered");
	}

	public void enterPassword(String text) {
		System.out.println("Attempting to enter Password");
		driver.findElement(passwordField).sendKeys(text);
		System.out.println("Password entered");
	}
	public void clearPasswordField() {
		System.out.println("Attempting to clear Password");
		driver.findElement(passwordField).clear();
		System.out.println("Password cleared");
	}

	public String getAppId() {
		System.out.println("Attempting to retrieve APP ID");
		String APPID = driver.findElement(passwordField).getText();
		System.out.println("App ID retrieved");
		return APPID;
	}


	}

