package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.CambridgeScreens;


public class CambridgePasswordStrengthChecker extends Base{

	String CambridgeUrl = "CambridgeUrl";
	String username;
	String email;
	int n = 5;
	String CambridgePasswordStrength;
	String scenarioOne = "scenarioOne";
	String scenarioTwo = "scenarioTwo";
	String scenarioThree = "scenarioThree";
	String scenarioFour = "scenarioFour";
	String scenarioFive = "scenarioFive";
	String scenarioSix = "scenarioSix";
	String scenarioSeven = "scenarioSeven";
	String scenarioEight = "scenarioEight";
	String scenarioNine = "scenarioNine";
	String scenarioTen = "scenarioTen";
	String scenarioEleven = "scenarioEleven";
	String scenarioTwelve = "scenarioTwelve";
	String scenarioThirteen = "scenarioThirteen";
	
	
	@Test
	public void CambridgePwdStrengthChecker() throws Exception {
		propertiesFileLoad(CambridgeUrl);
		CambridgeUrl = lobConfigProp.getProperty("CambridgeUrl");
		 driver.get(CambridgeUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		CambridgeScreens executor = new CambridgeScreens(driver);
		
		// Click on the button that opens the new window
		executor.clickOnApplicationPortalLink();
		executor.clickOnRegisterUrl();
		
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerrypot" + numGenerator.getAlphaNumericString(n);
		email = username + "gmail.com";

		executor.enterEmail(email);
		
		//Execute test cases
				//Scenario 1: 
				scenarioOne = propertiesFileLoad(scenarioOne);
				executor.enterPassword(scenarioOne);
				executor.enterConfirmPassword(scenarioOne);
				executor.clickOnRegisterButton();
				Thread.sleep(2000);
				
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("Scenario 2: Website does not accept scenario 1");
					
					//Scenario 2: 
					scenarioTwo = propertiesFileLoad(scenarioTwo);
					executor.enterPassword(scenarioTwo);
					executor.enterConfirmPassword(scenarioTwo);
					executor.clickOnRegisterButton();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("Scenario 3: Website does not accept scenario 2");
						
						//Scenario 3: 
						scenarioThree = propertiesFileLoad(scenarioThree);
						executor.enterPassword(scenarioThree);
						executor.enterConfirmPassword(scenarioThree);
						executor.clickOnRegisterButton();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 4: Website does not accept scenario 3");
							
							//Scenario 4: 
							scenarioFour = propertiesFileLoad(scenarioFour);
							executor.enterPassword(scenarioFour);
							executor.enterConfirmPassword(scenarioFour);
							executor.clickOnRegisterButton();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 5: Website does not accept scenario 4");
								
								//Scenario 5: 
								scenarioFive = propertiesFileLoad(scenarioFive);
								executor.enterPassword(scenarioFive);
								executor.enterConfirmPassword(scenarioFive);
								executor.clickOnRegisterButton();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 6: Website does not accept scenario 5");
									
									//Scenario 6: 
									scenarioSix = propertiesFileLoad(scenarioSix);
									executor.enterPassword(scenarioSix);
									executor.enterConfirmPassword(scenarioSix);
									executor.clickOnRegisterButton();
									Thread.sleep(2000);
									
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 7: Website does not accept scenario 6");
										
										//Scenario 7: 
										scenarioSeven = propertiesFileLoad(scenarioSeven);
										executor.enterPassword(scenarioSeven);
										executor.enterConfirmPassword(scenarioSeven);
										executor.clickOnRegisterButton();
										Thread.sleep(2000);
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("Scenario 8: Website does not accept scenario 7");
											
											//Scenario 8: 
											scenarioEight = propertiesFileLoad(scenarioEight);
											executor.enterPassword(scenarioEight);
											executor.enterConfirmPassword(scenarioEight);
											executor.clickOnRegisterButton();
											Thread.sleep(2000);
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("Scenario 9: Website does not accept scenario 8");
												
												//Scenario 9: 
												scenarioNine = propertiesFileLoad(scenarioNine);
												executor.enterPassword(scenarioNine);
												executor.enterConfirmPassword(scenarioNine);
												executor.clickOnRegisterButton();
												Thread.sleep(2000);
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("Scenario 10: Website does not accept scenario 9");
													
													//Scenario 10: 
													scenarioTen = propertiesFileLoad(scenarioTen);
													executor.enterPassword(scenarioTen);
													executor.enterConfirmPassword(scenarioTen);
													executor.clickOnRegisterButton();
													Thread.sleep(2000);
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("Scenario 11: Website does not accept scenario 10");
														
														//Scenario 11: 
														scenarioEleven = propertiesFileLoad(scenarioEleven);
														executor.enterPassword(scenarioEleven);
														executor.enterConfirmPassword(scenarioEleven);
														executor.clickOnRegisterButton();
														Thread.sleep(2000);
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("Scenario 12: Website does not accept scenario 11");
															
															//Scenario 12: 
															scenarioTwelve = propertiesFileLoad(scenarioTwelve);
															executor.enterPassword(scenarioTwelve);
															executor.enterConfirmPassword(scenarioTwelve);
															executor.clickOnRegisterButton();
															Thread.sleep(2000);
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("Scenario 13: Website does not accept scenario 12");
																
																//Scenario 13: 
																scenarioThirteen = propertiesFileLoad(scenarioThirteen);
																executor.enterPassword(scenarioThirteen);
																executor.enterConfirmPassword(scenarioThirteen);
																executor.clickOnRegisterButton();
																Thread.sleep(2000);
																CambridgePasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Cambridge Password Strength";			
																writePasswordStrengthResultToFile(CambridgePasswordStrength);
															}else {
										System.out.println("Cambridge Password Strength = 52.7");
										CambridgePasswordStrength = "Cambridge Password Strength is: 52.7";
										writePasswordStrengthResultToFile(CambridgePasswordStrength);
									}
							
								}else {
									System.out.println("Cambridge Password Strength = 49.1");
									CambridgePasswordStrength = "Cambridge Password Strength is: 49.1";
									writePasswordStrengthResultToFile(CambridgePasswordStrength);
								}
							}else {
								System.out.println("Cambridge Password Strength = 47.6");
								CambridgePasswordStrength = "Cambridge Password Strength is: 47.6";
								writePasswordStrengthResultToFile(CambridgePasswordStrength);
							}
						}else {
							System.out.println("Cambridge Password Strength = 45.6");
							CambridgePasswordStrength = "Cambridge Password Strength is: 45.6";
							writePasswordStrengthResultToFile(CambridgePasswordStrength);
						}
					
					}else {
						
						System.out.println("Cambridge Password Strength = 41.4");
						CambridgePasswordStrength = "Cambridge Password Strength is: 41.4";
						writePasswordStrengthResultToFile(CambridgePasswordStrength);
					}
				}else {
					System.out.println("Cambridge Password Strength = 37.6");
					CambridgePasswordStrength = "Cambridge Password Strength is: 37.6";
					writePasswordStrengthResultToFile(CambridgePasswordStrength);
				}
			}else {
				System.out.println("Cambridge Password Strength = 36.8");
				CambridgePasswordStrength = "Cambridge Password Strength is: 36.8";
				writePasswordStrengthResultToFile(CambridgePasswordStrength);
			}
		}else {
			System.out.println("Cambridge Password Strength = 35.7");
			CambridgePasswordStrength = "Cambridge Password Strength is: 35.7";
			writePasswordStrengthResultToFile(CambridgePasswordStrength);
		}
	}else {
		System.out.println("Cambridge Password Strength = 35.5");
		CambridgePasswordStrength = "Cambridge Password Strength is: 35.5";
		writePasswordStrengthResultToFile(CambridgePasswordStrength);
	}
			}else {
			System.out.println("Cambridge Password Strength = 28.2");
			CambridgePasswordStrength = "Cambridge Password Strength is: 28.2";
			writePasswordStrengthResultToFile(CambridgePasswordStrength);
		}

	}else {
		System.out.println("Cambridge Password Strength = 26.6");
		CambridgePasswordStrength = "Cambridge Password Strength is: 26.6";
		writePasswordStrengthResultToFile(CambridgePasswordStrength);
		}

	}
	else {
	System.out.println("Cambridge Password Strength = 19.9");
	CambridgePasswordStrength = "Cambridge Password Strength is: 19.9";
	writePasswordStrengthResultToFile(CambridgePasswordStrength);
	}
		
	}
}
