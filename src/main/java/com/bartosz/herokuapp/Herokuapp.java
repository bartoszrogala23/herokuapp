package com.bartosz.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Herokuapp {
    private final WebDriver driver;

    public Herokuapp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li/a[contains(text(),'Add')]")
    private WebElement addRemoveElementsLink;
    @FindBy(xpath = "//li/a[contains(text(),'Basic')]")
    private WebElement basicAuth;



    public void goToAddRemoveElements() {
        addRemoveElementsLink.click();
    }
    public void goToBasicAuth() {
        basicAuth.click();
    }


}
