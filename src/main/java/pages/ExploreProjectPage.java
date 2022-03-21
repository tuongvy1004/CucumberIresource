package pages;

import Initialization.ValidateHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreProjectPage {
    private WebDriver driver;
    private ValidateHelpers validateHelpers;

    @FindBy (className = "explore-title-top")
    private WebElement tilteExplore;
    @FindBy (className = "create-persona-title")
    private WebElement titleProfile;

    public ExploreProjectPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
        validateHelpers = new ValidateHelpers(this.driver);
    }

    public WebElement getTitleExplorePro(){
        return tilteExplore;
   }

   public WebElement getTitleProfile(){
        return titleProfile;
   }
}
