package com.study.behavior.builder;

public class Main {
    public static void main(String[] args) {
        NormalPhone normalPhone = new NormalPhone();
        Construct construct = new Construct(normalPhone);
        construct.getNormalPhone();

        SuperPhone superPhone = new SuperPhone();
        construct = new Construct(superPhone);
        construct.getSuperPhone();
    }
}
