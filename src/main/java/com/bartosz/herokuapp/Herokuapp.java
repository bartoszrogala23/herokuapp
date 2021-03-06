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
    private WebElement challengingDOMSite;
    @FindBy(xpath = "//li/a[contains(text(),'Context Menu')]")
    private WebElement contextMenuSite;
    @FindBy(xpath = "//li/a[contains(text(),'Disappearing Elements')]")
    private WebElement disappearingElementsSite;
    @FindBy(xpath = "//li/a[contains(text(),'Drag and Drop')]")
    private WebElement dragAndDropSite;
    @FindBy(xpath = "//li/a[contains(text(),'Dropdown')]")
    private WebElement dropdownSite;
    @FindBy(xpath = "//li/a[contains(text(),'Dynamic Content')]")
    private WebElement dynamicContentSite;
    @FindBy(xpath = "//li/a[contains(text(),'Dynamic Controls')]")
    private WebElement dynamicControlsSite;
    @FindBy(xpath = "//li/a[contains(text(),'Form Authentication')]")
    private WebElement formAuthenticationSite;



    public void goToAddRemoveElements() {
        addRemoveElementsSite.click();
    }

    public void goToBasicAuth() {
        basicAuthSite.click();
    }

    public void goToChallengingDOM() { challengingDOMSite.click(); }

    public void goToContextMenu() { contextMenuSite.click(); }

    public void goToDisappearingElements() { disappearingElementsSite.click();}

    public void goToDragAndDrop() { dragAndDropSite.click(); }

    public void goToDropdown() { dropdownSite.click(); }

    public void goToDynamicContent() { dynamicContentSite.click(); }

    public void goToDynamicControls() { dynamicControlsSite.click(); }

    public void goToformAuthentication() { formAuthenticationSite.click(); }


}
