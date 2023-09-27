package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class WikipediaScreens extends GenericMethods {
	
	
	public WikipediaScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By english = By.xpath("/html/body/div[2]/div[1]/a/strong");
	By createAccount = By.xpath("/html/body/div[1]/header/div[2]/nav/div[1]/div/ul/li[1]/a/span");
	By username = By.xpath("//input[@id='wpName2']");
	By password = By.xpath("//input[@id='wpPassword2']");
    public By errorToast = By.xpath("//*[@class='mw-message-box mw-message-box-error']");
	By confirmPassword = By.xpath("//input[@id='wpRetype']");
	
	public void clickOnEnglishButton() {
		System.out.println("Attempting to click on english");
		driver.findElement(english).click();
		System.out.println("english clicked");
	}
	
	public void clickOnCreateAccount() {
		System.out.println("Attempting to createAccount");
		driver.findElement(createAccount).click();
		System.out.println("createAccount clicked");
	}
	public void clickOnConfirmPassword() {
		System.out.println("Attempting to click  on confirmPassword");
		driver.findElement(confirmPassword).click();
		System.out.println("confirmPassword clicked");
	}
	
	public void enterUsername(String text) {
		System.out.println("Attempting to enter username");
		driver.findElement(username).sendKeys(text);
		System.out.println("Username entered");
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

