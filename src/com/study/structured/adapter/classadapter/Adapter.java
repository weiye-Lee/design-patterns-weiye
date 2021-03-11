package com.study.structured.adapter.classadapter;

public class Adapter extends Banner implements Target{
    public Adapter(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
