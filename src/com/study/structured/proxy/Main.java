package com.study.structured.proxy;

public class Main {
    public static void main(String[] args) {
        Printerable printerable = new PrinterProxy();
        printerable.setPainterName("weiye");
        System.out.println(printerable.getPainterName());
        printerable.print();
        printerable.setPainterName("tom");
        printerable.print();
    }
}
