package com.detail;

/**
 * 构造器
 * 无参构造器 调用父类的构造器完成初始化
 * 构造函数不能继承，但子类在构造器中会首先调用父类的构造器
 * 子类对父类的构造器访问权限与对应的访问修饰符一样
 */
public class Demo39 extends constructor{

    public static void main(String[] args) {
        new Demo39();
    }
}
class constructor{
    public constructor() {
        System.out.println("调用父类构造器");
    }
}
class Ball{
    public Ball(int radius){};
}

class Football extends Ball {
    public Football() {
        // 子类可不可以不调用父类的构造方法
        super(6);
    }
}