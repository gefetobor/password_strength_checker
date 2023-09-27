package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NoonScreens extends GenericMethods {
	
	
	public NoonScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	By signInButton = By.xpath("//*[@id='dd_header_signInOrUp']");
	By signUpButton = By.xpath("//*[text()='Sign Up']");
	By email = By.xpath("//input[@id='emailInput']");
	By password = By.xpath("//input[@id='passwordInput']");
	By submit = By.xpath("//*[@id='login-submit']");
    public By errorToast = By.xpath("//*[@class='error-message' and text()='Invalid password']");

	public void clickOnSignInButton() {
		System.out.println("Attempting to clickOnSignInButton");
		driver.findElement(signInButton).click();
		System.out.println("signInButton clicked");
	}
	public void clickOnSubmit() {
		System.out.println("Attempting to click on submit");
		driver.findElement(submit).click();
		System.out.println("submit clicked");
	}
	public void clickOnSignUpButton() {
		System.out.println("Attempting to clickOnSignUpButton");
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


}

