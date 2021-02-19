package com.bartosz.herokuapp;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContextMenuTest extends BaseHerokuappTest{

    /** r-click on the spot to get an alert **/

    @Test
    public void getAlertFromSiteTest(){
        herokuapp.goToContextMenu();
        contextMenu.rightClickHotSpot();
        contextMenu.acceptTheAlert();
//        assertThat(acceptTheAlert);
    }


}
