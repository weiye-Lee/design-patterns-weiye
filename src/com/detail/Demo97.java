package com.detail;

import java.util.Objects;

/**
 * String 是不可变类型
 */
public class Demo97 extends Object{
    public static void main(String[] args) {
        String str = "a" + "bc";
        String str2 = "ab" + "c";
        // 字符串变量在编译时不知道值
        String temp = "a";
        // 字符串常量在编译时就能确定值，str4的值得到abc 也会在常量池中进行匹配
        final String ftemp = "a";
        String str3 = temp + "bc";
        String str4 = ftemp + "bc";
        System.out.println(str == str2);
        System.out.println(str3 == str4);
        System.out.println(str4 == str);
        // String 使用new创建对象存储在堆区
        System.out.println(str == new String("abc"));

        System.out.println("------------------------");
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        // String 重写了equal方法，但是StringBuilder没有，比价的还是地址
        StringBuilder st1 = new StringBuilder("aaa");
        StringBuilder st2 = new StringBuilder("aaa");
        System.out.println(s1.equals(s2));
        System.out.println(st1.equals(st2));
        // 比较两个StringBuilder对象 通过将其转化成String对象，通过equal方法进行比较
        System.out.println(st1.toString());
        System.out.println(st1.toString().equals(st2.toString()));
    }
}
