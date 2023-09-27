package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class FacebookScreens extends GenericMethods {
	
	
	public FacebookScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By createAccountButton = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a");
	By firstNameField = By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input");
	By surnameField = By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input");
	By emailAddressField = By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input");
	By reEnterEmailAddressField = By.xpath("//input[@name='reg_email_confirmation__']");
	By newPasswordField = By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input");
	By ninetyOneOption = By.xpath("//*[@id=\"year\"]/option[33]");
	By yearField = By.xpath("//*[@id=\"year\"]");
	public By successElement = By.xpath("/html/body/div/div/div/div/div/div/div/div/div[1]/div/div[2]");
	By maleGenderOption = By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label");
	public By submitButton = By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button");
	public By acceptCookies = By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[4]/button[2]");
	public By errorToastOne = By.xpath("//*[text()='Your password must be at least 6 characters long. Please try another.']");
	public By errorToastTwo = By.xpath("//*[text()='Please choose a more secure password. It should be longer than 6 characters, unique to you and difficult for others to guess.']");
	                                                
	public void clickOnCreateAccountButton() {
		System.out.println("Attempting to click on createAccountButton");
		driver.findElement(createAccountButton).click();
		System.out.println("createAccountButton clicked");
	}
	
	public void selectForMyPersonalUseOptionNew() {
		System.out.println("Attempting to select forMyPersonalUseOption");
		Select dropdown = new Select(driver.findElement(createAccountButton));
		dropdown.selectByIndex(0);
		driver.findElement(createAccountButton).click();
		System.out.println("forMyPersonalUseOption selected");
	}
	public void clickOnFirstNameField() {
		System.out.println("Attempting to clickOnFirstNameField");
		driver.findElement(firstNameField).click();
		System.out.println("FirstName clicked");
	}
	public void enterFirstName(String text) {
		System.out.println("Attempting to enter firstNameField");
		driver.findElement(firstNameField).sendKeys(text);
		System.out.println("firstName entered");
	}
	public void selectMaleGenderOption() {
		System.out.println("Attempting to maleGenderOption");
		driver.findElement(maleGenderOption).click();
		System.out.println("maleGenderOption clicked");
	}
	public void enterSurnameField(String text) {
		System.out.println("Attempting to enter surnameField");
		driver.findElement(surnameField).sendKeys(text);
		System.out.println("surnameField entered");
	}
	public void clickOnRenterEmailField() {
		System.out.println("Attempting to click reEnterEmailAddressField");
		driver.findElement(reEnterEmailAddressField).click();
		System.out.println("reEnterEmailAddressField clicked");
	}
	public void reEnterEmailAddressField(String text) {
		System.out.println("Attempting to reEnterEmailAddressField");
		driver.findElement(reEnterEmailAddressField).sendKeys(text);
		System.out.println("reEnterEmailAddressField entered");
	}
	public void enterEmailAddressField(String text) {
		System.out.println("Attempting to enter emailAddressField");
		driver.findElement(emailAddressField).sendKeys(text);
		System.out.println("emailAddressField entered");
	}
	public void clickOnSsurnameField() {
		System.out.println("Attempting to surnameField");
		driver.findElement(surnameField).click();
		System.out.println("surnameField clicked");
	}
	public void acceptCookies() {
		System.out.println("Attempting to acceptCookies");
		driver.findElement(acceptCookies).click();
		System.out.println("Cookies Accepted");
	}
	public void selectNinetyOneOption() {
		System.out.println("Attempting to select ninetyOneOption");
		driver.findElement(ninetyOneOption).click();
		System.out.println("ninetyOneOption selected");
	}
	public void clickOnDOBField() {
		System.out.println("Attempting to click on yearField");
		driver.findElement(yearField).click();
		System.out.println("yearField selected");
	}
	public void enterYear(String text) {
		System.out.println("Attempting to enter Day");
		driver.findElement(yearField).sendKeys(text);
		System.out.println("Year entered");
	}

	public void enterPassword(String text) {
		System.out.println("Attempting to enter Password");
		driver.findElement(newPasswordField).sendKeys(text);
		System.out.println("Password entered");
	}
	public void clearPasswordField() {
		System.out.println("Attempting to clear Password");
		driver.findElement(newPasswordField).clear();
		System.out.println("Password cleared");
	}

	public void clickOnSubmitButton() {
		System.out.println("Attempting to click on submitButton");
		driver.findElement(submitButton).click();
		System.out.println("submitButton clickedOn");
	}
	public void clickOnAcceptCookies() {
		System.out.println("Attempting to click on acceptCookies");
		driver.findElement(acceptCookies).click();
		System.out.println("acceptCookies clickedOn");
	}
	public String getAppId() {
		System.out.println("Attempting to retrieve APP ID");
		String APPID = driver.findElement(submitButton).getText();
		System.out.println("App ID retrieved");
		return APPID;
	}


	}

