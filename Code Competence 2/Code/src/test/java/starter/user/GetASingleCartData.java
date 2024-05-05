package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetASingleCartData {
    public static String url = "https://fakestoreapi.com/carts/5";

    @Step("I set the API endpoint for a single cart data")
    public String setAPIEndpointSingleCart(){
        return url ;
    }

    @Step("I send a request to retrieve single cart data")
    public void sendRequestSingleCart(){
        SerenityRest.given()
                .get(setAPIEndpointSingleCart());
    }

    @Step("I should receive a specific single cart data")
    public void receiveSingleCartData(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_A_SINGLE_CART_DATA_SCHEMA);

        restAssuredThat(response -> response.body("id", Matchers.equalTo(5)));
        restAssuredThat(response -> response.body("userId", Matchers.equalTo(3)));
        restAssuredThat(response -> response.body("date", Matchers.equalTo("2020-03-01T00:00:00.000Z")));
        restAssuredThat(response -> response.body("products[0].productId", Matchers.equalTo(7)));
        restAssuredThat(response -> response.body("products[0].quantity", Matchers.equalTo(1)));
        restAssuredThat(response -> response.body("products[1].productId", Matchers.equalTo(8)));
        restAssuredThat(response -> response.body("products[1].quantity", Matchers.equalTo(1)));
        restAssuredThat(response -> response.body("__v", Matchers.equalTo(0)));


        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
