package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='Atliktos operacijos']")
    private WebElement clickToSearchField;
    @FindBy(xpath = "//tbody/tr[2]/td[5]/a[3]")
    private WebElement inputToShow;
    @FindBy(xpath = "//td[normalize-space()='1']")
    private WebElement CheckID;

    //Assertion PositiveTest


    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void setSearchField(){
        clickToSearchField.click();
    }
    public void setInputToShow(){
        inputToShow.click();
    }
    public void setCheckID(){
        CheckID.click();
    }

    //Assertion PositiveTest
    public String getAfterLogInnGettedTextPositiveTest(){
        return CheckID.getText();
    }

}
