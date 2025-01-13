package util;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ApiSpecBuilder {
    public static final String BASE_URL = "https://coinmarketcap.com/";

    public static RequestSpecification requestSpec() {
        return given()
                .baseUri(BASE_URL);
    }
}
