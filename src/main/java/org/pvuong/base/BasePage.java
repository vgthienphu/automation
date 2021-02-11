package org.pvuong.base;

import org.openqa.selenium.WebDriver;
import org.pvuong.helpers.DriverHelper;

public class BasePage {
    protected String baseURL = "https://www.google.com/";
    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverHelper.getInstance();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
