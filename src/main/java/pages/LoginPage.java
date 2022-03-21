package pages;

import Initialization.ValidateHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    private ValidateHelpers validateHelpers;

    // 1. Locators:
    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(css = "button[class ='login-form-submit-btn'][type = 'submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement errorMsgText;

    @FindBy(css = "p[class='errors']")
    private WebElement requiredMsg;

    @FindBy(css = "div[class='login-form-group '] p[class='errors']")
    private WebElement minimumMsg;

    @FindBy(css = "a[class='directional-signup-link']")
    private WebElement signupLink;

    @FindBy (className = "login-title")
    private WebElement loginTitle;

    @FindBy (css = "i[class ='fas fa-sign-out-alt'")
    private WebElement logoutIcon;

    @FindBy (css = " div.form-group.login-form-group:nth-child(2) > p.errors:nth-child(3)")
    private WebElement invalidEmailText;

    @FindBy (css = "input[type='text'][id='password']")
    private WebElement passwordText;

    @FindBy (css = "i[class='far fa-eye-slash']")
    private WebElement eyeIcon;

    // 2. Constructor of the page class:
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //Khởi tạo giá trị cho đối tượng này vs những đối số truyền vào
        validateHelpers = new ValidateHelpers(this.driver);
    }

    // 3. page actions: features(behavior) of the page the form of methods:
    public void enterEmail(String email){
        validateHelpers.setText(emailInput, email);
    }
    public void enterPassword(String password){
        validateHelpers.setText(passwordInput, password);
    }
    public void clickLogin(){
        validateHelpers.clickElement(loginButton);
    }
    public void clickLogout(){ validateHelpers.clickElement(logoutIcon);}

    //lấy thông báo lỗi khi nhập sai email hoặc password
    public WebElement getInvalidMessage(){
        return errorMsgText;
    }

    //lấy thông báo lỗi khi để trống trường email
    public WebElement getRequired(){
        return requiredMsg;
    }

    //lấy thông báo lỗi khi để trống trường password
    public WebElement getRequiredPassword(){
        return requiredMsg;
    }

    public WebElement getMinimumPass(){
        return minimumMsg;
    }

    public void clickSignUp(){
        validateHelpers.clickElement(signupLink);
    }

    public WebElement getLoginTitle(){
        return loginTitle;
    }

    public WebElement getInvalidEmailFormat(){
        return invalidEmailText;
    }

    public WebElement getPasswordText(){
        return passwordText;
    }
    public WebElement getEyeIcon(){
        return eyeIcon;
    }
}
