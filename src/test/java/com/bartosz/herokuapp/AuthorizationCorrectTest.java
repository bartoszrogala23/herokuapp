package com.bartosz.herokuapp;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthorizationCorrectTest extends BaseHerokuappTest {

    @Test
    public void correctAuthTest() {
        herokuapp.selectTopic("Basic Auth");
        basicAuthorization.correctAuth();
        String expectedMessage = "Congratulations! You must have the proper credentials.";
        assertThat(basicAuthorization.getLoginStatus()).isEqualTo(expectedMessage);
    }
}