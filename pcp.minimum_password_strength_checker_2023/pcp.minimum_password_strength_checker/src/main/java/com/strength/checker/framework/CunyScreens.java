package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class CunyScreens extends GenericMethods {
	
	
	public CunyScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}


	By registerNowButton = By.xpath("//*[@id='OAA_DERIVED_WRK_CONN_LINK']");
	By firstname = By.xpath("//*[@id='OAA_REG_SIG_WRK_FIRST_NAME']");
	By lastname = By.xpath("//*[@id='OAA_REG_SIG_WRK_LAST_NAME']");
	By dob = By.xpath("//*[@id='OAA_REG_SIG_WRK_DATE_OF_BIRTH']");
	By genderDropDown = By.xpath("//*[@id='OAA_REG_SIG_WRK_SEX']");
	By gender = By.xpath("//*[@id='OAA_REG_SIG_WRK_SEX']/option[2]");
	By email = By.xpath("//*[@id='OAA_REG_SIG_WRK_EMAIL_ADDR']");
	By username = By.xpath("//*[@id='OAA_REG_SIG_WRK_USERID']");
	By password = By.xpath("//input[@id='OAA_REG_SIG_WRK_OPERPSWD']");
	By confirmPassword = By.xpath("//input[@id='OAA_REG_SIG_WRK_OPERPSWDCONF']");
	By registerNow = By.xpath("//input[@id='OAA_DERIVED_WRK_REGISTER']");
    public By errorToast = By.xpath("//*[@id='OAA_REG_SIG_WRK_NOTES']");


    public void clickOnRegisterNowButton() {
		System.out.println("Attempting to clickOnRegisterNowButton");
		driver.findElement(registerNowButton).click();
		System.out.println("registerNowButton clicked");
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
	public void enterDob(String text) {
		System.out.println("Attempting to enter DOB");
		driver.findElement(dob).sendKeys(text);
		System.out.println("DOB entered");
	}
	public void clickOnGenderDropdown() {
		System.out.println("Attempting to click on gender field");
		driver.findElement(genderDropDown).click();
		System.out.println("genderDropDown clicked");
	}
	public void selectGender() {
		System.out.println("Attempting to selectGender");
		driver.findElement(gender).click();
		System.out.println("Gender selected");
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
	
	public void enterUsername(String text) {
		System.out.println("Attempting to enter username");
		driver.findElement(username).sendKeys(text);
		System.out.println("username entered");
	}
	public void clickOnPasswordField() {
		System.out.println("Attempting to clickOnPasswordField");
		driver.findElement(password).click();
		System.out.println("password clicked");
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
	public void clickOnConfirmPassword() {
		System.out.println("Attempting to click on confirm password");
		driver.findElement(confirmPassword).click();
		System.out.println("confirm password field clicked on");
	}
	public void enterConfirmPassword(String text) {
		System.out.println("Attempting to enter confirm password");
		driver.findElement(confirmPassword).sendKeys(text);
		System.out.println("password entered");
	}
	public void clearConfirmPasswordField() {
		System.out.println("Attempting to clear re-password field");
		driver.findElement(confirmPassword).clear();
		System.out.println("confirm password field cleared");
	}
	public void clickOnRegisterSubmitButton() {
		System.out.println("Attempting to clickOnRegisterNowButton");
		driver.findElement(registerNow).click();
		System.out.println("registerNow clicked");
	}


	}

