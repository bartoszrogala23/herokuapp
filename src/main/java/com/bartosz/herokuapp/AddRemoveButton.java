package com.bartosz.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddRemoveButton {
    private final WebDriver driver;

    public AddRemoveButton(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[onclick='addElement()']")
    private WebElement addElementButton;
    @FindBy(css = "[onclick='deleteElement()']")
    private WebElement deleteElementButton;


    public void addElement() {
        addElementButton.click();
    }

    public void deleteElement() {
        deleteElementButton.click();
    }

    public int countButtons() {
        List<WebElement> foundElements = driver.findElements(By.xpath("//button"));
        return foundElements.size();
    }
}