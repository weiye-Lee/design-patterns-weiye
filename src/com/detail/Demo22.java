package com.detail;

public class Demo22 {
    public static void main(String[] args) {
        int i;
        for (i = 1 ;i <= 10 ;i++ ) {
            System.out.println(i);
        }

        // 当执行第11 次时， i不在 <= 10 ,跳出循环
        System.out.println(i);
    }
}
