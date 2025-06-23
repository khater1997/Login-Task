package Org.Example.stepsDefs;

import Org.Example.pages.P01_loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Org.Example.stepsDefs.Hooks.driver;
import static org.testng.AssertJUnit.assertTrue;

public class D01_loginStepDefs {

    P01_loginPage loginPage;

    @Given("User open the login page")
    public void user_open_the_login_page() {
        loginPage = new P01_loginPage(driver);
        driver.get("https://example.com/login");   // enter your URl
    }

    @When("User enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("User click the login button")
    public void user_click_the_login_button() {

        loginPage.clickLogin();
    }

    @Then("User should see {string}")
    public void user_should_see(String result) {
        if (result.equals("success")) {
            assertTrue(driver.getCurrentUrl().contains("dashboard"));
        } else if (result.equals("error")) {
            assertTrue(loginPage.isErrorDisplayed());
        }

    }
}
