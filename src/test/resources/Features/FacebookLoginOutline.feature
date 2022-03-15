Feature: Facebook details checking

  Scenario Outline: Facebook Login/credential verification
    Given User is on facebook login page
    When User should enter "<username>" and "<password>"
    And User should click the login button
    Then User should verify the success message

    Examples:
      | username | password   |
      | anand    | anand@123  |
