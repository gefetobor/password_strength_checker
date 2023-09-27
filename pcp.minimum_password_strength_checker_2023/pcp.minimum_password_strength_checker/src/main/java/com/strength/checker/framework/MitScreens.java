package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class MitScreens extends GenericMethods {
	
	
	public MitScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	public By email = By.xpath("//input[@type='email' and @id='id_username']");
	By firstName = By.xpath("//input[@id='id_fname']");
	By lastName = By.xpath("//input[@id='id_lname']");
	By password = By.xpath("//input[@id='id_password1']");
	By retypePassword = By.xpath("//input[@id='id_password2']");
	public By errorToast = By.xpath("//*[@id='body']//*[@class='msg']");
	By createAccount = By.xpath("//*[@id='body']/form[2]/p/input[1]");
	By form = By.xpath("//*[@id='body']/form[2]/p");


	public void enterEmail(String text) {
		System.out.println("Attempting to enter email");
		driver.findElement(email).sendKeys(text);
		System.out.println("email entered");
	}
	public void enterFirstName(String text) {
		System.out.println("Attempting to enterFirstName");
		driver.findElement(firstName).sendKeys(text);
		System.out.println("firstName entered");
	}
	public void enterLastName(String text) {
		System.out.println("Attempting to enterLastName");
		driver.findElement(lastName).sendKeys(text);
		System.out.println("LastName entered");
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
	public void clickOnCreateAccount() {
		System.out.println("Attempting to click on create account button");
		driver.findElement(createAccount).clear();
		System.out.println("create account button clicked.");
	}
	public void clickOnPasswordField() {
		System.out.println("Attempting to click on password");
		driver.findElement(password).clear();
		System.out.println("password clicked.");
	}

	}

