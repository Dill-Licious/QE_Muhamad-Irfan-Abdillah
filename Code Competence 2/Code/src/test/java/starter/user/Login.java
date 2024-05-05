package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    public static String url = "https://fakestoreapi.com/auth/login";

    @Step("I set the API endpoint for login")
    public String setAPIEndpointLogin(){
        return url;
    }

    @Step("I submit a request to the API endpoint with a valid email and password")
    public void sendRequestLoginValidEmailAndPass(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^_");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointLogin());
    }

    @Step("I send a request to the API endpoint with a empty data")
    public void sendRequestLoginEmptyData(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "");
        requestBody.put("password", "");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointLogin());
    }

    @Step("I send a request to the API endpoint with invalid email")
    public void sendRequestLoginInvalidEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "Irfan");
        requestBody.put("password", "83r5^_");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setAPIEndpointLogin());
    }

    @Step("I should receive a status code of 400 Bad Request")
    public void receiveStatusCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I should receive a status code of 401 Unauthorized")
    public void receiveStatusCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I should receive a token indicating successful login")
    public void receiveTokenLoginSuccess(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.LOGIN_WITH_VALID_CREDENTIALS_SCHEMA);

        restAssuredThat(response -> response.body("token", Matchers.notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I should receive an error message stating that the username and password are not provided in JSON format")
    public void receiveErrorMessageEmptyField(){
        restAssuredThat(response -> response.body("message", Matchers.equalTo("username and password are not provided in JSON format")));
    }

    @Step("I should receive an error message stating that username or password is incorrect")
    public void receiveErrorMessageInvalidEmail(){
        restAssuredThat(response -> response.body("message", Matchers.equalTo("username or password is incorrect")));
    }
}
