package com.bartosz.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthentication {
    final  protected WebDriver driver;

    public FormAuthentication(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#username")
    private WebElement usernameField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = ".fa-sign-in")
    private WebElement loginButton;

    public void positiveLogin() {
        usernameField.sendKeys("tomsmith");
        passwordField.sendKeys("SuperSecretPassword!");
        loginButton.click();
    }

    public void incorrectUsername() {
        usernameField.sendKeys("toms");
        passwordField.sendKeys("SuperSecretPassword!");
        loginButton.click();
    }

    public void incorrectPassword() {
        usernameField.sendKeys("tomsmith");
        passwordField.sendKeys("asdf!");
        loginButton.click();
    }

    public String getMessage() {
        return driver.findElement(By.cssSelector("#flash")).getText();
    }

}
