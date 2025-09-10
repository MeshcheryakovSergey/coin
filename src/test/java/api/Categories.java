package api;

import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import page.api.CategoriesStep;
import util.ApiSpecBuilder;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Categories {

    @Test
    @DisplayName("Successful receipt information about all coin categories(200)")
    public void successGetCategories() {
        CategoriesStep.getCategories(ApiSpecBuilder.API_KEY)
            .then()
            .assertThat()
            .statusCode(200);
    }

    @Test
    @DisplayName("Take information about all coin categories without authentication(400)")
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

}
