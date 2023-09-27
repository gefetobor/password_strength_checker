package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.AmazonScreens;


public class AmazonPasswordStrengthChecker extends Base{

	String AmazonUrl = "AmazonUrl";
	String username;
	String email;
	int n = 5;
	String AmazonPasswordStrength;
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
	public void AmazonPwdStrengthChecker() throws Exception {
		propertiesFileLoad(AmazonUrl);
		AmazonUrl = lobConfigProp.getProperty("AmazonUrl");
		 driver.get(AmazonUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		AmazonScreens executor = new AmazonScreens(driver);
		
		// Click on the button that opens the new window
		executor.clickOnAccountDropdown();
		executor.clickOnCreateAccount();

		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerrypot" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		executor.enterFirstname(username);
		executor.enterEmail(email);

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		executor.reEnterPassword(scenarioOne);
		//executor.enterForm("1234");
		executor.clickOnSubmitButton();
		Thread.sleep(2000);
		// executor.clickOnSuccessElement();
		//String attr = executor.getSuccessElementAttribute();
		//System.out.println(attr);
		
		if (executor.isElementPresent(executor.submitButton)) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.clearPasswordField();
			executor.clearConfirmPasswordField();
			executor.enterPassword(scenarioTwo);
			executor.reEnterPassword(scenarioTwo);
			executor.clickOnSubmitButton();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.submitButton)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.clearPasswordField();
				executor.clearConfirmPasswordField();
				executor.enterPassword(scenarioThree);
				executor.reEnterPassword(scenarioThree);
				executor.clickOnSubmitButton();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.submitButton)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.clearPasswordField();
					executor.clearConfirmPasswordField();
					executor.enterPassword(scenarioFour);
					executor.reEnterPassword(scenarioFour);
					executor.clickOnSubmitButton();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.submitButton)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.clearPasswordField(); 
						executor.clearConfirmPasswordField();
						executor.enterPassword(scenarioFive);
						executor.reEnterPassword(scenarioFive);
						executor.clickOnSubmitButton();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.submitButton)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.clearPasswordField(); 
							executor.clearConfirmPasswordField();
							executor.enterPassword(scenarioSix);
							executor.reEnterPassword(scenarioSix);
							executor.clickOnSubmitButton();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.submitButton)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.clearPasswordField(); 
								executor.clearConfirmPasswordField();
								executor.enterPassword(scenarioSeven);
								executor.reEnterPassword(scenarioSeven);
								executor.clickOnSubmitButton();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.submitButton)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.clearPasswordField(); 
									executor.clearConfirmPasswordField();
									executor.enterPassword(scenarioEight);
									executor.reEnterPassword(scenarioEight);
									executor.clickOnSubmitButton();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.submitButton)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.clearPasswordField(); 
										executor.clearConfirmPasswordField();
										executor.enterPassword(scenarioNine);
										executor.reEnterPassword(scenarioNine);
										executor.clickOnSubmitButton();
										Thread.sleep(2000);
										AmazonPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Amazon Password Strength";			
										writePasswordStrengthResultToFile(AmazonPasswordStrength);
									}else {
										
										System.out.println("Amazon Password Strength = 52.7");
										AmazonPasswordStrength = "Amazon Password Strength is: 52.7";
										writePasswordStrengthResultToFile(AmazonPasswordStrength);
									}
								}else {
									System.out.println("Amazon Password Strength = 49.1");
									AmazonPasswordStrength = "Amazon Password Strength is: 49.1";
									writePasswordStrengthResultToFile(AmazonPasswordStrength);
								}
							}else {
								System.out.println("Amazon Password Strength = 47.6");
								AmazonPasswordStrength = "Amazon Password Strength is: 47.6";
								writePasswordStrengthResultToFile(AmazonPasswordStrength);
							}
						}else {
							System.out.println("Amazon Password Strength = 45.6");
							AmazonPasswordStrength = "Amazon Password Strength is: 45.6";
							writePasswordStrengthResultToFile(AmazonPasswordStrength);
						}
					}else {
						System.out.println("Amazon Password Strength = 37.6");
						AmazonPasswordStrength = "Amazon Password Strength is: 37.6";
						writePasswordStrengthResultToFile(AmazonPasswordStrength);
					}
				}else {
					System.out.println("Amazon Password Strength = 28.2");
					AmazonPasswordStrength = "Amazon Password Strength is: 28.2";
					writePasswordStrengthResultToFile(AmazonPasswordStrength);
				}
				
			}else {
				System.out.println("Amazon Password Strength = 26.6");
				AmazonPasswordStrength = "Amazon Password Strength is: 26.6";
				writePasswordStrengthResultToFile(AmazonPasswordStrength);
			}
			
		}
		else {
			System.out.println("Amazon Password Strength = 19.9");
			AmazonPasswordStrength = "Amazon Password Strength is: 19.9";
			writePasswordStrengthResultToFile(AmazonPasswordStrength);
		}
		
	}
}
