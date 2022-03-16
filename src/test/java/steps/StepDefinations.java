package steps;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import utils.DriverFactory;

public class StepDefinations {
    String actualLoginPageTitle;

    @Given("i am on the nop commerce home page")
    public void i_am_on_the_nop_commerce_home_page() {
        BasePage.driverUtils.navigatetoUrl(DriverFactory.prop.getProperty("Url"));
    }

    @When("i click log in link from the nav bar")
    public void i_click_log_in_link_from_the_nav_bar() {
        BasePage.homePage.clickLoginLink();
    }

    @Then("i should be navigated to login page")
    public void i_should_be_navigated_to_login_page() {
        String actualLoginPageTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedLoginPageTitle"), actualLoginPageTitle);

    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String email) {
        BasePage.loginPage.enteremail(email);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String pw) {
        BasePage.loginPage.enterpassword(pw);
    }

    @When("i click on log in button")
    public void i_click_on_log_in_button() {
        BasePage.loginPage.clickloginButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assertions.assertTrue(BasePage.loginPage.verifyLogOut(), "verify logout is displayed");
    }

    @Then("i should be navigated to home page")
    public void i_should_be_navigated_to_home_page() {
        String actualHomePageTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedHomePageTitle"), actualHomePageTitle);

    }

    @When("i click on register link on the navbar")
    public void i_click_on_register_link_on_the_navbar() {
        BasePage.homePage.clickRegisterLink();

    }

    @Then("i should be navigated to register page")
    public void i_should_be_navigated_to_register_page() {
        String actualRegisterPageTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedRegisterPageTitle"), actualRegisterPageTitle);
    }

    @When("i select gender as female")
    public void i_select_gender_as_female() {
        BasePage.registerPage.clickFemaleRadioBtn();
    }

    @When("i select day month year from date of birth dropdown")
    public void i_select_day_month_year_from_date_of_birth_dropdown() {
        BasePage.registerPage.selectDay();
        BasePage.registerPage.selectMonth();
        BasePage.registerPage.selectYear();
    }

    @When("i enter firstName lastName email password confPassword")
    public void i_enter_first_name_last_name_email_password_conf_password(io.cucumber.datatable.DataTable dataTable) {
        BasePage.registerPage.enterfirstName(dataTable.cell(1, 0));
        BasePage.registerPage.enterlastName(dataTable.cell(1, 1));
        BasePage.registerPage.enterEmail(dataTable.cell(1, 2));
        BasePage.registerPage.enterpassword(dataTable.cell(1, 3));
        BasePage.registerPage.enterconfirmpassword(dataTable.cell(1, 4));
    }

    @When("i click on register button")
    public void i_click_on_register_button() {
        BasePage.registerPage.clickRegisterButton();
    }

    @Then("registration is successful")
    public void registration_is_successful() {
        String actualRegMsg = BasePage.registerPage.getRegistercnfText();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedRegisterConfMsg"), actualRegMsg);
    }

    @Then("i should see error messages on all mandatory fields")
    public void iShouldSeeErrorMessagesOnAllMandatoryFields() {
        System.out.println("validating error message");

    }

    @When("i enter invalid email as {string}")
    public void iEnterInvalidEmailAs(String invalidEmail) {
        BasePage.loginPage.enterinvalidemail(invalidEmail);
    }

    @And("i enter invalid password as {string}")
    public void iEnterInvalidPasswordAs(String InvalidPassword) 
    {
        BasePage.loginPage.enterinvalidPassword(InvalidPassword);
    }

    @Then("i should not be logged in successfully")
    public void iShouldNotBeLoggedInSuccessfully() {
        BasePage.loginPage.getEmailErrorMsg();
    }

    @When("i keep  email as blank {string}")
    public void iKeepEmailAsBlank(String arg0) {
        BasePage.loginPage.BlankEmail();
    }

    @And("i keep  password as blank {string}")
    public void iKeepPasswordAsBlank(String arg0) {
       BasePage.loginPage.BlankPassword();
    }

    @Then("i should not be logged in")
    public void iShouldNotBeLoggedIn()
    {BasePage.loginPage.BlankEmail();
    }
}




