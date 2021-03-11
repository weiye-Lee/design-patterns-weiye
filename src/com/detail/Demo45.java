package com.detail;

/**
 * 类的加载
 * 如果只是声明类的引用，jvm不会载入类，jvm只在需要某个类时才加载该类
 * 包括使用该类成员变量，调用该类的静态方法，生成实例，加载子类时父类自然也会被加载
 */
public class Demo45 {
    public static void main(String[] args) {
        Bucket bucket;
//        Bucket bucket1 = new Bucket();
//        int height = Bucket.height;
        float volume = Bucket.volume();

        /*

        try {
            Class.forName("com.detail.Bucket");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

         */
    }
}
class Bucket{
    static {
        System.out.println("载入类...");
    }
    public static int height = 50;
    public static float volume() {
        return 25.5f;
    }
}