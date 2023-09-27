package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GraysScreens extends GenericMethods {
	
	
	public GraysScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By registerButton = By.xpath("//*[@class='sc-gdWVyK fRcpXp']");
	By createAccountButton = By.xpath("//*[@class='sc-kOJRsK jqczLP']");
	By email = By.xpath("//input[@name='email' and @class='sc-hUpaCq jSKPUf']");
	By password = By.xpath("//input[@name='password' and @class='sc-hUpaCq jSKPUf']");
    public By errorToast = By.xpath("//*[@class='sc-dkPtRN gWeitn sc-iAKWXU klPwZT']");
	

	public void clickOnRegisterButton() {
		System.out.println("Attempting to click on registerButton");
		driver.findElement(registerButton).click();
		System.out.println("registerButton clicked");
	}
	

	public void clickOnCreateAccount() {
		System.out.println("Attempting to clickOnCreateAccount");
		driver.findElement(createAccountButton).click();
		System.out.println("clickOnCreateAccount clicked");
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

