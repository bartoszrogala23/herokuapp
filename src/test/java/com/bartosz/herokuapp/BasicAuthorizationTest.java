package com.bartosz.herokuapp;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicAuthorizationTest extends BaseHerokuappTest {

    @Test
    public void correctAuthTest() {
        herokuapp.navigateToTopic("Basic Auth");
        basicAuthorization.authorizeUsingCorrectCredentials();
        String expectedMessage = "Congratulations! You must have the proper credentials.";
        assertThat(basicAuthorization.getLoginStatus()).containsIgnoringCase(expectedMessage);
    }
}