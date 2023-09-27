package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Auth0Screens extends GenericMethods {
	
	
	public Auth0Screens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	
	By email = By.xpath("//input[@name='email']");
	public By password = By.xpath("//input[@id='password']");
	public By confirmPassword = By.xpath("//input[@id='Password2']");
	By continueButton = By.xpath("//*[@id='database']");
	public By submitButton = By.xpath("//*[@class='c6d5cc3be']");
    public By errorToast = By.xpath("//*[text()='Your password must contain:']");
	public By acceptCookie = By.xpath("//*[@id='onetrust-accept-btn-handler']");
	
	public void acceptCookie() {
		System.out.println("Attempting to acceptCookie");
		driver.findElement(acceptCookie).click();
		System.out.println("Cookie accepted");
	}
	public void clickOnContinueButton() {
		System.out.println("Attempting to click on continueButton");
		driver.findElement(continueButton).click();
		System.out.println("continueButton clicked");
	}
	
	public void clickOnSubmitButton() {
		System.out.println("Attempting to click on submitButton");
		driver.findElement(submitButton).click();
		System.out.println("submitButton clicked");
	}
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void clickOnEmailField() {
		System.out.println("Attempting to clickOnEmailField");
		driver.findElement(email).click();
		System.out.println("Email clicked");
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
	public void enterConfirmPassword(String text) {
		System.out.println("Attempting to enter confirmPassword");
		driver.findElement(confirmPassword).sendKeys(text);
		System.out.println("confirmPassword entered");
	}
	public void clearConfirmPasswordd() {
		System.out.println("Attempting to clear confirmPassword");
		driver.findElement(confirmPassword).clear();
		System.out.println("confirmPassword field cleared");
	}


	}

