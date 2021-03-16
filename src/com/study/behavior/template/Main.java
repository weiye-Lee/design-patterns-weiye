package com.study.behavior.template;

public class Main {
    public static void main(String[] args) {
        Template t1 = new CharDisplay('a');
        Template t2 = new StringDisplay("hello world");
        t1.display();
        t2.display();
    }
}
