Feature: Login functionality

  @Sanity
  Scenario: validate user able to login with valid credentials
    Given User redirect to login page
    When User enter "standard_user" in uername textbox
    When User enter "secret_sauce" in password textbox
    When User click login button
    Then User should be login successfully
    When User perform add to card on 1 product
    Then User validate count of the shopping cart badge
    When User click on shopping cart bage
    Then User should able to see the added first product


  @Sanity1
  Scenario: validate user not able to login with invalid credentials
    Given User redirect to login page
    When User enter "usernamesdfsdfsd" in uername textbox
    When User enter "passwordsdfsd" in password textbox
    When User click login button
    Then User should not be login to application