package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.CalculatorPage;
import pageObjects.LogInnPage;
import pageObjects.RegisterAccountPage;
import pageObjects.SearchPage;

public class SearchTest extends BaseTest{
    LogInnPage loginPage;
    RegisterAccountPage registerAccountPage;
    SearchPage searchPage;
    CalculatorPage calculatorPage;

    @Test
    void searchPositiveTest(){
        loginPage = new LogInnPage(driver);
        registerAccountPage = new RegisterAccountPage(driver);
        searchPage = new SearchPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //LOGIN
        loginPage.setMyAccountName("Emilija");
        loginPage.setMyAccountPassword("Emilija123");
        loginPage.setButtonToLogInn();

        //Assertion LogInn
        String expectedMessage = "Skaičiuotuvas jautrus neigiamiems skaičiams ;)";
        String actualMessage = registerAccountPage.getAfterCreatedUserGettedText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("successfully Login!!!");

        //Search
        searchPage.setSearchField();
        searchPage.setInputToShow();

        //Assertion Search
        String expectedMessage2 = "1";
        String actualMessage2 = searchPage.getAfterLogInnGettedTextPositiveTest();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("You find It!!!");
    }
    @Test
    void searchNegativeTest(){
        loginPage = new LogInnPage(driver);
        registerAccountPage = new RegisterAccountPage(driver);
        searchPage = new SearchPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //LOGIN
        loginPage.setMyAccountName("Emilija");
        loginPage.setMyAccountPassword("Emilija123");
        loginPage.setButtonToLogInn();

        //Assertion LogInn
        String expectedMessage = "Skaičiuotuvas jautrus neigiamiems skaičiams ;)";
        String actualMessage = registerAccountPage.getAfterCreatedUserGettedText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("successfully Login!!!");

        //Search
        searchPage.setSearchField();
        searchPage.setInputToShow();

        //Assertion Search
        String expectedMessage2 = "150";
        String actualMessage2 = searchPage.getAfterLogInnGettedTextPositiveTest();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("You do Not find It!!!");
    }
}
