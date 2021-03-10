package com.study.creation.singleton;

/**
 * 懒汉式
 * 线程安全
 */
public class SingleObjectLazy2 {
    private static SingleObjectLazy2 singleObjectLazy1;

    private SingleObjectLazy2(){}

    // 加锁
    public static synchronized SingleObjectLazy2 getSingleObjectLazy1() {
        if (singleObjectLazy1 == null) {
            singleObjectLazy1 = new SingleObjectLazy2();
        }
        return singleObjectLazy1;
    }
}
