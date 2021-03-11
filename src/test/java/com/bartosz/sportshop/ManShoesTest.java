package com.bartosz.sportshop;

import org.junit.Test;

public class ManShoesTest extends BaseSportShopTest {


    @Test
    public void filterNikeManShoes() {
        sportshop.goToManShoes();
        manShoes.selectNikeShoesSize43();
    }
}
