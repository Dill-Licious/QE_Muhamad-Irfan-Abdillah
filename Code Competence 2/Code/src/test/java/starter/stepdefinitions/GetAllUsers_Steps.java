package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetAllUsers;

public class GetAllUsers_Steps {
    @Steps
    GetAllUsers getAllUsers;

    @Given("I set the API endpoint to retrieve all users data")
    public void setAPIEndpointAllUsersData(){
        getAllUsers.setAPIEndpointAllUsersData();
    }

    @When("I send a request to retrieve all users data")
    public void sendRequestAllUsersData(){
        getAllUsers.sendRequestAllUsersData();
    }

    @Then("I should receive all users data")
    public void receiveAllUsersData(){
        getAllUsers.receiveAllUsersData();
    }
}
