package com.bartosz.sportshop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseSportShopTest {
    protected SportShop sportshop;
    protected ManShoes manShoes;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sportshop = new SportShop(driver);
        manShoes = new ManShoes(driver);
        driver.get("http://www.sport-shop.pl/");
    }

}
