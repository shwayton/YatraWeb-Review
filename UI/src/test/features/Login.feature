Feature: Login to the yatra portal with or without google sign-in
  
  Scenario Outline: Login to Yatra using "<phone_number>"
    Given the user is on the yatra website
    And the login dialog box appears on the screen
    When the user enters the "<phone_number>" on sign In page for "<accountType>"
    And the user clicks on "<button1>"
    Then the user enters the OTP received
    And the user clicks on "<button2>"
    Examples:
      | phone_number   | accountType      | button1 | button2 |
      | +91 1234567890 | Personal Account | login   | Verify  |


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
    And the user clicks on "<button1>"
    Then user clicks on "login using OTP" link
    And the user enters the OTP received
    And the user clicks on "<button2>"
    Then the user should be logged in
    Examples:
      | email_id               | accountType      | button1 | button2 |
      | shwayton.001@gmail.com | Personal Account | login   | verify  |

  Scenario Outline: Sign Up to Yatra using non registered "<email_id>" for "Personal account Type"
    Given the user is on the yatra website
    When the login dialog box appears on the screen
    When the user enters the "<email_id>" on "<accountType>"
    And the user clicks on "<button1>"
    And the user lands on Sign Up page
    And email field already has the user "<email_id>"
    Then user enters the sign up "<password>"
    And the user enters "<phone_number>" in "phone_number"
    And the user enters "<full_name>" in "full_name"
    And the user selects "promotion" checkbox as true
    And the user selects "Whatsapp" checkbox as true
    And the user clicks "<button2>"
    And the user enters the OTP received
    And the user clicks on "<button3>"
    Then the user should be logged in
    Examples:
      | email_id             | button1 | password         | phone_number    | full_name               | button2 | accountType      | button3 |
      | abcdd.001@gmazil.com | login   | shwetanD7*ijegoh | +591 1234567855 | Ms. qwertyu powrthiosfh | Sign Up | Personal Account | verify  |


  Scenario Outline: Login to Yatra using non registered "<email_id>" for "SME account type"
    Given the user is on the yatra website
    When the login dialog box appears on the screen
    When the user enters the "<email_id>" on "SME account"
    And the user clicks on "<button1>"
    And the user lands on Sign Up page
    Then user enters the sign up "<password>"
    And the user enters "<phone_number>" in "phone_number"
    And the user enters "<full_name>" in "full_name"
    And the user enters "<GST_number>" in "GST_number"
    And the user enters "<company_name>" in "company_name"
    And the user enters "<company_address>" in "company_address"
    And the user enters "<pincode>" in "pincode"
    And the user enters "<city>" in "city"
    And the user enters "<state>" in "state"
    And the user selects "promotion" checkbox as true
    And the user selects "Whatsapp" checkbox as true
    And the user clicks "<button>"
    Examples:
      | email_id             | button1 | password      | phone_number  | full_name     | GST_number         | company_name | company_address | pincode | city  | state     |
      | abcdd.001@gmazil.com | login   | bjhguyfudfY7* | +1 2587946135 | Dr. JGVU KHKG | 456785434564543657 | AGL Corp     | Triumph Towers  | 973448  | HGCUY | khfvhjtcf |
# #############    NOT DEVELOPED YET    #############
#  Scenario Outline: Login to Yatra using google sign in
#    Given the user is on the yatra website
#    When the login dialog box appears on the screen
