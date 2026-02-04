package StepDefinition;


import POJO.Login;
import Utilities.BaseClass;
import Utilities.TextConstants;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginStepDefinition extends BaseClass
{
    WebDriver driver = getDriver();
    Login login = new Login(driver);

    @Given("the user is on the yatra website")
    public void the_user_is_on_the_yatra_website() throws InterruptedException
    {
        openWebsite("https://www.yatra.com/");
        Assert.assertEquals(getPageTitle(), TextConstants.YATRA_TITLE);
    }

    @Given("the login dialog box appears on the screen")
    public void  the_login_dialog_box_appears_on_the_screen()
    {
        Assert.assertEquals(getRequiredText(login.getLoginDialogBoxTextElement()), TextConstants.LOGIN_DIALOG_TEXT_BOX);
    }

    @When("the user enters the {string} on {string}")
    public void the_user_enters_the_on(String phone_number, String acct_Type)
    {
        if (acct_Type.equalsIgnoreCase(TextConstants.PERSONAL_ACCOUNT))
        {
            if (elementIsDisplayed(login.getGoogleLoginBtn()))
                enterTextInField(login.getLoginPhoneNumber(), phone_number);
            else {
                clickElement(login.getSME_Account());
                enterTextInField(login.getLoginPhoneNumber(), phone_number);
            }
        }
        else if (acct_Type.equalsIgnoreCase(TextConstants.SME_ACCOUNT))
        {
            if (!elementIsDisplayed(login.getGoogleLoginBtn()))
                enterTextInField(login.getLoginPhoneNumber(), phone_number);
            else {
                clickElement(login.getSME_Account());
                enterTextInField(login.getLoginPhoneNumber(), phone_number);
            }

        }

    }

    @Then("the user enters the OTP received")
    public void the_user_enters_the_otp_received()
    {
        enterTextInField(login.getOtpField(), "123456");
    }

    @Then("the user clicks on {string}")
    public void the_user_clicks_on(String string)
    {
        if(string.equalsIgnoreCase("login"))
            clickElement(login.getLoginBtn());
        else if(string.equalsIgnoreCase("Verify"))
            clickElement(login.getVerifyBtn());
    }

    @Then("user enters the {string}")
    public void user_enters_the(String string)
    {

    }

    @Then("the user should be logged in")
    public void the_user_should_be_logged_in()
    {

    }

    @Then("user clicks on {string} link")
    public void user_clicks_on_link(String string)
    {

    }

    @When("the user lands on Sign Up page")
    public void the_user_lands_on_sign_up_page()
    {
    }

    @Then("the user enters {string}")
    public void the_user_enters(String string)
    {

    }

    @Then("the user {string} promotion and offers checkbox")
    public void the_user_promotion_and_offers_checkbox(String string)
    {

    }

    @Then("the user {string} Whatsapp notification checkbox")
    public void the_user_whatsapp_notification_checkbox(String string)
    {

    }

    @Then("the user clicks {string}")
    public void the_user_clicks(String string)
    {
    }


}
