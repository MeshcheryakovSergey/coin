package page.main;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ApiSpecBuilder;


public class MainPage {

    public final static By firstCoin = By.cssSelector("table[class*='cmc-table']>tbody>tr:first-child");


    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void open() {
        driver.get(ApiSpecBuilder.BASE_URL);
    }

    @Step
    public void clickFirstCoin() {
        driver.findElement(firstCoin).click();
    }

}
