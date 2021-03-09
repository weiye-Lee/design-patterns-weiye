package com.detail;

import java.util.HashMap;
import java.util.Map;

/**
 * 每种基本数据类型都有对应的包装类
 * jdk1.5 之后提供自动封箱，拆箱功能
 */
public class Demo12 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("weiye", 22);
        map.put("tom", 16);
        map.put("sun", new Person(11, "male"));

        for (String key : map.keySet()) {
            System.out.print(key + ":");
            System.out.println(map.get(key));
        }
    }
}

class Person {
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    int age;
    String sex;

    public Person(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }
}
