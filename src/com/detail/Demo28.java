package com.detail;

/**
 * 数组初始化
 */
public class Demo28 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = new int[5];
        int[] c;
//        c = {1,2,4,5}; 只有在数组初始化时才能这样赋值
        c = new int[]{1,2,3,4,5};
        print(a);
        print(b);
        print(c);
    }
    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println("\n");
    }
}
