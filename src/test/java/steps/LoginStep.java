package steps;

import Initialization.ValidateHelpers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BaseSetup;
import pages.ExploreProjectPage;
import pages.LoginPage;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LoginStep extends BaseSetup{
    WebDriver driver;
    LoginPage loginPage;
    ExploreProjectPage exploreProjectPage;
    ValidateHelpers validateHelpers;
    ExcelReader reader = new ExcelReader();
    String filePath = "src/main/java/data/iresource.xlsx";
    List<Map<String, String>> testData;

    //LOG_001
    @Given("I am on the Login page")
    public void iAmOnTheLoginPage() {
        driver = new BaseSetup().setupDriver("chrome");
        driver.get(new BaseSetup().getUrl());
        loginPage = new LoginPage(driver);
        exploreProjectPage = new ExploreProjectPage(driver);
        validateHelpers = new ValidateHelpers(driver);
    }

    @When("I enter in all fields from given sheetname {string} and rownumber {int}")
    public void iEnterInAllFieldsFromGivenSheetnameAndRownumberRowNumber(String sheetName, Integer rowNumber) throws IOException {

       // Đọc file excel
        testData= reader.getData(filePath,sheetName);
        String email = testData.get(rowNumber).get("email");
        String password = testData.get(rowNumber).get("password");

        validateHelpers.waitForPageLoaded();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }


    @And("I click the Login button")
    public void iClickTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("The Explore project page appears with {string}")
    public void theExploreProjectPageAppearsWith(String title){
        validateHelpers.waitForPageLoaded();
        validateHelpers.getTitle(exploreProjectPage.getTitleExplorePro(), title);
        loginPage.clickLogout();
        new BaseSetup().tearDown();
    }

    //LOG_002
    @Then("The error {string} appears")
    public void theErrorAppears(String message) throws InterruptedException {
        validateHelpers.getErrorMsg(loginPage.getInvalidMessage(), message);
        new BaseSetup().tearDown();
    }

    //LOG_003
    @When("I only enter the password from given {string} and {int}")
    public void iOnlyEnterThePasswordFromGivenAndRowNumber(String sheetName, Integer rowNumber) throws IOException {
        //Đọc file excel
        testData= reader.getData(filePath,sheetName);
        String password = testData.get(rowNumber).get("password");

        loginPage.enterPassword(password);
    }

    @Then("The error {string} appears at the bottom of the Email field")
    public void theErrorAppearsAtTheBottomOfTheEmailField(String message) throws InterruptedException {
        validateHelpers.getErrorMsg(loginPage.getRequired(), message);
        new BaseSetup().tearDown();
    }

    @Then("The error {string} appears at the bottom of the Password field")
    public void theErrorAppearsAtTheBottomOfThePasswordField(String message) {
        validateHelpers.getErrorMsg(loginPage.getMinimumPass(), message);
        new BaseSetup().tearDown();
    }


    @Then("The invalid format error message {string} appears")
    public void theInvalidFormatErrorMessageAppears(String message) {
        validateHelpers.getErrorMsg(loginPage.getInvalidEmailFormat(), message);
        new BaseSetup().tearDown();
    }

    @When("I enter password from given sheetname {string} and rownumber {int}")
    public void iEnterPasswordFromGivenSheetnameAndRownumberRowNumber(String sheetName, Integer rowNumber) throws IOException {
        //Đọc file excel
        testData= reader.getData(filePath,sheetName);
        String password = testData.get(rowNumber).get("password");

        loginPage.enterPassword(password);
    }

    @And("I click the Eye icon")
    public void iClickTheEyeIcon() {
        validateHelpers.clickElement(loginPage.getEyeIcon());
    }

    @Then("The password is displayed with type text")
    public void thePasswordIsDisplayedWithTypeText() {
        validateHelpers.verifyIsDisplayed(loginPage.getPasswordText());
    }

    @When("I only enter the email from given {string} and {int}")
    public void iOnlyEnterTheEmailFromGivenAndRowNumber(String sheetName, Integer rowNumber) throws IOException {
        //Đọc file excel
        testData= reader.getData(filePath,sheetName);
        String email = testData.get(rowNumber).get("email");

        loginPage.enterEmail(email);
    }

    @Then("The error message {string} appears at the bottom of the Password field")
    public void theErrorMessageAppearsAtTheBottomOfThePasswordField(String message) {
        validateHelpers.getErrorMsg(loginPage.getRequiredPassword(), message);
        new BaseSetup().tearDown();
    }
}
