package com.strength.checker;


import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.BaiduScreens;


public class BaiduPasswordStrengthChecker extends Base{

	String baiduUrl = "baiduUrl";
	String username = "chuhan325";
	String phone = "13910998899";
	int n = 5;
	String BaiduPasswordStrength;
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
	public void BaiduPwdStrengthChecker() throws Exception {
		propertiesFileLoad(baiduUrl);
		baiduUrl = lobConfigProp.getProperty("baiduUrl");
		 driver.get(baiduUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		BaiduScreens executor = new BaiduScreens(driver);
		
		// Click on the button that opens the new window
		executor.clickOnLogInButton();
		//Thread.sleep(10000);
		executor.clickOnSignUpButton();

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
		//Thread.sleep(2000);
		executor.enterUsernameField(username);

		executor.enterPhoneNumber(phone);

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		//executor.enterForm("1234");
		executor.clickOnUsernameField();
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
			executor.clickOnUsernameField();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.clearPasswordField();
				executor.enterPassword(scenarioThree);
				executor.clickOnUsernameField();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.clearPasswordField();
					executor.enterPassword(scenarioFour);
					executor.clickOnUsernameField();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.clearPasswordField();
						executor.enterPassword(scenarioFive);
						executor.clickOnUsernameField();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.clearPasswordField();
							executor.enterPassword(scenarioSix);
							executor.clickOnUsernameField();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.clearPasswordField();
								executor.enterPassword(scenarioSeven);
								executor.clickOnUsernameField();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.clearPasswordField();
									executor.enterPassword(scenarioEight);
									executor.clickOnUsernameField();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.clearPasswordField();
										executor.enterPassword(scenarioNine);
										executor.clickOnUsernameField();
										Thread.sleep(2000);
										BaiduPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Baidu Password Strength";			
										writePasswordStrengthResultToFile(BaiduPasswordStrength);
									}else {
										
										System.out.println("Baidu Password Strength = 52.7");
										BaiduPasswordStrength = "Baidu Password Strength is: 52.7";
										writePasswordStrengthResultToFile(BaiduPasswordStrength);
									}
								}else {
									System.out.println("Baidu Password Strength = 49.1");
									BaiduPasswordStrength = "Baidu Password Strength is: 49.1";
									writePasswordStrengthResultToFile(BaiduPasswordStrength);
								}
							}else {
								System.out.println("Baidu Password Strength = 47.6");
								BaiduPasswordStrength = "Baidu Password Strength is: 47.6";
								writePasswordStrengthResultToFile(BaiduPasswordStrength);
							}
						}else {
							System.out.println("Baidu Password Strength = 45.6");
							BaiduPasswordStrength = "Baidu Password Strength is: 45.6";
							writePasswordStrengthResultToFile(BaiduPasswordStrength);
						}
					}else {
						System.out.println("Baidu Password Strength = 37.6");
						BaiduPasswordStrength = "Baidu Password Strength is: 37.6";
						writePasswordStrengthResultToFile(BaiduPasswordStrength);
					}
				}else {
					System.out.println("Baidu Password Strength = 28.2");
					BaiduPasswordStrength = "Baidu Password Strength is: 28.2";
					writePasswordStrengthResultToFile(BaiduPasswordStrength);
				}
				
			}else {
				System.out.println("Baidu Password Strength = 26.6");
				BaiduPasswordStrength = "Baidu Password Strength is: 26.6";
				writePasswordStrengthResultToFile(BaiduPasswordStrength);
			}
			
		}
		else {
			System.out.println("Baidu Password Strength = 19.9");
			BaiduPasswordStrength = "Baidu Password Strength is: 19.9";
			writePasswordStrengthResultToFile(BaiduPasswordStrength);
		}
		
	}
}
