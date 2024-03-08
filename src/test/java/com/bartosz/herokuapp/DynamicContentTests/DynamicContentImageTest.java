package com.bartosz.herokuapp.DynamicContentTests;

import com.bartosz.herokuapp.BaseHerokuappTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class DynamicContentImageTest extends BaseHerokuappTest {

    /**
     * Dynamic content site changes avatars and comments content if site is refreshed.
     * test verifies if users avatars are changing after site refreshing.
     * list of avatars' URLs after refresh should be different than
     * avatars' URLs before refresh
     */

    @Test
    public void AvatarChangeAfterRefreshTest() {
        herokuapp.selectTopic("Dynamic Content");
        ArrayList<String> before = (ArrayList<String>) dynamicContent.getAvatarList();
        dynamicContent.refreshSite();
        ArrayList<String> after = (ArrayList<String>) dynamicContent.getAvatarList();
        assertThat(before).isNotEqualTo(after);
    }
}