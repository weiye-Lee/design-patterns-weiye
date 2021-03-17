package com.study.structured.composite;

public class Main {
    public static void main(String[] args) {
        Directory rootdir = new Directory("root");
        Directory usrdir = new Directory("usr");
        Directory bin = new Directory("bin");
        rootdir.add(bin);
        rootdir.add(new File("localDate",1000));
        rootdir.add(usrdir);
        usrdir.add(new File("Program",200));
        rootdir.printList();
    }
}
