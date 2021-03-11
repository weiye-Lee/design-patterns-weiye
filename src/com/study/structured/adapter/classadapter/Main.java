package com.study.structured.adapter.classadapter;

public class Main {
    public static void main(String[] args) {
        Target target = new Adapter("hello");
        target.printStrong();
        target.printWeak();
    }
}
