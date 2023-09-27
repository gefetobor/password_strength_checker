package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AmazonScreens extends GenericMethods {
	
	
	public AmazonScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By startHere2 = By.xpath("/html/body/div[1]/header/div/div[3]/div[13]/div[2]/div/a");
	By startHere = By.xpath("//*[text()='Start here.']");
	By accountDropdown = By.xpath("//*[@class='nav-line-2 ']");
	By createAccount = By.xpath("//*[@id='createAccountSubmit']");
	By firstname = By.xpath("//input[@id='ap_customer_name']");
	By email = By.xpath("//input[@id='ap_email']");
	By password = By.xpath("//input[@id='ap_password']");
	By rePassword = By.xpath("//input[@id='ap_password_check']");
	public By successScreen = By.xpath("//input[@class='a-button-input']");
	//By confirmPassword = By.xpath("//input[@id='wpRetype']");
    public By submitButton = By.xpath("//input[@id='continue']");
	
	public void clickOnCreateAccount() {
		System.out.println("Attempting to click on createAccount");
		driver.findElement(createAccount).click();
		System.out.println("createAccount clicked");
	}
	public void clickOnAccountDropdown() {
		System.out.println("Attempting to click on accountDropdown");
		driver.findElement(accountDropdown).click();
		System.out.println("accountDropdown clicked");
	}
	public void clickOnStartHere() {
		System.out.println("Attempting to click on startHere");
		driver.findElement(startHere).click();
		System.out.println("startHere clicked");
	}
	
	public void enterFirstname(String text) {
		System.out.println("Attempting to enter firstname");
		driver.findElement(firstname).sendKeys(text);
		System.out.println("firstname entered");
	}
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void clickOnSubmitButton() {
		System.out.println("Attempting to submitButton");
		driver.findElement(submitButton).click();
		System.out.println("submitButton clicked");
	}
	public void enterPassword(String text) {
		System.out.println("Attempting to enter password");
		driver.findElement(password).sendKeys(text);
		System.out.println("password entered");
	}
	public void reEnterPassword(String text) {
		System.out.println("Attempting to confirm password");
		driver.findElement(rePassword).sendKeys(text);
		System.out.println("password re-entered");
	}
	public void clearPasswordField() {
		System.out.println("Attempting to clear password field");
		driver.findElement(password).clear();
		System.out.println("password field cleared");
	}
	public void clearConfirmPasswordField() {
		System.out.println("Attempting to clear confirm password field");
		driver.findElement(rePassword).clear();
		System.out.println("confirm password field cleared");
	}


	}

