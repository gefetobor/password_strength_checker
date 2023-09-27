package com.strength.checker;


import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.strength.checker.framework.Base;
import com.strength.checker.framework.GmailScreens;



public class GmailPasswordStrengthChecker extends Base{

	String gmailUrl = "gmailUrl";
	String googleUsername;
	String googlePassword;
	String email;
	String dob = "26/04/1992";
	String day ="26";
	String year ="2021";
	int n = 8;
	String GmailPasswordStrength;
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


	
	 static String getAlphaNumericString(int n)
	 {
	  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	         + "0123456789"
	         + "abcdefghijklmnopqrstuvxyz";
	  StringBuilder sb = new StringBuilder(n);
	  for (int i = 0; i < n; i++) {
	   int index
	    = (int)(AlphaNumericString.length()
	      * Math.random());
	   sb.append(AlphaNumericString
	      .charAt(index));
	  }
	  return sb.toString();
	 }
	 
/*	@BeforeMethod
	public void instantiateHelpers(String invokeDriver) throws Exception{
		//propertiesFileLoad(gmailUrl);
		//propertiesFileLoad(scenarioOne);
		gmailUrl = lobConfigProp.getProperty("gmailUrl");
		scenarioOne = lobConfigProp.getProperty("scenarioOne");

		}*/
	
	
	@Test
	public void gmailPasswordStrengthChecker() throws Exception {
		propertiesFileLoad(gmailUrl);
		 gmailUrl = lobConfigProp.getProperty("gmailUrl");
		 driver.get(gmailUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		GmailScreens executor = new GmailScreens(driver);
		
		//Click on Create Account
		executor.clickOnCreateAccountButton();
		Thread.sleep(3000);
		//Select my personal use
		executor.selectForMyPersonalUseOption();
		Thread.sleep(3000);
		//Enter first name
		googleUsername = "Jerry" + GmailPasswordStrengthChecker.getAlphaNumericString(n);
		executor.enterFirstName(googleUsername);
		Thread.sleep(3000);
		//Click on Next
		executor.clickOnNextButton();
		Thread.sleep(3000);
		//Enter Day
		executor.enterDay(day);
		Thread.sleep(3000);
		//Select Month
		executor.clickOnMonthDropdownButton();
		Thread.sleep(3000);
		executor.selectJanuaryOption();
		Thread.sleep(3000);
		//Enter Year
		executor.enterYear(year);
		Thread.sleep(3000);
		//DropDown Gender
		executor.clickOnGenderDropdownButton();
		Thread.sleep(3000);
		//Select Rather not say
		executor.selectRatherNotSayOption();
		Thread.sleep(3000);
		//Click on Next
		executor.clickOnNextButtonOnBasicInfoScreen();
		Thread.sleep(3000);
		//Select Create your own Gmail address
		executor.selectCreateYourOwnGmailAddressRadioButton();
		Thread.sleep(3000);
		//Enter an email
		executor.enterEmailAddress(googleUsername);
		Thread.sleep(3000);
		//Click on Next
		executor.clickOnNextButtonOnGmailAddressScreen();
		Thread.sleep(3000);
		//Execute test cases
		//Scenario 1: 
		scenarioOne = propertiesFileLoad(scenarioOne);
		executor.enterPassword(scenarioOne);
		executor.enterPasswordInConfirmPasswordField(scenarioOne);
		executor.clickOnNextOnCreatePasswordScreen();
		Thread.sleep(3000);
		
		if (executor.isElementPresent(executor.errorToast)) {
			System.out.println("Scenario 2: Website does not accept scenario 1");
			
			//Scenario 2: 
			scenarioTwo = propertiesFileLoad(scenarioTwo);
			WebElement pwd = driver.findElement(By.xpath("//*[@name='Passwd']"));
			WebElement cpwd = driver.findElement(By.xpath("//*[@name='PasswdAgain']"));
			Actions a = new Actions(driver);
			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			Thread.sleep(3000);
			a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
			Thread.sleep(3000);
			executor.enterPassword(scenarioTwo);
			Thread.sleep(3000);
			executor.enterPasswordInConfirmPasswordField(scenarioTwo);
			Thread.sleep(3000);
			executor.clickOnNextOnCreatePasswordScreen();
			Thread.sleep(3000);
			
			if (executor.isElementPresent(executor.errorToast)) {
				System.out.println("Scenario 3: Website does not accept scenario 2");
				
				//Scenario 3: 
				scenarioThree = propertiesFileLoad(scenarioThree);
				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
				Thread.sleep(3000);
				a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
				Thread.sleep(3000);
				executor.enterPassword(scenarioThree);
				Thread.sleep(3000);
				executor.enterPasswordInConfirmPasswordField(scenarioThree);
				Thread.sleep(3000);
				executor.clickOnNextOnCreatePasswordScreen();
				Thread.sleep(3000);
				
				if (executor.isElementPresent(executor.errorToast)) {
					System.out.println("Scenario 4: Website does not accept scenario 3");
					
					//Scenario 4: 
					scenarioFour = propertiesFileLoad(scenarioFour);
					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					Thread.sleep(3000);
					a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					Thread.sleep(3000);
					executor.enterPassword(scenarioFour);
					Thread.sleep(3000);
					executor.enterPasswordInConfirmPasswordField(scenarioFour);
					Thread.sleep(3000);
					executor.clickOnNextOnCreatePasswordScreen();
					Thread.sleep(3000);
					
					if (executor.isElementPresent(executor.errorToast)) {
						System.out.println("Scenario 5: Website does not accept scenario 4");
						
						//Scenario 5: 
						scenarioFive = propertiesFileLoad(scenarioFive);
						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
						Thread.sleep(3000);
						a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
						Thread.sleep(3000);
						executor.enterPassword(scenarioFive);
						Thread.sleep(3000);
						executor.enterPasswordInConfirmPasswordField(scenarioFive);
						Thread.sleep(3000);
						executor.clickOnNextOnCreatePasswordScreen();
						Thread.sleep(3000);
						
						if (executor.isElementPresent(executor.errorToast)) {
							System.out.println("Scenario 6: Website does not accept scenario 5");
							
							//Scenario 6: 
							scenarioSix = propertiesFileLoad(scenarioSix);
							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
							Thread.sleep(3000);
							a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
							Thread.sleep(3000);
							executor.enterPassword(scenarioSix);
							Thread.sleep(3000);
							executor.enterPasswordInConfirmPasswordField(scenarioSix);
							Thread.sleep(3000);
							executor.clickOnNextOnCreatePasswordScreen();
							Thread.sleep(3000);
							
							if (executor.isElementPresent(executor.errorToast)) {
								System.out.println("Scenario 7: Website does not accept scenario 6");
								
								//Scenario 7: 
								scenarioSeven = propertiesFileLoad(scenarioSeven);
								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
								Thread.sleep(3000);
								a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
								Thread.sleep(3000);
								executor.enterPassword(scenarioSeven);
								Thread.sleep(3000);
								executor.enterPasswordInConfirmPasswordField(scenarioSeven);
								Thread.sleep(3000);
								executor.clickOnNextOnCreatePasswordScreen();
								Thread.sleep(3000);
								
								if (executor.isElementPresent(executor.errorToast)) {
									System.out.println("Scenario 8: Website does not accept scenario 7");
									
									//Scenario 8: 
									scenarioEight = propertiesFileLoad(scenarioEight);
									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
									Thread.sleep(3000);
									a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
									Thread.sleep(3000);
									executor.enterPassword(scenarioEight);
									Thread.sleep(3000);
									executor.enterPasswordInConfirmPasswordField(scenarioEight);
									Thread.sleep(3000);
									executor.clickOnNextOnCreatePasswordScreen();
									Thread.sleep(3000);
									
									if (executor.isElementPresent(executor.errorToast)) {
										System.out.println("Scenario 9: Website does not accept scenario 8");
										
										//Scenario 9: 
										scenarioNine = propertiesFileLoad(scenarioNine);
										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
										Thread.sleep(3000);
										a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
										Thread.sleep(3000);
										executor.enterPassword(scenarioNine);
										Thread.sleep(3000);
										executor.enterPasswordInConfirmPasswordField(scenarioNine);
										Thread.sleep(3000);
										executor.clickOnNextOnCreatePasswordScreen();
										Thread.sleep(3000);
										
										if (executor.isElementPresent(executor.errorToast)) {
											System.out.println("Scenario 10: Website does not accept scenario 9");
											
											//Scenario 10: 
											scenarioTen = propertiesFileLoad(scenarioTen);
											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
											Thread.sleep(3000);
											a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
											Thread.sleep(3000);
											executor.enterPassword(scenarioTen);
											Thread.sleep(3000);
											executor.enterPasswordInConfirmPasswordField(scenarioTen);
											Thread.sleep(3000);
											executor.clickOnNextOnCreatePasswordScreen();
											Thread.sleep(3000);
											
											if (executor.isElementPresent(executor.errorToast)) {
												System.out.println("Scenario 11: Website does not accept scenario 10");
												
												//Scenario 11: 
												scenarioEleven = propertiesFileLoad(scenarioEleven);
												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
												Thread.sleep(3000);
												a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
												Thread.sleep(3000);
												executor.enterPassword(scenarioEleven);
												Thread.sleep(3000);
												executor.enterPasswordInConfirmPasswordField(scenarioEleven);
												Thread.sleep(3000);
												executor.clickOnNextOnCreatePasswordScreen();
												Thread.sleep(3000);
												
												if (executor.isElementPresent(executor.errorToast)) {
													System.out.println("Scenario 12: Website does not accept scenario 11");
													
													//Scenario 12: 
													scenarioTwelve = propertiesFileLoad(scenarioTwelve);
													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
													Thread.sleep(3000);
													a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
													Thread.sleep(3000);
													executor.enterPassword(scenarioTwelve);
													Thread.sleep(3000);
													executor.enterPasswordInConfirmPasswordField(scenarioTwelve);
													Thread.sleep(3000);
													executor.clickOnNextOnCreatePasswordScreen();
													Thread.sleep(3000);
													
													if (executor.isElementPresent(executor.errorToast)) {
														System.out.println("Scenario 13: Website does not accept scenario 12");
														
														//Scenario 13: 
														scenarioThirteen = propertiesFileLoad(scenarioThirteen);
														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
														Thread.sleep(3000);
														a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
														Thread.sleep(3000);
														executor.enterPassword(scenarioThirteen);
														Thread.sleep(3000);
														executor.enterPasswordInConfirmPasswordField(scenarioThirteen);
														Thread.sleep(3000);
														executor.clickOnNextOnCreatePasswordScreen();
														Thread.sleep(3000);
														
														if (executor.isElementPresent(executor.errorToast)) {
															System.out.println("Scenario 14: Website does not accept scenario 13");
															
															//Scenario 14: 
															scenarioFourteen = propertiesFileLoad(scenarioFourteen);
															a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
															Thread.sleep(3000);
															a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
															Thread.sleep(3000);
															executor.enterPassword(scenarioFourteen);
															Thread.sleep(3000);
															executor.enterPasswordInConfirmPasswordField(scenarioFourteen);
															Thread.sleep(3000);
															executor.clickOnNextOnCreatePasswordScreen();
															Thread.sleep(3000);
															
															if (executor.isElementPresent(executor.errorToast)) {
																System.out.println("Scenario 15: Website does not accept scenario 14");
																
																//Scenario 15: 
																scenarioFifteen = propertiesFileLoad(scenarioFifteen);
																a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																Thread.sleep(3000);
																a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																Thread.sleep(3000);
																executor.enterPassword(scenarioFifteen);
																Thread.sleep(3000);
																executor.enterPasswordInConfirmPasswordField(scenarioFifteen);
																Thread.sleep(3000);
																executor.clickOnNextOnCreatePasswordScreen();
																Thread.sleep(3000);
																
																if (executor.isElementPresent(executor.errorToast)) {
																	System.out.println("Scenario 16: Website does not accept scenario 15");
																	
																	//Scenario 16: 
																	scenarioSixteen = propertiesFileLoad(scenarioSixteen);
																	a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																	Thread.sleep(3000);
																	a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																	Thread.sleep(3000);
																	executor.enterPassword(scenarioSixteen);
																	Thread.sleep(3000);
																	executor.enterPasswordInConfirmPasswordField(scenarioSixteen);
																	Thread.sleep(3000);
																	executor.clickOnNextOnCreatePasswordScreen();
																	Thread.sleep(3000);
																	
																	if (executor.isElementPresent(executor.errorToast)) {
																		System.out.println("Scenario 17: Website does not accept scenario 16");
																		
																		//Scenario 17: 
																		scenarioSeventeen = propertiesFileLoad(scenarioSeventeen);
																		a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																		Thread.sleep(3000);
																		a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																		Thread.sleep(3000);
																		executor.enterPassword(scenarioSeventeen);
																		Thread.sleep(3000);
																		executor.enterPasswordInConfirmPasswordField(scenarioSeventeen);
																		Thread.sleep(3000);
																		executor.clickOnNextOnCreatePasswordScreen();
																		Thread.sleep(3000);
																		
																		if (executor.isElementPresent(executor.errorToast)) {
																			System.out.println("Scenario 18: Website does not accept scenario 17");
																			
																			//Scenario 18: 
																			scenarioEighteen = propertiesFileLoad(scenarioEighteen);
																			a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																			Thread.sleep(3000);
																			a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																			Thread.sleep(3000);
																			executor.enterPassword(scenarioEighteen);
																			Thread.sleep(3000);
																			executor.enterPasswordInConfirmPasswordField(scenarioEighteen);
																			Thread.sleep(3000);
																			executor.clickOnNextOnCreatePasswordScreen();
																			Thread.sleep(3000);
																			
																			if (executor.isElementPresent(executor.errorToast)) {
																				System.out.println("Scenario 19: Website does not accept scenario 18");
																				
																				//Scenario 19: 
																				scenarioNineteen = propertiesFileLoad(scenarioNineteen);
																				a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																				Thread.sleep(3000);
																				a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																				Thread.sleep(3000);
																				executor.enterPassword(scenarioNineteen);
																				Thread.sleep(3000);
																				executor.enterPasswordInConfirmPasswordField(scenarioNineteen);
																				Thread.sleep(3000);
																				executor.clickOnNextOnCreatePasswordScreen();
																				Thread.sleep(3000);
																				
																				if (executor.isElementPresent(executor.errorToast)) {
																					System.out.println("Scenario 20: Website does not accept scenario 19");
																					
																					//Scenario 20: 
																					scenarioTwenty = propertiesFileLoad(scenarioTwenty);
																					a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																					Thread.sleep(3000);
																					a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																					Thread.sleep(3000);
																					executor.enterPassword(scenarioTwenty);
																					Thread.sleep(3000);
																					executor.enterPasswordInConfirmPasswordField(scenarioTwenty);
																					Thread.sleep(3000);
																					executor.clickOnNextOnCreatePasswordScreen();
																					Thread.sleep(3000);
																					
																					if (executor.isElementPresent(executor.errorToast)) {
																						System.out.println("Scenario 21: Website does not accept scenario 20");
																						
																						//Scenario 21: 
																						scenarioTwentyOne = propertiesFileLoad(scenarioTwentyOne);
																						a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																						Thread.sleep(3000);
																						a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																						Thread.sleep(3000);
																						executor.enterPassword(scenarioTwentyOne);
																						Thread.sleep(3000);
																						executor.enterPasswordInConfirmPasswordField(scenarioTwentyOne);
																						Thread.sleep(3000);
																						executor.clickOnNextOnCreatePasswordScreen();
																						Thread.sleep(3000);
																						
																						if (executor.isElementPresent(executor.errorToast)) {
																							System.out.println("Scenario 22: Website does not accept scenario 21");
																							
																							//Scenario 22: 
																							scenarioTwentyTwo = propertiesFileLoad(scenarioTwentyTwo);
																							a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																							Thread.sleep(3000);
																							a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																							Thread.sleep(3000);
																							executor.enterPassword(scenarioTwentyThree);
																							Thread.sleep(3000);
																							executor.enterPasswordInConfirmPasswordField(scenarioTwentyThree);
																							Thread.sleep(3000);
																							executor.clickOnNextOnCreatePasswordScreen();
																							Thread.sleep(3000);
																							
																							if (executor.isElementPresent(executor.errorToast)) {
																								System.out.println("Scenario 23: Website does not accept scenario 22");
																								
																								//Scenario 23: 
																								scenarioTwentyThree = propertiesFileLoad(scenarioTwentyThree);
																								a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																								Thread.sleep(3000);
																								a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																								Thread.sleep(3000);
																								executor.enterPassword(scenarioTwo);
																								Thread.sleep(3000);
																								executor.enterPasswordInConfirmPasswordField(scenarioTwo);
																								Thread.sleep(3000);
																								executor.clickOnNextOnCreatePasswordScreen();
																								Thread.sleep(3000);
																								
																								if (executor.isElementPresent(executor.errorToast)) {
																									System.out.println("Scenario 24: Website does not accept scenario 23");
																									
																									//Scenario 24: 
																									scenarioTwentyFour = propertiesFileLoad(scenarioTwentyFour);
																									a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																									Thread.sleep(3000);
																									a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																									Thread.sleep(3000);
																									executor.enterPassword(scenarioTwentyFour);
																									Thread.sleep(3000);
																									executor.enterPasswordInConfirmPasswordField(scenarioTwentyFour);
																									Thread.sleep(3000);
																									executor.clickOnNextOnCreatePasswordScreen();
																									Thread.sleep(3000);
																									
																									if (executor.isElementPresent(executor.errorToast)) {
																										System.out.println("Scenario 25: Website does not accept scenario 24");
																										
																										//Scenario 25: 
																										scenarioTwentyFive = propertiesFileLoad(scenarioTwentyFive);
																										a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																										Thread.sleep(3000);
																										a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																										Thread.sleep(3000);
																										executor.enterPassword(scenarioTwentyFive);
																										Thread.sleep(3000);
																										executor.enterPasswordInConfirmPasswordField(scenarioTwentyFive);
																										Thread.sleep(3000);
																										executor.clickOnNextOnCreatePasswordScreen();
																										Thread.sleep(3000);
																										
																										if (executor.isElementPresent(executor.errorToast)) {
																											System.out.println("Scenario 26: Website does not accept scenario 25");
																											
																											//Scenario 26: 
																											scenarioTwentySix = propertiesFileLoad(scenarioTwentySix);
																											a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																											Thread.sleep(3000);
																											a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																											Thread.sleep(3000);
																											executor.enterPassword(scenarioTwentySix);
																											Thread.sleep(3000);
																											executor.enterPasswordInConfirmPasswordField(scenarioTwentySix);
																											Thread.sleep(3000);
																											executor.clickOnNextOnCreatePasswordScreen();
																											Thread.sleep(3000);
																											
																											if (executor.isElementPresent(executor.errorToast)) {
																												System.out.println("Scenario 27: Website does not accept scenario 26");
																												
																												//Scenario 27: 
																												scenarioTwentySeven = propertiesFileLoad(scenarioTwentySeven);
																												Thread.sleep(3000);
																												a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																												Thread.sleep(3000);
																												a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																												Thread.sleep(3000);
																												executor.enterPassword(scenarioTwentySeven);
																												Thread.sleep(3000);
																												executor.enterPasswordInConfirmPasswordField(scenarioTwentySeven);
																												Thread.sleep(3000);
																												executor.clickOnNextOnCreatePasswordScreen();
																												Thread.sleep(3000);
																												
																												if (executor.isElementPresent(executor.errorToast)) {
																													System.out.println("Scenario 28: Website does not accept scenario 27");
																													
																													//Scenario 28: 
																													scenarioTwentyEight = propertiesFileLoad(scenarioTwentyEight);
																													a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																													a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																													executor.enterPassword(scenarioTwentyEight);
																													executor.enterPasswordInConfirmPasswordField(scenarioTwentyEight);
																													executor.clickOnNextOnCreatePasswordScreen();
																													Thread.sleep(3000);
																													
																													if (executor.isElementPresent(executor.errorToast)) {
																														System.out.println("Scenario 29: Website does not accept scenario 28");
																														
																														//Scenario 29: 
																														scenarioTwentyNine = propertiesFileLoad(scenarioTwentyNine);
																														a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																														a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																														executor.enterPassword(scenarioTwentyNine);
																														executor.enterPasswordInConfirmPasswordField(scenarioTwentyNine);
																														executor.clickOnNextOnCreatePasswordScreen();
																														Thread.sleep(3000);
																														
																														if (executor.isElementPresent(executor.errorToast)) {
																															System.out.println("Scenario 30: Website does not accept scenario 29");
																															
																															//Scenario 30: 
																															scenarioThirty = propertiesFileLoad(scenarioThirty);
																															a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																															a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																															executor.enterPassword(scenarioThirty);
																															executor.enterPasswordInConfirmPasswordField(scenarioThirty);
																															executor.clickOnNextOnCreatePasswordScreen();
																															Thread.sleep(3000);
																															
																															if (executor.isElementPresent(executor.errorToast)) {
																																System.out.println("Scenario 31: Website does not accept scenario 30");
																																
																																//Scenario 31: 
																																scenarioThirtyOne = propertiesFileLoad(scenarioThirtyOne);
																																a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																executor.enterPassword(scenarioThirtyOne);
																																executor.enterPasswordInConfirmPasswordField(scenarioThirtyOne);
																																executor.clickOnNextOnCreatePasswordScreen();
																																Thread.sleep(3000);
																																
																																if (executor.isElementPresent(executor.errorToast)) {
																																	System.out.println("Scenario 32: Website does not accept scenario 31");
																																	
																																	//Scenario 32: 
																																	scenarioThirtyTwo = propertiesFileLoad(scenarioThirtyTwo);
																																	a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																	a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																	executor.enterPassword(scenarioThirtyTwo);
																																	executor.enterPasswordInConfirmPasswordField(scenarioThirtyTwo);
																																	executor.clickOnNextOnCreatePasswordScreen();
																																	Thread.sleep(3000);
																																	
																																	if (executor.isElementPresent(executor.errorToast)) {
																																		System.out.println("Scenario 33: Website does not accept scenario 32");
																																		
																																		//Scenario 33: 
																																		scenarioThirtyThree = propertiesFileLoad(scenarioThirtyThree);
																																		a.moveToElement(pwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																		a.moveToElement(cpwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
																																		executor.enterPassword(scenarioThirtyThree);
																																		executor.enterPasswordInConfirmPasswordField(scenarioThirtyThree);
																																		executor.clickOnNextOnCreatePasswordScreen();
																																		Thread.sleep(3000);
																														
																																		if (executor.isElementPresent(executor.errorToast)) {
																																		GmailPasswordStrength = "Scenarios Not Sufficient. Need more Scenarios to determine Gmail Password Strength";			
																																		writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																																			}else {
																																		System.out.println("Gmail Password Strength = 79.1");
																																		GmailPasswordStrength = "Gmail Password Strength is: 79.1";
																																		writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																																	}
																																}else {
																																	System.out.println("Gmail Password Strength = 71.4");
																																	GmailPasswordStrength = "Gmail Password Strength is: 71.4";
																																	writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																																}
																															}else {
																																System.out.println("Gmail Password Strength = 70.9");
																																GmailPasswordStrength = "Gmail Password Strength is: 70.9";
																																writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																															}
																														}else {
																															System.out.println("Gmail Password Strength = 68.4");
																															GmailPasswordStrength = "Gmail Password Strength is: 68.4";
																															writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																														}
																													}else {
																														System.out.println("Gmail Password Strength = 65.9");
																														GmailPasswordStrength = "Gmail Password Strength is: 65.9";
																														writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																													}
																												}else {
																													System.out.println("Gmail Password Strength = 65.5");
																													GmailPasswordStrength = "Gmail Password Strength is: 65.5";
																													writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);	
																												}
																											}else {
																												System.out.println("Gmail Password Strength = 62.0");
																												GmailPasswordStrength = "Gmail Password Strength is: 62.0";
																												writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);		
																											}
																										}else {
																											System.out.println("Gmail Password Strength = 61.3");
																											GmailPasswordStrength = "Gmail Password Strength is: 61.3";
																											writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);			
																										}
																									}else {
																										System.out.println("Gmail Password Strength = 59.5");
																										GmailPasswordStrength = "Gmail Password Strength is: 59.5";
																										writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																									}
																								}else {
																									System.out.println("Gmail Password Strength = 59.1");
																									GmailPasswordStrength = "Gmail Password Strength is: 59.1";
																									writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																									
																								}	
																							}else {
																								System.out.println("Gmail Password Strength = 57.0");
																								GmailPasswordStrength = "Gmail Password Strength is: 57.0";
																								writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																							}
																						}else {
																							System.out.println("Gmail Password Strength = 54.6");
																							GmailPasswordStrength = "Gmail Password Strength is: 54.6";
																							writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																						}
																					}else {
																						System.out.println("Gmail Password Strength = 52.7");
																						GmailPasswordStrength = "Gmail Password Strength is: 52.7";
																						writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																					}
																				}else {
																					System.out.println("Gmail Password Strength = 51.7");
																					GmailPasswordStrength = "Gmail Password Strength is: 51.7";
																					writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																				}
																			}else {
																				System.out.println("Gmail Password Strength = 49.1");
																				GmailPasswordStrength = "Gmail Password Strength is: 49.1";
																				writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																			}
																		}else {
																			System.out.println("Gmail Password Strength = 47.6");
																			GmailPasswordStrength = "Gmail Password Strength is: 47.6";
																			writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																		}
																	}else {
																		System.out.println("Gmail Password Strength = 47.3");
																		GmailPasswordStrength = "Gmail Password Strength is: 47.3";
																		writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																	}
																}else {
																	System.out.println("Gmail Password Strength = 47.0");
																	GmailPasswordStrength = "Gmail Password Strength is: 47.0";
																	writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
																}
															}else {
																System.out.println("Gmail Password Strength = 45.6");
																GmailPasswordStrength = "Gmail Password Strength is: 45.6";
																writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
															}
														}else {
															System.out.println("Gmail Password Strength = 43.7");
															GmailPasswordStrength = "Gmail Password Strength is: 43.7";
															writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
														}
													}else {
														System.out.println("Gmail Password Strength = 41.4");
														GmailPasswordStrength = "Gmail Password Strength is: 41.4";
														writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
													}
												}else {
													System.out.println("Gmail Password Strength = 39.5");
													GmailPasswordStrength = "Gmail Password Strength is: 39.5";
													writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
												}
											}else {
												System.out.println("Gmail Password Strength = 37.6");
												GmailPasswordStrength = "Gmail Password Strength is: 37.6";
												writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
											}
										}else {
											System.out.println("Gmail Password Strength = 36.8");
											GmailPasswordStrength = "Gmail Password Strength is: 36.8";
											writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
										}
									}else {
										System.out.println("Gmail Password Strength = 35.7");
										GmailPasswordStrength = "Gmail Password Strength is: 35.7";
										writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
									}
								}else {	
									System.out.println("Gmail Password Strength = 35.5");
									GmailPasswordStrength = "Gmail Password Strength is: 35.5";
									writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
								}
							}else {
								System.out.println("Gmail Password Strength = 34.2");
								GmailPasswordStrength = "Gmail Password Strength is: 34.2";
								writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
							}
						}else {
							System.out.println("Gmail Password Strength = 33.2");
							GmailPasswordStrength = "Gmail Password Strength is: 33.2";
							writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
						}
					}else {
						System.out.println("Gmail Password Strength = 32.8");
						GmailPasswordStrength = "Gmail Password Strength is: 32.8";
						writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
					}
				}else {
					System.out.println("Gmail Password Strength = 31.0");
					GmailPasswordStrength = "Gmail Password Strength is: 31.0";
					writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
					}
			}else {
				System.out.println("Gmail Password Strength = 28.2");
				GmailPasswordStrength = "Gmail Password Strength is: 28.2";
				writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
			}			
		}else {
			System.out.println("Gmail Password Strength = 26.6");
			GmailPasswordStrength = "Gmail Password Strength is: 26.6";
			writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
			}		
	}else {
		System.out.println("Gmail Password Strength = 19.9");
		GmailPasswordStrength = "Gmail Password Strength is: 19.9";
		writePasswordStrengthResultToFile(GmailPasswordStrength); writePasswordStrengthResultToFile("Account created on Gmail is : " + email);
		}			
}
}
