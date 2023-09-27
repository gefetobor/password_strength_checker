package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoFundMeScreens extends GenericMethods {
	
	
	public GoFundMeScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}


	By firstname = By.xpath("//input[@id='firstName']");
	By lastname = By.xpath("//input[@id='lastName']");
	By email = By.xpath("//input[@id='email']");
	By confirmEmail = By.xpath("//input[@id='emailConfirm']");
	By password = By.xpath("//input[@id='password']");
    public By errorToast = By.xpath("//*[@class='hrt-text-body-sm' and text()='Please enter a valid password.']");
    public By acceptCookies = By.xpath("//*[@class='button-base-text button-primary-text' and text()='Accept all']");
	
    public void clickOnAcceptCookies() {
		System.out.println("Attempting to click on acceptCookies");
		driver.findElement(acceptCookies).click();
		System.out.println("acceptCookies clicked");
	}
    public void enterFirstname(String text) {
		System.out.println("Attempting to enter firstname");
		driver.findElement(firstname).sendKeys(text);
		System.out.println("firstname entered");
	}
	public void enterLastname(String text) {
		System.out.println("Attempting to enter Lastname");
		driver.findElement(lastname).sendKeys(text);
		System.out.println("Lastname entered");
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
	public void enterConfirmEmail(String text) {
		System.out.println("Attempting to enterConfirmEmail");
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


	}

