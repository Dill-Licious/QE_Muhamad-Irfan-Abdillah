package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetLimitProductResults;

public class GetLimitedProductResults_Steps {
    @Steps
    GetLimitProductResults getLimitProductResults;

    @Given("I set the API endpoint to fetch user data limited to 5 products")
    public void setAPIEndpointLimitedProducts(){
        getLimitProductResults.setAPIEndpointLimitedProducts();
    }

    @When("I request to fetch user data limited to 5 products")
    public void sendRequestLimitedProducts(){
        getLimitProductResults.sendRequestLimitedProducts();
    }

    @Then("I should receive valid data containing only 5 products")
    public void receiveLimitedDataProducts(){
        getLimitProductResults.receiveLimitedDataProducts();
    }


}
