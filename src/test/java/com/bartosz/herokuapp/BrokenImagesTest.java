package com.bartosz.herokuapp;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

import static org.assertj.core.api.Assertions.assertThat;

public class BrokenImagesTest extends BaseHerokuappTest{

    @Test
    void brokenImageTest() {
        herokuapp.navigateToTopic("Broken Images");
        var images = brokenImage.findAllImages();
        images.forEach(image -> {
            assertThat(image.isDisplayed()).isTrue();
        });
    }
}
