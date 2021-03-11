package com.study.structured.adapter.objectadapter;

public class Adapter extends Target {
    private Banner banner;
    public Adapter(String str) {
        banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
