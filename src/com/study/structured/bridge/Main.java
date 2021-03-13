package com.study.structured.bridge;

public class Main {
    public static void main(String[] args) {
        Display d = new Display(new StringDisplayImpl("hello world"));
        Display d1 = new CountDisplay(new StringDisplayImpl("hello weiye"));
        CountDisplay d2 = new CountDisplay(new StringDisplayImpl("hello china"));
        d.display();
        d1.display();
        d2.display();
        d2.countPrint(5);
    }
}
