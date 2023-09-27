package com.strength.checker.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GloboScreens extends GenericMethods {
	
	
	public GloboScreens(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	
	By password = By.xpath("//input[@id='senha']");
	By email = By.xpath("//input[@id='email']");

    public By errorToast = By.xpath("//*[@class='error' and text()='A senha deve ter pelo menos 8 dígitos.']");
	public By acceptCookie = By.xpath("//*[@id='onetrust-accept-btn-handler']");
	
	public void clickOnEmailField() {
		System.out.println("Attempting to click on email field");
		driver.findElement(email).click();
		System.out.println("email field clicked on");
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

