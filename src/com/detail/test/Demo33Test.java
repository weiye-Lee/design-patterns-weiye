package com.detail.test;

import com.detail.Demo33;

import java.time.format.TextStyle;

/**
 * 不在protected包内的对象要想访问protected方法
 * 通过一个与protected在同一个类的public方法访问
 *
 *
 */
public class Demo33Test extends Demo33{
    public void access() {
        super.print();
        print();
    }
    public static void main(String[] args) {
        Demo33 demo33 = new Demo33();
//        不能使用实例访问protected修饰的方法
//        demo33.print();
        Demo33Test demo33Test = new Demo33Test();
        demo33Test.access();

//        Test 类为包内可见，所以无法声明引用
//        Test t;
    }
}
