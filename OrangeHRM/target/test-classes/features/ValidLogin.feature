@ignore
Feature: Login

  Scenario: Verify that user with valid login credentials can login successfully

    Given I am on the landing page
    When I enter a valid username in the username field
    And I enter a valid password in the password field
    When I click the login button
    Then I should be successfully logged in
    Then I can logout