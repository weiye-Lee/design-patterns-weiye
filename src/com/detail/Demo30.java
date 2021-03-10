package com.detail;

/**
 * 数组的复制
 */
public class Demo30 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] a_copy = a;
        a_copy[0] = 0;

        // a[0] = 0 a_copy只是将引用指向a的内存空间
        System.out.println(a[0]);

        newLine();
        // 通过数组复制会生成另外一个数组，而非指向同一个内存地址
        int[] b = {1,2,3};
        int[] b_copy = new int[b.length];
        System.arraycopy(b,0,b_copy,0,b.length);
        print(b_copy);
        b_copy[0] = 0;
        System.out.println(b[0]);

        newLine();
        /*
          原数组的类型为对象类型，复制的的对象的引用，而不是对象本身
          String不是基本数据类型，但是strings【0】的值没有被改变
          String 是非可变类，String对象一经创建，就无法修改
          对String对象的一切操作结果都是返回新创建的对象
         */
        String[] strings = {"weiye","is","the","best"};
        String[] strings_copy = new String[strings.length];
        System.arraycopy(strings,0,strings_copy,0,strings.length);
        // 相当于新建了一个String对象，所以原数组没有改变
        strings_copy[0] = "tom";
        System.out.println(strings_copy[0]);
        System.out.println(strings[0]);
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void newLine() {
        System.out.println("----------------------\n");
    }
}
