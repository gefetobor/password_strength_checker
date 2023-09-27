package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class CambridgeScreens extends GenericMethods {
	
	
	public CambridgeScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By applicationPortalLink = By.xpath("//*[@class='campl-primary-cta' and text()='Applicant Portal ']");
	By registerUrl = By.xpath("//*[@id='rootForm:registerUrl']");
	By email = By.xpath("//input[@id='rootForm:email:f']");
	By password = By.xpath("//input[@id='rootForm:password']");
	By confirmPassword = By.xpath("//input[@id='rootForm:passwordConfirm']");
	By termsAndConditonsCheckBox = By.xpath("//*[@id='rootForm:tcConfirm']//*[@class='ui-chkbox-icon ui-icon ui-c ui-icon-blank']");
	By privacyPolicyCheckBox = By.xpath("//*[@id='rootForm:privacyConfirm']//*[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']");
	public By errorToast = By.xpath("//*[@id='rootForm:j_idt94']//*[@class='ui-message-error-detail']");
	By registerButton = By.xpath("//*[@id='rootForm:registerButton']//*[@class='ui-button-text ui-c']");
	
	public void clickOnApplicationPortalLink() {
		System.out.println("Attempting to click on signInButton");
		driver.findElement(applicationPortalLink).click();
		System.out.println("signInButton clicked");
	}
	public void clickOnRegisterUrl() {
		System.out.println("Attempting to clickOnRegisterUrl");
		driver.findElement(registerUrl).click();
		System.out.println("registerUrl clicked");
	}
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
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
	public void enterConfirmPassword(String text) {
		System.out.println("Attempting to re-enter password");
		driver.findElement(confirmPassword).sendKeys(text);
		System.out.println("password re-entered");
	}
	public void clearConfirmPasswordField() {
		System.out.println("Attempting to clear confirm password field");
		driver.findElement(confirmPassword).clear();
		System.out.println("confirm password field cleared");
	}
	public void clickOnRegisterButton() {
		System.out.println("Attempting to click on registerButton");
		driver.findElement(registerButton).click();
		System.out.println("registerButton clicked");
	}


	}

