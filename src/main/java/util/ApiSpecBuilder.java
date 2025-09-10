package util;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ApiSpecBuilder {
    public static final String BASE_URL = "https://coinmarketcap.com/";

    public static final String API_BASE_URL = "https://pro-api.coinmarketcap.com";

    //    https://pro.coinmarketcap.com/account
    public static final String API_KEY = "";


    public static RequestSpecification requestSpec() {
        return given()
                .baseUri(API_BASE_URL);
    }
}
