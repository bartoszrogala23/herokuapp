package com.bartosz.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DynamicControl {
    final protected WebDriver driver;


    public DynamicControl(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id='checkbox-example'] #message")
    private WebElement checkboxMessage;
    @FindBy(css = "[type='checkbox']")
    private WebElement checkbox;
    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    private WebElement removeButton;
    @FindBy(xpath = "//button[contains(text(),'Add')]")
    private WebElement addButton;
    @FindBy(css = "[type='checkbox']")
    private WebElement dynamicControlCheckbox;
    @FindBy(css = "#input-example [type='text']")
    private WebElement textInputField;
    @FindBy(xpath = "//button[contains(text(),'Enable')]")
    private WebElement enableButton;
    @FindBy(css = "[id=\"input-example\"] #message")
    private WebElement inputMessage;


    public void checkboxClick() {
        checkbox.click();
    }

    public void removeButtonClick() {
        removeButton.click();
    }

    public void addClick() {
        addButton.click();
    }

    public void enableClick() {
        enableButton.click();
    }

    public void sendText() {
        textInputField.sendKeys("I am testing this field");
    }










}