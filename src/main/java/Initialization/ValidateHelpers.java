package Initialization;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ValidateHelpers {

    private WebDriver driver;
    public WebDriverWait wait;
    private final int timeoutWaitForPageLoaded = 20;
    public ValidateHelpers(WebDriver _driver){
        this.driver = _driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void setText(WebElement element, String value ){
        //sendKey một giá trị là value cho element truyền vào
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(value);

    }

    public void clickElement(WebElement element){
        //click vào một phần từ element truyền vào
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void getErrorMsg(WebElement element, String message){
        waitForPageLoaded();
        wait.until(ExpectedConditions.visibilityOf(element));
        String strErrorMsg = element.getText();
        Assert.assertEquals(strErrorMsg, message);
    }

    public void getTitle(WebElement element, String message){
        waitForPageLoaded();
        wait.until(ExpectedConditions.visibilityOf(element));

        String strTitle = element.getText();
        Assert.assertEquals(strTitle, message);
    }
    public void verifyRadioBtn(WebElement element){
        Assert.assertTrue(element.isSelected());
    }

    public void verifyIsDisplayed(WebElement element){
        Assert.assertTrue(element.isDisplayed());
    }
    //Chờ đợi đến khi trang load xong mới thực hiện
    //Thời gian là 20s
    public void waitForPageLoaded(){
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>(){
            public Boolean apply(WebDriver driver){
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutWaitForPageLoaded));
            wait.until(expectation);
        } catch (Throwable error){
            Assert.fail("Timeout waiting for page load request");
        }
    }
}
