package com.bartosz.herokuapp.DynamicContentTests;

import com.bartosz.herokuapp.BaseHerokuappTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class DynamicContentImageTest extends BaseHerokuappTest {


    @Test
    public void ImageRefreshTest(){
        herokuapp.goToDynamicContent();
        dynamicContent.refreshSite();


    }


}
