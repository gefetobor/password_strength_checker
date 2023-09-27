package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.WikipediaScreens;


public class WikipediaPasswordStrengthChecker extends Base{

	String wikipediaUrl = "wikipediaUrl";
	String username;
	int n = 4;
	String WikipediaPasswordStrength;
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
	public void WikipediaPwdStrengthChecker() throws Exception {
		propertiesFileLoad(wikipediaUrl);
		wikipediaUrl = lobConfigProp.getProperty("wikipediaUrl");
		 driver.get(wikipediaUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		WikipediaScreens executor = new WikipediaScreens(driver);
		
		// Click on the button that opens the new window
		executor.clickOnEnglishButton();
		//Thread.sleep(10000);
		executor.clickOnCreateAccount();

		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerry" + numGenerator.getAlphaNumericString(n);
		executor.enterUsername(username);
		
		

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		//executor.enterForm("1234");
		executor.clickOnConfirmPassword();
		Thread.sleep(2000);
		// executor.clickOnSuccessElement();
		//String attr = executor.getSuccessElementAttribute();
		//System.out.println(attr);
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.clearPasswordField();
			executor.enterPassword(scenarioTwo);
			executor.clickOnConfirmPassword();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.clearPasswordField();
				executor.enterPassword(scenarioThree);
				executor.clickOnConfirmPassword();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.clearPasswordField();
					executor.enterPassword(scenarioFour);
					executor.clickOnConfirmPassword();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.clearPasswordField();
						executor.enterPassword(scenarioFive);
						executor.clickOnConfirmPassword();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.clearPasswordField();
							executor.enterPassword(scenarioSix);
							executor.clickOnConfirmPassword();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.clearPasswordField();
								executor.enterPassword(scenarioSeven);
								executor.clickOnConfirmPassword();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.clearPasswordField();
									executor.enterPassword(scenarioEight);
									executor.clickOnConfirmPassword();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.clearPasswordField();
										executor.enterPassword(scenarioNine);
										executor.clickOnConfirmPassword();
										Thread.sleep(2000);
										WikipediaPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Wikipedia Password Strength";			
										writePasswordStrengthResultToFile(WikipediaPasswordStrength);
									}else {
										
										System.out.println("Wikipedia Password Strength = 52.7");
										WikipediaPasswordStrength = "Wikipedia Password Strength is: 52.7";
										writePasswordStrengthResultToFile(WikipediaPasswordStrength);
									}
								}else {
									System.out.println("Wikipedia Password Strength = 49.1");
									WikipediaPasswordStrength = "Wikipedia Password Strength is: 49.1";
									writePasswordStrengthResultToFile(WikipediaPasswordStrength);
								}
							}else {
								System.out.println("Wikipedia Password Strength = 47.6");
								WikipediaPasswordStrength = "Wikipedia Password Strength is: 47.6";
								writePasswordStrengthResultToFile(WikipediaPasswordStrength);
							}
						}else {
							System.out.println("Wikipedia Password Strength = 45.6");
							WikipediaPasswordStrength = "Wikipedia Password Strength is: 45.6";
							writePasswordStrengthResultToFile(WikipediaPasswordStrength);
						}
					}else {
						System.out.println("Wikipedia Password Strength = 37.6");
						WikipediaPasswordStrength = "Wikipedia Password Strength is: 37.6";
						writePasswordStrengthResultToFile(WikipediaPasswordStrength);
					}
				}else {
					System.out.println("Wikipedia Password Strength = 28.2");
					WikipediaPasswordStrength = "Wikipedia Password Strength is: 28.2";
					writePasswordStrengthResultToFile(WikipediaPasswordStrength);
				}
				
			}else {
				System.out.println("Wikipedia Password Strength = 26.6");
				WikipediaPasswordStrength = "Wikipedia Password Strength is: 26.6";
				writePasswordStrengthResultToFile(WikipediaPasswordStrength);
			}
			
		}
		else {
			System.out.println("Wikipedia Password Strength = 19.9");
			WikipediaPasswordStrength = "Wikipedia Password Strength is: 19.9";
			writePasswordStrengthResultToFile(WikipediaPasswordStrength);
		}
		
	}
}
