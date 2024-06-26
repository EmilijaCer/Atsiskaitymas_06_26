package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CalculatorPage extends BasePage{
    //Calculation
    @FindBy(xpath= "//input[@id='sk1']")
    private WebElement inputNumberOne;

    @FindBy(xpath = "//input[@id='sk2']")
    private WebElement inputNumberTwo;
    @FindBy(css = "select[name='zenklas']")
    private WebElement arithmeticSymbol;

    @FindBy(xpath = "//input[@value='skaičiuoti']")
    private WebElement calculateButton;
    //Assertion positive test
    @FindBy(xpath = "//a[normalize-space()='Atliktos operacijos']")
    private WebElement getOperationAfterCalculatingPositiveTest;
    @FindBy(xpath = "//h4[contains(text(),'3 +')]")
    private WebElement getResultAfterCalculatingPositiveTest;

    //Assertion negative test
    @FindBy(xpath = "//span[@id='sk1.errors']")
    private WebElement resultAfterCalculatingNegativeTest;

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }
    public void clearFirstNumber(){
        inputNumberOne.clear();
    }
    public void inputNumberOne(String txt) {
        inputNumberOne.sendKeys(txt);
    }
    public void clearNumberTwo(){
        inputNumberTwo.clear();
    }
    public void inputNumberTwo(String txt){
        inputNumberTwo.sendKeys(txt);
    }
public void selectArithmeticSymbol(int i) {
    Select selectFunction = new Select(arithmeticSymbol);
    selectFunction.selectByIndex(0);
}
    public void calculateButton(){
        arithmeticSymbol.submit();
    }
    //Assertion Postive Test
    public void setOperationAfterCalculatingPositiveTest(){
        getOperationAfterCalculatingPositiveTest.click();
    }
    public String resultAfterCalculatingMessage() {
        return getResultAfterCalculatingPositiveTest.getText();
    }
    //Assertion Negative Test
    public String getTesultAfterCalculatingNegativeTest() {
        return resultAfterCalculatingNegativeTest.getText();
    }
}

