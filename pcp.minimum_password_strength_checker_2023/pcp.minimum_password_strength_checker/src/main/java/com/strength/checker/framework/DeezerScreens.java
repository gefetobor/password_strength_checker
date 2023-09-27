package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DeezerScreens extends GenericMethods {
	
	
	public DeezerScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	By email = By.xpath("//input[@id='register_form_mail_input']");
	By username = By.xpath("//input[@id='register_form_username_input']");
	By password = By.xpath("//input[@id='register_form_password_input']");
    public By errorToast = By.xpath("//*[@class='form-control-error hidden-phone']");
    public By acceptCookies = By.xpath("//*[@id='gdpr-btn-accept-all']");
	
    public void clickOnAcceptCookies() {
		System.out.println("Attempting to click on acceptCookies");
		driver.findElement(acceptCookies).click();
		System.out.println("acceptCookies clicked");
	}
 
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void enterUsername(String text) {
		System.out.println("Attempting to enter username");
		driver.findElement(username).sendKeys(text);
		System.out.println("username entered");
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

