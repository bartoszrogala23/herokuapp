package com.bartosz.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class ChallengingDOM {
    private final WebDriver driver;

    public ChallengingDOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tbody//tr")
    private WebElement TableRow;
    @FindBy(css = "[href='#delete']")
    private WebElement randomDeleteButton;

    public int countTheRows() {
        List<WebElement> foundElements = driver.findElements(By.xpath("//tbody//tr"));
        return foundElements.size();
    }

    public void deleteRandomRow() {
        List<WebElement> foundButtons = driver.findElements(By.cssSelector("[href='#delete']"));
        Random random = new Random();
        WebElement randomPick = foundButtons.get(random.nextInt(foundButtons.size()));
        randomPick.click();
    }
}
