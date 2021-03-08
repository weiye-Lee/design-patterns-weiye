package com.study.behavior.abstractFactory;


public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shape) {
        if (shape.equals("circle")) {
            return new Circle();
        } else if (shape.equals("square")) {
            return new Square();
        } else {
            return null;
        }
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
