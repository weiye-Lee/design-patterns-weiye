package com.study.behavior.builder;

public class Construct {
    private Builder builder;

    public Construct(Builder builder) {
        this.builder = builder;
    }

    public Builder getNormalPhone() {
        builder.call("112");
        builder.sentMsg("hello world");
        builder.takePhoto();
        builder.close();
        return builder;
    }

    public Builder getSuperPhone() {
        builder.call("114");
        builder.sentMsg("hey weiye!");
        builder.takePhoto();
        builder.close();
        return builder;
    }
}
