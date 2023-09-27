package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ReverbScreens extends GenericMethods {
	
	
	public ReverbScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}
	
	By signUp = By.xpath("//*[@class='reverb-header__nav__link' and text()='Sign Up']");
	By firstname = By.xpath("//input[@id='user[first_name]']");
	By lastname = By.xpath("//input[@id='user[last_name]']");
	By email = By.xpath("//input[@id='user[email]']");
	By confirmEmail = By.xpath("//input[@id='emailConfirmValue']");
	By password = By.xpath("//input[@id='signup--password']");
    public By errorToast = By.xpath("//*[@class='signup-errors margined-bottom']");
    public By acceptTerms = By.xpath("//input[@id='user[accept_terms]']");
    By submitButton = By.xpath("//input[@class='button button--primary width-100']");
	
    
    public void clickOnSignUp() {
		System.out.println("Attempting to clickOnSignUp");
		driver.findElement(signUp).click();
		System.out.println("signUp clicked");
	}	
	public void enterFirstname(String text) {
		System.out.println("Attempting to enter firstname");
		driver.findElement(firstname).sendKeys(text);
		System.out.println("firstname entered");
	}
	public void enterLastname(String text) {
		System.out.println("Attempting to enter lastname");
		driver.findElement(lastname).sendKeys(text);
		System.out.println("lastname entered");
	}
 
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void enterConfirmEmail(String text) {
		System.out.println("Attempting to clickOnConfirmEmailField");
		driver.findElement(confirmEmail).sendKeys(text);
		System.out.println("confirmEmail entered");
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
	public void clickOnAcceptTerms() {
		System.out.println("Attempting to clickOnAcceptTerms");
		driver.findElement(acceptTerms).click();
		System.out.println("acceptTerms clicked");
	}	
	public void clickOnSubmitButton() {
		System.out.println("Attempting to clickOnSubmitButton");
		driver.findElement(submitButton).click();
		System.out.println("submitButton clicked");
	}	

	}

