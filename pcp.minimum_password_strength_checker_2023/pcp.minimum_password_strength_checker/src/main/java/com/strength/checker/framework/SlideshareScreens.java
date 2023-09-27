package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SlideshareScreens extends GenericMethods {
	
	
	public SlideshareScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}
	
	
	By signUpButton = By.xpath("//*[@id='signup-from-header']");
	By emailSignUp = By.xpath("//*[@class='wrapper__text_button' and text()='Sign up with email']");
	By name = By.xpath("//input[@id='word_user[name]']");
	By email = By.xpath("//input[@id='email_address[email]']");
	By password = By.xpath("//input[@id='word_user[password]']");
	By saveButton = By.xpath("//*[@class='wrapper__filled-button submit_btn AccountCreation-common-module_filled_button__DnnaT']");
    public By errorToast = By.xpath("//*[@class='wrapper__input_error error_msg']//*[text()='Please enter a password that is at least 10 characters']");
    public By acceptCookies = By.xpath("//*[@class=' osano-cm-accept-all osano-cm-buttons__button osano-cm-button osano-cm-button--type_accept ' and text()='Accept All']");
    By finishButton = By.xpath("//*[@class='rounded-button headline-bold dark-button dialog-base-button authentication-create-account-password authentication-reg-wall-create-account-password finish-button dialog-base-secondary-action']");
	
    
    public void clickOnSignUp() {
		System.out.println("Attempting to clickOnSignUp");
		driver.findElement(signUpButton).click();
		System.out.println("signUpButton clicked");
	}	
    public void clickOnFinish() {
		System.out.println("Attempting to clickOnFinish");
		driver.findElement(finishButton).click();
		System.out.println("finishButton clicked");
	}
    public void clickOnEmailSignUp() {
		System.out.println("Attempting to clickOnEmailSignUp");
		driver.findElement(emailSignUp).click();
		System.out.println("emailSignUp clicked");
	}
    public void clickOnAcceptCookies() {
		System.out.println("Attempting to click on acceptCookies");
		driver.findElement(acceptCookies).click();
		System.out.println("acceptCookies clicked");
	}
    public void enterName(String text) {
		System.out.println("Attempting to enterName");
		driver.findElement(name).sendKeys(text);
		System.out.println("name entered");
	}
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void clickOnContinue() {
		System.out.println("Attempting to clickOnContinue");
		driver.findElement(saveButton).click();
		System.out.println("continueButton clicked");
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

