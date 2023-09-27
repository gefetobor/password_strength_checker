package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LinkedInScreens extends GenericMethods {
	
	
	public LinkedInScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By submitButton = By.xpath("//*[@id='join-form-submit']");
	By firstname = By.xpath("//*[@id='join-form-submit']");
	By email = By.xpath("//input[@id='email-address']");
	By password = By.xpath("//input[@id='password']");
    public By errorToast = By.xpath("//*[@class='artdeco-inline-feedback__message']");
   

	public void clickOnSignInButton() {
		System.out.println("Attempting to click on signInButton");
		driver.findElement(submitButton).click();
		System.out.println("signInButton clicked");
	}
	
	public void enterFirstname(String text) {
		System.out.println("Attempting to enter firstname");
		driver.findElement(firstname).sendKeys(text);
		System.out.println("firstname entered");
	}
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void clickOnSubmitButton() {
		System.out.println("Attempting to clickOnSubmitButton");
		driver.findElement(submitButton).click();
		System.out.println("submitButton clicked");
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

