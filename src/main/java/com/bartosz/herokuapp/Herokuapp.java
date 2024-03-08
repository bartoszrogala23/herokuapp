package com.bartosz.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Herokuapp {
    private final WebDriver driver;

    public Herokuapp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final String TOPIC_SELECTOR = "//li/a[contains(text(),'%s')]";

    public void selectTopic(String name) {
        By topicLocator = By.xpath(String.format(TOPIC_SELECTOR, name));
        this.driver.findElement(topicLocator).click();
    }
}