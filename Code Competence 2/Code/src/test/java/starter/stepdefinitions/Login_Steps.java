package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Login;

public class Login_Steps {
    @Steps
    Login login;

    @Given("I set the API endpoint for login")
    public void setAPIEndpointLogin(){
        login.setAPIEndpointLogin();
    }

    @When("I submit a request to the API endpoint with a valid email and password")
    public void sendRequestLoginValidEmailAndPass(){
        login.sendRequestLoginValidEmailAndPass();
    }

    @Then("I should receive a token indicating successful login")
    public void receiveTokenLoginSuccess(){
        login.receiveTokenLoginSuccess();
    }

    @When("I send a request to the API endpoint with a empty data")
    public void sendRequestLoginEmptyData(){
        login.sendRequestLoginEmptyData();
    }

    @And("I should receive a status code of 400 Bad Request")
    public void receiveStatusCode400(){
        login.receiveStatusCode400();
    }

    @Then("I should receive an error message stating that the username and password are not provided in JSON format")
    public void receiveErrorMessageEmptyField(){
        login.receiveErrorMessageEmptyField();
    }

    @When("I send a request to the API endpoint with invalid email")
    public void sendRequestLoginInvalidEmail(){
        login.sendRequestLoginInvalidEmail();
    }

    @And("I should receive a status code of 401 Unauthorized")
    public void receiveStatusCode401(){
        login.receiveStatusCode401();
    }

    @Then("I should receive an error message stating that username or password is incorrect")
    public void receiveErrorMessageInvalidEmail(){
        login.receiveErrorMessageInvalidEmail();
    }
}
