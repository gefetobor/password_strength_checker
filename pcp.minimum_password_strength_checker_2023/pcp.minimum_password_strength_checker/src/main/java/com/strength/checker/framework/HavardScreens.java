package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HavardScreens extends GenericMethods {
	
	
	public HavardScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By firstYearStudentLink = By.xpath("//*[@id='createAccount0']");
	public By email = By.xpath("//input[@id='createEmailControl']");
	By retypeEmail = By.xpath("//input[@id='createRetypeEmailControl']");
	By password = By.xpath("//input[@id='createPasswordControl']");
	By retypePassword = By.xpath("//input[@id='confirmPassword']");
	public By errorToast = By.xpath("(//*[@class='control__error-icon ng-star-inserted'])[1]");
	public By phoneField = By.xpath("//input[@id='phone_ques_8']");
	
	public void clickOnFirstYearStudentLink() {
		System.out.println("Attempting to click on firstYearStudentLink");
		driver.findElement(firstYearStudentLink).click();
		System.out.println("firstYearStudentLink clicked");
	}

	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void reTypeEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(retypeEmail).sendKeys(text);
		System.out.println("email entered");
	}
	public void enterPhone(String text) {
		System.out.println("Attempting to enter phone number");
		driver.findElement(phoneField).sendKeys(text);
		System.out.println("phoneField entered");
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
	public void reTypePassword(String text) {
		System.out.println("Attempting to retypePassword");
		driver.findElement(retypePassword).sendKeys(text);
		System.out.println("password retyped");
	}
	public void clearReTypePasswordField() {
		System.out.println("Attempting to clear confirm password field");
		driver.findElement(retypePassword).clear();
		System.out.println("confirm password field cleared");
	}


	}

