package steps;

import Initialization.ValidateHelpers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import utils.ExcelReader;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SignUpStep{
    WebDriverWait wait;
    WebDriver driver;
    SignUpPage signUpPage;
    VerifyEmailPage verifyEmailPage;
    ValidateHelpers validateHelpers;
    LoginPage loginPage;
    ExploreProjectPage exploreProjectPage;
    ExcelReader reader = new ExcelReader();
    String filePath = "src/main/java/data/iresource.xlsx";
    List<Map<String, String>> testData;

    //SIG_001
    @Given("I am on the Login page and click the Sign up link")
    public void iAmOnTheLoginPageAndClickTheSignUpLink() {
        driver = new BaseSetup().setupDriver("chrome");
        driver.get(new BaseSetup().getUrl());
        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);
        validateHelpers = new ValidateHelpers(driver);
        verifyEmailPage = new VerifyEmailPage(driver);
        exploreProjectPage = new ExploreProjectPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        loginPage.clickSignUp();
    }
    @When("I enter in all fields from given {string} and {int}")
    public void iEnterInAllFieldsFromGivenAndRowNumber(String sheetName, Integer rowNumber) throws IOException {
        //Đọc file excel
        testData= reader.getData(filePath,sheetName);
        String firstName = testData.get(rowNumber).get("First name");
        String lastName = testData.get(rowNumber).get("Last name");
        String email = testData.get(rowNumber).get("Email");
        String password = testData.get(rowNumber).get("Password");
        String confirmPass = testData.get(rowNumber).get("Confirm password");
        validateHelpers.waitForPageLoaded();

        signUpPage.signup(firstName, lastName, email, password, confirmPass);
    }

    @And("I click the Sign up button")
    public void iClickTheSignUpButton() {
        signUpPage.clickSignup();
    }


    @And("The Verify Email page appears with title {string}")
    public void theVerifyEmailPageAppearsWithTitle(String title) throws InterruptedException {
        Thread.sleep(10000);
        validateHelpers.getTitle(verifyEmailPage.getTitleVerifyEmail(), title);
    }

    @And("I open the email page and enter email from {string} and {int}")
    public void iOpenTheEmailPageAndEnterEmailFromAndRowNumber(String sheetName, Integer rowNumber) throws IOException {
        //open url email and enter email
        signUpPage.enterEmailtoVerify();

        //Đọc file excel
        testData= reader.getData(filePath,sheetName);
        String email = testData.get(rowNumber).get("Email");
        int index = email.lastIndexOf("@");
        String strEmail = email.substring(0, index);
        verifyEmailPage.enterEmailName(strEmail);
        verifyEmailPage.clickBtnSubmit();
    }

    @And("I enter code in the text box")
    public void iEnterCodeInTheTextBox() {
        // lấy code và nhập
        verifyEmailPage.enterCodetoVerify();
    }

    @And("I click the Confirm button")
    public void iClickTheConfirmButton() {
        verifyEmailPage.clickBtnConfirmCode();
    }

    @And("the Login page appears with title {string}")
    public void theLoginPageAppearsWithTitle(String title) {
        validateHelpers.getTitle(loginPage.getLoginTitle(),title );
    }


    @And("I enter registered input from given {string} and {int}")
    public void iEnterRegisteredInputFromGivenAndRowNumber(String sheetName, int rowNumber) throws IOException {
        //Đọc file excel
        testData= reader.getData(filePath,sheetName);
        String email = testData.get(rowNumber).get("Email");
        String password = testData.get(rowNumber).get("Password");

        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }


    @Then("The Profile page appears with title {string}")
    public void theProfilePageAppearsWithTitle(String title) {
        validateHelpers.getTitle(exploreProjectPage.getTitleProfile(), title);
        new BaseSetup().tearDown();
    }

    //SIG_002
    @When("The Sign up page appears with title {string}")
    public void theSignUpPageAppearsWithTitle(String title) {
        validateHelpers.getTitle(signUpPage.getTitleSignUp(), title);
    }

    @Then("The radio button Persona is selected by default")
    public void theRadioButtonPersonaIsSelectedByDefault(){

        validateHelpers.verifyRadioBtn(signUpPage.getRbnPersona());
        new BaseSetup().tearDown();
    }

    //SIG_003
    @When("I enter number in the Firstname field from given {string} and {int}")
    public void iEnterNumberInTheFirstnameFieldFromGivenAndRowNumber(String sheetName, int rowNumber) throws IOException {
        //Đọc file excel
        testData= reader.getData(filePath,sheetName);
        int firstName = Integer.parseInt(testData.get(rowNumber).get("First name"));
        String lastName = testData.get(rowNumber).get("Last name");
        String email = testData.get(rowNumber).get("Email");
        String password = testData.get(rowNumber).get("Password");
        String confirmPass = testData.get(rowNumber).get("Confirm password");
        validateHelpers.waitForPageLoaded();


        signUpPage.enterFirstName(String.valueOf(firstName));
        signUpPage.signup(lastName, email, password, confirmPass);
    }

    @Then("The error message {string} appears")
    public void theErrorMessageAppears(String message) throws InterruptedException {
        Thread.sleep(2000);
        validateHelpers.getErrorMsg(signUpPage.getErrorMsgFirstName(), message);
        new BaseSetup().tearDown();
    }

    @When("I leave Firstname blank and enter remaining fields from given {string} and {int}")
    public void iLeaveFirstnameBlankAndEnterRemainingFieldsFromGivenAndRowNumber(String sheetName, int rowNumber) throws IOException {
        //Đọc file excel
        testData= reader.getData(filePath,sheetName);
        String lastName = testData.get(rowNumber).get("Last name");
        String email = testData.get(rowNumber).get("Email");
        String password = testData.get(rowNumber).get("Password");
        String confirmPass = testData.get(rowNumber).get("Confirm password");
        validateHelpers.waitForPageLoaded();

        signUpPage.signup(lastName, email, password, confirmPass);
    }

    @Then("The required error message appears with text {string}")
    public void theRequiredErrorMessageAppearsWithText(String message) {
        validateHelpers.getErrorMsg(signUpPage.getRequiredFirstName(), message );
        new BaseSetup().tearDown();
    }

    //SIG_005
    @When("I enter not match password in the Confirm password field from given {string} and {int}")
    public void iEnterNotMatchPasswordInTheConfirmPasswordFieldFromGivenAndRowNumber(String sheetName, int rowNumber) throws IOException {
        //Đọc file excel
        testData= reader.getData(filePath,sheetName);
        String firstName = testData.get(rowNumber).get("First name");
        String lastName = testData.get(rowNumber).get("Last name");
        String email = testData.get(rowNumber).get("Email");
        String password = testData.get(rowNumber).get("Password");
        String confirmPass = testData.get(rowNumber).get("Confirm password");
        validateHelpers.waitForPageLoaded();

        signUpPage.signup(firstName, lastName, email, password, confirmPass);
    }

    @Then("The Confirm password error message {string} appears")
    public void theConfirmPasswordErrorMessageAppears(String message) {
        validateHelpers.getErrorMsg(signUpPage.getConfirmPassMsg(), message);
        new BaseSetup().tearDown();
    }


    @When("I click the Login link")
    public void iClickTheLoginLink() {
        validateHelpers.clickElement(signUpPage.loginLinkText());
    }


    @Then("The Login page appears with the {string} title")
    public void theLoginPageAppearsWithTheTitle(String title) {
        validateHelpers.getTitle(loginPage.getLoginTitle(), title);
        new BaseSetup().tearDown();
    }
}
