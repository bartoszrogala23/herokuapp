package com.bartosz.herokuapp;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChallengingDOMTest extends BaseHerokuappTest{
    /** negative test **/

    @Test
    public void countTheRowsAfterRandomDelete() {
        herokuapp.goToChallengingDOM();
        int before = challengingDOM.countTheRows();
        challengingDOM.deleteRandomRow();
        int after = challengingDOM.countTheRows();
        assertThat(before).isEqualTo(after);
    }

}
