package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.NaverScreens;


public class NaverPasswordStrengthChecker extends Base{

	String NaverUrl = "NaverUrl";
	String username;
	String email;
	int n = 5;
	String NaverPasswordStrength;
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
	public void NaverPwdStrengthChecker() throws Exception {
		propertiesFileLoad(NaverUrl);
		NaverUrl = lobConfigProp.getProperty("NaverUrl");
		 driver.get(NaverUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		NaverScreens executor = new NaverScreens(driver);

		GenericMethods numGenerator = new GenericMethods(driver);
		email = "james" + numGenerator.getAlphaNumericString(n);
		
		
		executor.clickOnJoin();
		executor.clickOnCheckAll();
		executor.clickOnConfirmButton();
		executor.enterEmail(email);

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		executor.clickOnRecoveryEmail();
		Thread.sleep(2000);
		
		if (executor.isElementPresent(executor.errorToast) || executor.isElementPresent(executor.secureLevel) ) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			driver.navigate().back();
			executor.clickOnCheckAll();
			executor.clickOnConfirmButton();
			executor.enterEmail(email);
			
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.enterPassword(scenarioTwo);
			Thread.sleep(3000);
			executor.clickOnRecoveryEmail();
			Thread.sleep(2000);
			
			if (executor.isElementPresent(executor.errorToast) || executor.isElementPresent(executor.secureLevel) ) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				driver.navigate().back();
				executor.clickOnCheckAll();
				executor.clickOnConfirmButton();
				executor.enterEmail(email);
				
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.enterPassword(scenarioThree);
				Thread.sleep(3000);
				executor.clickOnRecoveryEmail();
				Thread.sleep(2000);
				
				if (executor.isElementPresent(executor.errorToast) || executor.isElementPresent(executor.secureLevel) ) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					driver.navigate().back();
					executor.clickOnCheckAll();
					executor.clickOnConfirmButton();
					executor.enterEmail(email);
					
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.enterPassword(scenarioFour);
					Thread.sleep(3000);
					executor.clickOnRecoveryEmail();
					Thread.sleep(2000);
					
					if (executor.isElementPresent(executor.errorToast) || executor.isElementPresent(executor.secureLevel) ) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						driver.navigate().back();
						executor.clickOnCheckAll();
						executor.clickOnConfirmButton();
						executor.enterEmail(email);
						
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.enterPassword(scenarioFive);
						Thread.sleep(3000);
						executor.clickOnRecoveryEmail();
						Thread.sleep(2000);
						
						if (executor.isElementPresent(executor.errorToast) || executor.isElementPresent(executor.secureLevel) ) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							driver.navigate().back();
							executor.clickOnCheckAll();
							executor.clickOnConfirmButton();
							executor.enterEmail(email);
							
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.enterPassword(scenarioSix);
							Thread.sleep(3000);
							executor.clickOnRecoveryEmail();
							Thread.sleep(2000);
							
							if (executor.isElementPresent(executor.errorToast) || executor.isElementPresent(executor.secureLevel) ) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								driver.navigate().back();
								executor.clickOnCheckAll();
								executor.clickOnConfirmButton();
								executor.enterEmail(email);
								
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.enterPassword(scenarioSeven);
								Thread.sleep(3000);
								executor.clickOnRecoveryEmail();
								Thread.sleep(2000);
								
								if (executor.isElementPresent(executor.errorToast) || executor.isElementPresent(executor.secureLevel) ) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									driver.navigate().back();
									executor.clickOnCheckAll();
									executor.clickOnConfirmButton();
									executor.enterEmail(email);
									
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.enterPassword(scenarioEight);
									Thread.sleep(3000);
									executor.clickOnRecoveryEmail();
									Thread.sleep(2000);
									
									if (executor.isElementPresent(executor.errorToast) || executor.isElementPresent(executor.secureLevel) ) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										driver.navigate().back();
										executor.clickOnCheckAll();
										executor.clickOnConfirmButton();
										executor.enterEmail(email);
										
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.enterPassword(scenarioNine);
										Thread.sleep(3000);
										executor.clickOnRecoveryEmail();
										Thread.sleep(2000);
										
										NaverPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Naver Password Strength";			
										writePasswordStrengthResultToFile(NaverPasswordStrength);
									}else {
										
										System.out.println("Naver Password Strength = 52.7");
										NaverPasswordStrength = "Naver Password Strength is: 52.7";
										writePasswordStrengthResultToFile(NaverPasswordStrength);
									}
								}else {
									System.out.println("Naver Password Strength = 49.1");
									NaverPasswordStrength = "Naver Password Strength is: 49.1";
									writePasswordStrengthResultToFile(NaverPasswordStrength);
								}
							}else {
								System.out.println("Naver Password Strength = 47.6");
								NaverPasswordStrength = "Naver Password Strength is: 47.6";
								writePasswordStrengthResultToFile(NaverPasswordStrength);
							}
						}else {
							System.out.println("Naver Password Strength = 45.6");
							NaverPasswordStrength = "Naver Password Strength is: 45.6";
							writePasswordStrengthResultToFile(NaverPasswordStrength);
						}
					}else {
						System.out.println("Naver Password Strength = 37.6");
						NaverPasswordStrength = "Naver Password Strength is: 37.6";
						writePasswordStrengthResultToFile(NaverPasswordStrength);
					}
				}else {
					System.out.println("Naver Password Strength = 28.2");
					NaverPasswordStrength = "Naver Password Strength is: 28.2";
					writePasswordStrengthResultToFile(NaverPasswordStrength);
				}
				
			}else {
				System.out.println("Naver Password Strength = 26.6");
				NaverPasswordStrength = "Naver Password Strength is: 26.6";
				writePasswordStrengthResultToFile(NaverPasswordStrength);
			}
			
		}
		else {
			System.out.println("Naver Password Strength = 19.9");
			NaverPasswordStrength = "Naver Password Strength is: 19.9";
			writePasswordStrengthResultToFile(NaverPasswordStrength);
		}
		
	}
}
