package com.detail;

/**
 * 类中成员变量私有
 * 通过共有方法对其访问
 * 公有制方式暴露了过多的实现细节，大大增加了模块之间的耦合性
 * 私有化方式隐藏了实现细节，与外界通过接口访问，将修改隔离
 */
public class Demo38 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
