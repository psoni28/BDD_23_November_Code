Feature: Login functionality

  @Sanity1
  Scenario Outline: validate user able to login with valid credentials
    Given User redirect to login page
    When User enter "<userId>" in uername textbox
    When User enter "<password>" in password textbox
    When User click login button
    Then User should be login successfully
    Examples:
      | userId                  | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | visual_user             | secret_sauce |
      | adasdasd                | secret_sauce |



