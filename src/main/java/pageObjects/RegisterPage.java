package pageObjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{ WebDriver driver;
    // locator
    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(id = "FirstName")
    public WebElement firstnameTextBox;

    @FindBy(id = "LastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "Email")
    public WebElement emailTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmpasswordTextBox;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(className ="result")
    public WebElement registerCnfText;

    @FindBy(name = "DateOfBirthDay")
    public WebElement dayDropDown;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthDropDown;
    @FindBy(name = "DateOfBirthYear")
    public WebElement yearDropDown;

    @FindBy(id= "gender-female")
    public WebElement femaleRadioBtn;






    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }

    //actions
    public void selectDay()
    {
        BasePage.driverUtils.selectUsingVisibility(dayDropDown,"19");

    }
    public void selectMonth()
    {
        BasePage.driverUtils.selectUsingVisibility(monthDropDown,"January");
    }
    public void selectYear()
    {
        BasePage.driverUtils.selectUsingVisibility(yearDropDown,"1914");
    }

    public void clickRegisterLink()
    {
        registerLink.click();
    }
    public void enterfirstName(String fn)
    {
        firstnameTextBox.sendKeys(fn);
    }
    public void enterlastName(String ln)
    {
        lastNameTextBox.sendKeys(ln);
    }
    public void enterEmail(String em)
    {
        emailTextBox.sendKeys(em);
    }
    public void enterpassword(String pw)
    {
        passwordTextBox.sendKeys(pw);
    }
    public void enterconfirmpassword(String cpw)
    {
        confirmpasswordTextBox.sendKeys(cpw);
    }

    public void clickRegisterButton()
    {
        registerButton.click();
    }
    public String getRegistercnfText()
    {
        return  registerCnfText.getText();
    }
public void clickFemaleRadioBtn()
{
    femaleRadioBtn.click();
}
}
