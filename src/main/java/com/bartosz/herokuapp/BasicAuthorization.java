package com.bartosz.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthorization {
    private final WebDriver driver;

    public BasicAuthorization(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".example")
    private WebElement properAuth;
    @FindBy(css = "#content")
    private WebElement loginStatus;


    public void authorizeUsingCorrectCredentials() {
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

    public void authorizeUsingIncorrectCredentials() {
        driver.get("http://abc:admin@the-internet.herokuapp.com/basic_auth");
    }

    public String getLoginStatus() {
        return loginStatus.getText();
    }
}