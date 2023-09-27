package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class NaverScreens extends GenericMethods {
	
	
	public NaverScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By join = By.xpath("//*[text()='회원가입']");
	By checkAll = By.xpath("//*[@id='join_form']/div[1]/div[1]/div[1]/div/label");
	By confirmButton = By.xpath("//*[@id='btnAgree']");
	By id = By.xpath("//input[@id='id']");
	By password = By.xpath("//input[@id='pswd1']");
	By recoveryEmail = By.xpath("//input[@id='email']");
    public By errorToast2 = By.xpath("//*[@class='error_text item_style'][@id='pswd1Msg']");
    public By errorToast = By.xpath("//*[text()='Password: 8~16 characters consisting of letters(A-Z, a-z), numbers, or special characters.']");
    public By secureLevel = By.xpath("//*[@id='secureLevel' and text()='Invalid']");
    public By successScreen = By.xpath("//input[@class='input-with-icon icon-password used verified']");
	By sendCode = By.xpath("//*[@id='btnSend']");
	
	By acceptCookie = By.xpath("/html/body/div/div/div/div/form/div[2]/div[2]/button[1]");
	
	public void acceptCookie() {
		System.out.println("Attempting to acceptCookie");
		driver.findElement(acceptCookie).click();
		System.out.println("Cookie accepted");
	}
	public void clickOnJoin() {
		System.out.println("Attempting to clickOnJoin");
		driver.findElement(join).click();
		System.out.println("join clicked");
	}
	public void clickOnConfirmButton() {
		System.out.println("Attempting to clickOnConfirmButton");
		driver.findElement(confirmButton).click();
		System.out.println("confirmButton clicked");
	}
	
	public void clickOnCheckAll() {
		System.out.println("Attempting to checkAll");
		driver.findElement(checkAll).click();
		System.out.println("checkAll clicked");
	}
	public void clickOnRecoveryEmail() {
		System.out.println("Attempting to clickOnRecoveryEmail");
		driver.findElement(recoveryEmail).click();
		System.out.println("RecoveryEmail clicked");
	}
	public void clickOnSendCode() {
		System.out.println("Attempting to sendCode");
		driver.findElement(sendCode).click();
		System.out.println("sendCode clicked");
	}
	public void enterRecoveryEmail(String text) {
		System.out.println("Attempting to enter recoveryEmail");
		driver.findElement(recoveryEmail).sendKeys(text);
		System.out.println("recoveryEmail entered");
	}
	
	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(id).sendKeys(text);
		System.out.println("email entered");
	}
	public void clickOnEmailField() {
		System.out.println("Attempting to clickOnEmailField");
		driver.findElement(id).click();
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
	public void clickOnPasswordField() {
		System.out.println("Attempting to clickOnPasswordField");
		driver.findElement(password).click();
		System.out.println("password clicked");
	}
	public boolean isErrorPresent() {
		System.out.println("Checking if error is present");
		//driver.findElement(errorToast).isDisplayed();
		boolean iSPresent = driver.findElements(errorToast).size() > 0;
		System.out.println("check complete");
		return iSPresent;
	}
	


	}

