package StepDefinition.LoginPage;

import POJO.Login;
import Utilities.AttributeValue;
import Utilities.BaseClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class LoginStepDefinition extends BaseClass
{
    WebDriver driver = getDriver();
    Login login = new Login(driver);

    @Given("the user is on the yatra website")
    public void the_user_is_on_the_yatra_website()
    {
        openWebsite("https://www.yatra.com/");
        Assert.assertEquals(getPageTitle(), TextConstants.YATRA_TITLE);
    }

    @Given("the login dialog box appears on the screen")
    public void the_login_dialog_box_appears_on_the_screen()
    {
        Assert.assertEquals(getRequiredText(login.getLoginDialogBoxTextElement()), TextConstants.LOGIN_DIALOG_TEXT_BOX);
    }

    @When("the user enters the {string} on {string}")
    public void the_user_enters_the_on(String credential, String acct_Type)
    {
        if (acct_Type.equalsIgnoreCase(TextConstants.PERSONAL_ACCOUNT)) {
            if (elementIsDisplayed(login.getGoogleLoginBtn()))
                enterTextInField(login.getLoginPhoneNumber(), credential);
            else {
                clickElement(login.getSME_Account());
                enterTextInField(login.getLoginPhoneNumber(), credential);
            }
        } else if (acct_Type.equalsIgnoreCase(TextConstants.SME_ACCOUNT)) {
            if (!elementIsDisplayed(login.getGoogleLoginBtn()))
                enterTextInField(login.getLoginPhoneNumber(), credential);
            else {
                clickElement(login.getSME_Account());
                enterTextInField(login.getLoginPhoneNumber(), credential);
            }

        }

    }

    @Then("the user enters the OTP received")
    public void the_user_enters_the_otp_received() throws InterruptedException
    {
        Thread.sleep(20000);
        //enterTextInField(login.getOtpField(), "123456");
    }

    @Then("the user clicks on {string}")
    public void the_user_clicks_on(String string)
    {
        if (string.equalsIgnoreCase("login"))
            clickElement(login.getLoginBtn());
        else if (string.equalsIgnoreCase("Verify"))
            clickElement(login.getVerifyBtn());
        else if (string.equalsIgnoreCase("PasswordLogin"))
            clickElement(login.getLoginBtnAfterPassword());
        else if(string.equalsIgnoreCase("Sign Up"))
            clickElement(login.getSignUpBtn());
    }

    @Then("user enters the {string}")
    public void user_enters_the(String string)
    {
        enterTextInField(login.getPasswordField(), "shwetank01");
    }

    @Then("the user should be logged in")
    public void the_user_should_be_logged_in()
    {

        Assert.assertTrue(elementIsDisplayed(login.getHiText()));

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        boolean invisible = wait.until(
//                ExpectedConditions.invisibilityOfElementLocated(
//                        By.xpath("//div[text()='Login / Signup']")
//                )
//        );
//
//        Assert.assertTrue(invisible,
//                "Login / Signup should disappear after login");
    }

    @Then("user clicks on {string} link")
    public void user_clicks_on_link(String string)
    {
        if (string.equalsIgnoreCase("login Using OTP")) {
            clickElement(login.getLoginUsingOTP());
            Assert.assertTrue(elementIsDisplayed(login.getOtpField()));
        }

    }

    @When("the user lands on Sign Up page")
    public void the_user_lands_on_sign_up_page()
    {
        Assert.assertEquals(getRequiredText(login.getSignUpHeader()).trim(), TextConstants.SIGNUP_HEADER);
    }

    @Then("^the user enters \"([^\"]*)\" in \"([^\"]*)\"")
    public void the_user_enters(String textToBeEntered, String field)
    {
        if (field.equalsIgnoreCase("phone_number")) {
            String[] str = textToBeEntered.split(" ");

            String countryCode = str[0];

            clickElement(login.getCountryCodeField());

            enterTextInField(login.getCountryListSearchField(), countryCode.substring(1));

            if (login.getCountryList().getFirst().getText().trim().equalsIgnoreCase(TextConstants.NO_MATCH_FOUND))
                System.out.println("Incorrect country code");

            else {
                for (WebElement ele : login.getCountryList()) {
                    if (ele.getText().split("\\R")[1].equalsIgnoreCase(countryCode)) {
                        clickElement(ele);
                    }
                }
            }

            enterTextInField(login.getSignUpPhoneNo(), str[1]);
        } else if (field.equalsIgnoreCase("full_name")) {

            String[] str = textToBeEntered.split(" ");

            clickElement(login.getSignUpPronoun());

            List<WebElement> pronounList = login.getPronounList();
            for (WebElement ele : pronounList) {
                if (str[0].equalsIgnoreCase(ele.getText())) {
                    clickElement(ele);
                    break;
                }
            }

            String nameToEnter = "";
            for (int i = 1; i < str.length; i++)
                nameToEnter = nameToEnter + str[i] + " ";

            enterTextInField(login.getSignUpName(), nameToEnter.trim());
        }

    }

    @Then("the user clicks {string}")
    public void the_user_clicks(String string)
    {
        clickElement(login.getSignUpBtn());
    }


    @And("email field already has the user {string}")
    public void emailFieldAlreadyHasTheUser(String string)
    {
        Assert.assertEquals(string, getAttributeValue(login.getSignUpEmail(), AttributeValue.VALUE));
    }

    @Then("user enters the sign up {string}")
    public void userEntersTheSignUp(String string)
    {
        enterTextInField(login.getSignUpPass(), string);
    }


    @And("^the user selects \"([^\"]*)\" checkbox as (true|false)$")
    public void theUserSelectsCheckbox(String checkBox, boolean flag)
    {
        if (flag) {
            if (checkBox.equalsIgnoreCase("Whatsapp"))
                clickElement(login.getWhatsappCheckBox());

            else if (checkBox.equalsIgnoreCase("Promotion"))
                clickElement(login.getPromotionCheckBox());
        }

    }

}
