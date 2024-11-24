@Sanity11
Feature: login functionality with background

  #This steps before each scneario or scenario outline
  Background:
    Given User redirect to login page


    Scenario: Verify login with valid credentials
      When User enter "standard_user" in uername textbox
      When User enter "secret_sauce" in password textbox
      When User click login button
      Then User should be login successfully


  Scenario: Verify login with invalid credentials
    When User enter "standard_usersdasd" in uername textbox
    When User enter "secret_sauceasdas" in password textbox
    When User click login button
    Then User should not be login to application