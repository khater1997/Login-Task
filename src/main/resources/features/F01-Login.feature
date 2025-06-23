@smoke
Feature: Login Functionality

  Scenario Outline: Login with different credentials
    Given User open the login page
    When User enter username "<username>" and password "<password>"
    And User click the login button
    Then User should see "<result>"

    Examples:
      | username    | password    | result  |
      | validUser   | validPass   | success |
      | invalidUser | validPass   | error   |
      | validUser   | invalidPass | error   |
      |             |             | error   |
