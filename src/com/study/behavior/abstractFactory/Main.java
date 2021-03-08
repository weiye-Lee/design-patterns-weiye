package com.study.behavior.abstractFactory;

public class Main {
    public static void main(String[] args) {
        FactoryProductor productor = new FactoryProductor();

        // 以下代码可能会产生空指针异常
        productor.getFactory("shape").getShape("circle").draw();

        productor.getFactory("color").getColor("red").paint();

    }}
