package com.study.creation.singleton;

/**
 * 双检锁
 * 不仅仅在获取对象方法上加锁，在变量上也加锁，线程更加安全
 */
public class SingleObjectDCL {
    private static SingleObjectDCL singleObjectDCL;

    private SingleObjectDCL(){}

    // 加锁
    public static synchronized SingleObjectDCL getSingleObjectLazy1() {
        if (singleObjectDCL == null) {
            singleObjectDCL = new SingleObjectDCL();
        }
        return singleObjectDCL;
    }
}
