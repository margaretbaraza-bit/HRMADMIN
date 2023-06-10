@ignore
Feature: Login

  Scenario Outline: Login with invalid credentials should return correct error message
    Given I get on the home page
    When I enter "<Username>" in the Username field
    And I enter "<Password>" in the Password field
    When I click the login
    Then I should get a correct "<errormessage>"

    Examples:
    |Username  |Password      |errormessage        |
    |Maggie    |admin123      |Invalid credentials |
    |Admin     |admintesting  |Invalid credentials |
    |Maggie    |admintesting  |Invalid credentials |