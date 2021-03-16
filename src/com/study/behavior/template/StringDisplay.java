package com.study.behavior.template;

public class StringDisplay extends Template{
    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        int len = str.length();
        for (int i = 0; i < len; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
