package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.LogInnPage;
import pageObjects.RegisterAccountPage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CreateNewAccountTest extends BaseTest{

    RegisterAccountPage registerAccountPage;
//    LoginPage loginPage;
    LogInnPage logInnPage;

    @Test
    void createNewAccountPositiveTest(){

        registerAccountPage = new RegisterAccountPage(driver);
        logInnPage = new LogInnPage(driver);
        //Register page Positive Test
        registerAccountPage.setCreateNewAccount();
        // registerAccountPage.setMyAccountName("Emilija");

        Random RandomGenerator = new Random();
        String nameRandom = RandomGenerator.nextInt(1000)+ "Useris";
        registerAccountPage.setMyAccountName(nameRandom);

        // registerAccountPage.setPassword("Emilija123");
        Random RandomGeneratorPassword = new Random();
        String passwordRandom = RandomGeneratorPassword.nextInt(1000)+ "UserisPass";
        registerAccountPage.setPassword(passwordRandom);

        registerAccountPage.setPasswordConfirm(passwordRandom);

        registerAccountPage.setcontinueButtonForFinishRegistration();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Assertion Register
        String expectedMessage = "Skaičiuotuvas jautrus neigiamiems skaičiams ;)";
        String actualMessage = registerAccountPage.getAfterCreatedUserGettedText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("successfully Created New Account!!!");

        //LOGOUT
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        registerAccountPage.setLogOutButton();

        //Assertion LogOut
        String expectedMessage2 = "Sėkmingai atsijungėte";
        String actualMessage2 = registerAccountPage.getAfterLogOutText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Logout!!!");
    }
    //Register page Negative Test
    @Test
    void createNewAccountNegativeTest(){

        registerAccountPage = new RegisterAccountPage(driver);
        logInnPage = new LogInnPage(driver);
        //Register page Positive Test
        registerAccountPage.setCreateNewAccount();
        // registerAccountPage.setMyAccountName("Emilija");

        Random RandomGenerator = new Random();
        String nameRandom = RandomGenerator.nextInt(1)+ "U";
        registerAccountPage.setMyAccountName(nameRandom);

        // registerAccountPage.setPassword("Emilija123");
        Random RandomGeneratorPassword = new Random();
        String passwordRandom = RandomGeneratorPassword.nextInt(1000)+ "UserisPass";
        registerAccountPage.setPassword(passwordRandom);

        registerAccountPage.setPasswordConfirm(passwordRandom);

        registerAccountPage.setcontinueButtonForFinishRegistration();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Assertion Register
        String expectedMessage = "Privaloma įvesti nuo 3 iki 32 simbolių";
        String actualMessage = registerAccountPage.getNegativeTestGettedText();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Account creation failed!!!");

    }
}
