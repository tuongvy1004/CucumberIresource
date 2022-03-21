package pages;

import Initialization.ValidateHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class VerifyEmailPage {
    WebDriver driver;
    private ValidateHelpers validateHelpers;
    @FindBy (css = "input[type='text']")
    private WebElement codeTextbox;

    @FindBy (css = "button[class='verify-email-form-btn']")
    private WebElement btnConfirm;

    @FindBy (id = "code")
    private WebElement emailNameText;

    @FindBy (id = "submit_code")
    private WebElement btnSubmit;

    @FindBy (className = "subject")
    private WebElement newEmail;

    @FindBy (css = "pre:nth-child(1)")
    private WebElement strEmail;

    @FindBy(css = "h2[class='signup-title']")
    private WebElement titleVerify;

    public VerifyEmailPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        validateHelpers = new ValidateHelpers(this.driver);
    }

    public WebElement getTitleVerifyEmail(){
        return titleVerify;
    }
    public void enterCode(String digitCode) {
        validateHelpers.setText(codeTextbox, digitCode);
    }
    public void clickBtnConfirmCode(){
        validateHelpers.clickElement(btnConfirm);
    }
     public void enterEmailName(String emailName){
        validateHelpers.setText(emailNameText, emailName);
     }


    public void clickBtnSubmit(){
        validateHelpers.clickElement(btnSubmit);
    }
    public void openMail(){
        newEmail.click();
    }

    public String getCode(){
        String code = strEmail.getText();
        int index = code.lastIndexOf("t:");
        String lastString = code.substring(index + 2).trim();
        String strCode = lastString.substring(0, 6);
        System.out.println(strCode);
        return strCode;
    }
    public void enterCodetoVerify(){
        driver.navigate().refresh();
        openMail();
        String strCode = getCode();
        //Switch to old tab to enter the code
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        enterCode(strCode);
    }

}
