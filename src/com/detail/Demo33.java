package com.detail;

/**
 * public 访问修饰符
 * 对构造器修饰即为所有位置都能创建该类的对象
 * 如果是private 那么都不能
 * 缺省则时包内可以
 */
public class Demo33 {
    // 当public缺省时，com.test.Demo33Test.java 报错
    public Demo33() {
    }

    protected void print() {
        System.out.println("woohoo, you can use this method ");
    }

    public void access() {
        print();
    }
}

class Test{
    public static void main(String[] args) {
        Demo33 demo33 = new Demo33();
        // protected在包内可见
        demo33.print();
    }
}