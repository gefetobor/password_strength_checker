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
import com.strength.checker.framework.FacebookScreens;
import com.strength.checker.framework.GenericMethods;




public class FacebookPasswordStrengthChecker extends Base{

	String facebookUrl = "facebookUrl";
	String facebookEmail;
	String facebookPassword;
	int n = 5;
	String FacebookPasswordStrength;
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
	public void facebookPasswordStrengthChecker() throws Exception {
		propertiesFileLoad(facebookUrl);
		facebookUrl = lobConfigProp.getProperty("facebookUrl");
		 driver.get(facebookUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
		
		FacebookScreens executor = new FacebookScreens(driver);
		
		//Click on Create Account
		
		WebDriverWait w = new WebDriverWait(driver, 10);
		try {
        w.until(ExpectedConditions
                .presenceOfElementLocated(executor.acceptCookies));
		
		
			if (executor.isElementPresent(executor.acceptCookies)) {
				executor.clickOnAcceptCookies();
			}
			}catch(Exception e){
				System.out.println(e);
			}
		executor.clickOnCreateAccountButton();
		GenericMethods numGenerator = new GenericMethods(driver);
		facebookEmail = "Jerry" + numGenerator.randomFirstName() + "@gmail.com";
		String firstName = numGenerator.randomFirstName();
		Thread.sleep(1500);
		String surName = numGenerator.randomFirstName();
		Thread.sleep(1500);
		//Enter firstname and surname
		executor.enterFirstName(firstName);
		Thread.sleep(1500);
		executor.enterSurnameField(surName);
		Thread.sleep(1500);
		//Enter facebookEmail
		executor.enterEmailAddressField(facebookEmail);
		Thread.sleep(1500);
		executor.clickOnRenterEmailField();
		Thread.sleep(1500);
		executor.reEnterEmailAddressField(facebookEmail);
		Thread.sleep(1500);

		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		Thread.sleep(1500);
		executor.clickOnDOBField();
		Thread.sleep(1500);
		executor.selectNinetyOneOption();
		Thread.sleep(1500);
		executor.selectMaleGenderOption();
		executor.clickOnSubmitButton();	
		
		
		System.out.println("waiting for toast");
			if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
				System.out.println("Scenario 2: Website does not accept scenario 1");
				
				//Scenario 2: 
				scenarioTwo = propertiesFileLoad(scenarioTwo);
				WebElement pwd = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
				Actions a = new Actions(driver);
				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
				Thread.sleep(1500);
				executor.enterPassword(scenarioTwo);
				executor.clickOnSubmitButton();
				
				Thread.sleep(1500);
				if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
					System.out.println("Scenario 3: Website does not accept scenario 2");
					
					//Scenario 3: 
					scenarioThree = propertiesFileLoad(scenarioThree);
					
					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					Thread.sleep(1500);
					executor.enterPassword(scenarioThree);
					executor.clickOnSubmitButton();
								Thread.sleep(1500);
					
					if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
						System.out.println("Scenario 4: Website does not accept scenario 3");
						
						//Scenario 4: 
						scenarioFour = propertiesFileLoad(scenarioFour);
						Thread.sleep(1500);
						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
						Thread.sleep(1500);
						executor.enterPassword(scenarioFour);
						executor.clickOnSubmitButton();
						
						Thread.sleep(1500);
						if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
							System.out.println("Scenario 5: Website does not accept scenario 4");
							
							//Scenario 5: 
							scenarioFive = propertiesFileLoad(scenarioFive);
							Thread.sleep(1500);
							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
							Thread.sleep(1500);
							executor.enterPassword(scenarioFive);
							executor.clickOnSubmitButton();
							
							Thread.sleep(1500);
							if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
								System.out.println("Scenario 6: Website does not accept scenario 5");
								
								//Scenario 6: 
								scenarioSix = propertiesFileLoad(scenarioSix);
								Thread.sleep(1500);
								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
								Thread.sleep(1500);
								executor.enterPassword(scenarioSix);
								executor.clickOnSubmitButton();
								
								Thread.sleep(1500);
								if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
									System.out.println("Scenario 7: Website does not accept scenario 6");
									
									//Scenario 7: 
									scenarioSeven = propertiesFileLoad(scenarioSeven);
									Thread.sleep(1500);
									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
									Thread.sleep(1500);
									executor.enterPassword(scenarioSeven);
									executor.clickOnSubmitButton();
									
									if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
										System.out.println("Scenario 8: Website does not accept scenario 7");
										
										//Scenario 8: 
										scenarioEight = propertiesFileLoad(scenarioEight);
										Thread.sleep(1500);
										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
										Thread.sleep(1500);
										executor.enterPassword(scenarioEight);
										executor.clickOnSubmitButton();
										
										if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
											System.out.println("Scenario 9: Website does not accept scenario 8");
											
											//Scenario 9: 
											scenarioNine = propertiesFileLoad(scenarioNine);
											Thread.sleep(1500);
											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
											Thread.sleep(1500);
											executor.enterPassword(scenarioNine);
											executor.clickOnSubmitButton();
											
											if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
												System.out.println("Scenario 10: Website does not accept scenario 9");
												
												//Scenario 10: 
												scenarioTen = propertiesFileLoad(scenarioTen);
												Thread.sleep(1500);
												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
												Thread.sleep(1500);
												executor.enterPassword(scenarioTen);
												executor.clickOnSubmitButton();
												
												if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
													System.out.println("Scenario 11: Website does not accept scenario 10");
													
													//Scenario 11: 
													scenarioEleven = propertiesFileLoad(scenarioEleven);
													Thread.sleep(1500);
													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
													executor.enterPassword(scenarioEleven);
													executor.clickOnSubmitButton();
													
													if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
														System.out.println("Scenario 12: Website does not accept scenario 11");
														
														//Scenario 12: 
														scenarioTwelve = propertiesFileLoad(scenarioTwelve);
														Thread.sleep(1500);
														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
														executor.enterPassword(scenarioTwelve);
														executor.clickOnSubmitButton();
														
														if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
															System.out.println("Scenario 13: Website does not accept scenario 12");
															
															//Scenario 13: 
															scenarioThirteen = propertiesFileLoad(scenarioThirteen);
															Thread.sleep(1500);
															a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
															executor.enterPassword(scenarioThirteen);
															executor.clickOnSubmitButton();
															
															if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																System.out.println("Scenario 14: Website does not accept scenario 13");
																
																//Scenario 14: 
																scenarioFourteen = propertiesFileLoad(scenarioFourteen);
																Thread.sleep(1500);
																a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																executor.enterPassword(scenarioFourteen);
																executor.clickOnSubmitButton();
																
																if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																	System.out.println("Scenario 15: Website does not accept scenario 14");
																	
																	//Scenario 15: 
																	scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																	Thread.sleep(1500);
																	a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																	executor.enterPassword(scenarioFifteen);
																	executor.clickOnSubmitButton();
																	
																	if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																		System.out.println("Scenario 16: Website does not accept scenario 15");
																		
																		//Scenario 16: 
																		scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																		Thread.sleep(1500);
																		a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																		executor.enterPassword(scenarioSixteen);
																		executor.clickOnSubmitButton();
																		
																		if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																			System.out.println("Scenario 17: Website does not accept scenario 16");
																			
																			//Scenario 17: 
																			scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																			Thread.sleep(1500);
																			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																			executor.enterPassword(scenarioSeventeen);
																			executor.clickOnSubmitButton();
																			
																			if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																				System.out.println("Scenario 18: Website does not accept scenario 17");
																				
																				//Scenario 18: 
																				scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																				Thread.sleep(1500);
																				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																				executor.enterPassword(scenarioEighteen);
																				executor.clickOnSubmitButton();
																				
																				if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																					System.out.println("Scenario 19: Website does not accept scenario 18");
																					
																					//Scenario 19: 
																					scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																					executor.enterPassword(scenarioNineteen);
																					executor.clickOnSubmitButton();
																					
																					if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																						System.out.println("Scenario 20: Website does not accept scenario 19");
																						
																						//Scenario 20: 
																						scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																						executor.enterPassword(scenarioTwenty);
																						executor.clickOnSubmitButton();
																						
																						if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																							System.out.println("Scenario 21: Website does not accept scenario 20");
																							
																							//Scenario 21: 
																							scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																							executor.enterPassword(scenarioTwentyOne);
																							executor.clickOnSubmitButton();
																							
																							if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																								System.out.println("Scenario 22: Website does not accept scenario 21");
																								
																								//Scenario 22: 
																								scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																								executor.enterPassword(scenarioTwentyTwo);
																								executor.clickOnSubmitButton();
																								
																								if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																									System.out.println("Scenario 23: Website does not accept scenario 22");
																									
																									//Scenario 23: 
																									scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																									executor.enterPassword(scenarioTwentyThree);
																									executor.clickOnSubmitButton();
																									
																									if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																										System.out.println("Scenario 24: Website does not accept scenario 23");
																										
																										//Scenario 24: 
																										scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																										executor.enterPassword(scenarioTwentyFour);
																										executor.clickOnSubmitButton();
																										
																										
																										if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																											System.out.println("Scenario 25: Website does not accept scenario 24");
																											
																											//Scenario 25: 
																											scenarioTwentyFive = propertiesFileLoad(scenarioTwentyFive);
																											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																											executor.enterPassword(scenarioTwentyFive);
																											executor.clickOnSubmitButton();
																											
																											
																											if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																												System.out.println("Scenario 26: Website does not accept scenario 25");
																												
																												//Scenario 26: 
																												scenarioTwentySix = propertiesFileLoad(scenarioTwentySix);
																												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																												executor.enterPassword(scenarioTwentySix);
																												executor.clickOnSubmitButton();
																												
																												
																												if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																													System.out.println("Scenario 27: Website does not accept scenario 26");
																													
																													//Scenario 27: 
																													scenarioTwentySeven = propertiesFileLoad(scenarioTwentySeven);
																													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																													executor.enterPassword(scenarioTwentySeven);
																													executor.clickOnSubmitButton();
																													
																													
																													if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																														System.out.println("Scenario 28: Website does not accept scenario 27");
																														
																														//Scenario 28: 
																														scenarioTwentyEight = propertiesFileLoad(scenarioTwentyEight);
																														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																														executor.enterPassword(scenarioTwentyEight);
																														executor.clickOnSubmitButton();
																														
																														
																														if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																															System.out.println("Scenario 29: Website does not accept scenario 28");
																															
																															//Scenario 29: 
																															scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																															a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																															executor.enterPassword(scenarioTwentyNine);
																															executor.clickOnSubmitButton();
																															
																															
																															if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																																System.out.println("Scenario 30: Website does not accept scenario 29");
																																
																																//Scenario 30: 
																																scenarioThirty = propertiesFileLoad(scenarioThirty);
																																a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																executor.enterPassword(scenarioThirty);
																																executor.clickOnSubmitButton();
																																
																																
																																if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																																	System.out.println("Scenario 31: Website does not accept scenario 30");
																																	
																																	//Scenario 31: 
																																	scenarioThirtyOne = propertiesFileLoad(scenarioThirtyOne);
																																	a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																	executor.enterPassword(scenarioThirtyOne);
																																	executor.clickOnSubmitButton();
																																	
																																	
																																	if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																																		System.out.println("Scenario 32: Website does not accept scenario 31");
																																		
																																		//Scenario 32: 
																																		scenarioThirtyTwo = propertiesFileLoad(scenarioThirtyTwo);
																																		a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																		executor.enterPassword(scenarioThirtyTwo);
																																		executor.clickOnSubmitButton();
																																		
																																		
																																		if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																																			System.out.println("Scenario 33: Website does not accept scenario 32");
																																			
																																			//Scenario 33: 
																																			scenarioThirtyThree = propertiesFileLoad(scenarioThirtyThree);
																																			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																			executor.enterPassword(scenarioThirtyThree);
																																			executor.clickOnSubmitButton();
																																			
																															
																																			if (executor.isElementPresent(executor.errorToastOne) || executor.isElementPresent(executor.errorToastTwo)) {
																																			FacebookPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Facebook Password Strength";			
																																			writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																																				}else {
																																			System.out.println("Facebook Password Strength = 79.1");
																																			FacebookPasswordStrength = "Facebook Password Strength is: 79.1";
																																			writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																																		}
																																	}else {
																																		System.out.println("Facebook Password Strength = 71.4");
																																		FacebookPasswordStrength = "Facebook Password Strength is: 71.4";
																																		writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																																	}
																																}else {
																																	System.out.println("Facebook Password Strength = 70.9");
																																	FacebookPasswordStrength = "Facebook Password Strength is: 70.9";
																																	writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																																}
																															}else {
																																System.out.println("Facebook Password Strength = 68.4");
																																FacebookPasswordStrength = "Facebook Password Strength is: 68.4";
																																writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																															}
																														}else {
																															System.out.println("Facebook Password Strength = 65.9");
																															FacebookPasswordStrength = "Facebook Password Strength is: 65.9";
																															writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																														}
																													}else {
																														System.out.println("Facebook Password Strength = 65.5");
																														FacebookPasswordStrength = "Facebook Password Strength is: 65.5";
																														writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);	
																													}
																												}else {
																													System.out.println("Facebook Password Strength = 62.0");
																													FacebookPasswordStrength = "Facebook Password Strength is: 62.0";
																													writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);		
																												}
																											}else {
																												System.out.println("Facebook Password Strength = 61.3");
																												FacebookPasswordStrength = "Facebook Password Strength is: 61.3";
																												writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);			
																											}
																										}else {
																											System.out.println("Facebook Password Strength = 59.5");
																											FacebookPasswordStrength = "Facebook Password Strength is: 59.5";
																											writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																										}
																									}else {
																										System.out.println("Facebook Password Strength = 59.1");
																										FacebookPasswordStrength = "Facebook Password Strength is: 59.1";
																										writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																										
																									}	
																								}else {
																									System.out.println("Facebook Password Strength = 57.0");
																									FacebookPasswordStrength = "Facebook Password Strength is: 57.0";
																									writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																								}
																							}else {
																								System.out.println("Facebook Password Strength = 54.6");
																								FacebookPasswordStrength = "Facebook Password Strength is: 54.6";
																								writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																							}
																						}else {
																							System.out.println("Facebook Password Strength = 52.7");
																							FacebookPasswordStrength = "Facebook Password Strength is: 52.7";
																							writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																						}
																					}else {
																						System.out.println("Facebook Password Strength = 51.7");
																						FacebookPasswordStrength = "Facebook Password Strength is: 51.7";
																						writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																					}
																				}else {
																					System.out.println("Facebook Password Strength = 49.1");
																					FacebookPasswordStrength = "Facebook Password Strength is: 49.1";
																					writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																				}
																			}else {
																				System.out.println("Facebook Password Strength = 47.6");
																				FacebookPasswordStrength = "Facebook Password Strength is: 47.6";
																				writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																			}
																		}else {
																			System.out.println("Facebook Password Strength = 47.3");
																			FacebookPasswordStrength = "Facebook Password Strength is: 47.3";
																			writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																		}
																	}else {
																		System.out.println("Facebook Password Strength = 47.0");
																		FacebookPasswordStrength = "Facebook Password Strength is: 47.0";
																		writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																	}
																}else {
																	System.out.println("Facebook Password Strength = 45.6");
																	FacebookPasswordStrength = "Facebook Password Strength is: 45.6";
																	writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
																}
															}else {
																System.out.println("Facebook Password Strength = 43.7");
																FacebookPasswordStrength = "Facebook Password Strength is: 43.7";
																writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
															}
														}else {
															System.out.println("Facebook Password Strength = 41.4");
															FacebookPasswordStrength = "Facebook Password Strength is: 41.4";
															writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
														}
													}else {
														System.out.println("Facebook Password Strength = 39.5");
														FacebookPasswordStrength = "Facebook Password Strength is: 39.5";
														writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
													}
												}else {
													System.out.println("Facebook Password Strength = 37.6");
													FacebookPasswordStrength = "Facebook Password Strength is: 37.6";
													writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
												}
											}else {
												System.out.println("Facebook Password Strength = 36.8");
												FacebookPasswordStrength = "Facebook Password Strength is: 36.8";
												writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
											}
										}else {
											System.out.println("Facebook Password Strength = 35.7");
											FacebookPasswordStrength = "Facebook Password Strength is: 35.7";
											writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
										}
									}else {	
										System.out.println("Facebook Password Strength = 35.5");
										FacebookPasswordStrength = "Facebook Password Strength is: 35.5";
										writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
									}
								}else {
									System.out.println("Facebook Password Strength = 34.2");
									FacebookPasswordStrength = "Facebook Password Strength is: 34.2";
									writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
								}
							}else {
								System.out.println("Facebook Password Strength = 33.2");
								FacebookPasswordStrength = "Facebook Password Strength is: 33.2";
								writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
							}
						}else {
							System.out.println("Facebook Password Strength = 32.8");
							FacebookPasswordStrength = "Facebook Password Strength is: 32.8";
							writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
						}
					}else {
						System.out.println("Facebook Password Strength = 31.0");
						FacebookPasswordStrength = "Facebook Password Strength is: 31.0";
						writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
						}
				}else {
					System.out.println("Facebook Password Strength = 28.2");
					FacebookPasswordStrength = "Facebook Password Strength is: 28.2";
					writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
				}			
			}else {
				System.out.println("Facebook Password Strength = 26.6");
				FacebookPasswordStrength = "Facebook Password Strength is: 26.6";
				writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
				}		
		}else {
			System.out.println("Facebook Password Strength = 19.9");
			FacebookPasswordStrength = "Facebook Password Strength is: 19.9";
			writePasswordStrengthResultToFile(FacebookPasswordStrength); writePasswordStrengthResultToFile("Account created on Facebook is : " + facebookEmail);
			}			
	}
	}