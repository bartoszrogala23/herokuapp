package com.bartosz.herokuapp;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DisappearingElementsSiteTest extends BaseHerokuappTest {

    @Test
    public void refreshSiteToMakeElementDisappear() {
        herokuapp.goToDisappearingElements();
        int before = disappearingElementsSite.countTheButtons();
        disappearingElementsSite.refreshSite();
        int after = disappearingElementsSite.countTheButtons();
        assertThat(before).isNotEqualTo(after);
    }
}
