package com.detail;

/**
 * 去摸和除法运算时要考虑0的存在
 */
public class Demo19 {
    public static void main(String[] args) {
        double inf = 1.0/0.0;
        System.out.println(inf);

        double nan = 0.0/0.0;
        System.out.println(nan);

        if (nan == Double.NaN) {
            System.out.println("nan is equal");
        } else if (Double.isNaN(nan)) {
            System.out.println("nan is NAN");
        }
    }
}
