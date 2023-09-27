package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CuttScreens extends GenericMethods {
	
	
	public CuttScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='password']");
	By signUpButton = By.xpath("(//*[text()='Create account'])[1]");
	By confirmPassword = By.xpath("//input[@id='rpassword']");	
	By termsOne = By.xpath("//*[@id='register']/div[4]/label/span/i");	
	By termsTwo = By.xpath("//*[@id='register']/div[5]/label/span/i");
	By continueButton = By.xpath("//*[@id='register']/div[6]/button");
	
	By continueWithEmailButton = By.xpath("//*[@id='register']/div[6]/button");	
	By firstname = By.xpath("//input[@id='email-signup-user[first_name]']");
	By lastname = By.xpath("//input[@id='email-signup-user[last_name]']");
	By dob = By.xpath("//input[@id='email-signup-date']");
	By submit = By.xpath("//*[@id='register']/div[6]/button");
	
	By loginButton = By.xpath("//*[@class='f1den9qh dir dir-ltr']");
	By accountDropdown = By.xpath("//*[@class='cnky2vc cln384f dir dir-ltr']");
	By join = By.xpath("//*[@class='sc-pbxEC ivFBYt']");
	public By register = By.xpath("//*[text()='Sign up for free']");
    public By errorToast = By.xpath("(//*[@class='err_new'])[1]");
	public By acceptCookie = By.xpath("//*[@id='c-p-bn']");
	
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
	public void clickOnTermsOne() {
		System.out.println("Attempting to click on termsOne");
		driver.findElement(termsOne).click();
		System.out.println("termsOne clicked");
	}
	public void clickOnTermsTwo() {
		System.out.println("Attempting to click on termsTwo");
		driver.findElement(termsTwo).click();
		System.out.println("termsTwo clicked");
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
	public void enterConfirmPassword(String text) {
		System.out.println("Attempting to enter repassword");
		driver.findElement(confirmPassword).sendKeys(text);
		System.out.println("repassword entered");
	}
	public void clearPasswordField() {
		System.out.println("Attempting to clear password field");
		driver.findElement(password).clear();
		System.out.println("password field cleared");
	}
	public void enterJoin(String text) {
		System.out.println("Attempting to enter enterJoin");
		driver.findElement(join).sendKeys(text);
		System.out.println("enterJoin entered");
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

