# (16) RESTful API Testing with REST Assured

### Fundamental API Integration:
- Mobile App
- API Server
- Ext Process
- API Testing

### Fundamental API: Test Process
1. Record, Define API Information
2. Parsing, Filter or Recording API Data and then extract
3. Reconstruction API calls, and sent them from a simulate client
4. Test validation

### The Practical Test Pyramid
TOP -> BOTTOM
1. UI
2. Integration & Componen
3. Unit

## REST ASSURED
Features:
- Supports for HTTP methods
- Supports for BDD / Gherkin (Given, When, Then)
- Use of Hamcrest matches for checks (equalTo)
- User of Gpath for selecting element from JSON response


### Writting the Test
1. .given() -> Test Setup 
  - .contentType()
  - .header()
2. .when() -> Test Action
  - .get(url), .post(), .put(), .delete(), .etc()
  - .log().all()
3. .then() -> Test Verification
  - .statusCode()
  - .body("data.nama", equalTo("Kentir"))   


### Project Sturcture
- __stepdefinitions__ : menyimpan berbagai step definition dari sintaks BDD yang dibuat
- __user__ : menyimpan berbagai code untuk API testing
- __utils__ : menyimpan fungsi utilitas seperti membaca JSON Schema
- __resources__ : menyimpan sintaks BDD dan JSON Schema