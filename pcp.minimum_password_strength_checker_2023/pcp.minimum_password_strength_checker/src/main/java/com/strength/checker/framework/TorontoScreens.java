package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class TorontoScreens extends GenericMethods {
	
	
	public TorontoScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}


	By firstname = By.xpath("//*[@id='firstName']");
	By lastname = By.xpath("//*[@id='lastName']");
	By dob = By.xpath("//*[@id='birthDate']");
	By email = By.xpath("//*[@id='emailAddress']");
	By confirmEmail = By.xpath("//*[@id='emailConfirm']");
	By username = By.xpath("//*[@id='username']");
	By password = By.xpath("//*[@id='password']");
	By confirmPassword = By.xpath("//*[@id='confirmPassword']");
    public By errorToastOne = By.xpath("//*[@class='fieldError' and text()='Password must be between 7 and 30 characters.']");
    public By errorToastTwo = By.xpath("//*[@class='fieldError' and text()='Include uppercase characters.']");
    public By errorToastThree = By.xpath("//*[@class='fieldError' and text()='Include numbers.']");
    public By errorToastFour = By.xpath("//*[@class='fieldError' and text()='Include symbols.']");
    public By errorToastFive = By.xpath("//*[@class='fieldError' and text()='Include lowercase characters']");
    
    

	
	public void enterFirstname(String text) {
		System.out.println("Attempting to enter firstname");
		driver.findElement(firstname).sendKeys(text);
		System.out.println("firstname entered");
	}
	public void enterLastname(String text) {
		System.out.println("Attempting to enter lastname");
		driver.findElement(lastname).sendKeys(text);
		System.out.println("lastname entered");
	}
	public void enterDOB(String text) {
		System.out.println("Attempting to enter DOB");
		driver.findElement(dob).sendKeys(text);
		System.out.println("DOB entered");
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
	public void enterConfirmEmail(String text) {
		System.out.println("Attempting to enter confirm email");
		driver.findElement(confirmEmail).sendKeys(text);
		System.out.println("confirm email field entered");
	}
	public void enterUsername(String text) {
		System.out.println("Attempting to enter username");
		driver.findElement(username).sendKeys(text);
		System.out.println("username entered");
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
		System.out.println("Attempting to enter password");
		driver.findElement(confirmPassword).sendKeys(text);
		System.out.println("password entered");
	}


	}

