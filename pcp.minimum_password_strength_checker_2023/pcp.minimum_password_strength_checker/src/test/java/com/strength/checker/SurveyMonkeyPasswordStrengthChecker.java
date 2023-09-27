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
import com.strength.checker.framework.SurveyMonkeyScreens;


public class SurveyMonkeyPasswordStrengthChecker extends Base{

	String SurveyMonkeyUrl = "SurveyMonkeyUrl";
	String username;
	String email;
	String dob = "26/04/1992";
	int n = 3;
	String SurveyMonkeyPasswordStrength;
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
	String blocklistScenarioThirty = "blocklistScenarioThirty";
	String blocklistScenarioThirtyOne = "blocklistScenarioThirtyOne";
	String blocklistScenarioThirtyTwo = "blocklistScenarioThirtyTwo";
	String blocklistScenarioThirtyThree = "blocklistScenarioThirtyThree";
	
	
	@Test
	public void SurveyMonkeyPwdStrengthChecker() throws Exception {
		propertiesFileLoad(SurveyMonkeyUrl);
		SurveyMonkeyUrl = lobConfigProp.getProperty("SurveyMonkeyUrl");
		
		 driver.get(SurveyMonkeyUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		SurveyMonkeyScreens executor = new SurveyMonkeyScreens(driver);
		WebDriverWait w = new WebDriverWait(driver, 10);
		try {
        w.until(ExpectedConditions
                .presenceOfElementLocated(executor.acceptCookie));
		
		
			if (executor.isElementPresent(executor.acceptCookie)) {
				executor.acceptCookie();
			}
			}catch(Exception e){
				System.out.println(e);
			}
		
		GenericMethods numGenerator = new GenericMethods(driver);
		username = "Jerry" + numGenerator.getAlphaNumericString(n);
		email = username + "@rocketmail.com";
		
		executor.clickOnSignUpButton();
		Thread.sleep(2000);
		executor.enterEmail(email);	
		Thread.sleep(2000);
		executor.clickOnAgreeCheckBox();
		Thread.sleep(2000);
		executor.clickOnContinueButton();
		Thread.sleep(4000);
		
		//Execute test cases
		//blocklistScenario 1: 
		blocklistScenarioOne = propertiesFileLoad(blocklistScenarioOne);
		executor.enterPassword(blocklistScenarioOne);
		Thread.sleep(2000);
		executor.enterConfirmPassword(blocklistScenarioOne); 
		Thread.sleep(2000);
		
		try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
		Thread.sleep(2000);
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("blocklistScenario 2: Website does not accept blocklistScenario 1");
			
			//blocklistScenario 2: 
			blocklistScenarioTwo = propertiesFileLoad(blocklistScenarioTwo);
			WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
			WebElement cpwd = driver.findElement(By.xpath("//input[@id='input1']"));
			Actions a = new Actions(driver);
			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			executor.enterPassword(blocklistScenarioTwo);
			Thread.sleep(2000);
			a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			executor.enterConfirmPassword(blocklistScenarioTwo); 
			try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
			Thread.sleep(2000);
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("blocklistScenario 3: Website does not accept blocklistScenario 2");
				
				//blocklistScenario 3: 
				blocklistScenarioThree = propertiesFileLoad(blocklistScenarioThree);
				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
				executor.enterPassword(blocklistScenarioThree);
				Thread.sleep(2000);
				a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
				executor.enterConfirmPassword(blocklistScenarioThree); 
				try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
				Thread.sleep(2000);
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("blocklistScenario 4: Website does not accept blocklistScenario 3");
					
					//blocklistScenario 4: 
					blocklistScenarioFour = propertiesFileLoad(blocklistScenarioFour);
					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					executor.enterPassword(blocklistScenarioFour);
					Thread.sleep(2000);
					a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
					executor.enterConfirmPassword(blocklistScenarioFour); 
					try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
					Thread.sleep(2000);
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("blocklistScenario 5: Website does not accept blocklistScenario 4");
						
						//blocklistScenario 5: 
						blocklistScenarioFive = propertiesFileLoad(blocklistScenarioFive);
						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
						executor.enterPassword(blocklistScenarioFive);
						Thread.sleep(2000);
						a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
						executor.enterConfirmPassword(blocklistScenarioFive); 
						try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
						Thread.sleep(2000);
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("blocklistScenario 6: Website does not accept blocklistScenario 5");
							
							//blocklistScenario 6: 
							blocklistScenarioSix = propertiesFileLoad(blocklistScenarioSix);
							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
							executor.enterPassword(blocklistScenarioSix);
							Thread.sleep(2000);
							a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
							executor.enterConfirmPassword(blocklistScenarioSix); 
							try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
							Thread.sleep(2000);
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("blocklistScenario 7: Website does not accept blocklistScenario 6");
								
								//blocklistScenario 7: 
								blocklistScenarioSeven = propertiesFileLoad(blocklistScenarioSeven);
								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
								executor.enterPassword(blocklistScenarioSeven);
								Thread.sleep(2000);
								a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
								executor.enterConfirmPassword(blocklistScenarioSeven); 
								try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
								Thread.sleep(2000);
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("blocklistScenario 8: Website does not accept blocklistScenario 7");
									
									//blocklistScenario 8: 
									blocklistScenarioEight = propertiesFileLoad(blocklistScenarioEight);
									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
									executor.enterPassword(blocklistScenarioEight);
									Thread.sleep(2000);
									a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
									executor.enterConfirmPassword(blocklistScenarioEight); 
									try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
									Thread.sleep(2000);
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("blocklistScenario 9: Website does not accept blocklistScenario 8");
										
										//blocklistScenario 9: 
										blocklistScenarioNine = propertiesFileLoad(blocklistScenarioNine);
										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
										executor.enterPassword(blocklistScenarioNine);
										Thread.sleep(2000);
										a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
										executor.enterConfirmPassword(blocklistScenarioNine); 
										try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
										Thread.sleep(2000);
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("blocklistScenario 10: Website does not accept blocklistScenario 9");
											
											//blocklistScenario 10: 
											blocklistScenarioTen = propertiesFileLoad(blocklistScenarioTen);
											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
											executor.enterPassword(blocklistScenarioTen);
											Thread.sleep(2000);
											a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
											executor.enterConfirmPassword(blocklistScenarioTen); 
											try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
											Thread.sleep(2000);
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("blocklistScenario 11: Website does not accept blocklistScenario 10");
												
												//blocklistScenario 11: 
												blocklistScenarioEleven = propertiesFileLoad(blocklistScenarioEleven);
												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
												executor.enterPassword(blocklistScenarioEleven);
												Thread.sleep(2000);
												a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
												executor.enterConfirmPassword(blocklistScenarioEleven); 
												try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
												Thread.sleep(2000);
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("blocklistScenario 12: Website does not accept blocklistScenario 11");
													
													//blocklistScenario 12: 
													blocklistScenarioTwelve = propertiesFileLoad(blocklistScenarioTwelve);
													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
													executor.enterPassword(blocklistScenarioTwelve);
													Thread.sleep(2000);
													a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
													executor.enterConfirmPassword(blocklistScenarioTwelve); 
													try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
													Thread.sleep(2000);
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("blocklistScenario 13: Website does not accept blocklistScenario 12");
														
														//blocklistScenario 13: 
														blocklistScenarioThirteen = propertiesFileLoad(blocklistScenarioThirteen);
														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
														executor.enterPassword(blocklistScenarioThirteen);
														Thread.sleep(2000);
														a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
														executor.enterConfirmPassword(blocklistScenarioThirteen); 
														try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
														Thread.sleep(2000);
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("blocklistScenario 14: Website does not accept blocklistScenario 13");
															
															//blocklistScenario 14: 
															blocklistScenarioFourteen = propertiesFileLoad(blocklistScenarioFourteen);
															a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
															executor.enterPassword(blocklistScenarioFourteen);
															Thread.sleep(2000);
															a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
															executor.enterConfirmPassword(blocklistScenarioFourteen); 
															try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
															Thread.sleep(2000);
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("blocklistScenario 15: Website does not accept blocklistScenario 14");
																
																//blocklistScenario 15: 
																blocklistScenarioFifteen = propertiesFileLoad(blocklistScenarioFifteen);
																a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																executor.enterPassword(blocklistScenarioFifteen);
																Thread.sleep(2000);
																a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																executor.enterConfirmPassword(blocklistScenarioFifteen); 
																try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																Thread.sleep(2000);
																if (executor.isElementPresent(executor.errorToast)) {
																	System.out.println("blocklistScenario 16: Website does not accept blocklistScenario 15");
																	
																	//blocklistScenario 16: 
																	blocklistScenarioSixteen = propertiesFileLoad(blocklistScenarioSixteen);
																	a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																	executor.enterPassword(blocklistScenarioSixteen);
																	Thread.sleep(2000);
																	a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																	executor.enterConfirmPassword(blocklistScenarioSixteen); 
																	try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																	Thread.sleep(2000);
																	if (executor.isElementPresent(executor.errorToast)) {
																		System.out.println("blocklistScenario 17: Website does not accept blocklistScenario 16");
																		
																		//blocklistScenario 17: 
																		blocklistScenarioSeventeen = propertiesFileLoad(blocklistScenarioSeventeen);
																		a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																		executor.enterPassword(blocklistScenarioSeventeen);
																		Thread.sleep(2000);
																		a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																		executor.enterConfirmPassword(blocklistScenarioSeventeen); 
																		try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																		Thread.sleep(2000);
																		if (executor.isElementPresent(executor.errorToast)) {
																			System.out.println("blocklistScenario 18: Website does not accept blocklistScenario 17");
																			
																			//blocklistScenario 18: 
																			blocklistScenarioEighteen = propertiesFileLoad(blocklistScenarioEighteen);
																			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																			executor.enterPassword(blocklistScenarioEighteen);
																			Thread.sleep(2000);
																			a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																			executor.enterConfirmPassword(blocklistScenarioEighteen); 
																			try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																			Thread.sleep(2000);
																			if (executor.isElementPresent(executor.errorToast)) {
																				System.out.println("blocklistScenario 19: Website does not accept blocklistScenario 18");
																				
																				//blocklistScenario 19: 
																				blocklistScenarioNineteen = propertiesFileLoad(blocklistScenarioNineteen);
																				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																				executor.enterPassword(blocklistScenarioNineteen);
																				Thread.sleep(2000);
																				a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																				executor.enterConfirmPassword(blocklistScenarioNineteen); 
																				try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																				Thread.sleep(2000);
																				if (executor.isElementPresent(executor.errorToast)) {
																					System.out.println("blocklistScenario 20: Website does not accept blocklistScenario 19");
																					
																					//blocklistScenario 20: 
																					blocklistScenarioTwenty = propertiesFileLoad(blocklistScenarioTwenty);
																					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																					executor.enterPassword(blocklistScenarioTwenty);
																					Thread.sleep(2000);
																					a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																					executor.enterConfirmPassword(blocklistScenarioTwenty); 
																					try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																					Thread.sleep(2000);
																					if (executor.isElementPresent(executor.errorToast)) {
																						System.out.println("blocklistScenario 21: Website does not accept blocklistScenario 20");
																						
																						//blocklistScenario 21: 
																						blocklistScenarioTwentyOne = propertiesFileLoad(blocklistScenarioTwentyOne);
																						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																						executor.enterPassword(blocklistScenarioTwentyOne);
																						Thread.sleep(2000);
																						a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																						executor.enterConfirmPassword(blocklistScenarioTwentyOne); 
																						try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																						Thread.sleep(2000);
																						if (executor.isElementPresent(executor.errorToast)) {
																							System.out.println("blocklistScenario 22: Website does not accept blocklistScenario 21");
																							
																							//blocklistScenario 22: 
																							blocklistScenarioTwentyTwo = propertiesFileLoad(blocklistScenarioTwentyTwo);
																							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																							executor.enterPassword(blocklistScenarioTwentyTwo);
																							Thread.sleep(2000);
																							a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																							executor.enterConfirmPassword(blocklistScenarioTwentyTwo); 
																							try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																							Thread.sleep(2000);
																							if (executor.isElementPresent(executor.errorToast)) {
																								System.out.println("blocklistScenario 23: Website does not accept blocklistScenario 22");
																								
																								//blocklistScenario 23: 
																								blocklistScenarioTwentyThree = propertiesFileLoad(blocklistScenarioTwentyThree);
																								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																								executor.enterPassword(blocklistScenarioTwentyThree);
																								Thread.sleep(2000);
																								a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																								executor.enterConfirmPassword(blocklistScenarioTwentyThree); 
																								try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																								Thread.sleep(2000);
																								if (executor.isElementPresent(executor.errorToast)) {
																									System.out.println("blocklistScenario 24: Website does not accept blocklistScenario 23");
																									
																									//blocklistScenario 24: 
																									blocklistScenarioTwentyFour = propertiesFileLoad(blocklistScenarioTwentyFour);
																									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																									executor.enterPassword(blocklistScenarioTwentyFour);
																									Thread.sleep(2000);
																									a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																									executor.enterConfirmPassword(blocklistScenarioTwentyFour); 
																									try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																									Thread.sleep(2000);
																									
																									if (executor.isElementPresent(executor.errorToast)) {
																										System.out.println("blocklistScenario 25: Website does not accept blocklistScenario 24");
																										
																										//blocklistScenario 25: 
																										blocklistScenarioTwentyFive = propertiesFileLoad(blocklistScenarioTwentyFive);
																										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																										executor.enterPassword(blocklistScenarioTwentyFive);
																										Thread.sleep(2000);
																										a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																										executor.enterConfirmPassword(blocklistScenarioTwentyFive); 
																										try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																										Thread.sleep(2000);
																										
																										if (executor.isElementPresent(executor.errorToast)) {
																											System.out.println("blocklistScenario 26: Website does not accept blocklistScenario 25");
																											
																											//blocklistScenario 26: 
																											blocklistScenarioTwentySix = propertiesFileLoad(blocklistScenarioTwentySix);
																											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																											executor.enterPassword(blocklistScenarioTwentySix);
																											Thread.sleep(2000);
																											a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																											executor.enterConfirmPassword(blocklistScenarioTwentySix); 
																											try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																											Thread.sleep(2000);
																											
																											if (executor.isElementPresent(executor.errorToast)) {
																												System.out.println("blocklistScenario 27: Website does not accept blocklistScenario 26");
																												
																												//blocklistScenario 27: 
																												blocklistScenarioTwentySeven = propertiesFileLoad(blocklistScenarioTwentySeven);
																												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																												executor.enterPassword(blocklistScenarioTwentySeven);
																												Thread.sleep(2000);
																												a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																												executor.enterConfirmPassword(blocklistScenarioTwentySeven); 
																												try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																												Thread.sleep(2000);
																												
																												if (executor.isElementPresent(executor.errorToast)) {
																													System.out.println("blocklistScenario 28: Website does not accept blocklistScenario 27");
																													
																													//blocklistScenario 28: 
																													blocklistScenarioTwentyEight = propertiesFileLoad(blocklistScenarioTwentyEight);
																													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																													executor.enterPassword(blocklistScenarioTwentyEight);
																													Thread.sleep(2000);
																													a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																													executor.enterConfirmPassword(blocklistScenarioTwentyEight); 
																													try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																													Thread.sleep(2000);
																													
																													if (executor.isElementPresent(executor.errorToast)) {
																														System.out.println("blocklistScenario 29: Website does not accept blocklistScenario 28");
																														
																														//blocklistScenario 29: 
																														blocklistScenarioTwentyNine = propertiesFileLoad(blocklistScenarioTwentyNine);
																														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																														executor.enterPassword(blocklistScenarioTwentyNine);
																														Thread.sleep(2000);
																														a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																														executor.enterConfirmPassword(blocklistScenarioTwentyNine);
																														try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																														Thread.sleep(2000);
																														
																														if (executor.isElementPresent(executor.errorToast)) {
																															System.out.println("blocklistScenario 30: Website does not accept blocklistScenario 29");
																															
																															//blocklistScenario 29: 
																															blocklistScenarioTwentyNine = propertiesFileLoad(blocklistScenarioTwentyNine);
																															a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																															executor.enterPassword(blocklistScenarioThirty);
																															Thread.sleep(2000);
																															a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																															executor.enterConfirmPassword(blocklistScenarioThirty);
																															try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																															Thread.sleep(2000);
																															
																															if (executor.isElementPresent(executor.errorToast)) {
																																System.out.println("blocklistScenario 31: Website does not accept blocklistScenario 30");
																																
																																//blocklistScenario 29: 
																																blocklistScenarioTwentyNine = propertiesFileLoad(blocklistScenarioTwentyNine);
																																a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																executor.enterPassword(blocklistScenarioThirtyOne);
																																Thread.sleep(2000);
																																a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																																executor.enterConfirmPassword(blocklistScenarioThirtyOne); 
																																try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																																Thread.sleep(2000);
																																
																																if (executor.isElementPresent(executor.errorToast)) {
																																	System.out.println("blocklistScenario 32: Website does not accept blocklistScenario 31");
																																	
																																	//blocklistScenario 29: 
																																	blocklistScenarioTwentyNine = propertiesFileLoad(blocklistScenarioTwentyNine);
																																	a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																	executor.enterPassword(blocklistScenarioThirtyTwo);
																																	Thread.sleep(2000);
																																	a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																																	executor.enterConfirmPassword(blocklistScenarioThirtyTwo); 
																																	try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																																	Thread.sleep(2000);
																																	
																																	if (executor.isElementPresent(executor.errorToast)) {
																																		System.out.println("blocklistScenario 33: Website does not accept blocklistScenario 32");
																																		
																																		//blocklistScenario 29: 
																																		blocklistScenarioTwentyNine = propertiesFileLoad(blocklistScenarioTwentyNine);
																																		a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																		executor.enterPassword(blocklistScenarioThirtyThree);
																																		Thread.sleep(2000);
																																		a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform(); 
																																		executor.enterConfirmPassword(blocklistScenarioThirtyThree); 
																																		try {
		executor.clickOnSubmit();
		} catch (Exception e) {
			System.out.println(e); 
		}
		
																																		Thread.sleep(2000);
																														
																																		if (executor.isElementPresent(executor.errorToast)) {
																																		SurveyMonkeyPasswordStrength = "blocklistScenarios Not Sufficient. Need more blocklistScenarios to determine SurveyMonkey Password Strength";			
																																		writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																																			}else {
																																		System.out.println("SurveyMonkey Password Strength = 79.1");
																																		SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 79.1";
																																		writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																																	}
																																}else {
																																	System.out.println("SurveyMonkey Password Strength = 71.4");
																																	SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 71.4";
																																	writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																																}
																															}else {
																																System.out.println("SurveyMonkey Password Strength = 70.9");
																																SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 70.9";
																																writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																															}
																														}else {
																															System.out.println("SurveyMonkey Password Strength = 68.4");
																															SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 68.4";
																															writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																														}
																													}else {
																														System.out.println("SurveyMonkey Password Strength = 65.9");
																														SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 65.9";
																														writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																													}
																												}else {
																													System.out.println("SurveyMonkey Password Strength = 65.5");
																													SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 65.5";
																													writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);	
																												}
																											}else {
																												System.out.println("SurveyMonkey Password Strength = 62.0");
																												SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 62.0";
																												writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);		
																											}
																										}else {
																											System.out.println("SurveyMonkey Password Strength = 61.3");
																											SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 61.3";
																											writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);			
																										}
																									}else {
																										System.out.println("SurveyMonkey Password Strength = 59.5");
																										SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 59.5";
																										writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																									}
																								}else {
																									System.out.println("SurveyMonkey Password Strength = 59.1");
																									SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 59.1";
																									writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																									
																								}	
																							}else {
																								System.out.println("SurveyMonkey Password Strength = 57.0");
																								SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 57.0";
																								writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																							}
																						}else {
																							System.out.println("SurveyMonkey Password Strength = 54.6");
																							SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 54.6";
																							writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																						}
																					}else {
																						System.out.println("SurveyMonkey Password Strength = 52.7");
																						SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 52.7";
																						writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																					}
																				}else {
																					System.out.println("SurveyMonkey Password Strength = 51.7");
																					SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 51.7";
																					writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																				}
																			}else {
																				System.out.println("SurveyMonkey Password Strength = 49.1");
																				SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 49.1";
																				writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																			}
																		}else {
																			System.out.println("SurveyMonkey Password Strength = 47.6");
																			SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 47.6";
																			writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																		}
																	}else {
																		System.out.println("SurveyMonkey Password Strength = 47.3");
																		SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 47.3";
																		writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																	}
																}else {
																	System.out.println("SurveyMonkey Password Strength = 47.0");
																	SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 47.0";
																	writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
																}
															}else {
																System.out.println("SurveyMonkey Password Strength = 45.6");
																SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 45.6";
																writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
															}
														}else {
															System.out.println("SurveyMonkey Password Strength = 43.7");
															SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 43.7";
															writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
														}
													}else {
														System.out.println("SurveyMonkey Password Strength = 41.4");
														SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 41.4";
														writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
													}
												}else {
													System.out.println("SurveyMonkey Password Strength = 39.5");
													SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 39.5";
													writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
												}
											}else {
												System.out.println("SurveyMonkey Password Strength = 37.6");
												SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 37.6";
												writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
											}
										}else {
											System.out.println("SurveyMonkey Password Strength = 36.8");
											SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 36.8";
											writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
										}
									}else {
										System.out.println("SurveyMonkey Password Strength = 35.7");
										SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 35.7";
										writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
									}
								}else {	
									System.out.println("SurveyMonkey Password Strength = 35.5");
									SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 35.5";
									writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
								}
							}else {
								System.out.println("SurveyMonkey Password Strength = 34.2");
								SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 34.2";
								writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
							}
						}else {
							System.out.println("SurveyMonkey Password Strength = 33.2");
							SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 33.2";
							writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
						}
					}else {
						System.out.println("SurveyMonkey Password Strength = 32.8");
						SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 32.8";
						writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
					}
				}else {
					System.out.println("SurveyMonkey Password Strength = 31.0");
					SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 31.0";
					writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
					}
			}else {
				System.out.println("SurveyMonkey Password Strength = 28.2");
				SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 28.2";
				writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
			}			
		}else {
			System.out.println("SurveyMonkey Password Strength = 26.6");
			SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 26.6";
			writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
			}		
	}else {
		System.out.println("SurveyMonkey Password Strength = 19.9");
		SurveyMonkeyPasswordStrength = "SurveyMonkey Password Strength is: 19.9";
		writePasswordStrengthResultToFile(SurveyMonkeyPasswordStrength); writePasswordStrengthResultToFile("Account created on SurveyMonkey is : " + email);
		}			
}
}
