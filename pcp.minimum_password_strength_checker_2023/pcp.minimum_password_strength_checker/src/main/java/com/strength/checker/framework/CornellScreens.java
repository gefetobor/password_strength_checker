package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class CornellScreens extends GenericMethods {
	
	
	public CornellScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By email = By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='password']");
    public By errorToastOne = By.xpath("//*[@id='password-error' and text()='This password is weak: password must contain letters in UPPER case.']");
    public By errorToastTwo = By.xpath("//*[@id='password-error' and text()='Password is too short (min. length: 8).']");
    public By errorToastThree = By.xpath("//*[@id='password-error' and text()='This password is weak: password is in list of top used passwords.']");
    public By errorToastFour = By.xpath("//*[@id='password-error' and text()='This password is weak: password must contain letters in lower case and letters in UPPER case.']");
    public By errorToastFive = By.xpath("//*[@id='password-error' and text()='This password is weak: password must contain digits.']");
    public By errorToastSix = By.xpath("//*[@id='password-error' and text()='This password is weak: password must contain letters in UPPER case and digits.']");


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

