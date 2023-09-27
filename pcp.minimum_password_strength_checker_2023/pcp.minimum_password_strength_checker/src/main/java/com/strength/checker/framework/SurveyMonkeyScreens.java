package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SurveyMonkeyScreens extends GenericMethods {
	
	
	public SurveyMonkeyScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By signUpButton = By.xpath("//*[text()='Sign up free']");
	By email = By.xpath("//*[@id='username']");
	By agreeCheckBox = By.xpath("//input[@id='tou-checkbox']");
	By continueButton = By.xpath("//*[text()='Next']");
	By password = By.xpath("//input[@id='password']");
	By confirmPassword = By.xpath("//input[@id='input1']");
	By submit = By.xpath("//*[text()='Create account']");
	
	By firstname = By.xpath("//input[@id='email-signup-user[first_name]']");
	By lastname = By.xpath("//input[@id='email-signup-user[last_name]']");
	By dob = By.xpath("//input[@id='email-signup-date']");
	By continueWithEmailButton = By.xpath("//input[@id='tou-checkbox']");	
	By loginButton = By.xpath("//*[@class='f1den9qh dir dir-ltr']");
	By join = By.xpath("//*[@class='sc-pbxEC ivFBYt']");
	public By register = By.xpath("//*[text()='Sign up for free']");
    public By errorToast = By.xpath("//*[text()='Create account']");
	public By acceptCookie = By.xpath("//*[@id='onetrust-accept-btn-handler']");
	
	public void acceptCookie() {
		System.out.println("Attempting to acceptCookie");
		driver.findElement(acceptCookie).click();
		System.out.println("Cookie accepted");
	}
	public void clickOnAgreeCheckBox() {
		System.out.println("Attempting to agreeCheckBox");
		driver.findElement(agreeCheckBox).click();
		System.out.println("agreeCheckBox accepted");
	}
	public void clickOnContinueButton() {
		System.out.println("Attempting to click on continueButton");
		driver.findElement(continueButton).click();
		System.out.println("continueButton clicked");
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
	public void enterDob(String text) {
		System.out.println("Attempting to enter dob");
		driver.findElement(dob).sendKeys(text);
		System.out.println("dob entered");
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

