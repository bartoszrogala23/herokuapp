package com.bartosz.herokuapp.FormAuthenticationTests;

import com.bartosz.herokuapp.BaseHerokuappTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositiveTest extends BaseHerokuappTest {

    @Test
    public void positiveLoginTest() {
        herokuapp.goToformAuthentication();
        formAuthentication.positiveLogin();
        String expectedResult = "You logged into a secure area!";
        assertThat(formAuthentication.getMessage()).contains(expectedResult);
    }
}
