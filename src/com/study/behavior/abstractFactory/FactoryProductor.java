package com.study.behavior.abstractFactory;

public class FactoryProductor {
    public AbstractFactory getFactory(String factory) {
        if (factory.equals("shape")) {
            return new ShapeFactory();
        } else if (factory.equals("color")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
