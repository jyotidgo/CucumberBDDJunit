package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;
    // locator


    @FindBy(linkText = "Log in")
    public WebElement LoginLink;

    @FindBy(id = "Email")
    public WebElement EmailTextBox;



    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(className = "login-button")
    public WebElement loginButton;

    @FindBy(className = "Log out")
    public WebElement logOutLink;

    @FindBy(className = "Please enter your email")
    public WebElement blankEmailMsg;

    @FindBy(id = "Email-error")
    public WebElement EmailErrorMsg;

    public LoginPage( WebDriver driver)



    {
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }



    public void clickLoginLink()
    {
        LoginLink.click();
    }

    public void enteremail(String email)
    {
EmailTextBox.sendKeys(email);
    }
    public void BlankEmail()
    {
        EmailTextBox.sendKeys();
    }
    public void enterinvalidemail(String invalidEmail)
    {
        EmailTextBox.sendKeys(invalidEmail);
    }

    public void enterpassword(String password)
    {
passwordTextBox.sendKeys(password);
    }
    public void BlankPassword()
    {
        passwordTextBox.sendKeys();
    }

    public void enterinvalidPassword(String invalidpassword)
    {
        passwordTextBox.sendKeys(invalidpassword);
    }
    public void clickloginButton()
    {
        loginButton.click();
    }
    public void clickloginOutLink()
    {
        loginButton.click();
    }
    public  String getMessage()
    {
return blankEmailMsg.getText();
    }

    public String getEmailErrorMsg()
    {
        return EmailErrorMsg.getText();
    }
    public boolean verifyLogOut()
    {
       return logOutLink.isDisplayed();
    }




}
