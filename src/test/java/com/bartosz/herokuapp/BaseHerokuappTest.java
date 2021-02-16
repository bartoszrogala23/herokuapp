package com.bartosz.herokuapp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseHerokuappTest {
    protected Herokuapp herokuapp;
    protected AddRemoveButton addRemoveButton;
    protected BasicAuthorization basicAuthorization;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        herokuapp = new Herokuapp(driver);
        addRemoveButton = new AddRemoveButton(driver);
        basicAuthorization = new BasicAuthorization(driver);
        driver.get("http://the-internet.herokuapp.com/");
    }

}