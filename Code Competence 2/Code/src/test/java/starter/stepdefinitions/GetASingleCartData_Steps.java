package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetASingleCartData;

public class GetASingleCartData_Steps {
    @Steps
    GetASingleCartData getASingleCartData;

    @Given("I set the API endpoint for a single cart data")
    public void setAPIEndpointSingleCart(){
        getASingleCartData.setAPIEndpointSingleCart();
    }

    @When("I send a request to retrieve single cart data")
    public void sendRequestSingleCart(){
        getASingleCartData.sendRequestSingleCart();
    }

    @Then("I should receive a specific single cart data")
    public void receiveSingleCartData(){
        getASingleCartData.receiveSingleCartData();
    }
}
