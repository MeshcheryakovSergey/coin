package page;

import io.qameta.allure.Step;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ApiSpecBuilder;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.StringStartsWith.startsWith;


public class MainPage {

    private final By portfolioButton = By.xpath(".//span[text()='Portfolio']");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void open() {
        driver.get(ApiSpecBuilder.BASE_URL);
    }

    @Step
    public void clickPortfolioButton() {
        driver.findElement(portfolioButton).click();
    }

    @Step
    public void checkPortfolioButtonText() {
        String text = driver.findElement(portfolioButton).getText();
        MatcherAssert.assertThat(text, startsWith("Portfolio"));
    }
}
