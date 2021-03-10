package com.study.creation.factory;

public class Factory {
    public Shape getShape(String shape) {
        if (shape.equals("circle")) {
            return new Circle();
        } else if (shape.equals("square")) {
            return new Square();
        } else {
            return null;
        }
    }
}
