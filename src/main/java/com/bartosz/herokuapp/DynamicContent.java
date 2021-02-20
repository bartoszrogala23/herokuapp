package com.bartosz.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DynamicContent {
    final protected WebDriver driver;

    public DynamicContent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css =".large-2")
    private WebElement imageAvatarElements;

    @FindBy(css = ".large-10")
    private WebElement textElements;

    public void getAvatarList() {

    }

    public void refreshSite() { driver.navigate().refresh(); }


}