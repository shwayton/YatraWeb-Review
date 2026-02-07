package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Login
{
    private WebDriver driver;

    public Login(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section//p[contains(text(),'Login or')]")
    WebElement loginDialogBoxTextElement;

    @FindBy(xpath = "//input[@placeholder ='Email Id / Mobile Number']")
    WebElement loginEmailID;

    @FindBy(xpath = "//*[@id = 'google-login-btn']")
    WebElement googleLoginBtn;

    @FindBy(xpath = "//*[text()='SME Account']")
    WebElement SME_Account;

    @FindBy(xpath = "//*[text()='Personal Account']")
    WebElement Personal_Account;

    @FindBy(xpath = "//button[text()='Login ']")
    WebElement LoginBtn;

    @FindBy(xpath = "//button[text() = 'Login']")
    WebElement LoginBtnAfterPassword;

    @FindBy(xpath = "//button[text()='Verify']")
    WebElement verifyBtn;

    @FindBy(id = "otp")
    WebElement otpField;

    @FindBy(xpath = "//div[@class='style_popup__a7PrI MuiBox-root css-0']")
    WebElement loginBox;

    @FindBy(id = "pass")
    WebElement  passwordField;

    @FindBy(xpath = "//div[contains(text(),'Login / Signup')]")
    WebElement Login_SignUpBtn;

    @FindBy(xpath = "//*[@id='__next']//*[contains(text(),'Hi')]")
    WebElement HiText;

    @FindBy(xpath = "//div[contains(text(),'Login using OTP')]")
    WebElement loginUsingOTP;

    @FindBy(xpath = "//p[contains(text(),'Sign Up')]")
    WebElement signUpHeader;

    @FindBy(id = "password")
    WebElement signUpPass;

    @FindBy(name = "email")
    WebElement signUpEmail;

    @FindBy(id = "mobile")
    WebElement signUpPhoneNo;

    @FindBy(name = "name")
    WebElement signUpName;

    @FindBy(xpath = "//span[@class='flag' and text()='Mr.']")
    WebElement signUpPronoun;

    @FindBy(xpath = "//span[@class='flag' and text()='Mr.']/following-sibling::ul/li")
    List<WebElement>  pronounList;

    @FindBy(id = "whtps")
    WebElement whatsappCheckBox;

    @FindBy(xpath = "//span[contains(text(),'Keep me updated on special promotions and offers')]/preceding-sibling::span")
    WebElement promotionCheckBox;

    @FindBy(xpath = "//span[@class='flag' and text()='+91']")
    WebElement countryCodeField;

    @FindBy(xpath = "//span[@class='flag' and text()='+91']/following-sibling::ul/li[1]/input")
    WebElement countryListSearchField;

    @FindBy(xpath = "//span[@class='flag' and text()='+91']/following-sibling::ul/li[1]/following-sibling::li")
    List<WebElement> countryList;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement signUpBtn;

    @FindBy(id ="gst")
    WebElement gst;

    @FindBy(id ="company")
    WebElement companyName;

    @FindBy(id = "address")
    WebElement companyAddress;

    @FindBy(id = "pincode")
    WebElement pincode;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "state")
    WebElement state;

    @FindBy(id = "mobile-number")
    WebElement loginPhoneNo;

    public WebElement getLoginPhoneNo()
    {
        return loginPhoneNo;
    }

    public WebElement getGst()
    {
        return gst;
    }

    public WebElement getCompanyName()
    {
        return companyName;
    }

    public WebElement getCompanyAddress()
    {
        return companyAddress;
    }

    public WebElement getPincode()
    {
        return pincode;
    }

    public WebElement getCity()
    {
        return city;
    }

    public WebElement getState()
    {
        return state;
    }

    public WebElement getSignUpBtn()
    {
        return signUpBtn;
    }

    public WebElement getCountryCodeField()
    {
        return countryCodeField;
    }

    public WebElement getCountryListSearchField()
    {
        return countryListSearchField;
    }

    public List<WebElement> getCountryList()
    {
        return countryList;
    }

    public WebElement getWhatsappCheckBox()
    {
        return whatsappCheckBox;
    }

    public WebElement getPromotionCheckBox()
    {
        return promotionCheckBox;
    }

    public WebElement getSignUpPronoun()
    {
        return signUpPronoun;
    }

    public List<WebElement> getPronounList()
    {
        return pronounList;
    }

    public WebElement getSignUpName()
    {
        return signUpName;
    }

    public WebElement getSignUpPhoneNo()
    {
        return signUpPhoneNo;
    }

    public WebElement getSignUpEmail()
    {
        return signUpEmail;
    }

    public WebElement getSignUpPass()
    {
        return signUpPass;
    }

    public WebElement getSignUpHeader()
    {
        return signUpHeader;
    }

    public WebElement getLoginUsingOTP()
    {
        return loginUsingOTP;
    }

    public WebElement getHiText()
    {
        return HiText;
    }

    public WebElement getLoginBtnAfterPassword()
    {
        return LoginBtnAfterPassword;
    }

    public WebElement getLogin_SignUpBtn()
    {
        return Login_SignUpBtn;
    }

    public WebElement getPasswordField()
    {
        return passwordField;
    }

    public WebElement getLoginBox()
    {
        return loginBox;
    }

    public WebElement getOtpField()
    {
        return otpField;
    }

    public WebElement getVerifyBtn()
    {
        return verifyBtn;
    }

    public WebElement getLoginBtn()
    {
        return LoginBtn;
    }

    public WebElement getPersonal_Account()
    {
        return Personal_Account;
    }

    public WebElement getSME_Account()
    {
        return SME_Account;
    }

    public WebElement getGoogleLoginBtn()
    {
        return googleLoginBtn;
    }

    public WebElement getLoginEmailID()
    {
        return loginEmailID;
    }

    public WebElement getLoginDialogBoxTextElement()
    {
        return loginDialogBoxTextElement;
    }

}