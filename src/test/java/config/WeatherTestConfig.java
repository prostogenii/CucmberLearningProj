package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.BeforeClass;

import static org.hamcrest.Matchers.lessThan;

public class WeatherTestConfig {
        @BeforeClass
        public static void testSetup(){
            RestAssured.requestSpecification = new RequestSpecBuilder()
                    .setBaseUri("https://api.openweathermap.org/data/2.5/weather?")
                    .addHeader("Accept", "application/json")
                    .addFilter(new RequestLoggingFilter())
                    .addFilter(new ResponseLoggingFilter())
                    .build();

            RestAssured.responseSpecification = new ResponseSpecBuilder()
                    .expectResponseTime(lessThan(3000L))
                    .build();
        }
    }
