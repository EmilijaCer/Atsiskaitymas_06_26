package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends BasePage{
    //Register page
    @FindBy(xpath = "//a[contains(text(),'Sukurti naują paskyrą')]")
    private WebElement openCreateNewAccount;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement inputName;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@id='passwordConfirm']")
    private WebElement inputPasswordConfirm;
    @FindBy(xpath = "//button[normalize-space()='Sukurti']")
    private  WebElement continueButtonForFinishRegistration;

    //Assertions register Account
    @FindBy(xpath = "//h3[contains(text(),'Skaičiuotuvas jautrus neigiamiems skaičiams ;)')]")
    private WebElement afterCreatedUserGettedText;

    //LogOut
    @FindBy(css = "a[onclick=\"document.forms['logoutForm'].submit()\"]" )
    private WebElement logOutButton;

    //Assertions LogOut
    @FindBy(xpath = "//span[contains(text(),'Sėkmingai atsijungėte')]")
    private WebElement afterLogOutGettedText;

    //Assertion Negative Test
    @FindBy(xpath = "//span[@id='username.errors']")
    private WebElement afterNegativeTestGettedText;

    public RegisterAccountPage(WebDriver driver) {
        super(driver);
    }
    //Register
    public void setCreateNewAccount(){
        openCreateNewAccount.click();
    }
    public void setMyAccountName(String txt){
        inputName.sendKeys(txt);
    }
    public void setPassword(String txt){
        inputPassword.sendKeys(txt);
    }
    public void setPasswordConfirm(String txt){
        inputPasswordConfirm.sendKeys(txt);
    }
    public void setcontinueButtonForFinishRegistration(){
       continueButtonForFinishRegistration.click();
    }

    //Assertions register
    public String getAfterCreatedUserGettedText(){
        return afterCreatedUserGettedText.getText();
    }

    //LogOut
    public void setLogOutButton(){
    logOutButton.click();
    }
    //Assertions LogOut
    public String getAfterLogOutText(){
        return afterLogOutGettedText.getText();
    }
    //Assertions Negative Test
    public String getNegativeTestGettedText(){
        return afterNegativeTestGettedText.getText();
    }
}
