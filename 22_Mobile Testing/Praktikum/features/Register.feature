Feature: Register
  As a user 
  I can want to register
  So that I can login to the app

  Scenario: As an User, I can register with valid credentials
    Given I am on the login page
    When I see create account text
    Then I click create account
    Then I am on the register page
    Then I input my name with valid credentials
    Then I input my email with valid credentials
    Then I input my password with valid credentials
    Then I confirm my password with valid credentials
    Then I click register button
    Then I see a pop-up message indicating register success  

  Scenario: As an User, I can't register with all fields is empty
    Given I am on the login page
    When I see create account text
    Then I click create account
    Then I am on the register page
    Then I click register button
    Then I see an error message indicate enter full name first

  Scenario: As an User, I can't register with invalid format email
    Given I am on the login page
    When I see create account text
    Then I click create account
    Then I am on the register page
    Then I input my name with valid credentials
    Then I input my email with invalid format
    Then I input my password with valid credentials
    Then I confirm my password with valid credentials
    Then I click register button
    Then I see an error message indicate please enter valid email