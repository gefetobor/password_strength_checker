package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.WordpressScreens;


public class WordpressPasswordStrengthChecker extends Base{

	String WordpressUrl = "WordpressUrl";
	String username;
	String email;
	int n = 3;
	String WordpressPasswordStrength;
	String blocklistScenarioOne = "blocklistScenarioOne";
	String blocklistScenarioTwo = "blocklistScenarioTwo";
	String blocklistScenarioThree = "blocklistScenarioThree";
	String blocklistScenarioFour = "blocklistScenarioFour";
	String blocklistScenarioFive = "blocklistScenarioFive";
	String blocklistScenarioSix = "blocklistScenarioSix";
	String blocklistScenarioSeven = "blocklistScenarioSeven";
	String blocklistScenarioEight = "blocklistScenarioEight";
	String blocklistScenarioNine = "blocklistScenarioNine";
	String blocklistScenarioTen = "blocklistScenarioTen";
	String blocklistScenarioEleven = "blocklistScenarioEleven";
	String blocklistScenarioTwelve = "blocklistScenarioTwelve";
	String blocklistScenarioThirteen = "blocklistScenarioThirteen";
	String blocklistScenarioFourteen = "blocklistScenarioFourteen";
	String blocklistScenarioFifteen = "blocklistScenarioFifteen";
	String blocklistScenarioSixteen = "blocklistScenarioSixteen";
	String blocklistScenarioSeventeen = "blocklistScenarioSeventeen";
	String blocklistScenarioEighteen = "blocklistScenarioEighteen";
	String blocklistScenarioNineteen = "blocklistScenarioNineteen";
	String blocklistScenarioTwenty = "blocklistScenarioTwenty";
	String blocklistScenarioTwentyOne = "blocklistScenarioTwentyOne";
	String blocklistScenarioTwentyTwo = "blocklistScenarioTwentyTwo";
	String blocklistScenarioTwentyThree = "blocklistScenarioTwentyThree";
	String blocklistScenarioTwentyFour = "blocklistScenarioTwentyFour";
	String blocklistScenarioTwentyFive = "blocklistScenarioTwentyFive";
	String blocklistScenarioTwentySix = "blocklistScenarioTwentySix";
	String blocklistScenarioTwentySeven = "blocklistScenarioTwentySeven";
	String blocklistScenarioTwentyEight = "blocklistScenarioTwentyEight";
	String blocklistScenarioTwentyNine = "blocklistScenarioTwentyNine";
	
	
	@Test
	public void WordpressPwdStrengthChecker() throws Exception {
		propertiesFileLoad(WordpressUrl);
		WordpressUrl = lobConfigProp.getProperty("WordpressUrl");
		 driver.get(WordpressUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		WordpressScreens executor = new WordpressScreens(driver);
		
		//executor.clickOnAcceptCookies(); 
		
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerry" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		WebDriverWait w = new WebDriverWait(driver, 10);
        w.until(ExpectedConditions
                .presenceOfElementLocated(executor.acceptCookies));
        
		executor.clickOnAcceptCookies();
		executor.enterEmail(email);
		executor.enterUsername(username);
		//Execute test cases
		//blocklistScenario 1: 
		blocklistScenarioOne = propertiesFileLoad(blocklistScenarioOne);
		executor.enterPassword(blocklistScenarioOne);
		executor.clickOnEmailField();
		Thread.sleep(2000);
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("blocklistScenario 2: Website does not accept blocklistScenario 1");
			
			//blocklistScenario 2: 
			blocklistScenarioTwo = propertiesFileLoad(blocklistScenarioTwo);
			executor.clearPasswordField();
			executor.enterPassword(blocklistScenarioTwo);
			executor.clickOnEmailField();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("blocklistScenario 3: Website does not accept blocklistScenario 2");
				
				//blocklistScenario 3: 
				blocklistScenarioThree = propertiesFileLoad(blocklistScenarioThree);
				executor.clearPasswordField();
				executor.enterPassword(blocklistScenarioThree);
				executor.clickOnEmailField();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("blocklistScenario 4: Website does not accept blocklistScenario 3");
					
					//blocklistScenario 4: 
					blocklistScenarioFour = propertiesFileLoad(blocklistScenarioFour);
					executor.clearPasswordField();
					executor.enterPassword(blocklistScenarioFour);
					executor.clickOnEmailField();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("blocklistScenario 5: Website does not accept blocklistScenario 4");
						
						//blocklistScenario 5: 
						blocklistScenarioFive = propertiesFileLoad(blocklistScenarioFive);
						executor.clearPasswordField();
						executor.enterPassword(blocklistScenarioFive);
						executor.clickOnEmailField();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("blocklistScenario 6: Website does not accept blocklistScenario 5");
							
							//blocklistScenario 6: 
							blocklistScenarioSix = propertiesFileLoad(blocklistScenarioSix);
							executor.clearPasswordField();
							executor.enterPassword(blocklistScenarioSix);
							executor.clickOnEmailField();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("blocklistScenario 7: Website does not accept blocklistScenario 6");
								
								//blocklistScenario 7: 
								blocklistScenarioSeven = propertiesFileLoad(blocklistScenarioSeven);
								executor.clearPasswordField();
								executor.enterPassword(blocklistScenarioSeven);
								executor.clickOnEmailField();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("blocklistScenario 8: Website does not accept blocklistScenario 7");
									
									//blocklistScenario 8: 
									blocklistScenarioEight = propertiesFileLoad(blocklistScenarioEight);
									executor.clearPasswordField();
									executor.enterPassword(blocklistScenarioEight);
									executor.clickOnEmailField();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("blocklistScenario 9: Website does not accept blocklistScenario 8");
										
										//blocklistScenario 9: 
										blocklistScenarioNine = propertiesFileLoad(blocklistScenarioNine);
										executor.clearPasswordField();
										executor.enterPassword(blocklistScenarioNine);
										executor.clickOnEmailField();
										Thread.sleep(2000);
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("blocklistScenario 10: Website does not accept blocklistScenario 9");
											
											//blocklistScenario 10: 
											blocklistScenarioTen = propertiesFileLoad(blocklistScenarioTen);
											executor.clearPasswordField();
											executor.enterPassword(blocklistScenarioTen);
											executor.clickOnEmailField();
											Thread.sleep(2000);
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("blocklistScenario 11: Website does not accept blocklistScenario 10");
												
												//blocklistScenario 11: 
												blocklistScenarioEleven = propertiesFileLoad(blocklistScenarioEleven);
												executor.clearPasswordField();
												executor.enterPassword(blocklistScenarioEleven);
												executor.clickOnEmailField();
												Thread.sleep(2000);
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("blocklistScenario 12: Website does not accept blocklistScenario 11");
													
													//blocklistScenario 12: 
													blocklistScenarioTwelve = propertiesFileLoad(blocklistScenarioTwelve);
													executor.clearPasswordField();
													executor.enterPassword(blocklistScenarioTwelve);
													executor.clickOnEmailField();
													Thread.sleep(2000);
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("blocklistScenario 13: Website does not accept blocklistScenario 12");
														
														//blocklistScenario 13: 
														blocklistScenarioThirteen = propertiesFileLoad(blocklistScenarioThirteen);
														executor.clearPasswordField();
														executor.enterPassword(blocklistScenarioThirteen);
														executor.clickOnEmailField();
														Thread.sleep(2000);
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("blocklistScenario 14: Website does not accept blocklistScenario 13");
															
															//blocklistScenario 14: 
															blocklistScenarioFourteen = propertiesFileLoad(blocklistScenarioFourteen);
															executor.clearPasswordField();
															executor.enterPassword(blocklistScenarioFourteen);
															executor.clickOnEmailField();
															Thread.sleep(2000);
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("blocklistScenario 15: Website does not accept blocklistScenario 14");
																
																//blocklistScenario 15: 
																blocklistScenarioFifteen = propertiesFileLoad(blocklistScenarioFifteen);
																executor.clearPasswordField();
																executor.enterPassword(blocklistScenarioFifteen);
																executor.clickOnEmailField();
																Thread.sleep(2000);
																if (executor.isElementPresent(executor.errorToast)) {
																	System.out.println("blocklistScenario 16: Website does not accept blocklistScenario 15");
																	
																	//blocklistScenario 16: 
																	blocklistScenarioSixteen = propertiesFileLoad(blocklistScenarioSixteen);
																	executor.clearPasswordField();
																	executor.enterPassword(blocklistScenarioSixteen);
																	executor.clickOnEmailField();
																	Thread.sleep(2000);
																	if (executor.isElementPresent(executor.errorToast)) {
																		System.out.println("blocklistScenario 17: Website does not accept blocklistScenario 16");
																		
																		//blocklistScenario 17: 
																		blocklistScenarioSeventeen = propertiesFileLoad(blocklistScenarioSeventeen);
																		executor.clearPasswordField();
																		executor.enterPassword(blocklistScenarioSeventeen);
																		executor.clickOnEmailField();
																		Thread.sleep(2000);
																		if (executor.isElementPresent(executor.errorToast)) {
																			System.out.println("blocklistScenario 18: Website does not accept blocklistScenario 17");
																			
																			//blocklistScenario 18: 
																			blocklistScenarioEighteen = propertiesFileLoad(blocklistScenarioEighteen);
																			executor.clearPasswordField();
																			executor.enterPassword(blocklistScenarioEighteen);
																			executor.clickOnEmailField();
																			Thread.sleep(2000);
																			if (executor.isElementPresent(executor.errorToast)) {
																				System.out.println("blocklistScenario 19: Website does not accept blocklistScenario 18");
																				
																				//blocklistScenario 19: 
																				blocklistScenarioNineteen = propertiesFileLoad(blocklistScenarioNineteen);
																				executor.clearPasswordField();
																				executor.enterPassword(blocklistScenarioNineteen);
																				executor.clickOnEmailField();
																				Thread.sleep(2000);
																				if (executor.isElementPresent(executor.errorToast)) {
																					System.out.println("blocklistScenario 20: Website does not accept blocklistScenario 19");
																					
																					//blocklistScenario 20: 
																					blocklistScenarioTwenty = propertiesFileLoad(blocklistScenarioTwenty);
																					executor.clearPasswordField();
																					executor.enterPassword(blocklistScenarioTwenty);
																					executor.clickOnEmailField();
																					Thread.sleep(2000);
																					if (executor.isElementPresent(executor.errorToast)) {
																						System.out.println("blocklistScenario 21: Website does not accept blocklistScenario 20");
																						
																						//blocklistScenario 21: 
																						blocklistScenarioTwentyOne = propertiesFileLoad(blocklistScenarioTwentyOne);
																						executor.clearPasswordField();
																						executor.enterPassword(blocklistScenarioTwentyOne);
																						executor.clickOnEmailField();
																						Thread.sleep(2000);
																						if (executor.isElementPresent(executor.errorToast)) {
																							System.out.println("blocklistScenario 22: Website does not accept blocklistScenario 21");
																							
																							//blocklistScenario 22: 
																							blocklistScenarioTwentyTwo = propertiesFileLoad(blocklistScenarioTwentyTwo);
																							executor.clearPasswordField();
																							executor.enterPassword(blocklistScenarioTwentyTwo);
																							executor.clickOnEmailField();
																							Thread.sleep(2000);
																							if (executor.isElementPresent(executor.errorToast)) {
																								System.out.println("blocklistScenario 23: Website does not accept blocklistScenario 22");
																								
																								//blocklistScenario 23: 
																								blocklistScenarioTwentyThree = propertiesFileLoad(blocklistScenarioTwentyThree);
																								executor.clearPasswordField();
																								executor.enterPassword(blocklistScenarioTwentyThree);
																								executor.clickOnEmailField();
																								Thread.sleep(2000);
																								if (executor.isElementPresent(executor.errorToast)) {
																									System.out.println("blocklistScenario 24: Website does not accept blocklistScenario 23");
																									
																									//blocklistScenario 24: 
																									blocklistScenarioTwentyFour = propertiesFileLoad(blocklistScenarioTwentyFour);
																									executor.clearPasswordField();
																									executor.enterPassword(blocklistScenarioTwentyFour);
																									executor.clickOnEmailField();
																									Thread.sleep(2000);
																									
																									if (executor.isElementPresent(executor.errorToast)) {
																										System.out.println("blocklistScenario 25: Website does not accept blocklistScenario 24");
																										
																										//blocklistScenario 25: 
																										blocklistScenarioTwentyFive = propertiesFileLoad(blocklistScenarioTwentyFive);
																										executor.clearPasswordField();
																										executor.enterPassword(blocklistScenarioTwentyFive);
																										executor.clickOnEmailField();
																										Thread.sleep(2000);
																										
																										if (executor.isElementPresent(executor.errorToast)) {
																											System.out.println("blocklistScenario 26: Website does not accept blocklistScenario 25");
																											
																											//blocklistScenario 26: 
																											blocklistScenarioTwentySix = propertiesFileLoad(blocklistScenarioTwentySix);
																											executor.clearPasswordField();
																											executor.enterPassword(blocklistScenarioTwentySix);
																											executor.clickOnEmailField();
																											Thread.sleep(2000);
																											
																											if (executor.isElementPresent(executor.errorToast)) {
																												System.out.println("blocklistScenario 27: Website does not accept blocklistScenario 26");
																												
																												//blocklistScenario 27: 
																												blocklistScenarioTwentySeven = propertiesFileLoad(blocklistScenarioTwentySeven);
																												executor.clearPasswordField();
																												executor.enterPassword(blocklistScenarioTwentySeven);
																												executor.clickOnEmailField();
																												Thread.sleep(2000);
																												
																												if (executor.isElementPresent(executor.errorToast)) {
																													System.out.println("blocklistScenario 28: Website does not accept blocklistScenario 27");
																													
																													//blocklistScenario 28: 
																													blocklistScenarioTwentyEight = propertiesFileLoad(blocklistScenarioTwentyEight);
																													executor.clearPasswordField();
																													executor.enterPassword(blocklistScenarioTwentyEight);
																													executor.clickOnEmailField();
																													Thread.sleep(2000);
																													
																													if (executor.isElementPresent(executor.errorToast)) {
																														System.out.println("blocklistScenario 29: Website does not accept blocklistScenario 28");
																														
																														//blocklistScenario 29: 
																														blocklistScenarioTwentyNine = propertiesFileLoad(blocklistScenarioTwentyNine);
																														executor.clearPasswordField();
																														executor.enterPassword(blocklistScenarioTwentyNine);
																														executor.clickOnEmailField();
																														Thread.sleep(2000);
																														
																														if (executor.isElementPresent(executor.errorToast)) {
																														WordpressPasswordStrength = "blocklistScenarios Not Sufficient. Need more blocklistScenarios to determine Wordpress Password Strength";			
																														writePasswordStrengthResultToFile(WordpressPasswordStrength);
																													}else {
																														System.out.println("Wordpress Password Strength = 79.1");
																														WordpressPasswordStrength = "Wordpress Password Strength is: 79.1";
																														writePasswordStrengthResultToFile(WordpressPasswordStrength);
																													}
																												}else {
																													System.out.println("Wordpress Password Strength = 71.4");
																													WordpressPasswordStrength = "Wordpress Password Strength is: 71.4";
																													writePasswordStrengthResultToFile(WordpressPasswordStrength);	
																												}
																											}else {
																												System.out.println("Wordpress Password Strength = 70.9");
																												WordpressPasswordStrength = "Wordpress Password Strength is: 70.9";
																												writePasswordStrengthResultToFile(WordpressPasswordStrength);		
																											}
																										}else {
																											System.out.println("Wordpress Password Strength = 68.4");
																											WordpressPasswordStrength = "Wordpress Password Strength is: 68.4";
																											writePasswordStrengthResultToFile(WordpressPasswordStrength);			
																										}
																									}else {
																										System.out.println("Wordpress Password Strength = 65.9");
																										WordpressPasswordStrength = "Wordpress Password Strength is: 65.9";
																										writePasswordStrengthResultToFile(WordpressPasswordStrength);
																									}
																								}else {
																									System.out.println("Wordpress Password Strength = 62.0");
																									WordpressPasswordStrength = "Wordpress Password Strength is: 62.0";
																									writePasswordStrengthResultToFile(WordpressPasswordStrength);
																								}	
																							}else {
																								System.out.println("Wordpress Password Strength = 61.3");
																								WordpressPasswordStrength = "Wordpress Password Strength is: 61.3";
																								writePasswordStrengthResultToFile(WordpressPasswordStrength);
																							}
																						}else {
																							System.out.println("Wordpress Password Strength = 59.5");
																							WordpressPasswordStrength = "Wordpress Password Strength is: 59.5";
																							writePasswordStrengthResultToFile(WordpressPasswordStrength);
																						}
																					}else {
																						System.out.println("Wordpress Password Strength = 59.1");
																						WordpressPasswordStrength = "Wordpress Password Strength is: 59.1";
																						writePasswordStrengthResultToFile(WordpressPasswordStrength);
																					}
																				}else {
																					System.out.println("Wordpress Password Strength = 57.0");
																					WordpressPasswordStrength = "Wordpress Password Strength is: 57.0";
																					writePasswordStrengthResultToFile(WordpressPasswordStrength);
																				}
																			}else {
																				System.out.println("Wordpress Password Strength = 52.7");
																				WordpressPasswordStrength = "Wordpress Password Strength is: 52.7";
																				writePasswordStrengthResultToFile(WordpressPasswordStrength);
																			}
																		}else {
																			System.out.println("Wordpress Password Strength = 51.7");
																			WordpressPasswordStrength = "Wordpress Password Strength is: 51.7";
																			writePasswordStrengthResultToFile(WordpressPasswordStrength);
																		}
																	}else {
																		System.out.println("Wordpress Password Strength = 49.1");
																		WordpressPasswordStrength = "Wordpress Password Strength is: 49.1";
																		writePasswordStrengthResultToFile(WordpressPasswordStrength);
																	}
																}else {
																	System.out.println("Wordpress Password Strength = 47.6");
																	WordpressPasswordStrength = "Wordpress Password Strength is: 47.6";
																	writePasswordStrengthResultToFile(WordpressPasswordStrength);
																}
															}else {
																System.out.println("Wordpress Password Strength = 47.3");
																WordpressPasswordStrength = "Wordpress Password Strength is: 47.3";
																writePasswordStrengthResultToFile(WordpressPasswordStrength);
															}
														}else {
															System.out.println("Wordpress Password Strength = 47.0");
															WordpressPasswordStrength = "Wordpress Password Strength is: 47.0";
															writePasswordStrengthResultToFile(WordpressPasswordStrength);
														}
													}else {
														System.out.println("Wordpress Password Strength = 45.6");
														WordpressPasswordStrength = "Wordpress Password Strength is: 45.6";
														writePasswordStrengthResultToFile(WordpressPasswordStrength);
													}
												}else {
													System.out.println("Wordpress Password Strength = 41.4");
													WordpressPasswordStrength = "Wordpress Password Strength is: 41.4";
													writePasswordStrengthResultToFile(WordpressPasswordStrength);
												}
											}else {
												System.out.println("Wordpress Password Strength = 39.5");
												WordpressPasswordStrength = "Wordpress Password Strength is: 39.5";
												writePasswordStrengthResultToFile(WordpressPasswordStrength);
											}
										}else {
											System.out.println("Wordpress Password Strength = 37.6");
											WordpressPasswordStrength = "Wordpress Password Strength is: 37.6";
											writePasswordStrengthResultToFile(WordpressPasswordStrength);
										}
									}else {
										System.out.println("Wordpress Password Strength = 36.8");
										WordpressPasswordStrength = "Wordpress Password Strength is: 36.8";
										writePasswordStrengthResultToFile(WordpressPasswordStrength);
									}
								}else {	
									System.out.println("Wordpress Password Strength = 35.7");
									WordpressPasswordStrength = "Wordpress Password Strength is: 35.7";
									writePasswordStrengthResultToFile(WordpressPasswordStrength);
								}
							}else {
								System.out.println("Wordpress Password Strength = 35.5");
								WordpressPasswordStrength = "Wordpress Password Strength is: 35.5";
								writePasswordStrengthResultToFile(WordpressPasswordStrength);
							}
						}else {
							System.out.println("Wordpress Password Strength = 34.2");
							WordpressPasswordStrength = "Wordpress Password Strength is: 34.2";
							writePasswordStrengthResultToFile(WordpressPasswordStrength);
						}
					}else {
						System.out.println("Wordpress Password Strength = 33.2");
						WordpressPasswordStrength = "Wordpress Password Strength is: 33.2";
						writePasswordStrengthResultToFile(WordpressPasswordStrength);
					}
				}else {
					System.out.println("Wordpress Password Strength = 31.0");
					WordpressPasswordStrength = "Wordpress Password Strength is: 31.0";
					writePasswordStrengthResultToFile(WordpressPasswordStrength);
					}
			}else {
				System.out.println("Wordpress Password Strength = 28.2");
				WordpressPasswordStrength = "Wordpress Password Strength is: 28.2";
				writePasswordStrengthResultToFile(WordpressPasswordStrength);
			}			
		}else {
			System.out.println("Wordpress Password Strength = 26.6");
			WordpressPasswordStrength = "Wordpress Password Strength is: 26.6";
			writePasswordStrengthResultToFile(WordpressPasswordStrength);
			}		
	}else {
		System.out.println("Wordpress Password Strength = 19.9");
		WordpressPasswordStrength = "Wordpress Password Strength is: 19.9";
		writePasswordStrengthResultToFile(WordpressPasswordStrength);
		}			
}
}
