package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AllrecepiesScreens extends GenericMethods {
	
	
	public AllrecepiesScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	By loginButton = By.xpath("(//*[@class='icon icon-account '])[1]");
	By join = By.xpath("//*[text()='Join now']");
	By continueWithEmailButton = By.xpath("//*[@class='login__button login__button--email button--outlined button--full-width type--cat-bold']");	
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='password']");
	public By submit = By.xpath("//*[@id='kc-form-buttons']");
	
	By signUpButton = By.xpath("//*[@id='kc-form-buttons']");
	public By register = By.xpath("//*[text()='Sign up for free']");
	By firstname = By.xpath("//input[@id='bdd-givenName']");
	By lastname = By.xpath("//input[@id='bdd-familyName']");
    public By errorToast = By.xpath("//*[@id='kc-form-buttons']");
	public By acceptCookie = By.xpath("//*[@id='onetrust-accept-btn-handler']");
	
	public void acceptCookie() {
		System.out.println("Attempting to acceptCookie");
		driver.findElement(acceptCookie).click();
		System.out.println("Cookie accepted");
	}
	public void clickOnRegister() {
		System.out.println("Attempting to click on register");
		driver.findElement(register).click();
		System.out.println("register clicked");
	}
	public void clickOnSubmit() {
		System.out.println("Attempting to click on submit");
		driver.findElement(submit).click();
		System.out.println("submit clicked");
	}
	
	public void clickOnContinueWithEmailButton() {
		System.out.println("Attempting to clickOnContinueWithEmailButton");
		driver.findElement(continueWithEmailButton).click();
		System.out.println("continueWithEmailButton clicked");
	}
	public void clickOnLoginButton() {
		System.out.println("Attempting to click on loginButton");
		driver.findElement(loginButton).click();
		System.out.println("loginButton clicked");
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

