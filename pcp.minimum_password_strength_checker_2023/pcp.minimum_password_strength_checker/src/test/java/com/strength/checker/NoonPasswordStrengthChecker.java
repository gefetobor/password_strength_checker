package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.NoonScreens;


public class NoonPasswordStrengthChecker extends Base{

	String NoonUrl = "NoonUrl";
	String username;
	String email;
	int n = 3;
	String NoonPasswordStrength;
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
	public void NoonPwdStrengthChecker() throws Exception {
		propertiesFileLoad(NoonUrl);
		NoonUrl = lobConfigProp.getProperty("NoonUrl");
		 driver.get(NoonUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		NoonScreens executor = new NoonScreens(driver);
		
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerry" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		
		
		executor.clickOnSignInButton();
		Thread.sleep(4000);
		executor.clickOnSignUpButton();
		Thread.sleep(4000);
		executor.enterEmail(email);
		Thread.sleep(4000);
		
		//Execute test cases
		//scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		Thread.sleep(4000);
		executor.clickOnSubmit();
		Thread.sleep(2000);
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("scenario 2: Website does not accept scenario 1");
			
			//scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			WebElement pwd = driver.findElement(By.xpath("//input[@id='passwordInput']"));
			Actions a = new Actions(driver);
			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			executor.enterPassword(scenarioTwo);
			executor.clickOnSubmit();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("scenario 3: Website does not accept scenario 2");
				
				//scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
				executor.enterPassword(scenarioThree);
				executor.clickOnSubmit();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("scenario 4: Website does not accept scenario 3");
					
					//scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					executor.enterPassword(scenarioFour);
					executor.clickOnSubmit();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("scenario 5: Website does not accept scenario 4");
						
						//scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
						executor.enterPassword(scenarioFive);
						executor.clickOnSubmit();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("scenario 6: Website does not accept scenario 5");
							
							//scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
							executor.enterPassword(scenarioSix);
							executor.clickOnSubmit();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("scenario 7: Website does not accept scenario 6");
								
								//scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
								executor.enterPassword(scenarioSeven);
								executor.clickOnSubmit();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("scenario 8: Website does not accept scenario 7");
									
									//scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
									executor.enterPassword(scenarioEight);
									executor.clickOnSubmit();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("scenario 9: Website does not accept scenario 8");
										
										//scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
										executor.enterPassword(scenarioNine);
										executor.clickOnSubmit();
										Thread.sleep(2000);
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("scenario 10: Website does not accept scenario 9");
											
											//scenario 10: 
											scenarioTen = propertiesFileLoad(scenarioTen);
											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
											executor.enterPassword(scenarioTen);
											executor.clickOnSubmit();
											Thread.sleep(2000);
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("scenario 11: Website does not accept scenario 10");
												
												//scenario 11: 
												scenarioEleven = propertiesFileLoad(scenarioEleven);
												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
												executor.enterPassword(scenarioEleven);
												executor.clickOnSubmit();
												Thread.sleep(2000);
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("scenario 12: Website does not accept scenario 11");
													
													//scenario 12: 
													scenarioTwelve = propertiesFileLoad(scenarioTwelve);
													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
													executor.enterPassword(scenarioTwelve);
													executor.clickOnSubmit();
													Thread.sleep(2000);
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("scenario 13: Website does not accept scenario 12");
														
														//scenario 13: 
														scenarioThirteen = propertiesFileLoad(scenarioThirteen);
														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
														executor.enterPassword(scenarioThirteen);
														executor.clickOnSubmit();
														Thread.sleep(2000);
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("scenario 14: Website does not accept scenario 13");
															
															//scenario 14: 
															scenarioFourteen = propertiesFileLoad(scenarioFourteen);
															a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
															executor.enterPassword(scenarioFourteen);
															executor.clickOnSubmit();
															Thread.sleep(2000);
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("scenario 15: Website does not accept scenario 14");
																
																//scenario 15: 
																scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																executor.enterPassword(scenarioFifteen);
																executor.clickOnSubmit();
																Thread.sleep(2000);
																if (executor.isElementPresent(executor.errorToast)) {
																	System.out.println("scenario 16: Website does not accept scenario 15");
																	
																	//scenario 16: 
																	scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																	a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																	executor.enterPassword(scenarioSixteen);
																	executor.clickOnSubmit();
																	Thread.sleep(2000);
																	if (executor.isElementPresent(executor.errorToast)) {
																		System.out.println("scenario 17: Website does not accept scenario 16");
																		
																		//scenario 17: 
																		scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																		a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																		executor.enterPassword(scenarioSeventeen);
																		executor.clickOnSubmit();
																		Thread.sleep(2000);
																		if (executor.isElementPresent(executor.errorToast)) {
																			System.out.println("scenario 18: Website does not accept scenario 17");
																			
																			//scenario 18: 
																			scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																			executor.enterPassword(scenarioEighteen);
																			executor.clickOnSubmit();
																			Thread.sleep(2000);
																			if (executor.isElementPresent(executor.errorToast)) {
																				System.out.println("scenario 19: Website does not accept scenario 18");
																				
																				//scenario 19: 
																				scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																				executor.enterPassword(scenarioNineteen);
																				executor.clickOnSubmit();
																				Thread.sleep(2000);
																				if (executor.isElementPresent(executor.errorToast)) {
																					System.out.println("scenario 20: Website does not accept scenario 19");
																					
																					//scenario 20: 
																					scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																					executor.enterPassword(scenarioTwenty);
																					executor.clickOnSubmit();
																					Thread.sleep(2000);
																					if (executor.isElementPresent(executor.errorToast)) {
																						System.out.println("scenario 21: Website does not accept scenario 20");
																						
																						//scenario 21: 
																						scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																						executor.enterPassword(scenarioTwentyOne);
																						executor.clickOnSubmit();
																						Thread.sleep(2000);
																						if (executor.isElementPresent(executor.errorToast)) {
																							System.out.println("scenario 22: Website does not accept scenario 21");
																							
																							//scenario 22: 
																							scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																							executor.enterPassword(scenarioTwentyTwo);
																							executor.clickOnSubmit();
																							Thread.sleep(2000);
																							if (executor.isElementPresent(executor.errorToast)) {
																								System.out.println("scenario 23: Website does not accept scenario 22");
																								
																								//scenario 23: 
																								scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																								executor.enterPassword(scenarioTwentyThree);
																								executor.clickOnSubmit();
																								Thread.sleep(2000);
																								if (executor.isElementPresent(executor.errorToast)) {
																									System.out.println("scenario 24: Website does not accept scenario 23");
																									
																									//scenario 24: 
																									scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																									executor.enterPassword(scenarioTwentyFour);
																									executor.clickOnSubmit();
																									Thread.sleep(2000);
																									
																									if (executor.isElementPresent(executor.errorToast)) {
																										System.out.println("scenario 25: Website does not accept scenario 24");
																										
																										//scenario 25: 
																										scenarioTwentyFive = propertiesFileLoad(scenarioTwentyFive);
																										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																										executor.enterPassword(scenarioTwentyFive);
																										executor.clickOnSubmit();
																										Thread.sleep(2000);
																										
																										if (executor.isElementPresent(executor.errorToast)) {
																											System.out.println("scenario 26: Website does not accept scenario 25");
																											
																											//scenario 26: 
																											scenarioTwentySix = propertiesFileLoad(scenarioTwentySix);
																											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																											executor.enterPassword(scenarioTwentySix);
																											executor.clickOnSubmit();
																											Thread.sleep(2000);
																											
																											if (executor.isElementPresent(executor.errorToast)) {
																												System.out.println("scenario 27: Website does not accept scenario 26");
																												
																												//scenario 27: 
																												scenarioTwentySeven = propertiesFileLoad(scenarioTwentySeven);
																												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																												executor.enterPassword(scenarioTwentySeven);
																												executor.clickOnSubmit();
																												Thread.sleep(2000);
																												
																												if (executor.isElementPresent(executor.errorToast)) {
																													System.out.println("scenario 28: Website does not accept scenario 27");
																													
																													//scenario 28: 
																													scenarioTwentyEight = propertiesFileLoad(scenarioTwentyEight);
																													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																													executor.enterPassword(scenarioTwentyEight);
																													executor.clickOnSubmit();
																													Thread.sleep(2000);
																													
																													if (executor.isElementPresent(executor.errorToast)) {
																														System.out.println("scenario 29: Website does not accept scenario 28");
																														
																														//scenario 29: 
																														scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																														executor.enterPassword(scenarioTwentyNine);
																														executor.clickOnSubmit();
																														Thread.sleep(2000);
																														
																														if (executor.isElementPresent(executor.errorToast)) {
																														NoonPasswordStrength = "scenarios Not Sufficient. Need more scenarios to determine Noon Password Strength";			
																														writePasswordStrengthResultToFile(NoonPasswordStrength);
																													}else {
																														System.out.println("Noon Password Strength = 79.1");
																														NoonPasswordStrength = "Noon Password Strength is: 79.1";
																														writePasswordStrengthResultToFile(NoonPasswordStrength);
																													}
																												}else {
																													System.out.println("Noon Password Strength = 71.4");
																													NoonPasswordStrength = "Noon Password Strength is: 71.4";
																													writePasswordStrengthResultToFile(NoonPasswordStrength);	
																												}
																											}else {
																												System.out.println("Noon Password Strength = 70.9");
																												NoonPasswordStrength = "Noon Password Strength is: 70.9";
																												writePasswordStrengthResultToFile(NoonPasswordStrength);		
																											}
																										}else {
																											System.out.println("Noon Password Strength = 68.4");
																											NoonPasswordStrength = "Noon Password Strength is: 68.4";
																											writePasswordStrengthResultToFile(NoonPasswordStrength);			
																										}
																									}else {
																										System.out.println("Noon Password Strength = 65.9");
																										NoonPasswordStrength = "Noon Password Strength is: 65.9";
																										writePasswordStrengthResultToFile(NoonPasswordStrength);
																									}
																								}else {
																									System.out.println("Noon Password Strength = 62.0");
																									NoonPasswordStrength = "Noon Password Strength is: 62.0";
																									writePasswordStrengthResultToFile(NoonPasswordStrength);
																								}	
																							}else {
																								System.out.println("Noon Password Strength = 61.3");
																								NoonPasswordStrength = "Noon Password Strength is: 61.3";
																								writePasswordStrengthResultToFile(NoonPasswordStrength);
																							}
																						}else {
																							System.out.println("Noon Password Strength = 59.5");
																							NoonPasswordStrength = "Noon Password Strength is: 59.5";
																							writePasswordStrengthResultToFile(NoonPasswordStrength);
																						}
																					}else {
																						System.out.println("Noon Password Strength = 59.1");
																						NoonPasswordStrength = "Noon Password Strength is: 59.1";
																						writePasswordStrengthResultToFile(NoonPasswordStrength);
																					}
																				}else {
																					System.out.println("Noon Password Strength = 57.0");
																					NoonPasswordStrength = "Noon Password Strength is: 57.0";
																					writePasswordStrengthResultToFile(NoonPasswordStrength);
																				}
																			}else {
																				System.out.println("Noon Password Strength = 52.7");
																				NoonPasswordStrength = "Noon Password Strength is: 52.7";
																				writePasswordStrengthResultToFile(NoonPasswordStrength);
																			}
																		}else {
																			System.out.println("Noon Password Strength = 51.7");
																			NoonPasswordStrength = "Noon Password Strength is: 51.7";
																			writePasswordStrengthResultToFile(NoonPasswordStrength);
																		}
																	}else {
																		System.out.println("Noon Password Strength = 49.1");
																		NoonPasswordStrength = "Noon Password Strength is: 49.1";
																		writePasswordStrengthResultToFile(NoonPasswordStrength);
																	}
																}else {
																	System.out.println("Noon Password Strength = 47.6");
																	NoonPasswordStrength = "Noon Password Strength is: 47.6";
																	writePasswordStrengthResultToFile(NoonPasswordStrength);
																}
															}else {
																System.out.println("Noon Password Strength = 47.3");
																NoonPasswordStrength = "Noon Password Strength is: 47.3";
																writePasswordStrengthResultToFile(NoonPasswordStrength);
															}
														}else {
															System.out.println("Noon Password Strength = 47.0");
															NoonPasswordStrength = "Noon Password Strength is: 47.0";
															writePasswordStrengthResultToFile(NoonPasswordStrength);
														}
													}else {
														System.out.println("Noon Password Strength = 45.6");
														NoonPasswordStrength = "Noon Password Strength is: 45.6";
														writePasswordStrengthResultToFile(NoonPasswordStrength);
													}
												}else {
													System.out.println("Noon Password Strength = 41.4");
													NoonPasswordStrength = "Noon Password Strength is: 41.4";
													writePasswordStrengthResultToFile(NoonPasswordStrength);
												}
											}else {
												System.out.println("Noon Password Strength = 39.5");
												NoonPasswordStrength = "Noon Password Strength is: 39.5";
												writePasswordStrengthResultToFile(NoonPasswordStrength);
											}
										}else {
											System.out.println("Noon Password Strength = 37.6");
											NoonPasswordStrength = "Noon Password Strength is: 37.6";
											writePasswordStrengthResultToFile(NoonPasswordStrength);
										}
									}else {
										System.out.println("Noon Password Strength = 36.8");
										NoonPasswordStrength = "Noon Password Strength is: 36.8";
										writePasswordStrengthResultToFile(NoonPasswordStrength);
									}
								}else {	
									System.out.println("Noon Password Strength = 35.7");
									NoonPasswordStrength = "Noon Password Strength is: 35.7";
									writePasswordStrengthResultToFile(NoonPasswordStrength);
								}
							}else {
								System.out.println("Noon Password Strength = 35.5");
								NoonPasswordStrength = "Noon Password Strength is: 35.5";
								writePasswordStrengthResultToFile(NoonPasswordStrength);
							}
						}else {
							System.out.println("Noon Password Strength = 34.2");
							NoonPasswordStrength = "Noon Password Strength is: 34.2";
							writePasswordStrengthResultToFile(NoonPasswordStrength);
						}
					}else {
						System.out.println("Noon Password Strength = 33.2");
						NoonPasswordStrength = "Noon Password Strength is: 33.2";
						writePasswordStrengthResultToFile(NoonPasswordStrength);
					}
				}else {
					System.out.println("Noon Password Strength = 31.0");
					NoonPasswordStrength = "Noon Password Strength is: 31.0";
					writePasswordStrengthResultToFile(NoonPasswordStrength);
					}
			}else {
				System.out.println("Noon Password Strength = 28.2");
				NoonPasswordStrength = "Noon Password Strength is: 28.2";
				writePasswordStrengthResultToFile(NoonPasswordStrength);
			}			
		}else {
			System.out.println("Noon Password Strength = 26.6");
			NoonPasswordStrength = "Noon Password Strength is: 26.6";
			writePasswordStrengthResultToFile(NoonPasswordStrength);
			}		
	}else {
		System.out.println("Noon Password Strength = 19.9");
		NoonPasswordStrength = "Noon Password Strength is: 19.9";
		writePasswordStrengthResultToFile(NoonPasswordStrength);
		}			
}
}
