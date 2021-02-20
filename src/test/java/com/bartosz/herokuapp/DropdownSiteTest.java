package com.bartosz.herokuapp;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DropdownSiteTest extends BaseHerokuappTest{


    @Test
    public void dropdownTest(){
        herokuapp.goToDropdown();
        String before = dropdownSite.getItemName();
        dropdownSite.selectValue1();
        String after = dropdownSite.getItemName();
        assertThat(before).isNotEqualTo(after);


    }


}
