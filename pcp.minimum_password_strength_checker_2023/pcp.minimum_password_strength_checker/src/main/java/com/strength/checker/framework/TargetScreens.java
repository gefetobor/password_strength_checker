package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TargetScreens extends GenericMethods {
	
	
	public TargetScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By signInButton = By.xpath("//*[@class='styles__LinkText-sc-1e1g60c-3 dZfgoT h-margin-r-x3']");
	By createAccount = By.xpath("//*[@class='styles__ListItemText-sc-diphzn-1 jaMNVl' and text()='Create Account']");
	By email = By.xpath("//input[@id='username']");
	By firstname = By.xpath("//input[@id='firstname']");
	By lastname = By.xpath("//input[@id='lastname']");
	By password = By.xpath("//input[@id='password']");
    public By errorToast = By.xpath("//*[@id='password--ErrorMessage']");
	By acceptCookie = By.xpath("/html/body/div/div/div/div/form/div[2]/div[2]/button[1]");
	
	public void acceptCookie() {
		System.out.println("Attempting to acceptCookie");
		driver.findElement(acceptCookie).click();
		System.out.println("Cookie accepted");
	}
	public void clickOnSignInButton() {
		System.out.println("Attempting to click on signInButton");
		driver.findElement(signInButton).click();
		System.out.println("signInButton clicked");
	}
	
	public void clickOnCreateAccount() {
		System.out.println("Attempting to createAccount");
		driver.findElement(createAccount).click();
		System.out.println("createAccount clicked");
	}
	
	public void enterFirstname(String text) {
		System.out.println("Attempting to enter firstname");
		driver.findElement(firstname).sendKeys(text);
		System.out.println("firstname entered");
	}
	public void enterLastname(String text) {
		System.out.println("Attempting to enter firstname");
		driver.findElement(lastname).sendKeys(text);
		System.out.println("firstname entered");
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

