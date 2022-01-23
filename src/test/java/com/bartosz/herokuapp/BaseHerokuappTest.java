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
    protected ChallengingDOM challengingDOM;
    protected ContextMenu contextMenu;
    protected DisappearingElementsSite disappearingElementsSite;
    protected DragAndDropSite dragAndDropSite;
    protected DropdownSite dropdownSite;
    protected DynamicContent dynamicContent;
    protected DynamicControl dynamicControl;
    protected FormAuthentication formAuthentication;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        herokuapp = new Herokuapp(driver);
        addRemoveButton = new AddRemoveButton(driver);
        basicAuthorization = new BasicAuthorization(driver);
        challengingDOM = new ChallengingDOM(driver);
        contextMenu = new ContextMenu(driver);
        disappearingElementsSite = new DisappearingElementsSite(driver);
        dragAndDropSite = new DragAndDropSite(driver);
        dropdownSite = new DropdownSite(driver);
        dynamicContent = new DynamicContent(driver);
        dynamicControl = new DynamicControl(driver);
        formAuthentication = new FormAuthentication(driver);
        driver.get("http://the-internet.herokuapp.com/");
    }
}