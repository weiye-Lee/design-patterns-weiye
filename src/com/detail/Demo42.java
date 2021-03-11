package com.detail;

/**
 * 为什么静态变量要用静态代码块初始化，静态代码块初始化时机
 * 对于静态成员变量，会先为所有类中声明的静态变量分配空间，每个变量存在默认值后，才会执行变量声明处的初始化
 *
 */
public class Demo42 {
    private int a;
    private byte b;
    private String str;

    public static void main(String[] args) {
        Demo42 demo42 = new Demo42();
        System.out.println("a:" + demo42.a);
        System.out.println("b:" + demo42.b);
        System.out.println("str:" + demo42.str);

//        ide 报错，局部变量没有初始化
//        int localVar;
//        System.out.println(localVar);

        Book book = new Book(1);
        System.out.println(Book.name);

    }
}

class Book {
    public static String name;
    public int id;

    static {
        System.out.println("静态代码块加载");
    }

    public Book(int id) {
        this.id = id;
        name = "java";
    }
}