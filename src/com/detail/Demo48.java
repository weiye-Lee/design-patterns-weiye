package com.detail;

public class Demo48 {
    public static void main(String[] args) {
        GetOne getOne = new GetOne();
        getOne.select(5);
        int[] array = {1,2,3
        };
        getOne.select(array);

        getOne.select('a','b','c');

//        int... 是多个int类型数字，char可以转型为int，但string不行
//        getOne.select("weiye","hello");
    }

}

class GetOne {
    /*
    无法通过返回类型冲太方法
    public int returnType() {
        return 1;
    }

    public float returnType() {
        return 1.0f;
    }


     */

    public void select(int... ints) {
        System.out.println("select ints");
    }

    public void select(int i) {
        System.out.println("select i");
    }

    public void select(float f) {
        System.out.println("select float");
    }
}
