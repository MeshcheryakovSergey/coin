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
    @DisplayName("Checking the operation of the limit parameter ")
    public void checkParamLimit() {
        Response response = CategoriesStep.queryParamLimit(1);
        response.then().log().all();
        response.then().assertThat().statusCode(200);
        List<Map<String, Object>> categories = response.jsonPath().getList("data");
        assertThat(categories.size(), equalTo(1));
    }



}
