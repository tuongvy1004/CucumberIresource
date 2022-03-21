package pages;

import Initialization.ValidateHelpers;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;

public class SignUpPage {
    WebDriver driver;
    private ValidateHelpers validateHelpers;
    @FindBy(className = "signup-title")
    private WebElement titleSignUp;

    @FindBy(name = "firstname")
    private WebElement firstnameInput;

    @FindBy(name = "lastname")
    private WebElement lastnameInput;

    @FindBy(css = "input[placeholder='Enter your email']")
    private WebElement emailInput;

    @FindBy(css = "input[placeholder='Enter your password']")
    private WebElement passwordInput;

    @FindBy(css = "input[placeholder='Confirm your password']")
    private WebElement confirmPassInput;

    @FindBy(css = "button[type='submit']")
    private WebElement btnSignUp;

    @FindBy(css = "p[class='errors']")
    private WebElement errorMsgFirstName;

    @FindBy (css = "#root > div > div.auth-layout > div > div.col-md-6.auth-main > div.signup-wrapper > form > div > div.row > div:nth-child(2) > p")
    private WebElement errorMsgLastName;

    @FindBy(css = "div[class='col form-group']>p[class='errors']")
    private WebElement requiredFirstName;

    @FindBy(xpath = "//input[@id='card1']")
    private WebElement radiobtnPersona;

    @FindBy(xpath = "//p[contains(text(),'Password doesn’t match')]")
    private WebElement confirmPass;

    @FindBy (css = "div.form-wrapper div.form-group:nth-child(4) > p.errors")
    private WebElement errorMsgPassword;

    @FindBy (css = "a[class='font-weight-bold'][href='/login']")
    private WebElement loginLink;

    public SignUpPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
        validateHelpers = new ValidateHelpers(this.driver);

    }
    public void signup(String firstName, String lastName, String email, String password, String confirmPass){
        firstnameInput.sendKeys(firstName);
        lastnameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPassInput.sendKeys(confirmPass);
    }
    public void signup(String lastName, String email, String password, String confirmPass){
        lastnameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPassInput.sendKeys(confirmPass);
    }
    public void enterFirstName(String firstName){
        validateHelpers.setText(firstnameInput, firstName);
    }
    public void enterLastName(String lastName){
        validateHelpers.setText(lastnameInput, lastName);
    }
    public void enterEmailSignUp(String email){
        validateHelpers.setText(emailInput, email);
    }
    public void enterPasswordSignUp(String password){
        validateHelpers.setText(passwordInput, password);
    }
    public void confirmPass(String confirmPass){
        validateHelpers.setText(confirmPassInput, confirmPass);
    }
    public void clickSignup(){
        validateHelpers.clickElement(btnSignUp);
    }

    public WebElement getTitleSignUp(){
        return titleSignUp;
    }

    public WebElement getErrorMsgFirstName(){
        return errorMsgFirstName;
    }

    public WebElement getRequiredFirstName(){
        return requiredFirstName;
    }

    public WebElement getRbnPersona(){
        return radiobtnPersona;

    }
    public WebElement getPasswordMsg(){
        return errorMsgPassword;
    }
    public WebElement getConfirmPassMsg(){
        return confirmPass;
    }

    public void enterEmailtoVerify(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // chuyến driver đến window con
        //blank: URL được tải vào cửa số mới
        js.executeScript("window.open('https://qa.team/','_blank');");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public WebElement loginLinkText(){
        return loginLink;
    }
}
