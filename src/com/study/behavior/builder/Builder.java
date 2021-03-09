package com.study.behavior.builder;

public abstract class Builder {
    public abstract void call(String phoneNum);
    public abstract void sentMsg(String msg);
    public abstract String takePhoto();
    public abstract void close();

}
