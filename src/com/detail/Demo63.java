package com.detail;

/**
 * 标记接口
 * 接口中没有声明任何方法，但是实现该接口就能够使用接口的某些特殊能力
 * 对于没有实现Cloneable 的类，不能使用clone方法
 * 怎么实现的，为什么？那只是一个接口，为什么super.clone() 是个方法
 * super 指向父类，父类不是cloneable接口 是object类，object类中实现clone方法
 * object类中没有实现，那么在哪里实现呢？
 */
public class Demo63 implements Cloneable {
//public class Demo63 {
    @Override
    public Demo63 clone() {
        Demo63 demo63 = null;
        try {
            demo63 = (Demo63) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return demo63;
    }
}

class main {
    public static void main(String[] args) {
        Demo63 demo63 = new Demo63();
        Demo63 test = demo63.clone();
        if (test == demo63) {
            System.out.println("指向相同的对象");
        } else {
            System.out.println("指向不同的地址");
        }
    }
}
