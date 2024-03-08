package com.bartosz.herokuapp;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddRemoveElementsTest extends BaseHerokuappTest {

    @Test
    public void AddAndRemoveElement() {
        herokuapp.navigateToTopic("Add/Remove Elements");
        int before = addRemoveButton.countButtons();
        addRemoveButton.addElement();
        int after = addRemoveButton.countButtons();
        addRemoveButton.deleteElement();
        assertThat(before).isLessThan(after);
    }
}