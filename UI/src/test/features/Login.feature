Feature: Login to the yatra portal with or without google sign-in


  Scenario Outline: Login to Yatra using "<phone_number>"
    Given the user is on the yatra website
    And the login dialog box appears on the screen
    When the user enters the "<phone_number>" on "<accountType>"
    And the user clicks on "login"
    Then the user enters the OTP received
    And the user clicks on "Verify"
    Examples:
      | phone_number | accountType      |
      | 8825370400   | Personal Account |

  @smoke
  Scenario Outline: Login to Yatra using already registered "<email_id>" with password
    Given the user is on the yatra website
    When the login dialog box appears on the screen
    When the user enters the "<email_id>" on "<accountType>"
    And the user clicks on "<button1>"
    Then user enters the "password"
    And the user clicks on "<button2>"
    Then the user should be logged in
    Examples:
      | email_id               | accountType      | button1 | button2       |
      | shwayton.001@gmail.com | Personal Account | login   | PasswordLogin |

  Scenario Outline: Login to Yatra using already registered email id with OTP
    Given the user is on the yatra website
    When the login dialog box appears on the screen
    When the user enters the "<email_id>" on "<accountType>"
    And the user clicks on "<button>"
    Then user clicks on "login using OTP" link
    And the user enters the OTP received
    And the user clicks on "<button>"
    Then the user should be logged in
    Examples:
      | email_id | accountType | button |


  Scenario Outline: Login to Yatra using non registered "<email_id>" for "Personal account Type"
    Given the user is on the yatra website
    When the login dialog box appears on the screen
    When the user enters the "<email_id>" on "Personal account Type"
    And the user clicks on "<button>"
    And the user lands on Sign Up page
    Then user enters the "<password>"
    And the user enters "<phone_number>"
    And the user enters "<full_name>"
    And the user "<selects>" promotion and offers checkbox
    And the user "<selects>" Whatsapp notification checkbox
    And the user clicks "<button>"
    Examples:
      | email_id | button | password | phone_number | full_name | selects |


  Scenario Outline: Login to Yatra using non registered "<email_id>" for "SME account type"
    Given the user is on the yatra website
    When the login dialog box appears on the screen
    When the user enters the "<email_id>" on "SME account type"
    And the user clicks on "<button>"
    And the user lands on Sign Up page
    Then user enters the "<password>"
    And the user enters "<phone_number>"
    And the user enters "<full_name>"
    And the user enters "<GST_number>"
    And the user enters "<company_name>"
    And the user enters "<company_address>"
    And the user enters "<pincode>"
    And the user enters "<city>"
    And the user enters "<state>"
    And the user "<selects>" promotion and offers checkbox
    And the user "<selects>" Whatsapp notification checkbox
    And the user clicks "<button>"
    Examples:
      | email_id | button | password | phone_number | full_name | GST_number | company_name | company_address | pincode | city | state | selects |

# #############    NOT DEVELOPED YET    #############
#  Scenario Outline: Login to Yatra using google sign in
#    Given the user is on the yatra website
#    When the login dialog box appears on the screen
