package com.strength.checker;


import java.util.concurrent.TimeUnit;
import org.junit.Test;
import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.RedditScreens;


public class RedditPasswordStrengthChecker extends Base{

	String RedditUrl = "RedditUrl";
	String username;
	String email;
	int n = 5;
	String RedditPasswordStrength;
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
	public void RedditPwdStrengthChecker() throws Exception {
		propertiesFileLoad(RedditUrl);
		RedditUrl = lobConfigProp.getProperty("RedditUrl");
		 driver.get(RedditUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		RedditScreens executor = new RedditScreens(driver);
		
		// Click on the button that opens the new window
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jeri" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		
		executor.enterEmail(email);
		executor.clickOnSubmitButton();

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		executor.clickOnUsername();
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.clearPasswordField();
			executor.enterPassword(scenarioTwo);
			executor.clickOnUsername();
			
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.clearPasswordField();
				executor.enterPassword(scenarioThree);
				executor.clickOnUsername();
				
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.clearPasswordField();
					executor.enterPassword(scenarioFour);
					executor.clickOnUsername();
					
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.clearPasswordField();
						executor.enterPassword(scenarioFive);
						executor.clickOnUsername();
						
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.clearPasswordField();
							executor.enterPassword(scenarioSix);
							executor.clickOnUsername();
							
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.clearPasswordField();
								executor.enterPassword(scenarioSeven);
								executor.clickOnUsername();
								
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.clearPasswordField();
									executor.enterPassword(scenarioEight);
									executor.clickOnUsername();
									
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.clearPasswordField();
										executor.enterPassword(scenarioNine);
										executor.clickOnUsername();
										
										RedditPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Reddit Password Strength";			
										writePasswordStrengthResultToFile(RedditPasswordStrength);
									}else {
										
										System.out.println("Reddit Password Strength = 52.7");
										RedditPasswordStrength = "Reddit Password Strength is: 52.7";
										writePasswordStrengthResultToFile(RedditPasswordStrength);
									}
								}else {
									System.out.println("Reddit Password Strength = 49.1");
									RedditPasswordStrength = "Reddit Password Strength is: 49.1";
									writePasswordStrengthResultToFile(RedditPasswordStrength);
								}
							}else {
								System.out.println("Reddit Password Strength = 47.6");
								RedditPasswordStrength = "Reddit Password Strength is: 47.6";
								writePasswordStrengthResultToFile(RedditPasswordStrength);
							}
						}else {
							System.out.println("Reddit Password Strength = 45.6");
							RedditPasswordStrength = "Reddit Password Strength is: 45.6";
							writePasswordStrengthResultToFile(RedditPasswordStrength);
						}
					}else {
						System.out.println("Reddit Password Strength = 37.6");
						RedditPasswordStrength = "Reddit Password Strength is: 37.6";
						writePasswordStrengthResultToFile(RedditPasswordStrength);
					}
				}else {
					System.out.println("Reddit Password Strength = 28.2");
					RedditPasswordStrength = "Reddit Password Strength is: 28.2";
					writePasswordStrengthResultToFile(RedditPasswordStrength);
				}
				
			}else {
				System.out.println("Reddit Password Strength = 26.6");
				RedditPasswordStrength = "Reddit Password Strength is: 26.6";
				writePasswordStrengthResultToFile(RedditPasswordStrength);
			}
			
		}
		else {
			System.out.println("Reddit Password Strength = 19.9");
			RedditPasswordStrength = "Reddit Password Strength is: 19.9";
			writePasswordStrengthResultToFile(RedditPasswordStrength);
		}
		
	}
}
