package com.study.structured.proxy;

public class Printer implements Printerable {
    private String name;

    public Printer() {
        heavyJob("正在生成Printer实例");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成Printer实例（" + name + "）");
    }

    @Override
    public void setPainterName(String name) {
        this.name = name;
    }

    @Override
    public String getPainterName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("(" + name + ")");
    }

    private void heavyJob(String job) {
        System.out.println(job);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("finish the heavy job");
    }
}
