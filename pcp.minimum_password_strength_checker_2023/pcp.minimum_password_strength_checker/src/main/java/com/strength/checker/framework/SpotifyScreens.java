package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SpotifyScreens extends GenericMethods {
	
	
	public SpotifyScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='password']");
    public By errorToast = By.xpath("//*[@id='__next']/main/div/div/form/div[2]/div[4]");
    public By acceptCookies = By.xpath("//*[@id='onetrust-accept-btn-handler']");
	
    public void clickOnAcceptCookies() {
		System.out.println("Attempting to click on acceptCookies");
		driver.findElement(acceptCookies).click();
		System.out.println("acceptCookies clicked");
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

