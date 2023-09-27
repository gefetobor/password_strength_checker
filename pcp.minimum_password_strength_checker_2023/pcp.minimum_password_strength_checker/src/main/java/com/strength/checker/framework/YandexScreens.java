package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class YandexScreens extends GenericMethods {
	
	
	public YandexScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	By createAccount = By.xpath("//*[@id='passp:exp-register']");
	By firstname = By.xpath("//input[@id='firstname']");
	By surname = By.xpath("//input[@id='lastname']");
	By username = By.xpath("//input[@id='login']");
	By pwd = By.xpath("//input[@id='password']");
    public By errorToast = By.xpath("//*[text()='Пароль слишком простой']");
 

	
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
	public void enterSurname(String text) {
		System.out.println("Attempting to enter surname");
		driver.findElement(surname).sendKeys(text);
		System.out.println("surname entered");
	}
	public void enterUsername(String text) {
		System.out.println("Attempting to enter username");
		driver.findElement(username).sendKeys(text);
		System.out.println("username entered");
	}
	public void clickOnEmailField() {
		System.out.println("Attempting to clickOnEmailField");
		driver.findElement(username).click();
		System.out.println("Email clicked");
	}
	public void clickOnPasswordField() {
		System.out.println("Attempting to clickOnPasswordField");
		driver.findElement(pwd).click();
		System.out.println("Password field clicked");
	}
	public void enterPassword(String text) {
		System.out.println("Attempting to enter password");
		driver.findElement(pwd).sendKeys(text);
		System.out.println("password entered");
	}
	public void clearPasswordField() {
		System.out.println("Attempting to clear password field");
		driver.findElement(pwd).clear();
		System.out.println("password field cleared");
	}


	}

