Feature: Create a user
    As a admin
    I want to create a post data
    So that the post data is stored

    Scenario: As a admin I can create a user
        Given I set API endpoint for create a post data
        When I send a request to create a post data
        Then I receive status code 201
        And I receive valid data for created post data

    Scenario: As a admin i can send request with unrecognized additional parameter
        Given I set API endpoint for create a post data
        When I send a request to create a post data with unrecognized additional parameter
        Then I receive status code 400
        And I receive valid parameter for created post data