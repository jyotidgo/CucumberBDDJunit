package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    WebDriver driver;
    // locator
    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(linkText = "Log in")
    public WebElement LoginLink;

    @FindBy(id = "small-searchterms")
    public WebElement searchTextBox;

    @FindBy(className = "search-box-button")
    public WebElement searchButton;

    public HomePage( WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }


    //actions
    public void clickRegisterLink()
    {
        registerLink.click();
    }
    public void clickLoginLink()
    {
        LoginLink.click();
    }

    public void enterSearchText(String text)
    {
        searchTextBox.sendKeys(text);
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }



}
