package com.study.creation.singleton;

/**
 * 饿汉式
 * 多线程安全，没有加锁执行效率高，类加载就初始化，狼类内存
 */
public class SingleObject {
    private static SingleObject singleObject = new SingleObject();
    private SingleObject() {}

    public static SingleObject getSingleObject() {
        return singleObject;
    }

    public void useMethod() {
        System.out.println("do something");
    }
}
