package com.bartosz.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenu {
    private final WebDriver driver;

    public ContextMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#hot-spot")
    private WebElement hotSpot;

    public void rightClickHotSpot() {
        Actions actions = new Actions(driver);
        actions.contextClick(hotSpot).build().perform();
    }

    public void acceptTheAlert() {
        driver.switchTo().alert().accept();
    }
}