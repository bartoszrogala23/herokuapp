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
    private WebElement addRemoveElementsSite;
    @FindBy(xpath = "//li/a[contains(text(),'Basic')]")
    private WebElement basicAuthSite;
    @FindBy(xpath = "//li/a[contains(text(),'Challenging DOM')]")
    private WebElement ChallengingDOMSite;
    @FindBy(xpath = "//li/a[contains(text(),'Context Menu')]")
    private WebElement ContextMenuSite;


    public void goToAddRemoveElements() {
        addRemoveElementsSite.click();
    }

    public void goToBasicAuth() {
        basicAuthSite.click();
    }

    public void goToChallengingDOM() { ChallengingDOMSite.click(); }

    public void goToContextMenu() { ContextMenuSite.click(); }


}
