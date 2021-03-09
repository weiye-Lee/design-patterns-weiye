package com.study.behavior.singleton;

/**
 * 懒汉式
 * 多线程不安全，因为在一个线程修改该对象的同时，另外一个对象也可能在修改
 */
public class SingleObjectLazy1 {
    private static SingleObjectLazy1 singleObjectLazy1;

    private SingleObjectLazy1(){}

    public static SingleObjectLazy1 getSingleObjectLazy1() {
        if (singleObjectLazy1 == null) {
            singleObjectLazy1 = new SingleObjectLazy1();
        }
        return singleObjectLazy1;
    }
}
