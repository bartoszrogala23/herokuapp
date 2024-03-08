package com.bartosz.herokuapp;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DragAndDropSiteTest extends BaseHerokuappTest{

    @Test
    public void moveTheElement() {
        herokuapp.navigateToTopic("Drag and Drop");
        Point before = dragAndDropSite.getPosition();
        dragAndDropSite.moveElement();
        Point after = dragAndDropSite.getPosition();
        assertThat(before).isNotEqualTo(after);
    }
}