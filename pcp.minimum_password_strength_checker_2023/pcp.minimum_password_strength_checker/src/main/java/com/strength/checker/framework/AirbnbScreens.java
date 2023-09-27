package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AirbnbScreens extends GenericMethods {
	
	
	public AirbnbScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By accountDropdown = By.xpath("//*[@class='cnky2vc cln384f dir dir-ltr']");
	By signUpButton = By.xpath("(//*[text()='Sign up'])[1]");
	By continueWithEmailButton = By.xpath("//*[@class='_bc4egv' and text()='Continue with email']");	
	By email = By.xpath("//input[@id='email-login-email']");
	By continueButton = By.xpath("//*[@class='t1dqvypu dir dir-ltr']");
	By firstname = By.xpath("//input[@id='email-signup-user[first_name]']");
	By lastname = By.xpath("//input[@id='email-signup-user[last_name]']");
	By dob = By.xpath("//input[@id='email-signup-date']");
	By password = By.xpath("//input[@id='email-signup-password']");
	By submit = By.xpath("//*[@class='l1ovpqvx b1gx9nk4 c1p6dday f1ewl0po dir dir-ltr']");
	
	By loginButton = By.xpath("//*[@class='f1den9qh dir dir-ltr']");
	By join = By.xpath("//*[@class='sc-pbxEC ivFBYt']");
	public By register = By.xpath("//*[text()='Sign up for free']");
    public By errorToast = By.xpath("//*[@class='_sesj4n']");
	public By acceptCookie = By.xpath("//*[@class='l1ovpqvx bmx2gr4 c1ih3c6 f1hzc007 dir dir-ltr']");
	
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
	public void clickOnAccountDropdown() {
		System.out.println("Attempting to click on accountDropdown");
		driver.findElement(accountDropdown).click();
		System.out.println("accountDropdown clicked");
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

