package com.cucumber.rest.cucumberdemo.steps;

import com.cucumber.rest.cucumberdemo.CucumberdemoApplicationTests;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class HelloWorldApiTestSteps extends CucumberdemoApplicationTests {

    Response response;

    @When("^the hello world api is invoked$")
    public void theHelloWorldApiIsInvoked() throws Throwable {
        response = given().relaxedHTTPSValidation().when().get("http://localhost:8080/message");
    }

    @Then("^it should return (\\d+) response code$")
    public void itShouldReturnResponseCode(int returnCode) throws Throwable {
        response.then().statusCode(200);
    }

    @And("^it should say \"([^\"]*)\"$")
    public void itShouldSay(String message) throws Throwable {
        assertEquals(response.asString(),message);
    }
}
