package org.pvuong.pages;

import org.pvuong.base.BasePage;

public class HomePage extends BasePage {
    public HomePage() {
        super();
    }

    public void goTo() {
        driver.get(env.getBaseURL());
    }
}
