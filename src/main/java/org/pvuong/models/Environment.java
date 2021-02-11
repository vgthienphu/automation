package org.pvuong.models;

public class Environment {
    private String name;
    private String baseURL;

    public Environment(String name, String baseURL) {
        this.name = name;
        this.baseURL = baseURL;
    }

    public String getName() {
        return this.name;
    }

    public String getBaseURL() {
        return this.baseURL;
    }
}
