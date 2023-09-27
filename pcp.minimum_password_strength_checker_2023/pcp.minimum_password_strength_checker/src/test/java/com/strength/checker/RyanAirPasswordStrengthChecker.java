package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.RyanAirScreens;


public class RyanAirPasswordStrengthChecker extends Base{

	String RyanAirUrl = "RyanAirUrl";
	String username;
	String email;
	String dob = "26/04/1992";
	int n = 3;
	String RyanAirPasswordStrength;
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
	String scenarioThirty = "scenarioThirty";
	String scenarioThirtyOne = "scenarioThirtyOne";
	String scenarioThirtyTwo = "scenarioThirtyTwo";
	String scenarioThirtyThree = "scenarioThirtyThree";
	
	
	@Test
	public void RyanAirPwdStrengthChecker() throws Exception {
		propertiesFileLoad(RyanAirUrl);
		RyanAirUrl = lobConfigProp.getProperty("RyanAirUrl");
		
		 driver.get(RyanAirUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		RyanAirScreens executor = new RyanAirScreens(driver);
		WebDriverWait w = new WebDriverWait(driver, 10);
		try {
        w.until(ExpectedConditions
                .presenceOfElementLocated(executor.acceptCookie));
		
		
			if (executor.isElementPresent(executor.acceptCookie)) {
				executor.acceptCookie();
				Thread.sleep(2000);
			}
			}catch(Exception e){
				System.out.println(e);
			}
		
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerry" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		
		Thread.sleep(2000);
		executor.clickOnSignUpButton();
		Thread.sleep(3000);
		
		//driver.switchTo().frame(0);
		
		executor.enterEmail(email);
		Thread.sleep(2000);
		
		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		Thread.sleep(3000);
		executor.clickOnSubmit();
		Thread.sleep(3000);
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
			Actions a = new Actions(driver);
			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			executor.enterPassword(scenarioTwo);
			executor.clickOnSubmit();
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
				executor.enterPassword(scenarioThree);
				executor.clickOnSubmit();
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					executor.enterPassword(scenarioFour);
					executor.clickOnSubmit();
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
						executor.enterPassword(scenarioFive);
						executor.clickOnSubmit();
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
							executor.enterPassword(scenarioSix);
							executor.clickOnSubmit();
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
								executor.enterPassword(scenarioSeven);
								executor.clickOnSubmit();
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
									executor.enterPassword(scenarioEight);
									executor.clickOnSubmit();
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
										executor.enterPassword(scenarioNine);
										executor.clickOnSubmit();
										Thread.sleep(2000);
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("Scenario 10: Website does not accept scenario 9");
											
											//Scenario 10: 
											scenarioTen = propertiesFileLoad(scenarioTen);
											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
											executor.enterPassword(scenarioTen);
											executor.clickOnSubmit();
											Thread.sleep(2000);
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("Scenario 11: Website does not accept scenario 10");
												
												//Scenario 11: 
												scenarioEleven = propertiesFileLoad(scenarioEleven);
												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
												executor.enterPassword(scenarioEleven);
												executor.clickOnSubmit();
												Thread.sleep(2000);
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("Scenario 12: Website does not accept scenario 11");
													
													//Scenario 12: 
													scenarioTwelve = propertiesFileLoad(scenarioTwelve);
													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
													executor.enterPassword(scenarioTwelve);
													executor.clickOnSubmit();
													Thread.sleep(2000);
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("Scenario 13: Website does not accept scenario 12");
														
														//Scenario 13: 
														scenarioThirteen = propertiesFileLoad(scenarioThirteen);
														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
														executor.enterPassword(scenarioThirteen);
														executor.clickOnSubmit();
														Thread.sleep(2000);
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("Scenario 14: Website does not accept scenario 13");
															
															//Scenario 14: 
															scenarioFourteen = propertiesFileLoad(scenarioFourteen);
															a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
															executor.enterPassword(scenarioFourteen);
															executor.clickOnSubmit();
															Thread.sleep(2000);
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("Scenario 15: Website does not accept scenario 14");
																
																//Scenario 15: 
																scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																executor.enterPassword(scenarioFifteen);
																executor.clickOnSubmit();
																Thread.sleep(2000);
																if (executor.isElementPresent(executor.errorToast)) {
																	System.out.println("Scenario 16: Website does not accept scenario 15");
																	
																	//Scenario 16: 
																	scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																	a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																	executor.enterPassword(scenarioSixteen);
																	executor.clickOnSubmit();
																	Thread.sleep(2000);
																	if (executor.isElementPresent(executor.errorToast)) {
																		System.out.println("Scenario 17: Website does not accept scenario 16");
																		
																		//Scenario 17: 
																		scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																		a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																		executor.enterPassword(scenarioSeventeen);
																		executor.clickOnSubmit();
																		Thread.sleep(2000);
																		if (executor.isElementPresent(executor.errorToast)) {
																			System.out.println("Scenario 18: Website does not accept scenario 17");
																			
																			//Scenario 18: 
																			scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																			executor.enterPassword(scenarioEighteen);
																			executor.clickOnSubmit();
																			Thread.sleep(2000);
																			if (executor.isElementPresent(executor.errorToast)) {
																				System.out.println("Scenario 19: Website does not accept scenario 18");
																				
																				//Scenario 19: 
																				scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																				executor.enterPassword(scenarioNineteen);
																				executor.clickOnSubmit();
																				Thread.sleep(2000);
																				if (executor.isElementPresent(executor.errorToast)) {
																					System.out.println("Scenario 20: Website does not accept scenario 19");
																					
																					//Scenario 20: 
																					scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																					executor.enterPassword(scenarioTwenty);
																					executor.clickOnSubmit();
																					Thread.sleep(2000);
																					if (executor.isElementPresent(executor.errorToast)) {
																						System.out.println("Scenario 21: Website does not accept scenario 20");
																						
																						//Scenario 21: 
																						scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																						executor.enterPassword(scenarioTwentyOne);
																						executor.clickOnSubmit();
																						Thread.sleep(2000);
																						if (executor.isElementPresent(executor.errorToast)) {
																							System.out.println("Scenario 22: Website does not accept scenario 21");
																							
																							//Scenario 22: 
																							scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																							executor.enterPassword(scenarioTwentyTwo);
																							executor.clickOnSubmit();
																							Thread.sleep(2000);
																							if (executor.isElementPresent(executor.errorToast)) {
																								System.out.println("Scenario 23: Website does not accept scenario 22");
																								
																								//Scenario 23: 
																								scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																								executor.enterPassword(scenarioTwentyThree);
																								executor.clickOnSubmit();
																								Thread.sleep(2000);
																								if (executor.isElementPresent(executor.errorToast)) {
																									System.out.println("Scenario 24: Website does not accept scenario 23");
																									
																									//Scenario 24: 
																									scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																									executor.enterPassword(scenarioTwentyFour);
																									executor.clickOnSubmit();
																									Thread.sleep(2000);
																									
																									if (executor.isElementPresent(executor.errorToast)) {
																										System.out.println("Scenario 25: Website does not accept scenario 24");
																										
																										//Scenario 25: 
																										scenarioTwentyFive = propertiesFileLoad(scenarioTwentyFive);
																										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																										executor.enterPassword(scenarioTwentyFive);
																										executor.clickOnSubmit();
																										Thread.sleep(2000);
																										
																										if (executor.isElementPresent(executor.errorToast)) {
																											System.out.println("Scenario 26: Website does not accept scenario 25");
																											
																											//Scenario 26: 
																											scenarioTwentySix = propertiesFileLoad(scenarioTwentySix);
																											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																											executor.enterPassword(scenarioTwentySix);
																											executor.clickOnSubmit();
																											Thread.sleep(2000);
																											
																											if (executor.isElementPresent(executor.errorToast)) {
																												System.out.println("Scenario 27: Website does not accept scenario 26");
																												
																												//Scenario 27: 
																												scenarioTwentySeven = propertiesFileLoad(scenarioTwentySeven);
																												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																												executor.enterPassword(scenarioTwentySeven);
																												executor.clickOnSubmit();
																												Thread.sleep(2000);
																												
																												if (executor.isElementPresent(executor.errorToast)) {
																													System.out.println("Scenario 28: Website does not accept scenario 27");
																													
																													//Scenario 28: 
																													scenarioTwentyEight = propertiesFileLoad(scenarioTwentyEight);
																													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																													executor.enterPassword(scenarioTwentyEight);
																													executor.clickOnSubmit();
																													Thread.sleep(2000);
																													
																													if (executor.isElementPresent(executor.errorToast)) {
																														System.out.println("Scenario 29: Website does not accept scenario 28");
																														
																														//Scenario 29: 
																														scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																														executor.enterPassword(scenarioTwentyNine);
																														executor.clickOnSubmit();
																														Thread.sleep(2000);
																														
																														if (executor.isElementPresent(executor.errorToast)) {
																															System.out.println("Scenario 30: Website does not accept scenario 29");
																															
																															//Scenario 30: 
																															scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																															a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																															executor.enterPassword(scenarioThirty);
																															executor.clickOnSubmit();
																															Thread.sleep(2000);
																															
																															if (executor.isElementPresent(executor.errorToast)) {
																																System.out.println("Scenario 31: Website does not accept scenario 30");
																																
																																//Scenario 31: 
																																scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																																a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																executor.enterPassword(scenarioThirtyOne);
																																executor.clickOnSubmit();
																																Thread.sleep(2000);
																																
																																if (executor.isElementPresent(executor.errorToast)) {
																																	System.out.println("Scenario 32: Website does not accept scenario 31");
																																	
																																	//Scenario 32: 
																																	scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																																	a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																	executor.enterPassword(scenarioThirtyTwo);
																																	executor.clickOnSubmit();
																																	Thread.sleep(2000);
																																	
																																	if (executor.isElementPresent(executor.errorToast)) {
																																		System.out.println("Scenario 33: Website does not accept scenario 32");
																																		
																																		//Scenario 33: 
																																		scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																																		a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																		executor.enterPassword(scenarioThirtyThree);
																																		executor.clickOnSubmit();
																																		Thread.sleep(2000);
																														
																																		if (executor.isElementPresent(executor.errorToast)) {
																																		RyanAirPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine RyanAir Password Strength";			
																																		writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																																			}else {
																																		System.out.println("RyanAir Password Strength = 79.1");
																																		RyanAirPasswordStrength = "RyanAir Password Strength is: 79.1";
																																		writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																																	}
																																}else {
																																	System.out.println("RyanAir Password Strength = 71.4");
																																	RyanAirPasswordStrength = "RyanAir Password Strength is: 71.4";
																																	writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																																}
																															}else {
																																System.out.println("RyanAir Password Strength = 70.9");
																																RyanAirPasswordStrength = "RyanAir Password Strength is: 70.9";
																																writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																															}
																														}else {
																															System.out.println("RyanAir Password Strength = 68.4");
																															RyanAirPasswordStrength = "RyanAir Password Strength is: 68.4";
																															writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																														}
																													}else {
																														System.out.println("RyanAir Password Strength = 65.9");
																														RyanAirPasswordStrength = "RyanAir Password Strength is: 65.9";
																														writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																													}
																												}else {
																													System.out.println("RyanAir Password Strength = 65.5");
																													RyanAirPasswordStrength = "RyanAir Password Strength is: 65.5";
																													writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);	
																												}
																											}else {
																												System.out.println("RyanAir Password Strength = 62.0");
																												RyanAirPasswordStrength = "RyanAir Password Strength is: 62.0";
																												writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);		
																											}
																										}else {
																											System.out.println("RyanAir Password Strength = 61.3");
																											RyanAirPasswordStrength = "RyanAir Password Strength is: 61.3";
																											writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);			
																										}
																									}else {
																										System.out.println("RyanAir Password Strength = 59.5");
																										RyanAirPasswordStrength = "RyanAir Password Strength is: 59.5";
																										writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																									}
																								}else {
																									System.out.println("RyanAir Password Strength = 59.1");
																									RyanAirPasswordStrength = "RyanAir Password Strength is: 59.1";
																									writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																									
																								}	
																							}else {
																								System.out.println("RyanAir Password Strength = 57.0");
																								RyanAirPasswordStrength = "RyanAir Password Strength is: 57.0";
																								writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																							}
																						}else {
																							System.out.println("RyanAir Password Strength = 54.6");
																							RyanAirPasswordStrength = "RyanAir Password Strength is: 54.6";
																							writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																						}
																					}else {
																						System.out.println("RyanAir Password Strength = 52.7");
																						RyanAirPasswordStrength = "RyanAir Password Strength is: 52.7";
																						writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																					}
																				}else {
																					System.out.println("RyanAir Password Strength = 51.7");
																					RyanAirPasswordStrength = "RyanAir Password Strength is: 51.7";
																					writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																				}
																			}else {
																				System.out.println("RyanAir Password Strength = 49.1");
																				RyanAirPasswordStrength = "RyanAir Password Strength is: 49.1";
																				writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																			}
																		}else {
																			System.out.println("RyanAir Password Strength = 47.6");
																			RyanAirPasswordStrength = "RyanAir Password Strength is: 47.6";
																			writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																		}
																	}else {
																		System.out.println("RyanAir Password Strength = 47.3");
																		RyanAirPasswordStrength = "RyanAir Password Strength is: 47.3";
																		writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																	}
																}else {
																	System.out.println("RyanAir Password Strength = 47.0");
																	RyanAirPasswordStrength = "RyanAir Password Strength is: 47.0";
																	writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
																}
															}else {
																System.out.println("RyanAir Password Strength = 45.6");
																RyanAirPasswordStrength = "RyanAir Password Strength is: 45.6";
																writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
															}
														}else {
															System.out.println("RyanAir Password Strength = 43.7");
															RyanAirPasswordStrength = "RyanAir Password Strength is: 43.7";
															writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
														}
													}else {
														System.out.println("RyanAir Password Strength = 41.4");
														RyanAirPasswordStrength = "RyanAir Password Strength is: 41.4";
														writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
													}
												}else {
													System.out.println("RyanAir Password Strength = 39.5");
													RyanAirPasswordStrength = "RyanAir Password Strength is: 39.5";
													writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
												}
											}else {
												System.out.println("RyanAir Password Strength = 37.6");
												RyanAirPasswordStrength = "RyanAir Password Strength is: 37.6";
												writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
											}
										}else {
											System.out.println("RyanAir Password Strength = 36.8");
											RyanAirPasswordStrength = "RyanAir Password Strength is: 36.8";
											writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
										}
									}else {
										System.out.println("RyanAir Password Strength = 35.7");
										RyanAirPasswordStrength = "RyanAir Password Strength is: 35.7";
										writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
									}
								}else {	
									System.out.println("RyanAir Password Strength = 35.5");
									RyanAirPasswordStrength = "RyanAir Password Strength is: 35.5";
									writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
								}
							}else {
								System.out.println("RyanAir Password Strength = 34.2");
								RyanAirPasswordStrength = "RyanAir Password Strength is: 34.2";
								writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
							}
						}else {
							System.out.println("RyanAir Password Strength = 33.2");
							RyanAirPasswordStrength = "RyanAir Password Strength is: 33.2";
							writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
						}
					}else {
						System.out.println("RyanAir Password Strength = 32.8");
						RyanAirPasswordStrength = "RyanAir Password Strength is: 32.8";
						writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
					}
				}else {
					System.out.println("RyanAir Password Strength = 31.0");
					RyanAirPasswordStrength = "RyanAir Password Strength is: 31.0";
					writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
					}
			}else {
				System.out.println("RyanAir Password Strength = 28.2");
				RyanAirPasswordStrength = "RyanAir Password Strength is: 28.2";
				writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
			}			
		}else {
			System.out.println("RyanAir Password Strength = 26.6");
			RyanAirPasswordStrength = "RyanAir Password Strength is: 26.6";
			writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
			}		
	}else {
		System.out.println("RyanAir Password Strength = 19.9");
		RyanAirPasswordStrength = "RyanAir Password Strength is: 19.9";
		writePasswordStrengthResultToFile(RyanAirPasswordStrength); writePasswordStrengthResultToFile("Account created on RyanAir is : " + email);
		}			
}
}
