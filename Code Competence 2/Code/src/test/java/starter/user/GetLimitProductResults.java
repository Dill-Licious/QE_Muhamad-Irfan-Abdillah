package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetLimitProductResults {
    public static String url = "https://fakestoreapi.com/products?limit=5";

    @Step("I set the API endpoint to fetch user data limited to 5 products")
    public String setAPIEndpointLimitedProducts(){
        return url;
    }

    @Step("I request to fetch user data limited to 5 products")
    public void sendRequestLimitedProducts() {
        SerenityRest.given()
                .get(setAPIEndpointLimitedProducts());
    }

    @Step("I should receive valid data containing only 5 products")
    public void receiveLimitedDataProducts(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_LIMIT_PRODUCT_RESULT_SCHEMA);

        restAssuredThat(response -> response.body("id", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("title", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("price", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("description", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("category", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("rating.rate", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("rating.count", Matchers.notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
