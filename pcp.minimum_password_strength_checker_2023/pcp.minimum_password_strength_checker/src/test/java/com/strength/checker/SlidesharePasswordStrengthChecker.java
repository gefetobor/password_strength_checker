package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.SlideshareScreens;


public class SlidesharePasswordStrengthChecker extends Base{

	String SlideshareUrl = "SlideshareUrl";
	String username;
	String email;
	int n = 3;
	String SlidesharePasswordStrength;
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
	public void SlidesharePwdStrengthChecker() throws Exception {
		propertiesFileLoad(SlideshareUrl);
		SlideshareUrl = lobConfigProp.getProperty("SlideshareUrl");
		 driver.get(SlideshareUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		SlideshareScreens executor = new SlideshareScreens(driver);
		
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerry" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		
		WebDriverWait w = new WebDriverWait(driver, 10);
        w.until(ExpectedConditions
                .presenceOfElementLocated(executor.acceptCookies));
		executor.clickOnAcceptCookies();
		
		executor.clickOnSignUp();
		Thread.sleep(5000);
		/*// Get the handle of the current window
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println(currentWindowHandle);
		
		// Get the handles of all open windows
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

		// Remove the handle of the current window from the set of handles
		windowHandles.remove(currentWindowHandle);
		// Switch to the new window
		driver.switchTo().window(windowHandles.iterator().next());*/
		
		
		executor.clickOnEmailSignUp();
		
		Thread.sleep(2000);
		executor.enterName(username);
		executor.enterEmail(email);
		
		//Execute test cases
		//scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		executor.clickOnContinue();
		
		Thread.sleep(2000);
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("scenario 2: Website does not accept scenario 1");
			
			//scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			executor.clearPasswordField();
			executor.enterPassword(scenarioTwo);
			executor.clickOnContinue();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("scenario 3: Website does not accept scenario 2");
				
				//scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				executor.clearPasswordField();
				executor.enterPassword(scenarioThree);
				executor.clickOnContinue();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("scenario 4: Website does not accept scenario 3");
					
					//scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					executor.clearPasswordField();
					executor.enterPassword(scenarioFour);
					executor.clickOnContinue();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("scenario 5: Website does not accept scenario 4");
						
						//scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						executor.clearPasswordField();
						executor.enterPassword(scenarioFive);
						executor.clickOnContinue();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("scenario 6: Website does not accept scenario 5");
							
							//scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							executor.clearPasswordField();
							executor.enterPassword(scenarioSix);
							executor.clickOnContinue();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("scenario 7: Website does not accept scenario 6");
								
								//scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								executor.clearPasswordField();
								executor.enterPassword(scenarioSeven);
								executor.clickOnContinue();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("scenario 8: Website does not accept scenario 7");
									
									//scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									executor.clearPasswordField();
									executor.enterPassword(scenarioEight);
									executor.clickOnContinue();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("scenario 9: Website does not accept scenario 8");
										
										//scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										executor.clearPasswordField();
										executor.enterPassword(scenarioNine);
										executor.clickOnContinue();
										Thread.sleep(2000);
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("scenario 10: Website does not accept scenario 9");
											
											//scenario 10: 
											scenarioTen = propertiesFileLoad(scenarioTen);
											executor.clearPasswordField();
											executor.enterPassword(scenarioTen);
											executor.clickOnContinue();
											Thread.sleep(2000);
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("scenario 11: Website does not accept scenario 10");
												
												//scenario 11: 
												scenarioEleven = propertiesFileLoad(scenarioEleven);
												executor.clearPasswordField();
												executor.enterPassword(scenarioEleven);
												executor.clickOnContinue();
												Thread.sleep(2000);
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("scenario 12: Website does not accept scenario 11");
													
													//scenario 12: 
													scenarioTwelve = propertiesFileLoad(scenarioTwelve);
													executor.clearPasswordField();
													executor.enterPassword(scenarioTwelve);
													executor.clickOnContinue();
													Thread.sleep(2000);
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("scenario 13: Website does not accept scenario 12");
														
														//scenario 13: 
														scenarioThirteen = propertiesFileLoad(scenarioThirteen);
														executor.clearPasswordField();
														executor.enterPassword(scenarioThirteen);
														executor.clickOnContinue();
														Thread.sleep(2000);
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("scenario 14: Website does not accept scenario 13");
															
															//scenario 14: 
															scenarioFourteen = propertiesFileLoad(scenarioFourteen);
															executor.clearPasswordField();
															executor.enterPassword(scenarioFourteen);
															executor.clickOnContinue();
															Thread.sleep(2000);
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("scenario 15: Website does not accept scenario 14");
																
																//scenario 15: 
																scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																executor.clearPasswordField();
																executor.enterPassword(scenarioFifteen);
																executor.clickOnContinue();
																Thread.sleep(2000);
																if (executor.isElementPresent(executor.errorToast)) {
																	System.out.println("scenario 16: Website does not accept scenario 15");
																	
																	//scenario 16: 
																	scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																	executor.clearPasswordField();
																	executor.enterPassword(scenarioSixteen);
																	executor.clickOnContinue();
																	Thread.sleep(2000);
																	if (executor.isElementPresent(executor.errorToast)) {
																		System.out.println("scenario 17: Website does not accept scenario 16");
																		
																		//scenario 17: 
																		scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																		executor.clearPasswordField();
																		executor.enterPassword(scenarioSeventeen);
																		executor.clickOnContinue();
																		Thread.sleep(2000);
																		if (executor.isElementPresent(executor.errorToast)) {
																			System.out.println("scenario 18: Website does not accept scenario 17");
																			
																			//scenario 18: 
																			scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																			executor.clearPasswordField();
																			executor.enterPassword(scenarioEighteen);
																			executor.clickOnContinue();
																			Thread.sleep(2000);
																			if (executor.isElementPresent(executor.errorToast)) {
																				System.out.println("scenario 19: Website does not accept scenario 18");
																				
																				//scenario 19: 
																				scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																				executor.clearPasswordField();
																				executor.enterPassword(scenarioNineteen);
																				executor.clickOnContinue();
																				Thread.sleep(2000);
																				if (executor.isElementPresent(executor.errorToast)) {
																					System.out.println("scenario 20: Website does not accept scenario 19");
																					
																					//scenario 20: 
																					scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																					executor.clearPasswordField();
																					executor.enterPassword(scenarioTwenty);
																					executor.clickOnContinue();
																					Thread.sleep(2000);
																					if (executor.isElementPresent(executor.errorToast)) {
																						System.out.println("scenario 21: Website does not accept scenario 20");
																						
																						//scenario 21: 
																						scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																						executor.clearPasswordField();
																						executor.enterPassword(scenarioTwentyOne);
																						executor.clickOnContinue();
																						Thread.sleep(2000);
																						if (executor.isElementPresent(executor.errorToast)) {
																							System.out.println("scenario 22: Website does not accept scenario 21");
																							
																							//scenario 22: 
																							scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																							executor.clearPasswordField();
																							executor.enterPassword(scenarioTwentyTwo);
																							executor.clickOnContinue();
																							Thread.sleep(2000);
																							if (executor.isElementPresent(executor.errorToast)) {
																								System.out.println("scenario 23: Website does not accept scenario 22");
																								
																								//scenario 23: 
																								scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																								executor.clearPasswordField();
																								executor.enterPassword(scenarioTwentyThree);
																								executor.clickOnContinue();
																								Thread.sleep(2000);
																								if (executor.isElementPresent(executor.errorToast)) {
																									System.out.println("scenario 24: Website does not accept scenario 23");
																									
																									//scenario 24: 
																									scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																									executor.clearPasswordField();
																									executor.enterPassword(scenarioTwentyFour);
																									executor.clickOnContinue();
																									Thread.sleep(2000);
																									
																									if (executor.isElementPresent(executor.errorToast)) {
																										System.out.println("scenario 25: Website does not accept scenario 24");
																										
																										//scenario 25: 
																										scenarioTwentyFive = propertiesFileLoad(scenarioTwentyFive);
																										executor.clearPasswordField();
																										executor.enterPassword(scenarioTwentyFive);
																										executor.clickOnContinue();
																										Thread.sleep(2000);
																										
																										if (executor.isElementPresent(executor.errorToast)) {
																											System.out.println("scenario 26: Website does not accept scenario 25");
																											
																											//scenario 26: 
																											scenarioTwentySix = propertiesFileLoad(scenarioTwentySix);
																											executor.clearPasswordField();
																											executor.enterPassword(scenarioTwentySix);
																											executor.clickOnContinue();
																											Thread.sleep(2000);
																											
																											if (executor.isElementPresent(executor.errorToast)) {
																												System.out.println("scenario 27: Website does not accept scenario 26");
																												
																												//scenario 27: 
																												scenarioTwentySeven = propertiesFileLoad(scenarioTwentySeven);
																												executor.clearPasswordField();
																												executor.enterPassword(scenarioTwentySeven);
																												executor.clickOnContinue();
																												Thread.sleep(2000);
																												
																												if (executor.isElementPresent(executor.errorToast)) {
																													System.out.println("scenario 28: Website does not accept scenario 27");
																													
																													//scenario 28: 
																													scenarioTwentyEight = propertiesFileLoad(scenarioTwentyEight);
																													executor.clearPasswordField();
																													executor.enterPassword(scenarioTwentyEight);
																													executor.clickOnContinue();
																													Thread.sleep(2000);
																													
																													if (executor.isElementPresent(executor.errorToast)) {
																														System.out.println("scenario 29: Website does not accept scenario 28");
																														
																														//scenario 29: 
																														scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																														executor.clearPasswordField();
																														executor.enterPassword(scenarioTwentyNine);
																														executor.clickOnContinue();
																														Thread.sleep(2000);
																														
																														if (executor.isElementPresent(executor.errorToast)) {
																														SlidesharePasswordStrength = "scenarios Not Sufficient. Need more scenarios to determine Slideshare Password Strength";			
																														writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																													}else {
																														System.out.println("Slideshare Password Strength = 79.1");
																														SlidesharePasswordStrength = "Slideshare Password Strength is: 79.1";
																														writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																													}
																												}else {
																													System.out.println("Slideshare Password Strength = 71.4");
																													SlidesharePasswordStrength = "Slideshare Password Strength is: 71.4";
																													writePasswordStrengthResultToFile(SlidesharePasswordStrength);	
																												}
																											}else {
																												System.out.println("Slideshare Password Strength = 70.9");
																												SlidesharePasswordStrength = "Slideshare Password Strength is: 70.9";
																												writePasswordStrengthResultToFile(SlidesharePasswordStrength);		
																											}
																										}else {
																											System.out.println("Slideshare Password Strength = 68.4");
																											SlidesharePasswordStrength = "Slideshare Password Strength is: 68.4";
																											writePasswordStrengthResultToFile(SlidesharePasswordStrength);			
																										}
																									}else {
																										System.out.println("Slideshare Password Strength = 65.9");
																										SlidesharePasswordStrength = "Slideshare Password Strength is: 65.9";
																										writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																									}
																								}else {
																									System.out.println("Slideshare Password Strength = 62.0");
																									SlidesharePasswordStrength = "Slideshare Password Strength is: 62.0";
																									writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																								}	
																							}else {
																								System.out.println("Slideshare Password Strength = 61.3");
																								SlidesharePasswordStrength = "Slideshare Password Strength is: 61.3";
																								writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																							}
																						}else {
																							System.out.println("Slideshare Password Strength = 59.5");
																							SlidesharePasswordStrength = "Slideshare Password Strength is: 59.5";
																							writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																						}
																					}else {
																						System.out.println("Slideshare Password Strength = 59.1");
																						SlidesharePasswordStrength = "Slideshare Password Strength is: 59.1";
																						writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																					}
																				}else {
																					System.out.println("Slideshare Password Strength = 57.0");
																					SlidesharePasswordStrength = "Slideshare Password Strength is: 57.0";
																					writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																				}
																			}else {
																				System.out.println("Slideshare Password Strength = 52.7");
																				SlidesharePasswordStrength = "Slideshare Password Strength is: 52.7";
																				writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																			}
																		}else {
																			System.out.println("Slideshare Password Strength = 51.7");
																			SlidesharePasswordStrength = "Slideshare Password Strength is: 51.7";
																			writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																		}
																	}else {
																		System.out.println("Slideshare Password Strength = 49.1");
																		SlidesharePasswordStrength = "Slideshare Password Strength is: 49.1";
																		writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																	}
																}else {
																	System.out.println("Slideshare Password Strength = 47.6");
																	SlidesharePasswordStrength = "Slideshare Password Strength is: 47.6";
																	writePasswordStrengthResultToFile(SlidesharePasswordStrength);
																}
															}else {
																System.out.println("Slideshare Password Strength = 47.3");
																SlidesharePasswordStrength = "Slideshare Password Strength is: 47.3";
																writePasswordStrengthResultToFile(SlidesharePasswordStrength);
															}
														}else {
															System.out.println("Slideshare Password Strength = 47.0");
															SlidesharePasswordStrength = "Slideshare Password Strength is: 47.0";
															writePasswordStrengthResultToFile(SlidesharePasswordStrength);
														}
													}else {
														System.out.println("Slideshare Password Strength = 45.6");
														SlidesharePasswordStrength = "Slideshare Password Strength is: 45.6";
														writePasswordStrengthResultToFile(SlidesharePasswordStrength);
													}
												}else {
													System.out.println("Slideshare Password Strength = 41.4");
													SlidesharePasswordStrength = "Slideshare Password Strength is: 41.4";
													writePasswordStrengthResultToFile(SlidesharePasswordStrength);
												}
											}else {
												System.out.println("Slideshare Password Strength = 39.5");
												SlidesharePasswordStrength = "Slideshare Password Strength is: 39.5";
												writePasswordStrengthResultToFile(SlidesharePasswordStrength);
											}
										}else {
											System.out.println("Slideshare Password Strength = 37.6");
											SlidesharePasswordStrength = "Slideshare Password Strength is: 37.6";
											writePasswordStrengthResultToFile(SlidesharePasswordStrength);
										}
									}else {
										System.out.println("Slideshare Password Strength = 36.8");
										SlidesharePasswordStrength = "Slideshare Password Strength is: 36.8";
										writePasswordStrengthResultToFile(SlidesharePasswordStrength);
									}
								}else {	
									System.out.println("Slideshare Password Strength = 35.7");
									SlidesharePasswordStrength = "Slideshare Password Strength is: 35.7";
									writePasswordStrengthResultToFile(SlidesharePasswordStrength);
								}
							}else {
								System.out.println("Slideshare Password Strength = 35.5");
								SlidesharePasswordStrength = "Slideshare Password Strength is: 35.5";
								writePasswordStrengthResultToFile(SlidesharePasswordStrength);
							}
						}else {
							System.out.println("Slideshare Password Strength = 34.2");
							SlidesharePasswordStrength = "Slideshare Password Strength is: 34.2";
							writePasswordStrengthResultToFile(SlidesharePasswordStrength);
						}
					}else {
						System.out.println("Slideshare Password Strength = 33.2");
						SlidesharePasswordStrength = "Slideshare Password Strength is: 33.2";
						writePasswordStrengthResultToFile(SlidesharePasswordStrength);
					}
				}else {
					System.out.println("Slideshare Password Strength = 31.0");
					SlidesharePasswordStrength = "Slideshare Password Strength is: 31.0";
					writePasswordStrengthResultToFile(SlidesharePasswordStrength);
					}
			}else {
				System.out.println("Slideshare Password Strength = 28.2");
				SlidesharePasswordStrength = "Slideshare Password Strength is: 28.2";
				writePasswordStrengthResultToFile(SlidesharePasswordStrength);
			}			
		}else {
			System.out.println("Slideshare Password Strength = 26.6");
			SlidesharePasswordStrength = "Slideshare Password Strength is: 26.6";
			writePasswordStrengthResultToFile(SlidesharePasswordStrength);
			}		
	}else {
		System.out.println("Slideshare Password Strength = 19.9");
		SlidesharePasswordStrength = "Slideshare Password Strength is: 19.9";
		writePasswordStrengthResultToFile(SlidesharePasswordStrength);
		}			
}
}
