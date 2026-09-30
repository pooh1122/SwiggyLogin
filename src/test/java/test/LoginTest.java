package test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	 private static final String phoneNumber = "9999999999";
	 
	 @Test
	    public void verifySwiggyLoginWithOtp() throws InterruptedException {
		 LoginPage loginPage = new LoginPage(driver);
		 
	        // Step 2: click Sign In
	        loginPage.clickSignIn();
	 
	        // Step 3: enter phone number and click Login
	        loginPage.enterPhoneNumber(phoneNumber);
	        loginPage.clickLogin();
	       
	        // Step 4: the OTP is sent to your real phone, so read it from the console
	        System.out.print("Enter the OTP received on your phone: ");
	        Scanner scanner = new Scanner(System.in);
	        String otp = scanner.nextLine().trim();
	 
	        loginPage.enterOtp(otp);
	        loginPage.clickVerifyOtp();
	    }
	 }

	


