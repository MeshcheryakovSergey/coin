package page.api;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import util.Api;
import util.ApiSpecBuilder;

import static util.ApiSpecBuilder.API_KEY;

public class CategoriesStep {

    @Step("Returns information about all coin categories available on CoinMarketCap")
    public static Response getCategories (String key) {
        Response response = ApiSpecBuilder.requestSpec()
                .header("X-CMC_PRO_API_KEY", key)
                .get(Api.CATEGORIES_PATH);
        return response;
    }

    @Step("Get coin categories with limit: {limit}")
    public static Response queryParamLimit(int limit) {
        Response response = ApiSpecBuilder.requestSpec()
                .header("X-CMC_PRO_API_KEY", API_KEY)
                .queryParam("limit", limit)
                .get(Api.CATEGORIES_PATH);
        return response;
    }
}
