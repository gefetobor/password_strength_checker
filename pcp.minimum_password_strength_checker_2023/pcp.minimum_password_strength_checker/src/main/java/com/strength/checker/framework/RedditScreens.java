package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class RedditScreens extends GenericMethods {
	
	
	public RedditScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	public By submitButton = By.xpath("//*[text()='Continue']");
	By createAccount = By.xpath("//*[@class='flex items-center gap-xs' and text()='Log In']");
	By email = By.xpath("//*[@class='AnimatedForm__textInput  m-modalUpdate ' and @id='regEmail']");
	By password = By.xpath("//*[@id='regPassword']");
	public By errorToast = By.xpath("//*[@class='AnimatedForm__errorMessage' and text()='Password must be at least 8 characters long']");
	By username = By.xpath("//*[@id='regUsername']");
	//public By frame = By.xpath("//*[@class='App m-desktop  m-shreddit   m-modalUpdate ']");
  
	
	public void clickOnCreateAccount() {
		System.out.println("Attempting to createAccount");
		driver.findElement(createAccount).click();
		System.out.println("createAccount clicked");
	}
	public void clickOnUsername() {
		System.out.println("Attempting to clickOnUsername");
		driver.findElement(username).click();
		System.out.println("Username clicked");
	}

	
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void clickOnSubmitButton() {
		System.out.println("Attempting to clickOnSubmitButton");
		driver.findElement(submitButton).click();
		System.out.println("Submit button clicked");
	}
	public void enterPassword(String text) {
		System.out.println("Attempting to enter password");
		driver.findElement(password).sendKeys(text);
		System.out.println("password entered");
	}
	public void clearPasswordField() {
		System.out.println("Attempting to clear password field");
		driver.findElement(password).clear();
		System.out.println("password field cleared");
	}


	}

