package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.YandexScreens;


public class YandexPasswordStrengthChecker extends Base{

	String YandexUrl = "YandexUrl";
	String username;
	String surname;
	int n = 2;
	int y = 2;
	String YandexPasswordStrength;
	String yandexScenarioOne = "yandexScenarioOne";
	String yandexScenarioTwo = "yandexScenarioTwo";
	String yandexScenarioThree = "yandexScenarioThree";
	String yandexScenarioFour = "yandexScenarioFour";
	String yandexScenarioFive = "yandexScenarioFive";
	String yandexScenarioSix = "yandexScenarioSix";
	String yandexScenarioSeven = "yandexScenarioSeven";
	String yandexScenarioEight = "yandexScenarioEight";
	String yandexScenarioNine = "yandexScenarioNine";
	
	
	@Test
	public void YandexPwdStrengthChecker() throws Exception {
		propertiesFileLoad(YandexUrl);
		YandexUrl = lobConfigProp.getProperty("YandexUrl");
		 driver.get(YandexUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		YandexScreens executor = new YandexScreens(driver);
		
		// Click on the button that opens the new window
		executor.clickOnCreateAccount();

		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jeri" + numGenerator.getAlphaNumericString(n);
		surname = "Obosco" + numGenerator.getAlphaNumericString(y);
		executor.enterFirstname(username);
		executor.enterSurname(surname);
		executor.enterUsername(username + surname); 

		//Execute test cases
		//yandexScenario 1: 
		yandexScenarioOne = propertiesFileLoad(yandexScenarioOne);
		executor.enterPassword(yandexScenarioOne);
		Thread.sleep(3000);
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("yandexScenario 2: Website does not accept yandexScenario 1");
			
			//yandexScenario 2: 
			yandexScenarioTwo = propertiesFileLoad(yandexScenarioTwo);
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			Actions a = new Actions(driver);
			//a.moveToElement(password).keyDown(Keys.CONTROL).sendKeys("a",Keys.DELETE).keyUp(Keys.CONTROL).perform();
			a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			
			executor.enterPassword(yandexScenarioTwo);
			executor.clickOnEmailField();
			Thread.sleep(3000);
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("yandexScenario 3: Website does not accept yandexScenario 2");
				
				//yandexScenario 3: 
				yandexScenarioThree = propertiesFileLoad(yandexScenarioThree);
				//executor.clearPasswordField();
				a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
				
				executor.enterPassword(yandexScenarioThree);
				executor.clickOnEmailField();
				Thread.sleep(3000);
				
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("yandexScenario 4: Website does not accept yandexScenario 3");
					
					//yandexScenario 4: 
					yandexScenarioFour = propertiesFileLoad(yandexScenarioFour);
					//executor.clearPasswordField();
					a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					
					executor.enterPassword(yandexScenarioFour);
					executor.clickOnEmailField();
					Thread.sleep(3000);
					
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("yandexScenario 5: Website does not accept yandexScenario 4");
						
						//yandexScenario 5: 
						yandexScenarioFive = propertiesFileLoad(yandexScenarioFive);
						//executor.clearPasswordField();
						a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
						
						executor.enterPassword(yandexScenarioFive);
						executor.clickOnEmailField();
						Thread.sleep(3000);
						
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("yandexScenario 6: Website does not accept yandexScenario 5");
							
							//yandexScenario 6: 
							yandexScenarioSix = propertiesFileLoad(yandexScenarioSix);
							//executor.clearPasswordField();
							a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
							
							executor.enterPassword(yandexScenarioSix);
							executor.clickOnEmailField();
							Thread.sleep(3000);
							
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("yandexScenario 7: Website does not accept yandexScenario 6");
								
								//yandexScenario 7: 
								yandexScenarioSeven = propertiesFileLoad(yandexScenarioSeven);
								//executor.clearPasswordField();
								a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
								
								executor.enterPassword(yandexScenarioSeven);
								executor.clickOnEmailField();
								Thread.sleep(3000);
								
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("yandexScenario 8: Website does not accept yandexScenario 7");
									
									//yandexScenario 8: 
									yandexScenarioEight = propertiesFileLoad(yandexScenarioEight);
									//executor.clearPasswordField();
									a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
									
									executor.enterPassword(yandexScenarioEight);
									executor.clickOnEmailField();
									Thread.sleep(3000);
									
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("yandexScenario 9: Website does not accept yandexScenario 8");
										
										//yandexScenario 9: 
										yandexScenarioNine = propertiesFileLoad(yandexScenarioNine);
										//executor.clearPasswordField();
										a.moveToElement(password).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
										
										executor.enterPassword(yandexScenarioNine);
									
										Thread.sleep(3000);
										YandexPasswordStrength = "yandexScenarios Not Sufficient. Need more yandexScenarios to determine Yandex Password Strength";			
										writePasswordStrengthResultToFile(YandexPasswordStrength);
									}else {
										
										System.out.println("Yandex Password Strength = 52.7");
										YandexPasswordStrength = "Yandex Password Strength is: 52.7";
										writePasswordStrengthResultToFile(YandexPasswordStrength);
									}
								}else {
									System.out.println("Yandex Password Strength = 49.1");
									YandexPasswordStrength = "Yandex Password Strength is: 49.1";
									writePasswordStrengthResultToFile(YandexPasswordStrength);
								}
							}else {
								System.out.println("Yandex Password Strength = 47.6");
								YandexPasswordStrength = "Yandex Password Strength is: 47.6";
								writePasswordStrengthResultToFile(YandexPasswordStrength);
							}
						}else {
							System.out.println("Yandex Password Strength = 45.6");
							YandexPasswordStrength = "Yandex Password Strength is: 45.6";
							writePasswordStrengthResultToFile(YandexPasswordStrength);
						}
					}else {
						System.out.println("Yandex Password Strength = 37.6");
						YandexPasswordStrength = "Yandex Password Strength is: 37.6";
						writePasswordStrengthResultToFile(YandexPasswordStrength);
					}
				}else {
					System.out.println("Yandex Password Strength = 28.2");
					YandexPasswordStrength = "Yandex Password Strength is: 28.2";
					writePasswordStrengthResultToFile(YandexPasswordStrength);
				}
				
			}else {
				System.out.println("Yandex Password Strength = 26.6");
				YandexPasswordStrength = "Yandex Password Strength is: 26.6";
				writePasswordStrengthResultToFile(YandexPasswordStrength);
			}
			
		}
		else {
			System.out.println("Yandex Password Strength = 19.9");
			YandexPasswordStrength = "Yandex Password Strength is: 19.9";
			writePasswordStrengthResultToFile(YandexPasswordStrength);
		}
		
	}
}
