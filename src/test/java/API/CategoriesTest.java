package API;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.github.tomakehurst.wiremock.WireMockServer;

import org.junit.Test;
import page.api.CategoriesStep;
import util.ApiSpecBuilder;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static util.Api.CATEGORIES_PATH;

public class CategoriesTest {

    private WireMockServer wireMockServer;

    @Test
    @DisplayName("Successful receipt information about all coin categories(200)")
    public void successGetCategories() {
        CategoriesStep.getCategories(ApiSpecBuilder.API_KEY)
            .then()
            .assertThat()
            .statusCode(200);
    }

    @Test
    @DisplayName("Query call with error(400)")
    public void GetCategoriesWithError() {
        CategoriesStep.get400("!")
            .then()
            .assertThat()
            .statusCode(400)
            .and()
            .body("status.error_code", equalTo(400))
            .and()
            .body("status.error_message", equalTo("\"limit\" must be a number"));
    }

    @Test
    @DisplayName("Take information about all coin categories without authentication(401)")
    public void GetCategoriesWithoutAuth() {
        CategoriesStep.getCategories("")
                .then()
                .assertThat()
                .statusCode(401)
                .and()
                .body("status.error_code", equalTo(1002))
                .and()
                .body("status.error_message", equalTo("API key missing."));
    }

    @Test
    @DisplayName("Getting error 500")
    public void GetCategories500ErrorTest() {
        WireMockServer wireMockServer = new WireMockServer(8080);
        wireMockServer.start();

        String jsonBody = "{\n" +
                "  \"status\": {\n" +
                "    \"timestamp\": \"2018-06-02T22:51:28.209Z\",\n" +
                "    \"error_code\": 500,\n" +
                "    \"error_message\": \"An internal server error occurred\",\n" +
                "    \"elapsed\": 10,\n" +
                "    \"credit_count\": 0\n" +
                "  }\n" +
                "}";

        wireMockServer.stubFor(get(urlEqualTo(CATEGORIES_PATH))
                .willReturn(aResponse()
                        .withStatus(500)
                        .withHeader("Content-Type", "application/json")
                        .withBody(jsonBody)));

        RestAssured.given()
                .when()
                .get("http://localhost:8080"+CATEGORIES_PATH)
                .then()
                .assertThat()
                .statusCode(500)
                .and()
                .body("status.error_code", equalTo(500))
                .and()
                .body("status.error_message", equalTo("An internal server error occurred"));

        wireMockServer.stop();
    }

    @Test
    @DisplayName("Getting error 403")
    public void Get403ErrorTest() {
        CategoriesStep.get403(ApiSpecBuilder.API_KEY)
                .then()
                .assertThat()
                .statusCode(403);
    }

    //Сначала делаю много запросов и после делаю тест на 429
    @Test
    @DisplayName("Getting error 429")
    @Description("")
    public void GetCategories429ErrorTest() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            final int requestNumber = i;
            executor.submit(() -> {
                try {
                    CategoriesStep.getCategories(ApiSpecBuilder.API_KEY);
                } catch (Exception e) {
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        CategoriesStep.getCategories(ApiSpecBuilder.API_KEY)
                .then()
                .assertThat()
                .statusCode(429);
    }
    
    @Test
    @DisplayName("Checking the operation of the limit parameter")
    public void checkParamLimit() {
        Response response = CategoriesStep.queryParamLimit(1);
        response.then().log().all();
        response.then().assertThat().statusCode(200);
        List<Map<String, Object>> categories = response.jsonPath().getList("data");
        assertThat(categories.size(), equalTo(1));
    }

    @Test
    @DisplayName("Checking the operation of the start parameter")
    public void checkParamStart() {
        Response response = CategoriesStep.queryParamStart(297);
        response.then().log().all();
        response.then().assertThat().statusCode(200);
        List<Map<String, Object>> categories = response.jsonPath().getList("data");
        assertThat(categories.size(), equalTo(1));
    }

    @Test
    @DisplayName("Checking the operation of the ID parameter")
    public void checkParamId() {
        Response response = CategoriesStep.queryParamId("6");
        response.then().log().all();
        response.then().assertThat().statusCode(200);
        List<Map<String, Object>> categories = response.jsonPath().getList("data");
        assertThat(categories.size(), equalTo(1));
    }

    @Test
    @DisplayName("Checking the operation of the many ID parameter")
    public void checkManyParamId() {
        Response response = CategoriesStep.queryParamId("5,6");
        response.then().log().all();
        response.then().assertThat().statusCode(200);
        List<Map<String, Object>> categories = response.jsonPath().getList("data");
        assertThat(categories.size(), equalTo(5));
    }

    @Test
    @DisplayName("Checking the operation of the slug parameter")
    public void checkParamSlug() {
        Response response = CategoriesStep.queryParamSlug("solana");
        response.then().log().all();
        response.then().assertThat().statusCode(200);
        List<Map<String, Object>> categories = response.jsonPath().getList("data");
        assertThat(categories.size(), equalTo(12));
    }

    @Test
    @DisplayName("Checking the operation of the many slug parameter")
    public void checkManyParamSlug() {
        Response response = CategoriesStep.queryParamSlug("solana,tron");
        response.then().log().all();
        response.then().assertThat().statusCode(200);
        List<Map<String, Object>> categories = response.jsonPath().getList("data");
        assertThat(categories.size(), equalTo(17));
    }

    @Test
    @DisplayName("Checking the operation of the symbol parameter")
    public void checkParamSymbol() {
        Response response = CategoriesStep.queryParamSymbol("TRX");
        response.then().log().all();
        response.then().assertThat().statusCode(200);
        List<Map<String, Object>> categories = response.jsonPath().getList("data");
        assertThat(categories.size(), equalTo(8));
    }

    @Test
    @DisplayName("Checking the operation of the many symbol parameter")
    public void checkManyParamSymbol() {
        Response response = CategoriesStep.queryParamSymbol("SOL,TRX");
        response.then().log().all();
        response.then().assertThat().statusCode(200);
        List<Map<String, Object>> categories = response.jsonPath().getList("data");
        assertThat(categories.size(), equalTo(16));
    }

    @Test
    @DisplayName("Checking fields in response")
    public void checkFields() {
        Response response = CategoriesStep.queryParamId("6");
        // Проверяем наличие ключей верхнего уровня
        response.then()
                .statusCode(200)
                .and()
                .body("$", allOf(hasKey("status"), hasKey("data"))) // Проверяем наличие ключей верхнего уровня
                .and()
                .body("status", allOf(hasKey("timestamp"), hasKey("error_code"), hasKey("error_message"), hasKey("elapsed"), hasKey("credit_count"), hasKey("notice")))
                .body("data", everyItem(allOf(hasKey("id"), hasKey("name"), hasKey("title"), hasKey("description"), hasKey("num_tokens"), hasKey("avg_price_change"), hasKey("market_cap"), hasKey("market_cap_change"), hasKey("volume"), hasKey("volume_change"), hasKey("last_updated"))));
    }

}
