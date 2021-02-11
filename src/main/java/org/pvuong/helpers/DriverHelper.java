package org.pvuong.helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pvuong.constants.general.Browser;

import static io.github.bonigarcia.wdm.config.DriverManagerType.*;

public class DriverHelper {
    private static WebDriver driver;

    public static void init(String browser) {
        switch (browser) {
            case Browser.CHROME:
                WebDriverManager.getInstance(CHROME).setup();
                driver = new ChromeDriver();
                break;
            case Browser.EDGE:
                WebDriverManager.getInstance(EDGE).setup();
                driver = new EdgeDriver();
                break;
            case Browser.FIREFOX:
                WebDriverManager.getInstance(FIREFOX).setup();
                driver = new FirefoxDriver();
                break;
        }
    }

    public static WebDriver getInstance() {
        return driver;
    }
}
