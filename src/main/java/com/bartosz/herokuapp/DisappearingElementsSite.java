package com.bartosz.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DisappearingElementsSite {
    final protected WebDriver driver;


    public DisappearingElementsSite(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int countTheButtons() {
        List<WebElement> foundElements = driver.findElements(By.xpath("//ul/li"));
        return foundElements.size();
    }

    public void refreshSite() {
        int firstCount = countTheButtons();
        do {
            driver.navigate().refresh();
        }
        while (firstCount == countTheButtons());
    }


}

