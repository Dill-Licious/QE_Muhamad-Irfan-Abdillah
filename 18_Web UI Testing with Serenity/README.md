# (18) Web UI Testing with Serenity

## Serenity BDD

Serenity architecture concist:
1. Requirements
2. Tests
3. Steps
4. Pages
5. Reports


### Define Requirements
- When using Serenity, you start with the requirements you need to implement.
- These are often expressed as user "stories" with acceptance criteria that help clarify requirements.
- It is these "stories" that Serenity automate.


### Automate Aceeptance Criteria
Contoh penulisan dalam format BDD:

**Feature**: Search by keyword  
In order for buyers to find what they are looking for  
  As a seller  
  I want buyers to be able to search articles by keywords  

  Scenario: Search for articles by keyword  
    Given I want to buy a wool scarf  
    When I search for 'wool'  
    Then I should see only articles related to 'wool'

### Report on Test Result
Serenity provides detailed reports on the test results and execution, including:
- A narrative for each test
- Screenshots for each step in the test
- Test results including execution times and error messages if a test failed


### Yang perlu diperhatikan
- Inspect web page 
- Get field component (id)
- Add error message component
- configure chrome driver