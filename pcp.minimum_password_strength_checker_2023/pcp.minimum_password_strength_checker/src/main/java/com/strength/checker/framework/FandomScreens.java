package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FandomScreens extends GenericMethods {
	
	
	public FandomScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By registerButton = By.xpath("//*[@id='global-register-link']/span");
	By email = By.xpath("//input[@id='traits.email']");
	By username = By.xpath("//input[@id='traits.username']");
	By password = By.xpath("//input[@name='password']");
	By dob = By.xpath("//input[@name='birthdate']");
	By agreeCheckBox = By.xpath("(//*[@class='Checkbox_icon__1l_6u Checkbox_uncheckedIcon__16Bb_'])[2]");
	By createAccount = By.xpath("//*[@id='password_submit']");
	public By acceptCookie = By.xpath("//*[@class='_2O--J403t2VqCuF8XJAZLK']");
    public By errorToast = By.xpath("//*[@class='InputError_inputError__3J6hl']");


    public void clickOnRegisterButton() {
		System.out.println("Attempting to clickOnRegisterButton");
		driver.findElement(registerButton).click();
		System.out.println("registerButton clicked");
	}
	
	public void clickOnCreateAccount() {
		System.out.println("Attempting to createAccount");
		driver.findElement(createAccount).click();
		System.out.println("createAccount clicked");
	}
	public void clickOnAcceptCookies() {
		System.out.println("Attempting to clickOnAcceptCookies");
		driver.findElement(acceptCookie).click();
		System.out.println("acceptCookie clicked");
	}
	public void clickOnAgreeCheckBox() {
		System.out.println("Attempting to click On AgreeCheckBox");
		driver.findElement(agreeCheckBox).click();
		System.out.println("agreeCheckBox clicked");
	}
	public void enterUsername(String text) {
		System.out.println("Attempting to enter username");
		driver.findElement(username).sendKeys(text);
		System.out.println("username entered");
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
	public void enterDob(String text) {
		System.out.println("Attempting to enter DOB");
		driver.findElement(dob).sendKeys(text);
		System.out.println("dob entered");
	}


	}

