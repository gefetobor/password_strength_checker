package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.CornellScreens;


public class CornellPasswordStrengthChecker extends Base{

	String CornellUrl = "CornellUrl";
	String username;
	String email;
	int n = 5;
	String CornellPasswordStrength;
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
	public void CornellPwdStrengthChecker() throws Exception {
		propertiesFileLoad(CornellUrl);
		CornellUrl = lobConfigProp.getProperty("CornellUrl");
		 driver.get(CornellUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		CornellScreens executor = new CornellScreens(driver);

		GenericMethods numGenerator = new GenericMethods(driver);
		email = "Jerrypot" + numGenerator.getAlphaNumericString(n) + "@rocketmail.com";
		executor.enterEmail(email);

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		//executor.enterForm("1234");
		executor.clickOnEmailField();
		Thread.sleep(2000);
		// executor.clickOnSuccessElement();
		//String attr = executor.getSuccessElementAttribute();
		//System.out.println(attr);
		
		if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.clearPasswordField();
			executor.enterPassword(scenarioTwo);
			executor.clickOnEmailField();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.clearPasswordField();
				executor.enterPassword(scenarioThree);
				executor.clickOnEmailField();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.clearPasswordField();
					executor.enterPassword(scenarioFour);
					executor.clickOnEmailField();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.clearPasswordField();
						executor.enterPassword(scenarioFive);
						executor.clickOnEmailField();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.clearPasswordField();
							executor.enterPassword(scenarioSix);
							executor.clickOnEmailField();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.clearPasswordField();
								executor.enterPassword(scenarioSeven);
								executor.clickOnEmailField();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.clearPasswordField();
									executor.enterPassword(scenarioEight);
									executor.clickOnEmailField();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.clearPasswordField();
										executor.enterPassword(scenarioNine);
										executor.clickOnEmailField();
										Thread.sleep(2000);
										if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
											System.out.println("Scenario 10: Website does not accept scenario 9");
											
											//Scenario 10: 
											scenarioTen = propertiesFileLoad(scenarioTen);
											executor.clearPasswordField();
											executor.enterPassword(scenarioTen);
											executor.clickOnEmailField();
											Thread.sleep(2000);
											if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
												System.out.println("Scenario 11: Website does not accept scenario 10");
												
												//Scenario 11: 
												scenarioEleven = propertiesFileLoad(scenarioEleven);
												executor.clearPasswordField();
												executor.enterPassword(scenarioEleven);
												executor.clickOnEmailField();
												Thread.sleep(2000);
												if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
													System.out.println("Scenario 12: Website does not accept scenario 11");
													
													//Scenario 12: 
													scenarioTwelve = propertiesFileLoad(scenarioTwelve);
													executor.clearPasswordField();
													executor.enterPassword(scenarioTwelve);
													executor.clickOnEmailField();
													Thread.sleep(2000);
													if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
														System.out.println("Scenario 13: Website does not accept scenario 12");
														
														//Scenario 13: 
														scenarioThirteen = propertiesFileLoad(scenarioThirteen);
														executor.clearPasswordField();
														executor.enterPassword(scenarioThirteen);
														executor.clickOnEmailField();
														Thread.sleep(2000);
														if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
															System.out.println("Scenario 14: Website does not accept scenario 13");
															
															//Scenario 14: 
															scenarioFourteen = propertiesFileLoad(scenarioFourteen);
															executor.clearPasswordField();
															executor.enterPassword(scenarioFourteen);
															executor.clickOnEmailField();
															Thread.sleep(2000);
															if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																System.out.println("Scenario 15: Website does not accept scenario 14");
																
																//Scenario 15: 
																scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																executor.clearPasswordField();
																executor.enterPassword(scenarioFifteen);
																executor.clickOnEmailField();
																Thread.sleep(2000);
																if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																	System.out.println("Scenario 16: Website does not accept scenario 15");
																	
																	//Scenario 16: 
																	scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																	executor.clearPasswordField();
																	executor.enterPassword(scenarioSixteen);
																	executor.clickOnEmailField();
																	Thread.sleep(2000);
																	if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																		System.out.println("Scenario 17: Website does not accept scenario 16");
																		
																		//Scenario 17: 
																		scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																		executor.clearPasswordField();
																		executor.enterPassword(scenarioSeventeen);
																		executor.clickOnEmailField();
																		Thread.sleep(2000);
																		if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																			System.out.println("Scenario 18: Website does not accept scenario 17");
																			
																			//Scenario 18: 
																			scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																			executor.clearPasswordField();
																			executor.enterPassword(scenarioEighteen);
																			executor.clickOnEmailField();
																			Thread.sleep(2000);
																			if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																				System.out.println("Scenario 19: Website does not accept scenario 18");
																				
																				//Scenario 19: 
																				scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																				executor.clearPasswordField();
																				executor.enterPassword(scenarioNineteen);
																				executor.clickOnEmailField();
																				Thread.sleep(2000);
																				if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																					System.out.println("Scenario 20: Website does not accept scenario 19");
																					
																					//Scenario 20: 
																					scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																					executor.clearPasswordField();
																					executor.enterPassword(scenarioTwenty);
																					executor.clickOnEmailField();
																					Thread.sleep(2000);
																					if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																						System.out.println("Scenario 21: Website does not accept scenario 20");
																						
																						//Scenario 21: 
																						scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																						executor.clearPasswordField();
																						executor.enterPassword(scenarioTwentyOne);
																						executor.clickOnEmailField();
																						Thread.sleep(2000);
																						if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																							System.out.println("Scenario 22: Website does not accept scenario 21");
																							
																							//Scenario 22: 
																							scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																							executor.clearPasswordField();
																							executor.enterPassword(scenarioTwentyTwo);
																							executor.clickOnEmailField();
																							Thread.sleep(2000);
																							if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																								System.out.println("Scenario 23: Website does not accept scenario 22");
																								
																								//Scenario 23: 
																								scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																								executor.clearPasswordField();
																								executor.enterPassword(scenarioTwentyThree);
																								executor.clickOnEmailField();
																								Thread.sleep(2000);
																								if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo) || executor.isElementPresent(executor.errorToastThree) || executor.isElementPresent(executor.errorToastFour) || executor.isElementPresent(executor.errorToastFive) || executor.isElementPresent(executor.errorToastSix)) {
																									System.out.println("Scenario 24: Website does not accept scenario 23");
																									
																									//Scenario 24: 
																									scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																									executor.clearPasswordField();
																									executor.enterPassword(scenarioTwentyFour);
																									executor.clickOnEmailField();
																									Thread.sleep(2000);
																									CornellPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Cornell Password Strength";			
																									writePasswordStrengthResultToFile(CornellPasswordStrength);
																								}else {
																									System.out.println("Cornell Password Strength = 65.9");
																									CornellPasswordStrength = "Cornell Password Strength is: 65.9";
																									writePasswordStrengthResultToFile(CornellPasswordStrength);
																								}
																							}else {
																								System.out.println("Cornell Password Strength = 61.3");
																								CornellPasswordStrength = "Cornell Password Strength is: 61.3";
																								writePasswordStrengthResultToFile(CornellPasswordStrength);
																							}
																						}else {
																							System.out.println("Cornell Password Strength = 59.5");
																							CornellPasswordStrength = "Cornell Password Strength is: 59.5";
																							writePasswordStrengthResultToFile(CornellPasswordStrength);
																						}
																					}else {
																						System.out.println("Cornell Password Strength = 59.1");
																						CornellPasswordStrength = "Cornell Password Strength is: 59.1";
																						writePasswordStrengthResultToFile(CornellPasswordStrength);
																					}
																				}else {
																					System.out.println("Cornell Password Strength = 57.0");
																					CornellPasswordStrength = "Cornell Password Strength is: 57.0";
																					writePasswordStrengthResultToFile(CornellPasswordStrength);
																				}
																			}else {
																				System.out.println("Cornell Password Strength = 51.7");
																				CornellPasswordStrength = "Cornell Password Strength is: 51.7";
																				writePasswordStrengthResultToFile(CornellPasswordStrength);
																			}
																		}else {
																			System.out.println("Cornell Password Strength = 49.1");
																			CornellPasswordStrength = "Cornell Password Strength is: 49.1";
																			writePasswordStrengthResultToFile(CornellPasswordStrength);
																		}
																	}else {
																		System.out.println("Cornell Password Strength = 47.6");
																		CornellPasswordStrength = "Cornell Password Strength is: 47.6";
																		writePasswordStrengthResultToFile(CornellPasswordStrength);
																	}
																}else {
																	System.out.println("Cornell Password Strength = 47.3");
																	CornellPasswordStrength = "Cornell Password Strength is: 47.3";
																	writePasswordStrengthResultToFile(CornellPasswordStrength);
																}
															}else {
																System.out.println("Cornell Password Strength = 47.0");
																CornellPasswordStrength = "Cornell Password Strength is: 47.0";
																writePasswordStrengthResultToFile(CornellPasswordStrength);
															}
														}else {
															System.out.println("Cornell Password Strength = 45.6");
															CornellPasswordStrength = "Cornell Password Strength is: 45.6";
															writePasswordStrengthResultToFile(CornellPasswordStrength);
														}
													}else {
														System.out.println("Cornell Password Strength = 41.4");
														CornellPasswordStrength = "Cornell Password Strength is: 41.4";
														writePasswordStrengthResultToFile(CornellPasswordStrength);
													}
												}else {
													System.out.println("Cornell Password Strength = 39.5");
													CornellPasswordStrength = "Cornell Password Strength is: 39.5";
													writePasswordStrengthResultToFile(CornellPasswordStrength);
												}
											}else {
												System.out.println("Cornell Password Strength = 37.6");
												CornellPasswordStrength = "Cornell Password Strength is: 37.6";
												writePasswordStrengthResultToFile(CornellPasswordStrength);
											}
										}else {
											System.out.println("Cornell Password Strength = 36.8");
											CornellPasswordStrength = "Cornell Password Strength is: 36.8";
											writePasswordStrengthResultToFile(CornellPasswordStrength);
										}
									}else {	
										System.out.println("Cornell Password Strength = 35.7");
										CornellPasswordStrength = "Cornell Password Strength is: 35.7";
										writePasswordStrengthResultToFile(CornellPasswordStrength);
									}
								}else {
									System.out.println("Cornell Password Strength = 35.5");
									CornellPasswordStrength = "Cornell Password Strength is: 35.5";
									writePasswordStrengthResultToFile(CornellPasswordStrength);
								}
							}else {
								System.out.println("Cornell Password Strength = 34.2");
								CornellPasswordStrength = "Cornell Password Strength is: 34.2";
								writePasswordStrengthResultToFile(CornellPasswordStrength);
							}
						}else {
							System.out.println("Cornell Password Strength = 33.2");
							CornellPasswordStrength = "Cornell Password Strength is: 33.2";
							writePasswordStrengthResultToFile(CornellPasswordStrength);
						}
					}else {
						System.out.println("Cornell Password Strength = 31.0");
						CornellPasswordStrength = "Cornell Password Strength is: 31.0";
						writePasswordStrengthResultToFile(CornellPasswordStrength);
						}
				}else {
					System.out.println("Cornell Password Strength = 28.2");
					CornellPasswordStrength = "Cornell Password Strength is: 28.2";
					writePasswordStrengthResultToFile(CornellPasswordStrength);
				}			
			}else {
				System.out.println("Cornell Password Strength = 26.6");
				CornellPasswordStrength = "Cornell Password Strength is: 26.6";
				writePasswordStrengthResultToFile(CornellPasswordStrength);
				}		
		}else {
			System.out.println("Cornell Password Strength = 19.9");
			CornellPasswordStrength = "Cornell Password Strength is: 19.9";
			writePasswordStrengthResultToFile(CornellPasswordStrength);
			}			
	}
}
