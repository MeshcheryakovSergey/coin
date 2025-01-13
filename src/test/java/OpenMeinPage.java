import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import page.MainPage;

public class OpenMeinPage extends DriverRule{

    @Before
    public void openMain(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Check text on Portfolio button")
    public void checkTextOnPortfolioButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.checkPortfolioButtonText();
    }

    @Test
    @DisplayName("Success open Portfolio")
    public void successOpenPortfolio(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickPortfolioButton();
    }


}
