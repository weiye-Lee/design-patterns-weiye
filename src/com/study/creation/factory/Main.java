package com.study.creation.factory;

/**
 * 工厂模式
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape shape = factory.getShape("circle");
        shape.draw();

        Shape shape1 = factory.getShape("square");
        shape1.draw();
    }
}
