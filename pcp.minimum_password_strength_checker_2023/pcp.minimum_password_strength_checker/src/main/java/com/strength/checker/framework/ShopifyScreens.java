package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShopifyScreens extends GenericMethods {
	
	
	public ShopifyScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By registerButton = By.xpath("(//*[@class='e4adce92df' and text()='Register'])[1]");
	By email = By.xpath("//input[@id='account_email']");
	By continueWithEmailButton = By.xpath("//*[text()='Continue with email']");
	By password = By.xpath("//input[@id='new_password']");
	By confirmPassword = By.xpath("//input[@id='confirmed_password']");
	By createAccountButton = By.xpath("//*[@class='yfCvx60qsR50VNBG15jF' and text()='Create account']");
    public By errorToast = By.xpath("//*[@id='new_password-note']");
	public By acceptCookie = By.xpath("//*[text()='Accept all']");
	
	public void acceptCookie() {
		System.out.println("Attempting to acceptCookie");
		driver.findElement(acceptCookie).click();
		System.out.println("Cookie accepted");
	}
	public void clickOnRegisterButton() {
		System.out.println("Attempting to click on registerButton");
		driver.findElement(registerButton).click();
		System.out.println("registerButton clicked");
	}
	
	public void clickOnContinueWithEmailButton() {
		System.out.println("Attempting to clickOnContinueWithEmailButton");
		driver.findElement(continueWithEmailButton).click();
		System.out.println("continueWithEmailButton clicked");
	}
	public void clickOnCreateAccount() {
		System.out.println("Attempting to clickOnCreateAccount");
		driver.findElement(createAccountButton).click();
		System.out.println("clickOnCreateAccount clicked");
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

