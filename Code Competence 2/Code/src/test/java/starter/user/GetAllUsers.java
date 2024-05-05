package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUsers {
    private static String url = "https://fakestoreapi.com/users";

    @Step("I set the API endpoint to retrieve all users data")
    public String setAPIEndpointAllUsersData(){
        return url;
    }

    @Step("I send a request to retrieve all users data")
    public void sendRequestAllUsersData(){
        SerenityRest.given()
                .get(setAPIEndpointAllUsersData());
    }

    @Step("I should receive all users data")
    public void receiveAllUsersData(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_USERS_SCHEMA);

        restAssuredThat(response -> response.body("address.geolocation.lat", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("address.geolocation.long", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("address.city", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("address.street", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("address.number", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("address.zipcode", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("id", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("email", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("username", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("password", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("name.firstname", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("name.lastname", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("phone", Matchers.notNullValue()));
        restAssuredThat(response -> response.body("__v", Matchers.notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
