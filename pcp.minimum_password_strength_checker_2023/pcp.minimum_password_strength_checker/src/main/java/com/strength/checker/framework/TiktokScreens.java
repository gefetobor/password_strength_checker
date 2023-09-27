package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class TiktokScreens extends GenericMethods {
	
	
	public TiktokScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By signInButton = By.xpath("//*[@id='header-login-button']");
	By signUpButton = By.xpath("//*[@id='login-modal']//*[text()='Sign up']");
	By selectUseEmail = By.xpath("//*[@id='loginContainer']//*[text()='Use phone or email']");
	By switchToEmailView = By.xpath("//*[@id='loginContainer']//*[text()='Sign up with email']");
	

	By email = By.xpath("//*[@id='loginContainer']//*[@name='email']");
	By password = By.xpath("//*[@id='loginContainer']//input[@type='password']");
    public By firstErrorToast = By.xpath("(//*[@id='loginContainer']//div[@type='error'])[1]");
    public By secondErrorToast = By.xpath("(//*[@id='loginContainer']//div[@type='error'])[2]");
    public By acceptCookie = By.xpath("//*[@class=' tiktok-cookie-banner ' and text()='Accept all']");
    By body = By.xpath("//*[@id='main-content-explore_page']");
	
	public void acceptCookie() {
		System.out.println("Attempting to acceptCookie");
		driver.findElement(acceptCookie).click();
		System.out.println("Cookie accepted");
	}
	public void clickOnBody() {
		System.out.println("Attempting to clickOnBody");
		driver.findElement(body).click();
		System.out.println("body clicked");
	}
	public void clickOnSignInButton() {
		System.out.println("Attempting to click on signInButton");
		driver.findElement(signInButton).click();
		System.out.println("signInButton clicked");
	}
	public void clickOnSignUpButton() {
		System.out.println("Attempting to click on signUpButton");
		driver.findElement(signUpButton).click();
		System.out.println("signUpButton clicked");
	}
	
	public void clickOnUseEmail() {
		System.out.println("Attempting selectUseEmail");
		driver.findElement(selectUseEmail).click();
		System.out.println("UseEmail clicked");
	}
	public void switchToEmailView() {
		System.out.println("Attempting to switchToEmailView");
		driver.findElement(switchToEmailView).click();
		System.out.println("Email view switched");
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

