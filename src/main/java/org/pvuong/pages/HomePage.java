package org.pvuong.pages;

import org.openqa.selenium.WebDriver;
import org.pvuong.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(baseURL);
    }
}
