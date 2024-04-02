Feature: Get all post data
    As a admin
    I want to get all post data
    So that I can view list of user

    Scenario: As a user I can get all post data
        Given I set API endpoint for get all post data
        When I send a request to get all post data
        Then I receive status code 200
        And I receive valid data for all post data

    Scenario: As a user I want to check if null data is received for all post data
        Given I set API endpoint for get all post data
        When I send a request to get all post data
        Then I receive status code 400
        And I receive null data for all post data