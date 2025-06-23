package Org.Example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_loginPage {

    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginBtn");
    By errorMsg = By.id("errorMsg");

    public P01_loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorDisplayed() {
        return driver.findElements(errorMsg).size()> 0 && driver.findElement(errorMsg).isDisplayed();
    }
}
