package com.bartosz.herokuapp.FormAuthenticationTests;

import com.bartosz.herokuapp.BaseHerokuappTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordNegativeTest extends BaseHerokuappTest {

    @Test
    public void positiveLoginTest() {
        herokuapp.goToformAuthentication();
        formAuthentication.incorrectPassword();
        String expectedResult = "Your password is invalid!";
        assertThat(formAuthentication.getMessage()).contains(expectedResult);
    }
}
