package com.bartosz.herokuapp.DynamicControlTests;

import com.bartosz.herokuapp.BaseHerokuappTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EnableDisableTest extends BaseHerokuappTest {

    /** Dynamic Control Site shows different message when You disable or enable typing field.
     *  I am verifying  if massages are changing and if they meet expected results.
     *  Additionally, I put a text in the type field (without assertion).
     */

    @Test
    public void enablePutTextAndDisableField() {
        herokuapp.selectTopic("Dynamic Controls");
        dynamicControl.enableInputField();
        String afterEnable = dynamicControl.getMessage();
        dynamicControl.sendText();
        dynamicControl.disableButton();
        String afterDisable = dynamicControl.getMessage();
        assertThat(afterEnable).isNotEqualTo(afterDisable);
        assertThat(afterEnable).isEqualTo("It's enabled!");
        assertThat(afterDisable).isEqualTo("It's disabled!");
    }
}