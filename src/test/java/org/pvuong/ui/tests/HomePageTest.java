package org.pvuong.ui.tests;

import org.pvuong.base.BaseTest;
import org.pvuong.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void verifyHomePageDisplayed() {
        HomePage homePage = new HomePage(driver);

        homePage.goTo();
    }
}
