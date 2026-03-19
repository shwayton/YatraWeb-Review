package POJO;

import org.openqa.selenium.By;

public class Login
{

    // ================= LOCATORS =================

    private final By loginDialogBoxTextElement = By.xpath("//section//p[contains(text(),'Login or')]");
    private final By loginEmailID = By.xpath("//input[@placeholder ='Email Id / Mobile Number']");
    private final By googleLoginBtn = By.xpath("//*[@id = 'google-login-btn']");
    private final By SME_Account = By.xpath("//*[text()='SME Account']");
    private final By Personal_Account = By.xpath("//*[text()='Personal Account']");
    private final By LoginBtn = By.xpath("//button[text()='Login ']");
    private final By LoginBtnAfterPassword = By.xpath("//button[text() = 'Login']");
    private final By verifyBtn = By.xpath("//button[text()='Verify']");
    private final By otpField = By.id("otp");
    private final By loginBox = By.xpath("//div[@class='style_popup__a7PrI MuiBox-root css-0']");
    private final By passwordField = By.id("pass");
    private final By Login_SignUpBtn = By.xpath("//div[contains(text(),'Login / Signup')]");
    private final By HiText = By.xpath("//*[@id='__next']//*[contains(text(),'Hi')]");
    private final By loginUsingOTP = By.xpath("//div[contains(text(),'Login using OTP')]");
    private final By signUpHeader = By.xpath("//p[contains(text(),'Sign Up')]");
    private final By signUpPass = By.id("password");
    private final By signUpEmail = By.name("email");
    private final By signUpPhoneNo = By.id("mobile");
    private final By signUpName = By.name("name");
    private final By signUpPronoun = By.xpath("//span[@class='flag' and text()='Mr.']");
    private final By pronounList = By.xpath("//span[@class='flag' and text()='Mr.']/following-sibling::ul/li");
    private final By whatsappCheckBox = By.id("whtps");
    private final By promotionCheckBox = By.xpath("//span[contains(text(),'Keep me updated on special promotions and offers')]/preceding-sibling::span");
    private final By countryCodeField = By.xpath("//span[@class='flag' and text()='+91']");
    private final By countryListSearchField = By.xpath("//span[@class='flag' and text()='+91']/following-sibling::ul/li[1]/input");
    private final By countryList = By.xpath("//span[@class='flag' and text()='+91']/following-sibling::ul/li[1]/following-sibling::li");
    private final By signUpBtn = By.xpath("//button[@type='submit']");
    private final By gst = By.id("gst");
    private final By companyName = By.id("company");
    private final By companyAddress = By.id("address");
    private final By pincode = By.id("pincode");
    private final By city = By.name("city");
    private final By state = By.name("state");
    private final By loginPhoneNo = By.id("mobile-number");
    private final By closePopup = By.xpath("//span[@class='style_cross__q1ZoV']/img");

    // ================= RETURN LOCATORS =================


    public By getLoginDialogBoxTextElement()
    {
        return loginDialogBoxTextElement;
    }

    public By getLoginEmailID()
    {
        return loginEmailID;
    }

    public By getGoogleLoginBtn()
    {
        return googleLoginBtn;
    }

    public By getSME_Account()
    {
        return SME_Account;
    }

    public By getPersonal_Account()
    {
        return Personal_Account;
    }

    public By getLoginBtn()
    {
        return LoginBtn;
    }

    public By getLoginBtnAfterPassword()
    {
        return LoginBtnAfterPassword;
    }

    public By getVerifyBtn()
    {
        return verifyBtn;
    }

    public By getOtpField()
    {
        return otpField;
    }

    public By getLoginBox()
    {
        return loginBox;
    }

    public By getPasswordField()
    {
        return passwordField;
    }

    public By getLogin_SignUpBtn()
    {
        return Login_SignUpBtn;
    }

    public By getHiText()
    {
        return HiText;
    }

    public By getLoginUsingOTP()
    {
        return loginUsingOTP;
    }

    public By getSignUpHeader()
    {
        return signUpHeader;
    }

    public By getSignUpPass()
    {
        return signUpPass;
    }

    public By getSignUpEmail()
    {
        return signUpEmail;
    }

    public By getSignUpPhoneNo()
    {
        return signUpPhoneNo;
    }

    public By getSignUpName()
    {
        return signUpName;
    }

    public By getSignUpPronoun()
    {
        return signUpPronoun;
    }

    public By getPronounList()
    {
        return pronounList;
    }

    public By getWhatsappCheckBox()
    {
        return whatsappCheckBox;
    }

    public By getPromotionCheckBox()
    {
        return promotionCheckBox;
    }

    public By getCountryCodeField()
    {
        return countryCodeField;
    }

    public By getCountryListSearchField()
    {
        return countryListSearchField;
    }

    public By getCountryList()
    {
        return countryList;
    }

    public By getSignUpBtn()
    {
        return signUpBtn;
    }

    public By getGst()
    {
        return gst;
    }

    public By getCompanyName()
    {
        return companyName;
    }

    public By getCompanyAddress()
    {
        return companyAddress;
    }

    public By getPincode()
    {
        return pincode;
    }

    public By getCity()
    {
        return city;
    }

    public By getState()
    {
        return state;
    }

    public By getLoginPhoneNo()
    {
        return loginPhoneNo;
    }

    public By getClosePopup()
    {
        return closePopup;
    }
}