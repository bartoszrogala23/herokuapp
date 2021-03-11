package com.bartosz.herokuapp.FormAuthenticationTests;

import com.bartosz.herokuapp.BaseHerokuappTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UsernameNegativeTest extends BaseHerokuappTest {

    @Test
    public void positiveLoginTest() {
        herokuapp.goToformAuthentication();
        formAuthentication.incorrectUsername();
        String expectedResult = "Your username is invalid!";
        assertThat(formAuthentication.getMessage()).contains(expectedResult);
    }
}
