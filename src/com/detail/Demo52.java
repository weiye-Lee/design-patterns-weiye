package com.detail;

/**
 * 对于基本数据类型 == 比较的是值，非基本数据比较的是内存地址是否相同
 * 不论是否是基本数据类型，equal比较的都是值
 */
public class Demo52 {
    public static void main(String[] args) {
        {
            Integer i = 300;
            Integer i1 = 300;
            int a = 10;
            int a1 = 10;

            System.out.println(i == i1);
            System.out.println(i.equals(i1));

            System.out.println(a == a1);
        }
        newLine();
        {
            Integer i = 100;
            Integer i1 = 100;
            System.out.println(i == i1);
            // 类似于String 一经创建无法修改，新建对象（-127 ,128)之间
            i1 = 101;
            System.out.println(i == i1);
            System.out.println(i);
        }

    }

    private static void newLine() {
        System.out.println("*****************************");
    }
}
