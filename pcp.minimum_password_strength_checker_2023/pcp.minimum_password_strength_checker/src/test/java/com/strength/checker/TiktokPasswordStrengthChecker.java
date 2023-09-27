package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.TiktokScreens;


public class TiktokPasswordStrengthChecker extends Base{

	String TiktokUrl = "TiktokUrl";
	String username;
	String email;
	int n = 5;
	String TiktokPasswordStrength;
	String scenarioOne = "scenarioOne";
	String scenarioTwo = "scenarioTwo";
	String scenarioThree = "scenarioThree";
	String scenarioFour = "scenarioFour";
	String scenarioFive = "scenarioFive";
	String scenarioSix = "scenarioSix";
	String scenarioSeven = "scenarioSeven";
	String scenarioEight = "scenarioEight";
	String scenarioNine = "scenarioNine";
	
	
	@Test
	public void TiktokPwdStrengthChecker() throws Exception {
		propertiesFileLoad(TiktokUrl);
		TiktokUrl = lobConfigProp.getProperty("TiktokUrl");
		 driver.get(TiktokUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		TiktokScreens executor = new TiktokScreens(driver);
		
		executor.clickOnSignInButton();
		
		executor.clickOnSignUpButton();	
		
		executor.clickOnUseEmail();
	
		executor.switchToEmailView();

		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerrypot" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		executor.enterEmail(email);

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		//executor.enterForm("1234");
		executor.clickOnEmailField();
		Thread.sleep(2000);
		
		if (executor.isElementPresent(executor.firstErrorToast) || executor.isElementPresent(executor.secondErrorToast )) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			WebElement password = driver.findElement(By.xpath("//*[@id='loginContainer']//input[@type='password']"));
			Actions a = new Actions(driver);
			a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			
			executor.enterPassword(scenarioTwo);
			executor.clickOnEmailField();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.firstErrorToast) || executor.isElementPresent(executor.secondErrorToast )) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			
				executor.enterPassword(scenarioThree);
				executor.clickOnEmailField();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.firstErrorToast) || executor.isElementPresent(executor.secondErrorToast )) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			
					executor.enterPassword(scenarioFour);
					executor.clickOnEmailField();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.firstErrorToast) || executor.isElementPresent(executor.secondErrorToast )) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			
						executor.enterPassword(scenarioFive);
						executor.clickOnEmailField();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.firstErrorToast) || executor.isElementPresent(executor.secondErrorToast )) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			
							executor.enterPassword(scenarioSix);
							executor.clickOnEmailField();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.firstErrorToast) || executor.isElementPresent(executor.secondErrorToast )) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			
								executor.enterPassword(scenarioSeven);
								executor.clickOnEmailField();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.firstErrorToast) || executor.isElementPresent(executor.secondErrorToast )) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			
									executor.enterPassword(scenarioEight);
									executor.clickOnEmailField();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.firstErrorToast) || executor.isElementPresent(executor.secondErrorToast )) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			
										executor.enterPassword(scenarioNine);
										executor.clickOnEmailField();
										Thread.sleep(2000);
										TiktokPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Tiktok Password Strength";			
										writePasswordStrengthResultToFile(TiktokPasswordStrength);
									}else {
										
										System.out.println("Tiktok Password Strength = 52.7");
										TiktokPasswordStrength = "Tiktok Password Strength is: 52.7";
										writePasswordStrengthResultToFile(TiktokPasswordStrength);
									}
								}else {
									System.out.println("Tiktok Password Strength = 49.1");
									TiktokPasswordStrength = "Tiktok Password Strength is: 49.1";
									writePasswordStrengthResultToFile(TiktokPasswordStrength);
								}
							}else {
								System.out.println("Tiktok Password Strength = 47.6");
								TiktokPasswordStrength = "Tiktok Password Strength is: 47.6";
								writePasswordStrengthResultToFile(TiktokPasswordStrength);
							}
						}else {
							System.out.println("Tiktok Password Strength = 45.6");
							TiktokPasswordStrength = "Tiktok Password Strength is: 45.6";
							writePasswordStrengthResultToFile(TiktokPasswordStrength);
						}
					}else {
						System.out.println("Tiktok Password Strength = 37.6");
						TiktokPasswordStrength = "Tiktok Password Strength is: 37.6";
						writePasswordStrengthResultToFile(TiktokPasswordStrength);
					}
				}else {
					System.out.println("Tiktok Password Strength = 28.2");
					TiktokPasswordStrength = "Tiktok Password Strength is: 28.2";
					writePasswordStrengthResultToFile(TiktokPasswordStrength);
				}
				
			}else {
				System.out.println("Tiktok Password Strength = 26.6");
				TiktokPasswordStrength = "Tiktok Password Strength is: 26.6";
				writePasswordStrengthResultToFile(TiktokPasswordStrength);
			}
			
		}
		else {
			System.out.println("Tiktok Password Strength = 19.9");
			TiktokPasswordStrength = "Tiktok Password Strength is: 19.9";
			writePasswordStrengthResultToFile(TiktokPasswordStrength);
		}
		
	}
}
