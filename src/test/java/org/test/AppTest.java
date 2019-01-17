package org.test;

import static org.junit.Assert.assertTrue;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import net.serenitybdd.rest.SerenityRest;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void statusCodeOk(){
        String url = "/api/status/";
        Response response = SerenityRest.
                given().
                header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8").
                when().
                get(url);
        response.then().statusCode(200).log().all();
    }

    @Test
    public void getToken(String expectedToken) {
        String url = "/api";
        Response response = SerenityRest.
                given().
                header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8").
                when().
                post(url);
        JsonPath jsonPathEvaluator = response.jsonPath();
        String token = jsonPathEvaluator.get("token");
        System.out.println("Token is: " + token);
        assertTrue(token.matches(expectedToken));
    }

    @Test
    public void defineImageCategory(String expectedCategory) {
        String url = "/api";
        Response response = SerenityRest.
                given().
                header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8").
                formParam("image", "testImage").
                when().
                post(url);
        JsonPath jsonPathEvaluator = response.jsonPath();
        String category = jsonPathEvaluator.get("category");
        System.out.println("Category is: " + category);
        assertTrue(category.matches(expectedCategory));
    }
}