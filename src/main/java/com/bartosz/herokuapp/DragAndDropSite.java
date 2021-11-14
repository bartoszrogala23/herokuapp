package com.bartosz.herokuapp;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropSite {
    final protected WebDriver driver;

    public DragAndDropSite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#column-a")
    private WebElement blockA;

    @FindBy(css = "#column-b")
    private WebElement blockB;

    public void moveElement() {
        Actions actions = new Actions(driver);
//        TODO: DragAndDropSite does not move blockA to indicated element (blockB) - fix it.
        actions.clickAndHold(blockA).moveByOffset(1000,0).release().build().perform();
    }

    public Point getPosition() {
        return blockA.getLocation();
    }
}
