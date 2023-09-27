package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.HavardScreens;


public class HavardPasswordStrengthChecker extends Base{

	String HavardUrl = "HavardUrl";
	String phone = "3143132824";
	String username;
	String email;
	int n = 5;
	String HavardPasswordStrength;
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
	public void HavardPwdStrengthChecker() throws Exception {
		propertiesFileLoad(HavardUrl);
		HavardUrl = lobConfigProp.getProperty("HavardUrl");
		 driver.get(HavardUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		HavardScreens executor = new HavardScreens(driver);
		
		executor.clickOnFirstYearStudentLink();
			
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerrypot" + numGenerator.getAlphaNumericString(n);
		email = username + "@gmail.com";

		executor.enterEmail(email);
		executor.reTypeEmail(email);
		
		//Execute test cases
				//Scenario 1: 
				scenarioOne = propertiesFileLoad(scenarioOne);
				executor.enterPassword(scenarioOne);
				executor.reTypePassword(scenarioOne);
				Thread.sleep(2000);
				
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("Scenario 2: Website does not accept scenario 1");
					
					//Scenario 2: 
					scenarioTwo = propertiesFileLoad(scenarioTwo);
					executor.clearPasswordField();
					executor.clearReTypePasswordField();
					executor.enterPassword(scenarioTwo);
					executor.reTypePassword(scenarioTwo);
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("Scenario 3: Website does not accept scenario 2");
						
						//Scenario 3: 
						scenarioThree = propertiesFileLoad(scenarioThree);
						executor.clearPasswordField();
						executor.clearReTypePasswordField();
						executor.enterPassword(scenarioThree);
						executor.reTypePassword(scenarioThree);
						
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 4: Website does not accept scenario 3");
							
							//Scenario 4: 
							scenarioFour = propertiesFileLoad(scenarioFour);
							executor.clearPasswordField();
							executor.clearReTypePasswordField();
							executor.enterPassword(scenarioFour);
							executor.reTypePassword(scenarioFour);
							
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 5: Website does not accept scenario 4");
								
								//Scenario 5: 
								scenarioFive = propertiesFileLoad(scenarioFive);
								executor.clearPasswordField();
								executor.clearReTypePasswordField();
								executor.enterPassword(scenarioFive);
								executor.reTypePassword(scenarioFive);
								
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 6: Website does not accept scenario 5");
									
									//Scenario 6: 
									scenarioSix = propertiesFileLoad(scenarioSix);
									executor.clearPasswordField();
									executor.clearReTypePasswordField();
									executor.enterPassword(scenarioSix);
									executor.reTypePassword(scenarioSix);
									
									Thread.sleep(2000);
									
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 7: Website does not accept scenario 6");
										
										//Scenario 7: 
										scenarioSeven = propertiesFileLoad(scenarioSeven);
										executor.clearPasswordField();
										executor.clearReTypePasswordField();
										executor.enterPassword(scenarioSeven);
										executor.reTypePassword(scenarioSeven);
										
										Thread.sleep(2000);
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("Scenario 8: Website does not accept scenario 7");
											
											//Scenario 8: 
											scenarioEight = propertiesFileLoad(scenarioEight);
											executor.clearPasswordField();
											executor.clearReTypePasswordField();
											executor.enterPassword(scenarioEight);
											executor.reTypePassword(scenarioEight);
											
											Thread.sleep(2000);
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("Scenario 9: Website does not accept scenario 8");
												
												//Scenario 9: 
												scenarioNine = propertiesFileLoad(scenarioNine);
												executor.clearPasswordField();
												executor.clearReTypePasswordField();
												executor.enterPassword(scenarioNine);
												executor.reTypePassword(scenarioNine);
												
												Thread.sleep(2000);
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("Scenario 10: Website does not accept scenario 9");
													
													//Scenario 10: 
													scenarioTen = propertiesFileLoad(scenarioTen);
													executor.clearPasswordField();
													executor.clearReTypePasswordField();
													executor.enterPassword(scenarioTen);
													executor.reTypePassword(scenarioTen);
													
													Thread.sleep(2000);
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("Scenario 11: Website does not accept scenario 10");
														
														//Scenario 11: 
														scenarioEleven = propertiesFileLoad(scenarioEleven);
														executor.clearPasswordField();
														executor.clearReTypePasswordField();
														executor.enterPassword(scenarioEleven);
														executor.reTypePassword(scenarioEleven);
														
														Thread.sleep(2000);
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("Scenario 12: Website does not accept scenario 11");
															
															//Scenario 12: 
															scenarioTwelve = propertiesFileLoad(scenarioTwelve);
															executor.clearPasswordField();
															executor.clearReTypePasswordField();
															executor.enterPassword(scenarioTwelve);
															executor.reTypePassword(scenarioTwelve);
															
															Thread.sleep(2000);
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("Scenario 13: Website does not accept scenario 12");
																
																//Scenario 13: 
																scenarioThirteen = propertiesFileLoad(scenarioThirteen);
																executor.clearPasswordField();
																executor.clearReTypePasswordField();
																executor.enterPassword(scenarioThirteen);
																executor.reTypePassword(scenarioThirteen);
																
																Thread.sleep(2000);
																if (executor.isElementPresent(executor.errorToast)) {
																	System.out.println("Scenario 14: Website does not accept scenario 13");
																	
																	//Scenario 14: 
																	scenarioFourteen = propertiesFileLoad(scenarioFourteen);
																	executor.clearPasswordField();
																	executor.clearReTypePasswordField();
																	executor.enterPassword(scenarioFourteen);
																	executor.reTypePassword(scenarioFourteen);
																	
																	Thread.sleep(2000);
																	if (executor.isElementPresent(executor.errorToast)) {
																		System.out.println("Scenario 15: Website does not accept scenario 14");
																		
																		//Scenario 15: 
																		scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																		executor.clearPasswordField();
																		executor.clearReTypePasswordField();
																		executor.enterPassword(scenarioFifteen);
																		executor.reTypePassword(scenarioFifteen);
																		
																		Thread.sleep(2000);
																		if (executor.isElementPresent(executor.errorToast)) {
																			System.out.println("Scenario 16: Website does not accept scenario 15");
																			
																			//Scenario 16: 
																			scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																			executor.clearPasswordField();
																			executor.clearReTypePasswordField();
																			executor.enterPassword(scenarioSixteen);
																			executor.reTypePassword(scenarioSixteen);
																			
																			Thread.sleep(2000);
																			if (executor.isElementPresent(executor.errorToast)) {
																				System.out.println("Scenario 17: Website does not accept scenario 16");
																				
																				//Scenario 17: 
																				scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																				executor.clearPasswordField();
																				executor.clearReTypePasswordField();
																				executor.enterPassword(scenarioSeventeen);
																				executor.reTypePassword(scenarioSeventeen);
																				
																				Thread.sleep(2000);
																				if (executor.isElementPresent(executor.errorToast)) {
																					System.out.println("Scenario 18: Website does not accept scenario 17");
																					
																					//Scenario 18: 
																					scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																					executor.clearPasswordField();
																					executor.clearReTypePasswordField();
																					executor.enterPassword(scenarioEighteen);
																					executor.reTypePassword(scenarioEighteen);
																					
																					Thread.sleep(2000);
																					if (executor.isElementPresent(executor.errorToast)) {
																						System.out.println("Scenario 19: Website does not accept scenario 18");
																						
																						//Scenario 19: 
																						scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																						executor.clearPasswordField();
																						executor.clearReTypePasswordField();
																						executor.enterPassword(scenarioNineteen);
																						executor.reTypePassword(scenarioNineteen);
																						
																						Thread.sleep(2000);
																						if (executor.isElementPresent(executor.errorToast)) {
																							System.out.println("Scenario 20: Website does not accept scenario 19");
																							
																							//Scenario 20: 
																							scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																							executor.clearPasswordField();
																							executor.clearReTypePasswordField();
																							executor.enterPassword(scenarioTwenty);
																							executor.reTypePassword(scenarioTwenty);
																							
																							Thread.sleep(2000);
																							if (executor.isElementPresent(executor.errorToast)) {
																								System.out.println("Scenario 21: Website does not accept scenario 20");
																								
																								//Scenario 21: 
																								scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																								executor.clearPasswordField();
																								executor.clearReTypePasswordField();
																								executor.enterPassword(scenarioTwentyOne);
																								executor.reTypePassword(scenarioTwentyOne);
																								
																								Thread.sleep(2000);
																								if (executor.isElementPresent(executor.errorToast)) {
																									System.out.println("Scenario 22: Website does not accept scenario 21");
																									
																									//Scenario 22: 
																									scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																									executor.clearPasswordField();
																									executor.clearReTypePasswordField();
																									executor.enterPassword(scenarioTwentyTwo);
																									executor.reTypePassword(scenarioTwentyTwo);
																									
																									Thread.sleep(2000);
																									if (executor.isElementPresent(executor.errorToast)) {
																										System.out.println("Scenario 23: Website does not accept scenario 22");
																										
																										//Scenario 23: 
																										scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																										executor.clearPasswordField();
																										executor.clearReTypePasswordField();
																										executor.enterPassword(scenarioTwentyThree);
																										executor.reTypePassword(scenarioTwentyThree);
																										
																										Thread.sleep(2000);
																										if (executor.isElementPresent(executor.errorToast)) {
																											System.out.println("Scenario 24: Website does not accept scenario 23");
																											
																											//Scenario 24: 
																											scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																											executor.clearPasswordField();
																											executor.clearReTypePasswordField();
																											executor.enterPassword(scenarioTwentyFour);
																											executor.reTypePassword(scenarioTwentyFour);
																											
																											Thread.sleep(2000);
																											HavardPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Havard Password Strength";			
																											writePasswordStrengthResultToFile(HavardPasswordStrength);
																										}else {
																											System.out.println("Havard Password Strength = 65.9");
																											HavardPasswordStrength = "Havard Password Strength is: 65.9";
																											writePasswordStrengthResultToFile(HavardPasswordStrength);
																										}
																									}else {
																										System.out.println("Havard Password Strength = 61.3");
																										HavardPasswordStrength = "Havard Password Strength is: 61.3";
																										writePasswordStrengthResultToFile(HavardPasswordStrength);
																									}
																								}else {
																									System.out.println("Havard Password Strength = 59.5");
																									HavardPasswordStrength = "Havard Password Strength is: 59.5";
																									writePasswordStrengthResultToFile(HavardPasswordStrength);
																								}
																							}else {
																								System.out.println("Havard Password Strength = 59.1");
																								HavardPasswordStrength = "Havard Password Strength is: 59.1";
																								writePasswordStrengthResultToFile(HavardPasswordStrength);
																							}
																						}else {
																							System.out.println("Havard Password Strength = 57.0");
																							HavardPasswordStrength = "Havard Password Strength is: 57.0";
																							writePasswordStrengthResultToFile(HavardPasswordStrength);
																						}
																					}else {
																						System.out.println("Havard Password Strength = 51.7");
																						HavardPasswordStrength = "Havard Password Strength is: 51.7";
																						writePasswordStrengthResultToFile(HavardPasswordStrength);
																					}
																				}else {
																					System.out.println("Havard Password Strength = 49.1");
																					HavardPasswordStrength = "Havard Password Strength is: 49.1";
																					writePasswordStrengthResultToFile(HavardPasswordStrength);
																				}
																			}else {
																				System.out.println("Havard Password Strength = 47.6");
																				HavardPasswordStrength = "Havard Password Strength is: 47.6";
																				writePasswordStrengthResultToFile(HavardPasswordStrength);
																			}
																		}else {
																			System.out.println("Havard Password Strength = 47.3");
																			HavardPasswordStrength = "Havard Password Strength is: 47.3";
																			writePasswordStrengthResultToFile(HavardPasswordStrength);
																		}
																	}else {
																		System.out.println("Havard Password Strength = 47.0");
																		HavardPasswordStrength = "Havard Password Strength is: 47.0";
																		writePasswordStrengthResultToFile(HavardPasswordStrength);
																	}
																}else {
																	System.out.println("Havard Password Strength = 45.6");
																	HavardPasswordStrength = "Havard Password Strength is: 45.6";
																	writePasswordStrengthResultToFile(HavardPasswordStrength);
																}
															}else {
										System.out.println("Havard Password Strength = 41.4");
										HavardPasswordStrength = "Havard Password Strength is: 41.4";
										writePasswordStrengthResultToFile(HavardPasswordStrength);
									}
							
								}else {
									System.out.println("Havard Password Strength = 39.5");
									HavardPasswordStrength = "Havard Password Strength is: 39.5";
									writePasswordStrengthResultToFile(HavardPasswordStrength);
								}
							}else {
								System.out.println("Havard Password Strength = 37.6");
								HavardPasswordStrength = "Havard Password Strength is: 37.6";
								writePasswordStrengthResultToFile(HavardPasswordStrength);
							}
						}else {
							System.out.println("Havard Password Strength = 36.8");
							HavardPasswordStrength = "Havard Password Strength is: 36.8";
							writePasswordStrengthResultToFile(HavardPasswordStrength);
						}
					}else {	
						System.out.println("Havard Password Strength = 35.7");
						HavardPasswordStrength = "Havard Password Strength is: 35.7";
						writePasswordStrengthResultToFile(HavardPasswordStrength);
					}
				}else {
					System.out.println("Havard Password Strength = 35.5");
					HavardPasswordStrength = "Havard Password Strength is: 35.5";
					writePasswordStrengthResultToFile(HavardPasswordStrength);
				}
			}else {
				System.out.println("Havard Password Strength = 34.2");
				HavardPasswordStrength = "Havard Password Strength is: 34.2";
				writePasswordStrengthResultToFile(HavardPasswordStrength);
			}
		}else {
			System.out.println("Havard Password Strength = 33.2");
			HavardPasswordStrength = "Havard Password Strength is: 33.2";
			writePasswordStrengthResultToFile(HavardPasswordStrength);
		}
	}else {
		System.out.println("Havard Password Strength = 31.0");
		HavardPasswordStrength = "Havard Password Strength is: 31.0";
		writePasswordStrengthResultToFile(HavardPasswordStrength);
	}
			}else {
			System.out.println("Havard Password Strength = 28.2");
			HavardPasswordStrength = "Havard Password Strength is: 28.2";
			writePasswordStrengthResultToFile(HavardPasswordStrength);
		}

	}else {
		System.out.println("Havard Password Strength = 26.6");
		HavardPasswordStrength = "Havard Password Strength is: 26.6";
		writePasswordStrengthResultToFile(HavardPasswordStrength);
		}

	}
	else {
	System.out.println("Havard Password Strength = 19.9");
	HavardPasswordStrength = "Havard Password Strength is: 19.9";
	writePasswordStrengthResultToFile(HavardPasswordStrength);
	}
		
	}
}
