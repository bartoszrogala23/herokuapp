package com.bartosz.sportshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportShop {
    final protected WebDriver driver;

    public SportShop(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div/a[contains(text(),'Obuwie męskie')]")
    private WebElement manShoes;


    public void goToManShoes() {
        manShoes.click();
    }


}
