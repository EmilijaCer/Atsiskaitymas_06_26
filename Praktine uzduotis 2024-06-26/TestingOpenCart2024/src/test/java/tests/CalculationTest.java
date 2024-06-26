package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.CalculatorPage;
import pageObjects.LogInnPage;
import pageObjects.RegisterAccountPage;

public class CalculationTest extends BaseTest{
    LogInnPage loginPage;
    CalculatorPage calculatorPage;
    RegisterAccountPage registerAccountPage;

    @Test
    void createCalculationPositiveTest(){
        loginPage = new LogInnPage(driver);
        calculatorPage = new CalculatorPage(driver);
        registerAccountPage = new RegisterAccountPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //LOGIN
        loginPage.setMyAccountName("Emilija");
        loginPage.setMyAccountPassword("Emilija123");
        loginPage.setButtonToLogInn();

        //Assertion LogInn
        String expectedMessage = "Skaičiuotuvas jautrus neigiamiems skaičiams ;)";
        String actualMessage = registerAccountPage.getAfterCreatedUserGettedText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Login!!!");

        //Calculation
        calculatorPage.clearFirstNumber();
        calculatorPage.inputNumberOne("3");
        calculatorPage.clearNumberTwo();
        calculatorPage.inputNumberTwo("2");
        calculatorPage.selectArithmeticSymbol(0);
        calculatorPage.calculateButton();

        //Assertion Calculation
        String expectedMessage2 = "3 + 2 = 5";
        String actualMessage2 = calculatorPage.resultAfterCalculatingMessage();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("Yes, you did it!");

    }
    @Test
    void createCalculationNegativeTest(){
        loginPage = new LogInnPage(driver);
        calculatorPage = new CalculatorPage(driver);
        registerAccountPage = new RegisterAccountPage(driver);

        //LOGIN
        loginPage.setMyAccountName("Emilija");
        loginPage.setMyAccountPassword("Emilija123");
        loginPage.setButtonToLogInn();

        //Assertion LogInn
        String expectedMessage = "Skaičiuotuvas jautrus neigiamiems skaičiams ;)";
        String actualMessage = registerAccountPage.getAfterCreatedUserGettedText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Loginn!!!");

        //Calculation Negative Test
        calculatorPage.clearFirstNumber();
        calculatorPage.inputNumberOne("A");
        calculatorPage.clearNumberTwo();
        calculatorPage.inputNumberTwo("B");
        calculatorPage.selectArithmeticSymbol(1);
        calculatorPage.calculateButton();

        //Assertion Calculation negative Test
        String expectedMessage2 = "Failed to convert property value of type java.lang.String to required type int for property sk1; nested exception is java.lang.NumberFormatException: For input string: \"\"";
        String actualMessage2 = calculatorPage.getTesultAfterCalculatingNegativeTest();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
        System.out.println("Yes, you did it!");

    }
}
