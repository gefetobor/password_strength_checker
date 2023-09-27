package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class OpenAiScreens extends GenericMethods {
	
	
	public OpenAiScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	public By submitButton = By.xpath("//*[text()='Continue']");
	By createAccount = By.xpath("//*[@class='f-ui-1' and text()='Sign up']");
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='password']");
  
	
	public void clickOnCreateAccount() {
		System.out.println("Attempting to createAccount");
		driver.findElement(createAccount).click();
		System.out.println("createAccount clicked");
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

