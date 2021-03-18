package com.study.structured.proxy;

public class PrinterProxy implements Printerable {
    private String name;
    private Printer printer;

    @Override
    public synchronized void setPainterName(String name) {
        if (printer != null) {
            printer.setPainterName(name);

        }
        this.name = name;
    }

    @Override
    public String getPainterName() {
        return name;
    }

    @Override
    public void print() {
        getPrinter();
        printer.print();
    }

    private synchronized void getPrinter() {
        printer = new Printer(name);
    }
}
