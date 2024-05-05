Feature: Login
    As a User
    I want to login
    So that I can use the App

    Scenario: Login with valid email and password
        Given I set the API endpoint for login
        When I submit a request to the API endpoint with a valid email and password
        And I should receive a status code of 200
        Then I should receive a token indicating successful login

    Scenario: Login with email and password fields is empty
        Given I set the API endpoint for login
        When I send a request to the API endpoint with a empty data
        And I should receive a status code of 400 Bad Request
        Then I should receive an error message stating that the username and password are not provided in JSON format

    Scenario: Login with invalid email
        Given I set the API endpoint for login
        When I send a request to the API endpoint with invalid email
        And I should receive a status code of 401 Unauthorized
        Then I should receive an error message stating that username or password is incorrect
