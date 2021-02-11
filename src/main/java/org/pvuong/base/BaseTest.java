package org.pvuong.base;

import org.openqa.selenium.WebDriver;
import org.pvuong.constants.general.Browser;
import org.pvuong.helpers.DriverHelper;
import org.pvuong.pages.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    @BeforeTest
    @Parameters("browser")
    public void setUp(@Optional(Browser.CHROME) String browser) {
        DriverHelper.init(browser);
        HomePage homePage = new HomePage();

        homePage.goTo();
        homePage.maximizeWindow();
    }

    @AfterTest
    public void tearDown() {
        HomePage homePage = new HomePage();
        homePage.closeBrowser();
    }
}
