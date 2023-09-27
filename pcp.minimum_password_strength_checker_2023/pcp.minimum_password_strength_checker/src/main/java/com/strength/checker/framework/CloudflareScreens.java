package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CloudflareScreens extends GenericMethods {
	
	
	public CloudflareScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By signIn = By.xpath("//*[text()='Sign in']");
	By continueWithEmailButton = By.xpath("//*[@class='textContainer' and text()='Continue with email']");	
	
	By join = By.xpath("(//*[@class='coreRegLinkHighlight'])[1]");
	By firstname = By.xpath("//input[@id='regSignUp.firstNameInput']");
	By lastname = By.xpath("//input[@id='regSignUp.lastNameInput']");
	By email = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='password']");
	By signUpButton = By.xpath("//*[text()='Sign up']");
    public By errorToast = By.xpath("//*[text()='Create a password that contains at least: ']");
	public By acceptCookie = By.xpath("//*[@id='onetrust-accept-btn-handler']");
	
	public void acceptCookie() {
		System.out.println("Attempting to acceptCookie");
		driver.findElement(acceptCookie).click();
		System.out.println("Cookie accepted");
	}
	public void clickOnSignButton() {
		System.out.println("Attempting to click on signIn");
		driver.findElement(signIn).click();
		System.out.println("signIn clicked");
	}
	
	public void clickOnContinueWithEmailButton() {
		System.out.println("Attempting to clickOnContinueWithEmailButton");
		driver.findElement(continueWithEmailButton).click();
		System.out.println("continueWithEmailButton clicked");
	}
	public void clickOnSignUpButton() {
		System.out.println("Attempting to click on signUpButton");
		driver.findElement(signUpButton).click();
		System.out.println("signUpButton clicked");
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
		driver.findElement(join).sendKeys(text);
		System.out.println("confirmPassword entered");
	}
	public void clickOnJoinButton() {
		System.out.println("Attempting to click on join");
		driver.findElement(join).click();
		System.out.println("cJoin button clicked on");
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

	}

