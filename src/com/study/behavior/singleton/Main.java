package com.study.behavior.singleton;

public class Main {
    public static void main(String[] args) {
//        试图实例化单例类，ide报错
//        SingleObject singleObject = new SingleObject();

        SingleObject singleObject = SingleObject.getSingleObject();
        singleObject.useMethod();
    }
}
