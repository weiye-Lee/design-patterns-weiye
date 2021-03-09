package com.detail;

/**
 * i++ 和 ++i 的区别
 * i++ 是先赋值后计算i = i + 1
 * ++i 是先计算i = i + 1 后赋值
 *
 */
public class Demo17 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i++);
        System.out.println(i);

        i = 0;
        System.out.println(++i);
        System.out.println(i);
    }

}
