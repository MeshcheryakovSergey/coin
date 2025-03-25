import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import page.MainPage;

public class MainHeaderLeftPart extends DriverRule{

    @Before
    public void openMain(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Check text on Cryptocurrencies Section on left menu")
    public void checkTextOnCryptocurrenciesButton(){
        MainPage mainPage = new MainPage(driver);
        mainPage.hoverCryptocurrenciesButton();
        mainPage.checkCryptocurrenciesSectionText();
    }



}
