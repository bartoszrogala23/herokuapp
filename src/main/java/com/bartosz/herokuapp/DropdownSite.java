package com.bartosz.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownSite {
    final protected WebDriver driver;

    public DropdownSite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#dropdown")
    private WebElement dropdownList;

    @FindBy(css = "[value='1']")
    private WebElement value1;

    @FindBy(css = "[selected='selected']")
    private WebElement selectedItem;

    public void selectValue1() {
        dropdownList.click();
        value1.click();
    }

    public String getItemName() {
       return selectedItem.getText();
    }
}