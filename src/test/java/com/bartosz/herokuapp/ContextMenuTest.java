package com.bartosz.herokuapp;

import org.testng.annotations.Test;

public class ContextMenuTest extends BaseHerokuappTest {

    /** r-click on the spot to get an alert **/
    /**
     * automation process only, figure out how to make an assertion
     **/

    @Test
    public void getAlertFromSiteTest() {
        herokuapp.selectTopic("Context Menu");
        contextMenu.rightClickHotSpot();
        contextMenu.acceptTheAlert();
    }
}