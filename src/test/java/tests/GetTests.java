package tests;

import config.WeatherEndpoints;
import config.WeatherTestConfig;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class GetTests extends WeatherTestConfig {

    @Test
    public void firstGetTest(){
        given()
                .pathParam("cityId", 2172797)
                .when()
                .basePath(WeatherEndpoints.GET_A_SINGLE_USER+WeatherEndpoints.TOKEN)
                .then()
                .statusCode(200);
    }

    @Test
    public void firstGetTest2(){

        String id = "id=2172797";

        Response response = get(id+WeatherEndpoints.TOKEN)
                .then()
                .statusCode(200)
                .extract().response();

        String contentType = response.getContentType();

        System.out.println(contentType);

    }
}