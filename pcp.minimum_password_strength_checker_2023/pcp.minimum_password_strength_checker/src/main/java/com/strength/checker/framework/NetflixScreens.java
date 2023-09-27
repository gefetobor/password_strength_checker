package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class NetflixScreens extends GenericMethods {
	
	
	public NetflixScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}
	
	By email = By.xpath("//input[@name='email']");
	By getStarted = By.xpath("(//*[@id='appMountPoint']//*[@class=' e1ax5wel1 default-ltr-cache-f1k880'])[1]");
	By next = By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/button");
	By password = By.xpath("//input[@name='password']");
	By submitButton = By.xpath("//*[@class='submitBtnContainer']");
	public By errorToast = By.xpath("//*[text()='Password should be between 6 and 60 characters.']");

	
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void clickOnGetStarted() {
		System.out.println("Attempting to clickOnGetStarted");
		driver.findElement(getStarted).click();
		System.out.println("getStarted button clicked");
	}
	public void clickOnNext() {
		System.out.println("Attempting to clickOnNext");
		driver.findElement(next).click();
		System.out.println("next button clicked");
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
	public void clickOnSubmitButton() {
		System.out.println("Attempting to clickOnSubmitButton");
		driver.findElement(submitButton).click();
		System.out.println("submitButton button clicked");
	}


	}

