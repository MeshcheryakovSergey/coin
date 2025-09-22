package util;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ApiSpecBuilder {
    public static final String BASE_URL = "https://coinmarketcap.com/";

    public static final String API_BASE_URL = "https://pro-api.coinmarketcap.com";

    //    https://pro.coinmarketcap.com/account
    public static final String API_KEY = "38431eef-810e-4a6d-9ecf-113abe6257a4";


    public static RequestSpecification requestSpec() {
        return given()
                .baseUri(API_BASE_URL);
    }
}
