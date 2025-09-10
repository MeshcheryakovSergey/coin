package page.api;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import util.Api;
import util.ApiSpecBuilder;

import java.util.List;

import static util.ApiSpecBuilder.API_KEY;

public class CategoriesStep {

    @Step("Returns information about all coin categories available on CoinMarketCap")
    public static Response getCategories (String key) {
        Response response = ApiSpecBuilder.requestSpec()
                .header("X-CMC_PRO_API_KEY", key)
                .get(Api.CATEGORIES_PATH);
        return response;
    }

    @Step("Get 400 status coin categories")
    public static Response get400(String limit) {
        Response response = ApiSpecBuilder.requestSpec()
                .header("X-CMC_PRO_API_KEY", API_KEY)
                .queryParam("limit", limit)
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

    @Step("Get coin categories with start: {start}")
    public static Response queryParamStart(int start) {
        Response response = ApiSpecBuilder.requestSpec()
                .header("X-CMC_PRO_API_KEY", API_KEY)
                .queryParam("start", start)
                .get(Api.CATEGORIES_PATH);
        return response;
    }

    @Step("Get coin categories with id: {id}")
    public static Response queryParamId(String id) {
        Response response = ApiSpecBuilder.requestSpec()
                .header("X-CMC_PRO_API_KEY", API_KEY)
                .queryParam("id", id)
                .log().uri()
                .get(Api.CATEGORIES_PATH);
        return response;
    }

    @Step("Get coin categories with slug: {slug}")
    public static Response queryParamSlug(String slug) {
        Response response = ApiSpecBuilder.requestSpec()
                .header("X-CMC_PRO_API_KEY", API_KEY)
                .queryParam("slug", slug)
                .log().uri()
                .get(Api.CATEGORIES_PATH);
        return response;
    }

    @Step("Get coin categories with symbol: {symbol}")
    public static Response queryParamSymbol(String symbol) {
        Response response = ApiSpecBuilder.requestSpec()
                .header("X-CMC_PRO_API_KEY", API_KEY)
                .queryParam("symbol", symbol)
                .log().uri()
                .get(Api.CATEGORIES_PATH);
        return response;
    }

}
