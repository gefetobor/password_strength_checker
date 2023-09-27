package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.ReverbScreens;


public class ReverbPasswordStrengthChecker extends Base{

	String ReverbUrl = "ReverbUrl";
	String username;
	String email;
	int n = 3;
	String ReverbPasswordStrength;
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
	String scenarioTwentyFive = "scenarioTwentyFive";
	String scenarioTwentySix = "scenarioTwentySix";
	String scenarioTwentySeven = "scenarioTwentySeven";
	String scenarioTwentyEight = "scenarioTwentyEight";
	String scenarioTwentyNine = "scenarioTwentyNine";
	
	
	@Test
	public void ReverbPwdStrengthChecker() throws Exception {
		propertiesFileLoad(ReverbUrl);
		ReverbUrl = lobConfigProp.getProperty("ReverbUrl");
		 driver.get(ReverbUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		ReverbScreens executor = new ReverbScreens(driver);
		
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerry" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		
		executor.clickOnSignUp();
		
		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterFirstname(username);
		executor.enterLastname(username);
		executor.enterEmail(email);
		executor.enterConfirmEmail(email);
		executor.enterPassword(scenarioOne);
		executor.clickOnAcceptTerms();
		Thread.sleep(5000);
		executor.clickOnSubmitButton();
		Thread.sleep(5000);
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.enterFirstname(username);
			executor.enterLastname(username);
			executor.enterEmail(email);
			executor.enterConfirmEmail(email);
			executor.enterPassword(scenarioOne);
			executor.clickOnAcceptTerms();
			Thread.sleep(10000);
			executor.clickOnSubmitButton();
			Thread.sleep(2000);
			
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.enterFirstname(username);
				executor.enterLastname(username);
				executor.enterEmail(email);
				executor.enterConfirmEmail(email);
				executor.enterPassword(scenarioOne);
				executor.clickOnAcceptTerms();
				executor.clickOnSubmitButton();
				Thread.sleep(2000);
				
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.enterFirstname(username);
					executor.enterLastname(username);
					executor.enterEmail(email);
					executor.enterConfirmEmail(email);
					executor.enterPassword(scenarioOne);
					executor.clickOnAcceptTerms();
					executor.clickOnSubmitButton();
					Thread.sleep(2000);
					
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.enterFirstname(username);
						executor.enterLastname(username);
						executor.enterEmail(email);
						executor.enterConfirmEmail(email);
						executor.enterPassword(scenarioOne);
						executor.clickOnAcceptTerms();
						executor.clickOnSubmitButton();
						Thread.sleep(2000);
						
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.enterFirstname(username);
							executor.enterLastname(username);
							executor.enterEmail(email);
							executor.enterConfirmEmail(email);
							executor.enterPassword(scenarioOne);
							executor.clickOnAcceptTerms();
							executor.clickOnSubmitButton();
							Thread.sleep(2000);
							
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.enterFirstname(username);
								executor.enterLastname(username);
								executor.enterEmail(email);
								executor.enterConfirmEmail(email);
								executor.enterPassword(scenarioOne);
								executor.clickOnAcceptTerms();
								executor.clickOnSubmitButton();
								Thread.sleep(2000);
								
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.enterFirstname(username);
									executor.enterLastname(username);
									executor.enterEmail(email);
									executor.enterConfirmEmail(email);
									executor.enterPassword(scenarioOne);
									executor.clickOnAcceptTerms();
									executor.clickOnSubmitButton();
									Thread.sleep(2000);
									
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.enterFirstname(username);
										executor.enterLastname(username);
										executor.enterEmail(email);
										executor.enterConfirmEmail(email);
										executor.enterPassword(scenarioOne);
										executor.clickOnAcceptTerms();
										executor.clickOnSubmitButton();
										Thread.sleep(2000);
										
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("Scenario 10: Website does not accept scenario 9");
											
											//Scenario 10: 
											scenarioTen = propertiesFileLoad(scenarioTen);
											executor.enterFirstname(username);
											executor.enterLastname(username);
											executor.enterEmail(email);
											executor.enterConfirmEmail(email);
											executor.enterPassword(scenarioOne);
											executor.clickOnAcceptTerms();
											executor.clickOnSubmitButton();
											Thread.sleep(2000);
											
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("Scenario 11: Website does not accept scenario 10");
												
												//Scenario 11: 
												scenarioEleven = propertiesFileLoad(scenarioEleven);
												executor.enterFirstname(username);
												executor.enterLastname(username);
												executor.enterEmail(email);
												executor.enterConfirmEmail(email);
												executor.enterPassword(scenarioOne);
												executor.clickOnAcceptTerms();
												executor.clickOnSubmitButton();
												Thread.sleep(2000);
												
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("Scenario 12: Website does not accept scenario 11");
													
													//Scenario 12: 
													scenarioTwelve = propertiesFileLoad(scenarioTwelve);
													executor.enterFirstname(username);
													executor.enterLastname(username);
													executor.enterEmail(email);
													executor.enterConfirmEmail(email);
													executor.enterPassword(scenarioOne);
													executor.clickOnAcceptTerms();
													executor.clickOnSubmitButton();
													Thread.sleep(2000);
													
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("Scenario 13: Website does not accept scenario 12");
														
														//Scenario 13: 
														scenarioThirteen = propertiesFileLoad(scenarioThirteen);
														executor.enterFirstname(username);
														executor.enterLastname(username);
														executor.enterEmail(email);
														executor.enterConfirmEmail(email);
														executor.enterPassword(scenarioOne);
														executor.clickOnAcceptTerms();
														executor.clickOnSubmitButton();
														Thread.sleep(2000);
														
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("Scenario 14: Website does not accept scenario 13");
															
															//Scenario 14: 
															scenarioFourteen = propertiesFileLoad(scenarioFourteen);
															executor.enterFirstname(username);
															executor.enterLastname(username);
															executor.enterEmail(email);
															executor.enterConfirmEmail(email);
															executor.enterPassword(scenarioOne);
															executor.clickOnAcceptTerms();
															executor.clickOnSubmitButton();
															Thread.sleep(2000);
															
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("Scenario 15: Website does not accept scenario 14");
																
																//Scenario 15: 
																scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																executor.enterFirstname(username);
																executor.enterLastname(username);
																executor.enterEmail(email);
																executor.enterConfirmEmail(email);
																executor.enterPassword(scenarioOne);
																executor.clickOnAcceptTerms();
																executor.clickOnSubmitButton();
																Thread.sleep(2000);
																
																if (executor.isElementPresent(executor.errorToast)) {
																	System.out.println("Scenario 16: Website does not accept scenario 15");
																	
																	//Scenario 16: 
																	scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																	executor.enterFirstname(username);
																	executor.enterLastname(username);
																	executor.enterEmail(email);
																	executor.enterConfirmEmail(email);
																	executor.enterPassword(scenarioOne);
																	executor.clickOnAcceptTerms();
																	executor.clickOnSubmitButton();
																	Thread.sleep(2000);
																	
																	if (executor.isElementPresent(executor.errorToast)) {
																		System.out.println("Scenario 17: Website does not accept scenario 16");
																		
																		//Scenario 17: 
																		scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																		executor.enterFirstname(username);
																		executor.enterLastname(username);
																		executor.enterEmail(email);
																		executor.enterConfirmEmail(email);
																		executor.enterPassword(scenarioOne);
																		executor.clickOnAcceptTerms();
																		executor.clickOnSubmitButton();
																		Thread.sleep(2000);
																		
																		if (executor.isElementPresent(executor.errorToast)) {
																			System.out.println("Scenario 18: Website does not accept scenario 17");
																			
																			//Scenario 18: 
																			scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																			executor.enterFirstname(username);
																			executor.enterLastname(username);
																			executor.enterEmail(email);
																			executor.enterConfirmEmail(email);
																			executor.enterPassword(scenarioOne);
																			executor.clickOnAcceptTerms();
																			executor.clickOnSubmitButton();
																			Thread.sleep(2000);
																			
																			if (executor.isElementPresent(executor.errorToast)) {
																				System.out.println("Scenario 19: Website does not accept scenario 18");
																				
																				//Scenario 19: 
																				scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																				executor.enterFirstname(username);
																				executor.enterLastname(username);
																				executor.enterEmail(email);
																				executor.enterConfirmEmail(email);
																				executor.enterPassword(scenarioOne);
																				executor.clickOnAcceptTerms();
																				executor.clickOnSubmitButton();
																				Thread.sleep(2000);
																				
																				if (executor.isElementPresent(executor.errorToast)) {
																					System.out.println("Scenario 20: Website does not accept scenario 19");
																					
																					//Scenario 20: 
																					scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																					executor.enterFirstname(username);
																					executor.enterLastname(username);
																					executor.enterEmail(email);
																					executor.enterConfirmEmail(email);
																					executor.enterPassword(scenarioOne);
																					executor.clickOnAcceptTerms();
																					executor.clickOnSubmitButton();
																					Thread.sleep(2000);
																					if (executor.isElementPresent(executor.errorToast)) {
																						System.out.println("Scenario 21: Website does not accept scenario 20");
																						
																						//Scenario 21: 
																						scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																						executor.enterFirstname(username);
																						executor.enterLastname(username);
																						executor.enterEmail(email);
																						executor.enterConfirmEmail(email);
																						executor.enterPassword(scenarioOne);
																						executor.clickOnAcceptTerms();
																						executor.clickOnSubmitButton();
																						Thread.sleep(2000);
																						if (executor.isElementPresent(executor.errorToast)) {
																							System.out.println("Scenario 22: Website does not accept scenario 21");
																							
																							//Scenario 22: 
																							scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																							executor.enterFirstname(username);
																							executor.enterLastname(username);
																							executor.enterEmail(email);
																							executor.enterConfirmEmail(email);
																							executor.enterPassword(scenarioOne);
																							executor.clickOnAcceptTerms();
																							executor.clickOnSubmitButton();
																							Thread.sleep(2000);
																							if (executor.isElementPresent(executor.errorToast)) {
																								System.out.println("Scenario 23: Website does not accept scenario 22");
																								
																								//Scenario 23: 
																								scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																								executor.enterFirstname(username);
																								executor.enterLastname(username);
																								executor.enterEmail(email);
																								executor.enterConfirmEmail(email);
																								executor.enterPassword(scenarioOne);
																								executor.clickOnAcceptTerms();
																								executor.clickOnSubmitButton();
																								Thread.sleep(2000);
																								if (executor.isElementPresent(executor.errorToast)) {
																									System.out.println("Scenario 24: Website does not accept scenario 23");
																									
																									//Scenario 24: 
																									scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																									executor.enterFirstname(username);
																									executor.enterLastname(username);
																									executor.enterEmail(email);
																									executor.enterConfirmEmail(email);
																									executor.enterPassword(scenarioOne);
																									executor.clickOnAcceptTerms();
																									executor.clickOnSubmitButton();
																									Thread.sleep(2000);
																									
																									if (executor.isElementPresent(executor.errorToast)) {
																										System.out.println("Scenario 25: Website does not accept scenario 24");
																										
																										//Scenario 25: 
																										scenarioTwentyFive = propertiesFileLoad(scenarioTwentyFive);
																										executor.enterFirstname(username);
																										executor.enterLastname(username);
																										executor.enterEmail(email);
																										executor.enterConfirmEmail(email);
																										executor.enterPassword(scenarioOne);
																										executor.clickOnAcceptTerms();
																										executor.clickOnSubmitButton();
																										Thread.sleep(2000);
																										
																										if (executor.isElementPresent(executor.errorToast)) {
																											System.out.println("Scenario 26: Website does not accept scenario 25");
																											
																											//Scenario 26: 
																											scenarioTwentySix = propertiesFileLoad(scenarioTwentySix);
																											executor.enterFirstname(username);
																											executor.enterLastname(username);
																											executor.enterEmail(email);
																											executor.enterConfirmEmail(email);
																											executor.enterPassword(scenarioOne);
																											executor.clickOnAcceptTerms();
																											executor.clickOnSubmitButton();
																											Thread.sleep(2000);
																											
																											if (executor.isElementPresent(executor.errorToast)) {
																												System.out.println("Scenario 27: Website does not accept scenario 26");
																												
																												//Scenario 27: 
																												scenarioTwentySeven = propertiesFileLoad(scenarioTwentySeven);
																												executor.enterFirstname(username);
																												executor.enterLastname(username);
																												executor.enterEmail(email);
																												executor.enterConfirmEmail(email);
																												executor.enterPassword(scenarioOne);
																												executor.clickOnAcceptTerms();
																												executor.clickOnSubmitButton();
																												Thread.sleep(2000);
																												
																												if (executor.isElementPresent(executor.errorToast)) {
																													System.out.println("Scenario 28: Website does not accept scenario 27");
																													
																													//Scenario 28: 
																													scenarioTwentyEight = propertiesFileLoad(scenarioTwentyEight);
																													executor.enterFirstname(username);
																													executor.enterLastname(username);
																													executor.enterEmail(email);
																													executor.enterConfirmEmail(email);
																													executor.enterPassword(scenarioOne);
																													executor.clickOnAcceptTerms();
																													executor.clickOnSubmitButton();
																													Thread.sleep(2000);
																													
																													if (executor.isElementPresent(executor.errorToast)) {
																														System.out.println("Scenario 29: Website does not accept scenario 28");
																														
																														//Scenario 29: 
																														scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																														executor.enterFirstname(username);
																														executor.enterLastname(username);
																														executor.enterEmail(email);
																														executor.enterConfirmEmail(email);
																														executor.enterPassword(scenarioOne);
																														executor.clickOnAcceptTerms();
																														executor.clickOnSubmitButton();
																														Thread.sleep(2000);
																														
																														if (executor.isElementPresent(executor.errorToast)) {
																														ReverbPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Reverb Password Strength";			
																														writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																													}else {
																														System.out.println("Reverb Password Strength = 79.1");
																														ReverbPasswordStrength = "Reverb Password Strength is: 79.1";
																														writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																													}
																												}else {
																													System.out.println("Reverb Password Strength = 71.4");
																													ReverbPasswordStrength = "Reverb Password Strength is: 71.4";
																													writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);	
																												}
																											}else {
																												System.out.println("Reverb Password Strength = 70.9");
																												ReverbPasswordStrength = "Reverb Password Strength is: 70.9";
																												writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);		
																											}
																										}else {
																											System.out.println("Reverb Password Strength = 68.4");
																											ReverbPasswordStrength = "Reverb Password Strength is: 68.4";
																											writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);			
																										}
																									}else {
																										System.out.println("Reverb Password Strength = 65.9");
																										ReverbPasswordStrength = "Reverb Password Strength is: 65.9";
																										writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																									}
																								}else {
																									System.out.println("Reverb Password Strength = 62.0");
																									ReverbPasswordStrength = "Reverb Password Strength is: 62.0";
																									writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																								}	
																							}else {
																								System.out.println("Reverb Password Strength = 61.3");
																								ReverbPasswordStrength = "Reverb Password Strength is: 61.3";
																								writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																							}
																						}else {
																							System.out.println("Reverb Password Strength = 59.5");
																							ReverbPasswordStrength = "Reverb Password Strength is: 59.5";
																							writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																						}
																					}else {
																						System.out.println("Reverb Password Strength = 59.1");
																						ReverbPasswordStrength = "Reverb Password Strength is: 59.1";
																						writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																					}
																				}else {
																					System.out.println("Reverb Password Strength = 57.0");
																					ReverbPasswordStrength = "Reverb Password Strength is: 57.0";
																					writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																				}
																			}else {
																				System.out.println("Reverb Password Strength = 52.7");
																				ReverbPasswordStrength = "Reverb Password Strength is: 52.7";
																				writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																			}
																		}else {
																			System.out.println("Reverb Password Strength = 51.7");
																			ReverbPasswordStrength = "Reverb Password Strength is: 51.7";
																			writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																		}
																	}else {
																		System.out.println("Reverb Password Strength = 49.1");
																		ReverbPasswordStrength = "Reverb Password Strength is: 49.1";
																		writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																	}
																}else {
																	System.out.println("Reverb Password Strength = 47.6");
																	ReverbPasswordStrength = "Reverb Password Strength is: 47.6";
																	writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
																}
															}else {
																System.out.println("Reverb Password Strength = 47.3");
																ReverbPasswordStrength = "Reverb Password Strength is: 47.3";
																writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
															}
														}else {
															System.out.println("Reverb Password Strength = 47.0");
															ReverbPasswordStrength = "Reverb Password Strength is: 47.0";
															writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
														}
													}else {
														System.out.println("Reverb Password Strength = 45.6");
														ReverbPasswordStrength = "Reverb Password Strength is: 45.6";
														writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
													}
												}else {
													System.out.println("Reverb Password Strength = 41.4");
													ReverbPasswordStrength = "Reverb Password Strength is: 41.4";
													writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
												}
											}else {
												System.out.println("Reverb Password Strength = 39.5");
												ReverbPasswordStrength = "Reverb Password Strength is: 39.5";
												writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
											}
										}else {
											System.out.println("Reverb Password Strength = 37.6");
											ReverbPasswordStrength = "Reverb Password Strength is: 37.6";
											writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
										}
									}else {
										System.out.println("Reverb Password Strength = 36.8");
										ReverbPasswordStrength = "Reverb Password Strength is: 36.8";
										writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
									}
								}else {	
									System.out.println("Reverb Password Strength = 35.7");
									ReverbPasswordStrength = "Reverb Password Strength is: 35.7";
									writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
								}
							}else {
								System.out.println("Reverb Password Strength = 35.5");
								ReverbPasswordStrength = "Reverb Password Strength is: 35.5";
								writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
							}
						}else {
							System.out.println("Reverb Password Strength = 34.2");
							ReverbPasswordStrength = "Reverb Password Strength is: 34.2";
							writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
						}
					}else {
						System.out.println("Reverb Password Strength = 33.2");
						ReverbPasswordStrength = "Reverb Password Strength is: 33.2";
						writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
					}
				}else {
					System.out.println("Reverb Password Strength = 31.0");
					ReverbPasswordStrength = "Reverb Password Strength is: 31.0";
					writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
					}
			}else {
				System.out.println("Reverb Password Strength = 28.2");
				ReverbPasswordStrength = "Reverb Password Strength is: 28.2";
				writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
			}			
		}else {
			System.out.println("Reverb Password Strength = 26.6");
			ReverbPasswordStrength = "Reverb Password Strength is: 26.6";
			writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
			}		
	}else {
		System.out.println("Reverb Password Strength = 19.9");
		ReverbPasswordStrength = "Reverb Password Strength is: 19.9";
		writePasswordStrengthResultToFile(ReverbPasswordStrength);
					writePasswordStrengthResultToFile("Account created: " + email);
		}			
}
}
