package com.bartosz.herokuapp.DynamicContentTests;

import com.bartosz.herokuapp.BaseHerokuappTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class DynamicContentImageTest extends BaseHerokuappTest {


    @Test
    public void ImageRefreshTest() {
        herokuapp.goToDynamicContent();
        ArrayList<String> before = (ArrayList<String>) dynamicContent.getAvatarList();
        dynamicContent.refreshSite();
        ArrayList<String> after = (ArrayList<String>) dynamicContent.getAvatarList();
        assertThat(before).isNotEqualTo(after);
    }

    @Test
    public void getAtr() {
        herokuapp.goToDynamicContent();
        dynamicContent.getAttribute();
    }


}
