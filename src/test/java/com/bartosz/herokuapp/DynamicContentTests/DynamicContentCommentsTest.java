package com.bartosz.herokuapp.DynamicContentTests;

import com.bartosz.herokuapp.BaseHerokuappTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class DynamicContentCommentsTest extends BaseHerokuappTest {

    /**
     * Dynamic content site changes avatars and comments content if site is refreshed.
     * test verifies if users comments are changing after site refreshing.
     * users comments after refresh should be different than
     * users comments before refresh.
     */

    @Test
    public void CommentChangeAfterRefreshTest() {
        herokuapp.navigateToTopic("Dynamic Content");
        ArrayList<String> before = (ArrayList<String>) dynamicContent.getCommentList();
        dynamicContent.refreshSite();
        ArrayList<String> after = (ArrayList<String>) dynamicContent.getCommentList();
        assertThat(before).isNotEqualTo(after);
    }
}