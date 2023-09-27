package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class MicrosoftLiveScreens extends GenericMethods {
	
	
	public MicrosoftLiveScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	//By signInButton = By.xpath("//*[text()='Sign in']");
	By createAccount = By.xpath("//*[text()='Create free account']");
	//*[@id='Email' and @name='Email']
	//By firstname = By.xpath("//input[@id='usernamereg-firstName']");
	By email = By.xpath("//input[@id='MemberName']");
	By password = By.xpath("//input[@id='PasswordInput']");
    public By errorToast = By.xpath("//*[@class='alert alert-error']");
    //public By successScreen = By.xpath("//input[@class='input-with-icon icon-password used verified']");
	//By confirmPassword = By.xpath("//input[@id='wpRetype']");
	By submitButton = By.xpath("//input[@id='iSignupAction']");
	//By acceptCookie = By.xpath("/html/body/div/div/div/div/form/div[2]/div[2]/button[1]");
	
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
		System.out.println("clickOnSubmitButton clicked");
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


	}

