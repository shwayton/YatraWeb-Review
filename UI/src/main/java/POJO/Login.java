package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    WebElement loginPhoneNumber;

    @FindBy(xpath = "//*[@id = 'google-login-btn']")
    WebElement googleLoginBtn;

    @FindBy(xpath = "//*[text()='SME Account']")
    WebElement SME_Account;

    @FindBy(xpath = "//*[text()='Personal Account']")
    WebElement Personal_Account;

    @FindBy(xpath = "//button[text()='Login ']")
    WebElement LoginBtn;

    @FindBy(xpath = "//button[text()='Verify']")
    WebElement verifyBtn;

    @FindBy(id = "otp")
    WebElement otpField;

    @FindBy(xpath = "//div[@class='style_popup__a7PrI MuiBox-root css-0']")
    WebElement loginBox;

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

    public WebElement getLoginPhoneNumber()
    {
        return loginPhoneNumber;
    }

    public WebElement getLoginDialogBoxTextElement()
    {
        return loginDialogBoxTextElement;
    }

}