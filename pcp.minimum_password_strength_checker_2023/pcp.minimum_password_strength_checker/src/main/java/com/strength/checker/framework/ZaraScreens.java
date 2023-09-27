package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class ZaraScreens extends GenericMethods {
	
	
	public ZaraScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By email = By.xpath("//input[@class='zds-input-base__input' and @name='email']");
	By password = By.xpath("//input[@class='zds-input-base__input' and @name='password']");
	public By errorToast = By.xpath("//*[text()='Enter a secure password: At least 8 characters long, containing uppercase and lowercase letters and numbers.']");
	public By acceptCookie = By.xpath("//*[@id='onetrust-accept-btn-handler']");
   

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
	public void clickOnAcceptCookies() {
		System.out.println("Attempting to clickOnAcceptCookies");
		driver.findElement(acceptCookie).click();
		System.out.println("acceptCookies clicked");
	}


	}

