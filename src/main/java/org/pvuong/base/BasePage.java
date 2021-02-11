package org.pvuong.base;

import org.openqa.selenium.WebDriver;
import org.pvuong.helpers.DriverHelper;
import org.pvuong.helpers.EnvironmentHelper;
import org.pvuong.models.Environment;

public class BasePage {
    protected Environment env;
    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverHelper.getInstance();
        this.env = EnvironmentHelper.getCurrent();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
