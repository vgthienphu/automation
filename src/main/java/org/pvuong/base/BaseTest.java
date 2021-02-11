package org.pvuong.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.getInstance(CHROME).setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
