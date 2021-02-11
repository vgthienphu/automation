package org.pvuong.base;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected String baseURL = "https://www.google.com/";
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
    }
}
