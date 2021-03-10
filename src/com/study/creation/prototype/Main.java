package com.study.creation.prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen linePen = new UnderLinePen('_');
        MessageBox messageBox = new MessageBox('*');
        manager.register("linePen",linePen);
        manager.register("messageBox",messageBox);

        Product p = manager.clone("linePen");
        p.use("hello world");
        Product p1 = manager.clone("messageBox");
        p1.use("hello world");
    }
}
