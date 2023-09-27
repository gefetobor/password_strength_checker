package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.CunyScreens;


public class CunyPasswordStrengthChecker extends Base{

	String CunyUrl = "CunyUrl";
	String username;
	String email;
	String dob ;
	int n = 5;
	String CunyPasswordStrength;
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
	String scenarioFourteen = "scenarioFourteen";
	String scenarioFifteen = "scenarioFifteen";
	String scenarioSixteen = "scenarioSixteen";
	String scenarioSeventeen = "scenarioSeventeen";
	String scenarioEighteen = "scenarioEighteen";
	String scenarioNineteen = "scenarioNineteen";
	String scenarioTwenty = "scenarioTwenty";
	String scenarioTwentyOne = "scenarioTwentyOne";
	String scenarioTwentyTwo = "scenarioTwentyTwo";
	String scenarioTwentyThree = "scenarioTwentyThree";
	String scenarioTwentyFour = "scenarioTwentyFour";
	
	
	@Test
	public void CunyPwdStrengthChecker() throws Exception {
		propertiesFileLoad(CunyUrl);
		CunyUrl = lobConfigProp.getProperty("CunyUrl");
		 driver.get(CunyUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		CunyScreens executor = new CunyScreens(driver);

		GenericMethods numGenerator = new GenericMethods(driver);
		email = "Jerrypot" + numGenerator.getAlphaNumericString(n) + "@rocketmail.com";
		username = "Goodwills" + numGenerator.getAlphaNumericString(n);
		dob = "26/04/1991";
		
		executor.clickOnRegisterNowButton();
		
		executor.enterFirstname(username);
		executor.enterLastname(username);
		executor.enterDob(dob);
		executor.clickOnGenderDropdown();
		Thread.sleep(2000);
		executor.selectGender();
		Thread.sleep(2000);
		executor.enterEmail(email);
		executor.enterUsername(username);
		

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		Thread.sleep(2000); 
		
		executor.clickOnPasswordField();
		Thread.sleep(1000);
		executor.enterPassword(scenarioOne); 
		Thread.sleep(1000); 
		executor.clickOnConfirmPassword();
		Thread.sleep(3000); 

		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.clearPasswordField(); 
			Thread.sleep(1000); 
			executor.enterPassword(scenarioTwo);
			Thread.sleep(1000);
			executor.clickOnConfirmPassword();
			Thread.sleep(3000); 
		
			if (executor.isElementPresent(executor.errorToast)){
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.clearPasswordField(); 
				Thread.sleep(1000); 
				executor.enterPassword(scenarioThree);
				Thread.sleep(1000);
				executor.clickOnConfirmPassword();
				Thread.sleep(3000); 
				
				if (executor.isElementPresent(executor.errorToast)){
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.clearPasswordField(); 
					Thread.sleep(1000); 
					executor.enterPassword(scenarioFour);
					Thread.sleep(1000);
					executor.clickOnConfirmPassword();
					Thread.sleep(3000); 
					
					if (executor.isElementPresent(executor.errorToast)){
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.clearPasswordField(); 
						Thread.sleep(1000); 
						executor.enterPassword(scenarioFive);
						Thread.sleep(1000);
						executor.clickOnConfirmPassword();
						Thread.sleep(3000); 
						
						if (executor.isElementPresent(executor.errorToast)){
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.clearPasswordField(); 
							Thread.sleep(1000); 
							executor.enterPassword(scenarioSix);
							Thread.sleep(1000);
							executor.clickOnConfirmPassword();
							Thread.sleep(3000); 
							
							if (executor.isElementPresent(executor.errorToast)){
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.clearPasswordField(); 
								Thread.sleep(1000); 
								executor.enterPassword(scenarioSeven);
								Thread.sleep(1000);
								executor.clickOnConfirmPassword();
								Thread.sleep(3000); 
								
								if (executor.isElementPresent(executor.errorToast)){
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.clearPasswordField(); 
									Thread.sleep(1000); 
									executor.enterPassword(scenarioEight);
									Thread.sleep(1000);
									executor.clickOnConfirmPassword();
									Thread.sleep(3000); 
									
									if (executor.isElementPresent(executor.errorToast)){
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.clearPasswordField(); 
										Thread.sleep(1000); 
										executor.enterPassword(scenarioNine);
										Thread.sleep(1000);
										executor.clickOnConfirmPassword();
										Thread.sleep(3000); 
										
										if (executor.isElementPresent(executor.errorToast)){
											System.out.println("Scenario 10: Website does not accept scenario 9");
											
											//Scenario 10: 
											scenarioTen = propertiesFileLoad(scenarioTen);
											executor.clearPasswordField(); 
											Thread.sleep(1000); 
											executor.enterPassword(scenarioTen);
											Thread.sleep(1000);
											executor.clickOnConfirmPassword();
											Thread.sleep(3000); 
											
											if (executor.isElementPresent(executor.errorToast)){
												System.out.println("Scenario 11: Website does not accept scenario 10");
												
												//Scenario 11: 
												scenarioEleven = propertiesFileLoad(scenarioEleven);
												executor.clearPasswordField(); 
												Thread.sleep(1000); 
												executor.enterPassword(scenarioEleven);
												Thread.sleep(1000);
												executor.clickOnConfirmPassword();
												Thread.sleep(3000); 
												
												if (executor.isElementPresent(executor.errorToast)){
													System.out.println("Scenario 12: Website does not accept scenario 11");
													
													//Scenario 12: 
													scenarioTwelve = propertiesFileLoad(scenarioTwelve);
													executor.clearPasswordField(); 
													Thread.sleep(1000); 
													executor.enterPassword(scenarioTwelve);
													Thread.sleep(1000);
													executor.clickOnConfirmPassword();
													Thread.sleep(3000); 
													
													if (executor.isElementPresent(executor.errorToast)){
														System.out.println("Scenario 13: Website does not accept scenario 12");
														
														//Scenario 13: 
														scenarioThirteen = propertiesFileLoad(scenarioThirteen);
														executor.clearPasswordField(); 
														Thread.sleep(1000); 
														executor.enterPassword(scenarioThirteen);
														Thread.sleep(1000);
														executor.clickOnConfirmPassword();
														Thread.sleep(3000); 
														
														if (executor.isElementPresent(executor.errorToast)){
															System.out.println("Scenario 14: Website does not accept scenario 13");
															
															//Scenario 14: 
															scenarioFourteen = propertiesFileLoad(scenarioFourteen);
															executor.clearPasswordField(); 
															Thread.sleep(1000); 
															executor.enterPassword(scenarioFourteen);
															Thread.sleep(1000);
															executor.clickOnConfirmPassword();
															Thread.sleep(3000); 
															
															if (executor.isElementPresent(executor.errorToast)){
																System.out.println("Scenario 15: Website does not accept scenario 14");
																
																//Scenario 15: 
																scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																executor.clearPasswordField(); 
																Thread.sleep(1000); 
																executor.enterPassword(scenarioFifteen);
																Thread.sleep(1000);
																executor.clickOnConfirmPassword();
																Thread.sleep(3000); 
																
																if (executor.isElementPresent(executor.errorToast)){
																	System.out.println("Scenario 16: Website does not accept scenario 15");
																	
																	//Scenario 16: 
																	scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																	executor.clearPasswordField(); 
																	Thread.sleep(1000); 
																	executor.enterPassword(scenarioSixteen);
																	Thread.sleep(1000);
																	executor.clickOnConfirmPassword();
																	Thread.sleep(3000); 
																	
																	if (executor.isElementPresent(executor.errorToast)){
																		System.out.println("Scenario 17: Website does not accept scenario 16");
																		
																		//Scenario 17: 
																		scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																		executor.clearPasswordField(); 
																		Thread.sleep(1000); 
																		executor.enterPassword(scenarioSeventeen);
																		Thread.sleep(1000);
																		executor.clickOnConfirmPassword();
																		Thread.sleep(3000); 
																		
																		if (executor.isElementPresent(executor.errorToast)){
																			System.out.println("Scenario 18: Website does not accept scenario 17");
																			
																			//Scenario 18: 
																			scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																			executor.clearPasswordField(); 
																			Thread.sleep(1000); 
																			executor.enterPassword(scenarioEighteen);
																			Thread.sleep(1000);
																			executor.clickOnConfirmPassword();
																			Thread.sleep(3000); 
																			
																			if (executor.isElementPresent(executor.errorToast)){
																				System.out.println("Scenario 19: Website does not accept scenario 18");
																				
																				//Scenario 19: 
																				scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																				executor.clearPasswordField(); 
																				Thread.sleep(1000); 
																				executor.enterPassword(scenarioNineteen);
																				Thread.sleep(1000);
																				executor.clickOnConfirmPassword();
																				Thread.sleep(3000); 
																				
																				if (executor.isElementPresent(executor.errorToast)){
																					System.out.println("Scenario 20: Website does not accept scenario 19");
																					
																					//Scenario 20: 
																					scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																					executor.clearPasswordField(); 
																					Thread.sleep(1000); 
																					executor.enterPassword(scenarioTwenty);
																					Thread.sleep(1000);
																					executor.clickOnConfirmPassword();
																					Thread.sleep(3000); 
																					
																					if (executor.isElementPresent(executor.errorToast)){
																						System.out.println("Scenario 21: Website does not accept scenario 20");
																						
																						//Scenario 21: 
																						scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																						executor.clearPasswordField(); 
																						Thread.sleep(1000); 
																						executor.enterPassword(scenarioTwentyOne);
																						Thread.sleep(1000);
																						executor.clickOnConfirmPassword();
																						Thread.sleep(3000); 
																						
																						if (executor.isElementPresent(executor.errorToast)){
																							System.out.println("Scenario 22: Website does not accept scenario 21");
																							
																							//Scenario 22: 
																							scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																							executor.clearPasswordField(); 
																							Thread.sleep(1000); 
																							executor.enterPassword(scenarioTwentyTwo);
																							Thread.sleep(1000);
																							executor.clickOnConfirmPassword();
																							Thread.sleep(3000); 
																							
																							if (executor.isElementPresent(executor.errorToast)){
																								System.out.println("Scenario 23: Website does not accept scenario 22");
																								
																								//Scenario 23: 
																								scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																								executor.clearPasswordField(); 
																								Thread.sleep(1000); 
																								executor.enterPassword(scenarioTwentyThree);
																								Thread.sleep(1000);
																								executor.clickOnConfirmPassword();
																								Thread.sleep(3000); 
																								
																								if (executor.isElementPresent(executor.errorToast)){
																									System.out.println("Scenario 24: Website does not accept scenario 23");
																									
																									//Scenario 24: 
																									scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																									executor.clearPasswordField(); 
																									Thread.sleep(1000); 
																									executor.enterPassword(scenarioTwentyFour);
																									Thread.sleep(1000);
																									executor.clickOnConfirmPassword();
																									Thread.sleep(3000); 
																									
																									if (executor.isElementPresent(executor.errorToast)){
																										
																										CunyPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Cuny Password Strength";			
																										writePasswordStrengthResultToFile(CunyPasswordStrength);
																									
																									}else {
																										System.out.println("Cuny Password Strength = 65.9");
																										CunyPasswordStrength = "Cuny Password Strength is: 61.3";
																										writePasswordStrengthResultToFile(CunyPasswordStrength);
																									}	
																								}else {
																									System.out.println("Cuny Password Strength = 61.3");
																									CunyPasswordStrength = "Cuny Password Strength is: 61.3";
																									writePasswordStrengthResultToFile(CunyPasswordStrength);
																								}
																							}else {
																								System.out.println("Cuny Password Strength = 59.5");
																								CunyPasswordStrength = "Cuny Password Strength is: 59.5";
																								writePasswordStrengthResultToFile(CunyPasswordStrength);
																							}
																						}else {
																							System.out.println("Cuny Password Strength = 59.1");
																							CunyPasswordStrength = "Cuny Password Strength is: 59.1";
																							writePasswordStrengthResultToFile(CunyPasswordStrength);
																						}
																					}else {
																						System.out.println("Cuny Password Strength = 57.0");
																						CunyPasswordStrength = "Cuny Password Strength is: 57.0";
																						writePasswordStrengthResultToFile(CunyPasswordStrength);
																					}
																				}else {
																					System.out.println("Cuny Password Strength = 52.7");
																					CunyPasswordStrength = "Cuny Password Strength is: 52.7";
																					writePasswordStrengthResultToFile(CunyPasswordStrength);
																				}
																			}else {
																				System.out.println("Cuny Password Strength = 51.7");
																				CunyPasswordStrength = "Cuny Password Strength is: 51.7";
																				writePasswordStrengthResultToFile(CunyPasswordStrength);
																			}
																		}else {
																			System.out.println("Cuny Password Strength = 49.1");
																			CunyPasswordStrength = "Cuny Password Strength is: 49.1";
																			writePasswordStrengthResultToFile(CunyPasswordStrength);
																		}
																	}else {
																		System.out.println("Cuny Password Strength = 47.6");
																		CunyPasswordStrength = "Cuny Password Strength is: 47.6";
																		writePasswordStrengthResultToFile(CunyPasswordStrength);
																	}
																}else {
																	System.out.println("Cuny Password Strength = 47.3");
																	CunyPasswordStrength = "Cuny Password Strength is: 47.3";
																	writePasswordStrengthResultToFile(CunyPasswordStrength);
																}
															}else {
																System.out.println("Cuny Password Strength = 47.0");
																CunyPasswordStrength = "Cuny Password Strength is: 47.0";
																writePasswordStrengthResultToFile(CunyPasswordStrength);
															}
														}else {
															System.out.println("Cuny Password Strength = 45.6");
															CunyPasswordStrength = "Cuny Password Strength is: 45.6";
															writePasswordStrengthResultToFile(CunyPasswordStrength);
														}
													}else {
														System.out.println("Cuny Password Strength = 41.4");
														CunyPasswordStrength = "Cuny Password Strength is: 41.4";
														writePasswordStrengthResultToFile(CunyPasswordStrength);
													}
												}else {
													System.out.println("Cuny Password Strength = 39.5");
													CunyPasswordStrength = "Cuny Password Strength is: 39.5";
													writePasswordStrengthResultToFile(CunyPasswordStrength);
												}
											}else {
												System.out.println("Cuny Password Strength = 37.6");
												CunyPasswordStrength = "Cuny Password Strength is: 37.6";
												writePasswordStrengthResultToFile(CunyPasswordStrength);
											}
										}else {
											System.out.println("Cuny Password Strength = 36.8");
											CunyPasswordStrength = "Cuny Password Strength is: 36.8";
											writePasswordStrengthResultToFile(CunyPasswordStrength);
										}
									}else {	
										System.out.println("Cuny Password Strength = 35.7");
										CunyPasswordStrength = "Cuny Password Strength is: 35.7";
										writePasswordStrengthResultToFile(CunyPasswordStrength);
									}
								}else {
									System.out.println("Cuny Password Strength = 35.5");
									CunyPasswordStrength = "Cuny Password Strength is: 35.5";
									writePasswordStrengthResultToFile(CunyPasswordStrength);
								}
							}else {
								System.out.println("Cuny Password Strength = 34.2");
								CunyPasswordStrength = "Cuny Password Strength is: 34.2";
								writePasswordStrengthResultToFile(CunyPasswordStrength);
							}
						}else {
							System.out.println("Cuny Password Strength = 33.2");
							CunyPasswordStrength = "Cuny Password Strength is: 33.2";
							writePasswordStrengthResultToFile(CunyPasswordStrength);
						}
					}else {
						System.out.println("Cuny Password Strength = 31.0");
						CunyPasswordStrength = "Cuny Password Strength is: 31.0";
						writePasswordStrengthResultToFile(CunyPasswordStrength);
						}
				}else {
					System.out.println("Cuny Password Strength = 28.2");
					CunyPasswordStrength = "Cuny Password Strength is: 28.2";
					writePasswordStrengthResultToFile(CunyPasswordStrength);
				}			
			}else {
				System.out.println("Cuny Password Strength = 26.6");
				CunyPasswordStrength = "Cuny Password Strength is: 26.6";
				writePasswordStrengthResultToFile(CunyPasswordStrength);
				}		
		}else {
			System.out.println("Cuny Password Strength = 19.9");
			CunyPasswordStrength = "Cuny Password Strength is: 19.9";
			writePasswordStrengthResultToFile(CunyPasswordStrength);
			}			
	}
}
