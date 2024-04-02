Feature: Get data post by ID
    As a admin
    I want to retrieve post data by its ID
    So that I can view specific details of a post

    Scenario: As a admin i want to retrieve post data by ID
        Given I set API endpoint for post data with ID
        When I send a request to retrieve the post data with that ID
        And I receive status code 200
        Then I should receive the post data by ID

    Scenario: As a admin, I want to retrieve post data with an invalid ID
        Given I set API endpoint for post data with an invalid ID
        When I send a request to retrieve the post data with that invalid ID
        Then I receive status code 404
        And I should receive a empty post data
