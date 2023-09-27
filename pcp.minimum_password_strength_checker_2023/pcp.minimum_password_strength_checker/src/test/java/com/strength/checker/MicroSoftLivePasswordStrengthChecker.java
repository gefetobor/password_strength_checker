package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.MicrosoftLiveScreens;


public class MicroSoftLivePasswordStrengthChecker extends Base{

	String MicrosoftLiveUrl = "MicrosoftLiveUrl";
	String username;
	String email;
	int n = 5;
	String MicrosoftLivePasswordStrength;
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
	public void MicrosoftLivePwdStrengthChecker() throws Exception {
		propertiesFileLoad(MicrosoftLiveUrl);
		MicrosoftLiveUrl = lobConfigProp.getProperty("MicrosoftLiveUrl");
		 driver.get(MicrosoftLiveUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		MicrosoftLiveScreens executor = new MicrosoftLiveScreens(driver);
		
		// Click on the button that opens the new window
		executor.clickOnCreateAccount();

		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerrypot" + numGenerator.getAlphaNumericString(n);
		executor.enterEmail(username);
		executor.clickOnSubmitButton();

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		//executor.enterForm("1234");
		executor.clickOnSubmitButton();
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
			executor.clickOnSubmitButton();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.clearPasswordField();
				executor.enterPassword(scenarioThree);
				executor.clickOnSubmitButton();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.clearPasswordField();
					executor.enterPassword(scenarioFour);
					executor.clickOnSubmitButton();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.clearPasswordField();
						executor.enterPassword(scenarioFive);
						executor.clickOnSubmitButton();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.clearPasswordField();
							executor.enterPassword(scenarioSix);
							executor.clickOnSubmitButton();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.clearPasswordField();
								executor.enterPassword(scenarioSeven);
								executor.clickOnSubmitButton();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.clearPasswordField();
									executor.enterPassword(scenarioEight);
									executor.clickOnSubmitButton();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.clearPasswordField();
										executor.enterPassword(scenarioNine);
										executor.clickOnSubmitButton();
										Thread.sleep(2000);
										MicrosoftLivePasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine MicrosoftLive Password Strength";			
										writePasswordStrengthResultToFile(MicrosoftLivePasswordStrength);
									}else {
										
										System.out.println("MicrosoftLive Password Strength = 52.7");
										MicrosoftLivePasswordStrength = "MicrosoftLive Password Strength is: 52.7";
										writePasswordStrengthResultToFile(MicrosoftLivePasswordStrength);
									}
								}else {
									System.out.println("MicrosoftLive Password Strength = 49.1");
									MicrosoftLivePasswordStrength = "MicrosoftLive Password Strength is: 49.1";
									writePasswordStrengthResultToFile(MicrosoftLivePasswordStrength);
								}
							}else {
								System.out.println("MicrosoftLive Password Strength = 47.6");
								MicrosoftLivePasswordStrength = "MicrosoftLive Password Strength is: 47.6";
								writePasswordStrengthResultToFile(MicrosoftLivePasswordStrength);
							}
						}else {
							System.out.println("MicrosoftLive Password Strength = 45.6");
							MicrosoftLivePasswordStrength = "MicrosoftLive Password Strength is: 45.6";
							writePasswordStrengthResultToFile(MicrosoftLivePasswordStrength);
						}
					}else {
						System.out.println("MicrosoftLive Password Strength = 37.6");
						MicrosoftLivePasswordStrength = "MicrosoftLive Password Strength is: 37.6";
						writePasswordStrengthResultToFile(MicrosoftLivePasswordStrength);
					}
				}else {
					System.out.println("MicrosoftLive Password Strength = 28.2");
					MicrosoftLivePasswordStrength = "MicrosoftLive Password Strength is: 28.2";
					writePasswordStrengthResultToFile(MicrosoftLivePasswordStrength);
				}
				
			}else {
				System.out.println("MicrosoftLive Password Strength = 26.6");
				MicrosoftLivePasswordStrength = "MicrosoftLive Password Strength is: 26.6";
				writePasswordStrengthResultToFile(MicrosoftLivePasswordStrength);
			}
			
		}
		else {
			System.out.println("MicrosoftLive Password Strength = 19.9");
			MicrosoftLivePasswordStrength = "MicrosoftLive Password Strength is: 19.9";
			writePasswordStrengthResultToFile(MicrosoftLivePasswordStrength);
		}
		
	}
}
