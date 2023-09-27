package com.strength.checker;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.OpenAiScreens;


public class OpenAiPasswordStrengthChecker extends Base{

	String OpenAiUrl = "OpenAiUrl";
	String username;
	String email;
	int n = 5;
	String OpenAiPasswordStrength;
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
	public void OpenAiPwdStrengthChecker() throws Exception {
		propertiesFileLoad(OpenAiUrl);
		OpenAiUrl = lobConfigProp.getProperty("OpenAiUrl");
		 driver.get(OpenAiUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		OpenAiScreens executor = new OpenAiScreens(driver);
		
		// Click on the button that opens the new window
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerryp" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		executor.clickOnCreateAccount();
		
		// Get the handle of the current window
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println(currentWindowHandle);
		
		// Get the handles of all open windows
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

		// Remove the handle of the current window from the set of handles
		windowHandles.remove(currentWindowHandle);
		// Switch to the new window
		driver.switchTo().window(windowHandles.iterator().next());
		
		executor.enterEmail(email);
		executor.clickOnSubmitButton();

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		executor.clickOnSubmitButton();
		
		if (executor.isElementPresent(executor.submitButton)) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.clearPasswordField();
			executor.enterPassword(scenarioTwo);
			executor.clickOnSubmitButton();
			
			if (executor.isElementPresent(executor.submitButton)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.clearPasswordField();
				executor.enterPassword(scenarioThree);
				executor.clickOnSubmitButton();
				
				if (executor.isElementPresent(executor.submitButton)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.clearPasswordField();
					executor.enterPassword(scenarioFour);
					executor.clickOnSubmitButton();
					
					if (executor.isElementPresent(executor.submitButton)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.clearPasswordField();
						executor.enterPassword(scenarioFive);
						executor.clickOnSubmitButton();
						
						if (executor.isElementPresent(executor.submitButton)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.clearPasswordField();
							executor.enterPassword(scenarioSix);
							executor.clickOnSubmitButton();
							
							if (executor.isElementPresent(executor.submitButton)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.clearPasswordField();
								executor.enterPassword(scenarioSeven);
								executor.clickOnSubmitButton();
								
								if (executor.isElementPresent(executor.submitButton)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.clearPasswordField();
									executor.enterPassword(scenarioEight);
									executor.clickOnSubmitButton();
									
									if (executor.isElementPresent(executor.submitButton)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.clearPasswordField();
										executor.enterPassword(scenarioNine);
										executor.clickOnSubmitButton();
										
										OpenAiPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine OpenAi Password Strength";			
										writePasswordStrengthResultToFile(OpenAiPasswordStrength);
									}else {
										
										System.out.println("OpenAi Password Strength = 52.7");
										OpenAiPasswordStrength = "OpenAi Password Strength is: 52.7";
										writePasswordStrengthResultToFile(OpenAiPasswordStrength);
									}
								}else {
									System.out.println("OpenAi Password Strength = 49.1");
									OpenAiPasswordStrength = "OpenAi Password Strength is: 49.1";
									writePasswordStrengthResultToFile(OpenAiPasswordStrength);
								}
							}else {
								System.out.println("OpenAi Password Strength = 47.6");
								OpenAiPasswordStrength = "OpenAi Password Strength is: 47.6";
								writePasswordStrengthResultToFile(OpenAiPasswordStrength);
							}
						}else {
							System.out.println("OpenAi Password Strength = 45.6");
							OpenAiPasswordStrength = "OpenAi Password Strength is: 45.6";
							writePasswordStrengthResultToFile(OpenAiPasswordStrength);
						}
					}else {
						System.out.println("OpenAi Password Strength = 37.6");
						OpenAiPasswordStrength = "OpenAi Password Strength is: 37.6";
						writePasswordStrengthResultToFile(OpenAiPasswordStrength);
					}
				}else {
					System.out.println("OpenAi Password Strength = 28.2");
					OpenAiPasswordStrength = "OpenAi Password Strength is: 28.2";
					writePasswordStrengthResultToFile(OpenAiPasswordStrength);
				}
				
			}else {
				System.out.println("OpenAi Password Strength = 26.6");
				OpenAiPasswordStrength = "OpenAi Password Strength is: 26.6";
				writePasswordStrengthResultToFile(OpenAiPasswordStrength);
			}
			
		}
		else {
			System.out.println("OpenAi Password Strength = 19.9");
			OpenAiPasswordStrength = "OpenAi Password Strength is: 19.9";
			writePasswordStrengthResultToFile(OpenAiPasswordStrength);
		}
		
	}
}
