package com.bartosz.sportshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManShoes {
    private final WebDriver driver;

    public ManShoes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//div[contains(text(),'Rozwiń listę...')]")
    private WebElement expandSizeListButton;

    @FindBy(css = "[for='sizeGroupId_23']")
    private WebElement size43Button;

    @FindBy(xpath = "//li[@data-ord='3']/input[@type='checkbox']")
    private WebElement nikeSelectCheckbox;

    @FindBy(css = "#FilterBtn")
    private WebElement submitFilterButton;

    public void selectNikeShoesSize43() {
        expandSizeListButton.click();
        size43Button.click();
        nikeSelectCheckbox.click();
        submitFilterButton.click();
    }



}
