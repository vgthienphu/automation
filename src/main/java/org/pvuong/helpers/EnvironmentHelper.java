package org.pvuong.helpers;

import org.pvuong.models.Environment;

public class EnvironmentHelper {
    private static Environment env;

    public static void setUp(String envName) {
        switch (envName) {
            case "Development":
                env = new Environment(envName, "https://www.DEVELOPMENT.com/");
                break;
            case "Staging":
                env = new Environment(envName, "https://www.STAGING.com/");
                break;
        }
    }

    public static Environment getCurrent() {
        return env;
    }
}
