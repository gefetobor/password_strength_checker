package com.strength.checker;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GenericMethods;
import com.strength.checker.framework.MitScreens;


public class MitPasswordStrengthChecker extends Base{

	String MitUrl = "MitUrl";
	String lastname;
	String firstname;
	String email;
	String account;
	int n = 2;
	int m = 3;
	String MitPasswordStrength;
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
	public void MitPwdStrengthChecker() throws Exception {
		propertiesFileLoad(MitUrl);
		MitUrl = lobConfigProp.getProperty("MitUrl");
		 driver.get(MitUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		MitScreens executor = new MitScreens(driver);
			
		GenericMethods numGenerator = new GenericMethods(driver);
		firstname = "Toby" + numGenerator.getAlphaNumericString(n) + numGenerator.getAlphaNumericString(m);
		lastname = "Saint" + numGenerator.getAlphaNumericString(n) + numGenerator.getAlphaNumericString(m);
		email = "Anabel" + numGenerator.getAlphaNumericString(m) + "@gmail.com";
		
		account = "Account Created = " + email + ", " + firstname + ", " + lastname + ".";
		executor.enterEmail(email);
		
		executor.enterFirstName(firstname);
		
		executor.enterLastName(lastname);
		
		//Execute test cases
				//Scenario 1: 
				scenarioOne = propertiesFileLoad(scenarioOne);
				executor.enterPassword(scenarioOne);
				executor.reTypePassword(scenarioOne); 
				
				WebElement createAcct = driver.findElement(By.xpath("//*[@id='body']/form[2]/p/input[1]"));
				Actions a = new Actions(driver);
				a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

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
					System.out.println("Attempt to Click on Create Acct");
					a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

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
						System.out.println("Attempt to Click on Create Acct");
						a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

						
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 4: Website does not accept scenario 3");
							
							//Scenario 4: 
							scenarioFour = propertiesFileLoad(scenarioFour);
							executor.clearPasswordField();
							executor.clearReTypePasswordField();
							executor.enterPassword(scenarioFour);
							executor.reTypePassword(scenarioFour);
							a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

							
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 5: Website does not accept scenario 4");
								
								//Scenario 5: 
								scenarioFive = propertiesFileLoad(scenarioFive);
								executor.clearPasswordField();
								executor.clearReTypePasswordField();
								executor.enterPassword(scenarioFive);
								executor.reTypePassword(scenarioFive);
								a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

								
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 6: Website does not accept scenario 5");
									
									//Scenario 6: 
									scenarioSix = propertiesFileLoad(scenarioSix);
									executor.clearPasswordField();
									executor.clearReTypePasswordField();
									executor.enterPassword(scenarioSix);
									executor.reTypePassword(scenarioSix);
									a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

									
									Thread.sleep(2000);
									
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 7: Website does not accept scenario 6");
										
										//Scenario 7: 
										scenarioSeven = propertiesFileLoad(scenarioSeven);
										executor.clearPasswordField();
										executor.clearReTypePasswordField();
										executor.enterPassword(scenarioSeven);
										executor.reTypePassword(scenarioSeven);
										a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

										
										Thread.sleep(2000);
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("Scenario 8: Website does not accept scenario 7");
											
											//Scenario 8: 
											scenarioEight = propertiesFileLoad(scenarioEight);
											executor.clearPasswordField();
											executor.clearReTypePasswordField();
											executor.enterPassword(scenarioEight);
											executor.reTypePassword(scenarioEight);
											a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

											
											Thread.sleep(2000);
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("Scenario 9: Website does not accept scenario 8");
												
												//Scenario 9: 
												scenarioNine = propertiesFileLoad(scenarioNine);
												executor.clearPasswordField();
												executor.clearReTypePasswordField();
												executor.enterPassword(scenarioNine);
												executor.reTypePassword(scenarioNine);
												a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

												
												Thread.sleep(2000);
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("Scenario 10: Website does not accept scenario 9");
													
													//Scenario 10: 
													scenarioTen = propertiesFileLoad(scenarioTen);
													executor.clearPasswordField();
													executor.clearReTypePasswordField();
													executor.enterPassword(scenarioTen);
													executor.reTypePassword(scenarioTen);
													a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

													
													Thread.sleep(2000);
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("Scenario 11: Website does not accept scenario 10");
														
														//Scenario 11: 
														scenarioEleven = propertiesFileLoad(scenarioEleven);
														executor.clearPasswordField();
														executor.clearReTypePasswordField();
														executor.enterPassword(scenarioEleven);
														executor.reTypePassword(scenarioEleven);
														a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

														
														Thread.sleep(2000);
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("Scenario 12: Website does not accept scenario 11");
															
															//Scenario 12: 
															scenarioTwelve = propertiesFileLoad(scenarioTwelve);
															executor.clearPasswordField();
															executor.clearReTypePasswordField();
															executor.enterPassword(scenarioTwelve);
															executor.reTypePassword(scenarioTwelve);
															a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

															
															Thread.sleep(2000);
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("Scenario 13: Website does not accept scenario 12");
																
																//Scenario 13: 
																scenarioThirteen = propertiesFileLoad(scenarioThirteen);
																executor.clearPasswordField();
																executor.clearReTypePasswordField();
																executor.enterPassword(scenarioThirteen);
																executor.reTypePassword(scenarioThirteen);
																a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																
																Thread.sleep(2000);
																if (executor.isElementPresent(executor.errorToast)) {
																	System.out.println("Scenario 14: Website does not accept scenario 13");
																	
																	//Scenario 14: 
																	scenarioFourteen = propertiesFileLoad(scenarioFourteen);
																	executor.clearPasswordField();
																	executor.clearReTypePasswordField();
																	executor.enterPassword(scenarioFourteen);
																	executor.reTypePassword(scenarioFourteen);
																	a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																	
																	Thread.sleep(2000);
																	if (executor.isElementPresent(executor.errorToast)) {
																		System.out.println("Scenario 15: Website does not accept scenario 14");
																		
																		//Scenario 15: 
																		scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																		executor.clearPasswordField();
																		executor.clearReTypePasswordField();
																		executor.enterPassword(scenarioFifteen);
																		executor.reTypePassword(scenarioFifteen);
																		a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																		
																		Thread.sleep(2000);
																		if (executor.isElementPresent(executor.errorToast)) {
																			System.out.println("Scenario 16: Website does not accept scenario 15");
																			
																			//Scenario 16: 
																			scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																			executor.clearPasswordField();
																			executor.clearReTypePasswordField();
																			executor.enterPassword(scenarioSixteen);
																			executor.reTypePassword(scenarioSixteen);
																			a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																			
																			Thread.sleep(2000);
																			if (executor.isElementPresent(executor.errorToast)) {
																				System.out.println("Scenario 17: Website does not accept scenario 16");
																				
																				//Scenario 17: 
																				scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																				executor.clearPasswordField();
																				executor.clearReTypePasswordField();
																				executor.enterPassword(scenarioSeventeen);
																				executor.reTypePassword(scenarioSeventeen);
																				a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																				
																				Thread.sleep(2000);
																				if (executor.isElementPresent(executor.errorToast)) {
																					System.out.println("Scenario 18: Website does not accept scenario 17");
																					
																					//Scenario 18: 
																					scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																					executor.clearPasswordField();
																					executor.clearReTypePasswordField();
																					executor.enterPassword(scenarioEighteen);
																					executor.reTypePassword(scenarioEighteen);
																					a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																					
																					Thread.sleep(2000);
																					if (executor.isElementPresent(executor.errorToast)) {
																						System.out.println("Scenario 19: Website does not accept scenario 18");
																						
																						//Scenario 19: 
																						scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																						executor.clearPasswordField();
																						executor.clearReTypePasswordField();
																						executor.enterPassword(scenarioNineteen);
																						executor.reTypePassword(scenarioNineteen);
																						a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																						
																						Thread.sleep(2000);
																						if (executor.isElementPresent(executor.errorToast)) {
																							System.out.println("Scenario 20: Website does not accept scenario 19");
																							
																							//Scenario 20: 
																							scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																							executor.clearPasswordField();
																							executor.clearReTypePasswordField();
																							executor.enterPassword(scenarioTwenty);
																							executor.reTypePassword(scenarioTwenty);
																							a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																							
																							Thread.sleep(2000);
																							if (executor.isElementPresent(executor.errorToast)) {
																								System.out.println("Scenario 21: Website does not accept scenario 20");
																								
																								//Scenario 21: 
																								scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																								executor.clearPasswordField();
																								executor.clearReTypePasswordField();
																								executor.enterPassword(scenarioTwentyOne);
																								executor.reTypePassword(scenarioTwentyOne);
																								a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																								
																								Thread.sleep(2000);
																								if (executor.isElementPresent(executor.errorToast)) {
																									System.out.println("Scenario 22: Website does not accept scenario 21");
																									
																									//Scenario 22: 
																									scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																									executor.clearPasswordField();
																									executor.clearReTypePasswordField();
																									executor.enterPassword(scenarioTwentyTwo);
																									executor.reTypePassword(scenarioTwentyTwo);
																									a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																									
																									Thread.sleep(2000);
																									if (executor.isElementPresent(executor.errorToast)) {
																										System.out.println("Scenario 23: Website does not accept scenario 22");
																										
																										//Scenario 23: 
																										scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																										executor.clearPasswordField();
																										executor.clearReTypePasswordField();
																										executor.enterPassword(scenarioTwentyThree);
																										executor.reTypePassword(scenarioTwentyThree);
																										a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																										
																										Thread.sleep(2000);
																										if (executor.isElementPresent(executor.errorToast)) {
																											System.out.println("Scenario 24: Website does not accept scenario 23");
																											
																											//Scenario 24: 
																											scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																											executor.clearPasswordField();
																											executor.clearReTypePasswordField();
																											executor.enterPassword(scenarioTwentyFour);
																											executor.reTypePassword(scenarioTwentyFour);
																											a.moveToElement(createAcct).sendKeys(Keys.ENTER).perform();

																											
																											Thread.sleep(2000);
																											MitPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Mit Password Strength";			
																											writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																										}else {
																											System.out.println("Mit Password Strength = 65.9");
																											MitPasswordStrength = "Mit Password Strength is: 65.9";
																											writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																										}
																									}else {
																										System.out.println("Mit Password Strength = 61.3");
																										MitPasswordStrength = "Mit Password Strength is: 61.3";
																										writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																									}
																								}else {
																									System.out.println("Mit Password Strength = 59.5");
																									MitPasswordStrength = "Mit Password Strength is: 59.5";
																									writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																								}
																							}else {
																								System.out.println("Mit Password Strength = 59.1");
																								MitPasswordStrength = "Mit Password Strength is: 59.1";
																								writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																							}
																						}else {
																							System.out.println("Mit Password Strength = 57.0");
																							MitPasswordStrength = "Mit Password Strength is: 57.0";
																							writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																						}
																					}else {
																						System.out.println("Mit Password Strength = 51.7");
																						MitPasswordStrength = "Mit Password Strength is: 51.7";
																						writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																					}
																				}else {
																					System.out.println("Mit Password Strength = 49.1");
																					MitPasswordStrength = "Mit Password Strength is: 49.1";
																					writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																				}
																			}else {
																				System.out.println("Mit Password Strength = 47.6");
																				MitPasswordStrength = "Mit Password Strength is: 47.6";
																				writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																			}
																		}else {
																			System.out.println("Mit Password Strength = 47.3");
																			MitPasswordStrength = "Mit Password Strength is: 47.3";
																			writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																		}
																	}else {
																		System.out.println("Mit Password Strength = 47.0");
																		MitPasswordStrength = "Mit Password Strength is: 47.0";
																		writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																	}
																}else {
																	System.out.println("Mit Password Strength = 45.6");
																	MitPasswordStrength = "Mit Password Strength is: 45.6";
																	writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
																}
															}else {
										System.out.println("Mit Password Strength = 41.4");
										MitPasswordStrength = "Mit Password Strength is: 41.4";
										writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
									}
							
								}else {
									System.out.println("Mit Password Strength = 39.5");
									MitPasswordStrength = "Mit Password Strength is: 39.5";
									writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
								}
							}else {
								System.out.println("Mit Password Strength = 37.6");
								MitPasswordStrength = "Mit Password Strength is: 37.6";
								writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
							}
						}else {
							System.out.println("Mit Password Strength = 36.8");
							MitPasswordStrength = "Mit Password Strength is: 36.8";
							writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
						}
					}else {	
						System.out.println("Mit Password Strength = 35.7");
						MitPasswordStrength = "Mit Password Strength is: 35.7";
						writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
					}
				}else {
					System.out.println("Mit Password Strength = 35.5");
					MitPasswordStrength = "Mit Password Strength is: 35.5";
					writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
				}
			}else {
				System.out.println("Mit Password Strength = 34.2");
				MitPasswordStrength = "Mit Password Strength is: 34.2";
				writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
			}
		}else {
			System.out.println("Mit Password Strength = 33.2");
			MitPasswordStrength = "Mit Password Strength is: 33.2";
			writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
		}
	}else {
		System.out.println("Mit Password Strength = 31.0");
		MitPasswordStrength = "Mit Password Strength is: 31.0";
		writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
	}
			}else {
			System.out.println("Mit Password Strength = 28.2");
			MitPasswordStrength = "Mit Password Strength is: 28.2";
			writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
		}

	}else {
		System.out.println("Mit Password Strength = 26.6");
		MitPasswordStrength = "Mit Password Strength is: 26.6";
		writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
		}

	}
	else {
	System.out.println("Mit Password Strength = 19.9");
	MitPasswordStrength = "Mit Password Strength is: 19.9";
	writePasswordStrengthResultToFile(MitPasswordStrength); writePasswordStrengthResultToFile(account);
	}
		
	}
}
