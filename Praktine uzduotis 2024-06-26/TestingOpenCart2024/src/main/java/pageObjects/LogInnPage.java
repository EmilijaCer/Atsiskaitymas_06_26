package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInnPage extends BasePage{

    //LOGInn
    @FindBy(xpath = "//input[@placeholder='Prisijungimo vardas']")
    private WebElement myAccountName;
    @FindBy(xpath = "//input[@placeholder='Slaptažodis']")
    private WebElement myAccountPassword;

    @FindBy(xpath = "//button[normalize-space()='Prisijungti']")
    private WebElement clickButtonToLogIn;

    //Assertions NegativeTest
    @FindBy(xpath = "//span[contains(text(),'Įvestas prisijungimo vardas ir/ arba slaptažodis y')]")
    private WebElement afterLogInnGettedTextNegativeTest;

    public LogInnPage(WebDriver driver) {
        super(driver);
    }
    //LOGInn
    public void setMyAccountName(String txt){
        myAccountName.sendKeys(txt);
    }
    public void setMyAccountPassword(String txt){
       myAccountPassword.sendKeys(txt);
    }
    public void setButtonToLogInn(){
        clickButtonToLogIn.click();
    }

    //Assertions negativeTest
    public String getAfterLogInnGettedTextNegativeTest(){
        return afterLogInnGettedTextNegativeTest.getText();
    }










}
