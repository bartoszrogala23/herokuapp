package com.bartosz.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DynamicContent {
    final WebDriver driver;

    public DynamicContent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void refreshSite() {
        driver.navigate().refresh();
    }

//    getAvatarList() - creates list of avatars from the site.
//    step one: list of webelements (there's 3 avatars on the site)
//    step two: string list where we will put attributes from webelements .large-2 img
//    step three: loop fills the string list and returns this list
//    I could unify variables in both loops to use just one but the second one is for practise,

    public List<String> getAvatarList() {
        List<WebElement> avatarList = driver.findElements(By.cssSelector(".large-2 img"));
        List<String> srcElements = new ArrayList<>();
        for (WebElement webElement : avatarList) {
            String avatarSource = webElement.getAttribute("src");
            srcElements.add(avatarSource);
        }
        return srcElements;
    }

    public List<String> getCommentList() {
        List<WebElement> commentList = driver.findElements(By.cssSelector(".large-10"));
        List<String> textElements = new ArrayList<>();
        for (WebElement webElement : commentList) {
            String comment = webElement.getText();
            textElements.add(comment);
        }
        return textElements;
    }
}