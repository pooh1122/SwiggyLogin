package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
public class LoginPage extends BasePage {
	
	private final By signIn=By.linkText("Sign in");
	 private final By phoneNumberField = By.id("mobile");
	 private final By loginButton = By.xpath("//a[normalize-space()='Login']");
	 private final By otpField = By.id("otp");
	 private final By verifyOtpButton = By.linkText("VERIFY OTP");	
	public LoginPage(WebDriver driver) {
        super(driver);
    }

	public void clickSignIn() {
		click(signIn);
		//driver.findElement(signIn).click();
    }

    // 3. Enter the phone number and click Login
    public void enterPhoneNumber(String phoneNumber) {
    	type(phoneNumberField, phoneNumber);
    	//driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

	public void clickLogin() {
		click(loginButton);
		// driver.findElement(loginButton).click();
    }
	public boolean isOtpFieldDisplayed() {
	    return isDisplayed(otpField);
	}

    // 4. Enter the OTP and click Verify OTP
    public void enterOtp(String otp) {
    	type(otpField, otp);
    	//driver.findElement(otpField).sendKeys(otp);
    }

    public void clickVerifyOtp() {
    	click(verifyOtpButton);
    	//driver.findElement(verifyOtpButton).click();
    }

 
    public void login(String phoneNumber, String otp) {
        clickSignIn();
        enterPhoneNumber(phoneNumber);
        clickLogin();
        enterOtp(otp);
        clickVerifyOtp();
    }
}





    
    
