package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.LogInnPage;
import pageObjects.RegisterAccountPage;

public class LoginTest extends BaseTest{

    LogInnPage loginPage;
    RegisterAccountPage registerAccountPage;

    @Test
    void loginPositiveTest(){

        loginPage = new LogInnPage(driver);
        registerAccountPage = new RegisterAccountPage(driver);

        //LOGIN
        loginPage.setMyAccountName("Emilija");
        loginPage.setMyAccountPassword("Emilija123");
        loginPage.setButtonToLogInn();

        //Assertion
        String expectedMessage = "Skaičiuotuvas jautrus neigiamiems skaičiams ;)";
        String actualMessage = registerAccountPage.getAfterCreatedUserGettedText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("successfully Login!!!");
    }
    @Test
    void loginNegativeTest(){

        loginPage = new LogInnPage(driver);
        registerAccountPage = new RegisterAccountPage(driver);

        //LOGIN
        loginPage.setMyAccountName("Em");
        loginPage.setMyAccountPassword("E1");
        loginPage.setButtonToLogInn();

        //Assertion
        String expectedMessage = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";
        String actualMessage = loginPage.getAfterLogInnGettedTextNegativeTest();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("successfully Login!!!");
    }
}

